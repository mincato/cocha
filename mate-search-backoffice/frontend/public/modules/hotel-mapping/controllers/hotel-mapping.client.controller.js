'use strict';

// Hotel Mappings controller
angular.module('hotel-mapping').controller('HotelMappingController', ['$scope', '$stateParams', '$location', 'HotelMappingService',
	function($scope, $stateParams, $location, HotelMappingService) {

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

		// Find existing Hotel Mapping
		$scope.findOne = function() {
			$scope.hotelMapping = HotelMappingService.get({
				hotelMappingId: $stateParams.hotelMappingId
			});
		};
	}
]);