'use strict';

// Hotel Mappings controller
angular.module('hotel-mapping').controller('MappingReviewController', ['$scope', '$stateParams', '$location', 'HotelMappingService',
	function($scope, $stateParams, $location, HotelMappingService) {

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

		$scope.findReview = function() {
			$scope.mappingReview = HotelMappingService.getReview({
				id: $stateParams.hotelMappingId
			});
		};
        
        $scope.confirm = function(mapping) {
            HotelMappingService.confirm({ id : mapping.id }, function() {
				$scope.goToListByCountry($stateParams.countryCode);
			}, function(errorResponse) {
				$scope.error = errorResponse.data.message;
			});
        };
        
        $scope.reject = function(mapping) {
            HotelMappingService.reject({ id : mapping.id }, function() {
				$scope.goToListByCountry($stateParams.countryCode);
			}, function(errorResponse) {
				$scope.error = errorResponse.data.message;
			});
        };
        
        $scope.deactivate = function(mapping) {
            HotelMappingService.deactivate({ id : mapping.id }, function() {
				$scope.goToListByCountry($stateParams.countryCode);
			}, function(errorResponse) {
				$scope.error = errorResponse.data.message;
			});
        };
        
        $scope.goToListByCountry = function(countryCode) {
            $location.path('hoteles/mapping/country/' + countryCode);
        };
	}
]);