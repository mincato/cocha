'use strict';

// Hotel Mappings controller
angular.module('hotel-mapping').controller('HotelMappingController', ['$scope', '$stateParams', '$location', 'HotelMappingService',
	function($scope, $stateParams, $location, HotelMappingService) {

        $scope.howMany = 10;
        $scope.countryCode = $stateParams.countryCode;
        
		// Create new Hotel Mapping
		$scope.create = function() {
			// Create new Hotel Mapping object
			var hotelMapping = new HotelMappingService ({
				codigo: this.codigo,
				valor: this.valor
			});

			// Redirect after save
			hotelMapping.$save(function(response) {
				$location.path('hoteles/mapping/' + response._id);

				// Clear form fields
				$scope.codigo = '';
				$scope.valor = '';
			}, function(errorResponse) {
				$scope.error = errorResponse.data.message;
			});
		};

		// Remove existing Hotel Mapping
		$scope.remove = function(hotelMapping) {
			if ( hotelMapping ) { 
				hotelMapping.$remove();

				for (var i in $scope.hotelMappings) {
					if ($scope.hotelMappings [i] === hotelMapping) {
						$scope.hotelMappings.splice(i, 1);
					}
				}
			} else {
				$scope.hotelMapping.$remove(function() {
					$location.path('hoteles/mapping');
				});
			}
		};

		// Update existing Hotel Mapping
		$scope.update = function() {
			var hotelMapping = $scope.hotelMapping;

			hotelMapping.$update(function() {
				$location.path('hoteles/mapping/' + hotelMapping._id);
			}, function(errorResponse) {
				$scope.error = errorResponse.data.message;
			});
		};

		// Find a list of Hotel Mappings
		$scope.find = function() {
			$scope.hotelMappings = HotelMappingService.query();
		};
        
        $scope.findTopCountries = function() {
            $scope.mappingCounts = HotelMappingService.queryTopCountries({
                howMany : $scope.howMany
            });
        };
        
        $scope.findMappings = function() {
            $scope.hotelMappings = HotelMappingService.queryByCountry({
                countryCode : $stateParams.countryCode
            });
        };

		// Find existing Hotel Mapping
		$scope.findOne = function() {
			$scope.hotelMapping = HotelMappingService.get({
				id: $stateParams.hotelMappingId
			});
		};
        
        $scope.activate = function(mapping) {
            HotelMappingService.activate({ id : mapping.id }, function(response) {
				for (var i in $scope.hotelMappings) {
					if ($scope.hotelMappings [i].id === response.id) {
						$scope.hotelMappings [i] = response;
					}
				}
			}, function(errorResponse) {
				$scope.error = errorResponse.data.message;
			});
        };
        
        $scope.deactivate = function(mapping) {
            HotelMappingService.deactivate({ id : mapping.id }, function(response) {
				for (var i in $scope.hotelMappings) {
					if ($scope.hotelMappings [i].id === response.id) {
						$scope.hotelMappings [i] = response;
					}
				}
			}, function(errorResponse) {
				$scope.error = errorResponse.data.message;
			});
        };
        
        $scope.goToListByCountry = function(countryCode) {
            $location.path('hoteles/mapping/country/' + countryCode);
        };
        
        $scope.goToReviewMapping = function(mapping) {
            $location.path('hoteles/mapping/review/' + mapping.id);
        };
	}
]);