'use strict';

//Hotel Mappings service used to communicate Hotel Mappings REST endpoints
angular.module('hotel-mapping').factory('HotelMappingService', ['$resource', 'Configuration',
	function($resource, Configuration) {

		var url = Configuration.serviceContext + 'hoteles/mapping/:hotelMappingId';
		
		return $resource(url, { hotelMappingId: '@_id'
		}, {
			update: {
				method: 'PUT'
			}
		});
	}
]);