'use strict';

//Hotel Mappings service used to communicate Hotel Mappings REST endpoints
angular.module('hotel-mapping').factory('HotelMappingService', ['$resource', 'Configuration',
	function($resource, Configuration) {

		var url = Configuration.serviceContext + 'hoteles/mapping/:operation/:id';
		
		return $resource(url, { id: '@_id'
		}, {
			update: {
				method: 'PUT'
			},
            queryTopCountries: {
                method: 'GET',
                isArray: true,
                params: {
                    operation: 'top'
                }
            },
            queryByCountry: {
                method: 'GET',
                isArray: true,
                params: {
                    operation: 'country'
                }
            }
		});
	}
]);