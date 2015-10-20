var serviceMateSearch = angular.module('mateSearchTestApp');


serviceMateSearch.controller('serviceController', ['$scope','$http','$location',function($scope,$http,$location) {

	$scope.hotel={
		currencyCode : 'USD'
	};
	$scope.hotels={};
	$scope.isLoadingSearch=false;
	$scope.isLoadingToken=false;
	$scope.searching=false;


	$scope.createToken = function() {
		$scope.isLoadingToken=true;
		$http.get('http://'+$location.host()+':'+$location.port()+'/mate-search/sabre/createsession?code=125')
		.success(function(data) {
			$scope.isLoadingToken=false;
			$scope.hotel.token = data.replace('\"','').replace('\"','');
		});
	}


	$scope.search = function(hotel) {
		$scope.searching = true;
		$scope.error = "";
		$scope.hotels={};
			$scope.isLoadingSearch=true;
			$http.get('http://'+$location.host()+':'+$location.port()+'/mate-search/mate/availability?idHotel='+hotel.ids+'&arrival_date='+moment(hotel.arrivalDate).format('MM/DD/YYYY')+'&departure_date='+moment(hotel.departureDate).format('MM/DD/YYYY')+'&currencyCode='+hotel.currencyCode+'&token='+hotel.token)
			.success(function(data) {
				$scope.isLoadingSearch=false;
				$scope.hotels = data.hotels;
				$scope.hotel.ids = hotel.ids;
				$scope.hotel.arrivalDate = hotel.arrivalDate;
				$scope.hotel.departureDate = hotel.departureDate;
				$scope.hotel.service = hotel.service;
				$scope.hotel.numeroResultado = data.hotels.length;
				$scope.searching = false;
			}).error(function(data) {
				$scope.isLoadingSearch=false;
				$scope.error = "Error al buscar"
				$scope.searching = false;
			});
	};
}]);
