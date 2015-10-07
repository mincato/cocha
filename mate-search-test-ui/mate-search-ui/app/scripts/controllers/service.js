var serviceMateSearch = angular.module('mateSearchTestApp');


serviceMateSearch.controller('serviceController', ['$scope','$http','$location',function($scope,$http,$location) {

	$scope.hotel={};
	$scope.hotels={};
	$scope.searching=false;

	$scope.search = function(hotel) {
		$scope.searching = true;
		$scope.error = "";
		//if(hotel.service == 'all') {
			$http.get('http://'+$location.host()+':'+$location.port()+'/mate-search/mate/availability?idHotel='+hotel.ids+'&arrival_date='+moment(hotel.arrivalDate).format('MM/DD/YYYY')+'&departure_date='+moment(hotel.departureDate).format('MM/DD/YYYY'))
			.success(function(data) {
				$scope.hotels = data.hotel;
				$scope.hotel.ids=hotel.ids;
				$scope.hotel.arrivalDate = hotel.arrivalDate;
				$scope.hotel.departureDate = hotel.departureDate;
				$scope.hotel.service = hotel.service;
				$scope.hotel.numeroResultado = data.hotel.length;
				$scope.searching = false;
			}).error(function(data) {
				$scope.error = "Error al buscar"
				$scope.searching = false;
			});
		//}
/*		if(hotel.service == 'booking') {
			$http.get('http://'+$location.host()+':'+$location.port()+'/mate-search/booking/send?idHotel='+hotel.idSupplier+'&arrival_date='+hotel.arrivalDate+'&departure_date='+hotel.departureDate)
			.success(function(data) {

			});
		}
		if(hotel.service == 'ean') {
			$http.get('http://'+$location.host()+':'+$location.port()+'/mate-search/ean/send?idHotel='+hotel.idSupplier+'&arrival_date='+hotel.arrivalDate+'&departure_date='+hotel.departureDate)
			.success(function(data) {
			});
		}
		if(hotel.service == 'sabre') {

		}*/
	};
}]);
