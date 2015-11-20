'use strict';

// Hotel Mappings controller
angular.module('hotel-mapping').controller('HotelMappingController', ['$scope', '$stateParams', '$location', 'HotelMappingService', 'HotelService',
	function($scope, $stateParams, $location, HotelMappingService, HotelService) {

        $scope.howMany = 10;
        $scope.countryCode = $stateParams.countryCode;
        
		// Create new Hotel Mapping
		$scope.create = function() {
			// Create new Hotel Mapping object
			HotelMappingService.createMapping ({}, {	       
                referenceId : $scope.referenceHotel.id,
                referenceSupplierCode : $scope.referenceHotel.supplierCode,
                mapId : $scope.mapHotel.id,
                mapSupplierCode : $scope.mapHotel.supplierCode,
            },function(response) {
				$scope.goToListByCountry(response.countryCode);
			}, function(errorResponse) {
				$scope.error = errorResponse.data.message;
			})
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
        
        $scope.findReference = function() {
            $scope.referenceHotel = HotelService.findReference({ id : $scope.referenceHotelId });
        };
        
        $scope.findToMap = function() {
            $scope.mapHotel = HotelService.findToMap({ id : $scope.mapHotelId });
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
        
        $scope.goHome = function() {
            $location.path('#!/');
        };
	}
]);