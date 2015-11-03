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
			$http({
				method: 'GET',
				data : '',
				url: 'http://'+$location.host()+':'+$location.port()+'/mate-search/hotel/list?regionId='+hotel.ids+'&arrivalDate='+moment(hotel.arrivalDate).format('MM/DD/YYYY')+'&departureDate='+moment(hotel.departureDate).format('MM/DD/YYYY')+'&currencyCode='+hotel.currencyCode+'&token='+hotel.token,
 				headers: {'Content-Type': 'application/json'}
			})
			.success(function(data) {
				$scope.isLoadingSearch=false;
				$scope.hotels = data.HotelList;
				$scope.hotel.ids = hotel.ids;
				$scope.hotel.arrivalDate = hotel.arrivalDate;
				$scope.hotel.departureDate = hotel.departureDate;
				$scope.hotel.service = hotel.service;
				$scope.hotel.numeroResultado = data.HotelList.size;
				$scope.searching = false;
			}).error(function(data) {
				$scope.isLoadingSearch=false;
				$scope.error = "Error al buscar"
				$scope.searching = false;
			});
	};
}]);
