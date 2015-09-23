var serviceMateSearch = angular.module('mateSearchTestApp');

serviceMateSearch.controller('serviceController', ['$scope','$http','$location', function($scope,$http,$location) {
	
	$scope.hotel={};
	
	$scope.search = function(hotel) {
		
		if(hotel.service == 'all') {
			$http.get('http://'+$location.host()+':'+$location.port()+'/mate-search/mate/availability?idHotel='+hotel.idSupplier+'&arrival_date='+hotel.arrivalDate+'&departure_date='+hotel.departureDate)
			.success(function(data) {
				$scope.hotel = data;
				$scope.hotel.arrivalDate = hotel.arrivalDate;
				$scope.hotel.departureDate = hotel.departureDate;
				$scope.hotel.service = hotel.service;
			});
		}
		if(hotel.service == 'booking') {
			$http.get('http://'+$location.host()+':'+$location.port()+'/mate-search/booking/send?idHotel='+hotel.idSupplier+'&arrival_date='+hotel.arrivalDate+'&departure_date='+hotel.departureDate)
			.success(function(data) {
				$scope.hotel = data;
				$scope.hotel.arrivalDate = hotel.arrivalDate;
				$scope.hotel.departureDate = hotel.departureDate;
				$scope.hotel.service = hotel.service;
			});
		}
		if(hotel.service == 'ean') {
			$http.get('http://'+$location.host()+':'+$location.port()+'/mate-search/ean/send?idHotel='+hotel.idSupplier+'&arrival_date='+hotel.arrivalDate+'&departure_date='+hotel.departureDate)
			.success(function(data) {
				$scope.hotel = data;
				$scope.hotel.arrivalDate = hotel.arrivalDate;
				$scope.hotel.departureDate = hotel.departureDate;
				$scope.hotel.service = hotel.service;
			});
		}
		if(hotel.service == 'sabre') {
			
		}
	};
}]);