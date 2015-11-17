'use strict';

//Setting up route
angular.module('hotel-mapping').config(['$stateProvider',
	function($stateProvider) {
		// Hotel Mapping state routing
		$stateProvider.
		state('listHotelMapping', {
			url: '/hoteles/mapping',
			templateUrl: 'modules/hotel-mapping/views/list-hotel-mapping.client.view.html'
		}).
		state('createHotelMapping', {
			url: '/hoteles/mapping/crear',
			templateUrl: 'modules/hotel-mapping/views/create-hotel-mapping.client.view.html'
		}).
		state('viewHotelMapping', {
			url: '/hoteles/mapping/:hotelMappingId',
			templateUrl: 'modules/hotel-mapping/views/view-hotel-mapping.client.view.html'
		}).
		state('editHotelMapping', {
			url: '/hoteles/mapping/:hotelMappingId/editar',
			templateUrl: 'modules/hotel-mapping/views/edit-hotel-mapping.client.view.html'
		});
	}
]);