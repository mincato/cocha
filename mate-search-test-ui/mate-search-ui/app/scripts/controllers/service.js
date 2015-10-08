var serviceMateSearch = angular.module('mateSearchTestApp');


serviceMateSearch.controller('serviceController', ['$scope','$http','$location',function($scope,$http,$location) {

	$scope.hotel={};
	$scope.hotels={};
	$scope.isLoadingSearch=false;
	$scope.isLoadingToken=false;

	$scope.createToken = function() {
		$scope.isLoadingToken=true;
		$http.get('http://'+$location.host()+':'+$location.port()+'/mate-search/sabre/createsession?code=125')
		.success(function(data) {
			$scope.isLoadingToken=false;
			$scope.hotel.token = data;
		});
	}

	$scope.search = function(hotel) {

		//if(hotel.service == 'all') {
			$scope.isLoadingSearch=true;
			$http.get('http://'+$location.host()+':'+$location.port()+'/mate-search/mate/availability?idHotel='+hotel.ids+'&arrival_date='+moment(hotel.arrivalDate).format('MM/DD/YYYY')+'&departure_date='+moment(hotel.departureDate).format('MM/DD/YYYY')+'&token='+hotel.token)
			.success(function(data) {
				$scope.isLoadingSearch=false;
				$scope.hotels = data.hotel;
				$scope.hotel.ids = hotel.ids;
				$scope.hotel.arrivalDate = hotel.arrivalDate;
				$scope.hotel.departureDate = hotel.departureDate;
				$scope.hotel.service = hotel.service;
				$scope.hotel.numeroResultado = data.hotel.length;
			})
			.error(function(data){
				$scope.isLoadingSearch=false;
			})

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
