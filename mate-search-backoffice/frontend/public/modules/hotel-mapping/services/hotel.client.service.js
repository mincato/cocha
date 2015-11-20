'use strict';

//Hotel Mappings service used to communicate Hotel Mappings REST endpoints
angular.module('hotel-mapping').factory('HotelService', ['$resource', 'Configuration',
	function($resource, Configuration) {

		var url = Configuration.serviceContext + 'hoteles/:supplier/:id';
		
		return $resource(url, { id: '@id'
		}, {
            findReference: {
                method: 'GET',
                isArray: false,
                params: {
                    supplier: 'EAN'
                }
            },
            findToMap: {
                method: 'GET',
                isArray: false,
                params: {
                    supplier: 'BKG'
                }
            }
		});
	}
]);