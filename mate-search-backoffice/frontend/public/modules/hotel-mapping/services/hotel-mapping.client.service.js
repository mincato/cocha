'use strict';

//Hotel Mappings service used to communicate Hotel Mappings REST endpoints
angular.module('hotel-mapping').factory('HotelMappingService', ['$resource', 'Configuration',
	function($resource, Configuration) {

		var url = Configuration.serviceContext + 'hoteles/mapping/:id/:operation';
		
		return $resource(url, { id: '@id'
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
                    operation: 'byCountry'
                }
            },
            getReview: {
                method: 'GET',
                isArray: false,
                params: {
                    operation: 'review'
                }
            },
            confirm: {
                method: 'PUT',
                isArray: false,
                params: {
                    operation: 'confirm'
                }
            },
            reject: {
                method: 'PUT',
                isArray: false,
                params: {
                    operation: 'reject'
                }
            },
            activate: {
                method: 'PUT',
                isArray: false,
                params: {
                    operation: 'activate'
                }
            },
            deactivate: {
                method: 'PUT',
                isArray: false,
                params: {
                    operation: 'deactivate'
                }
            }
            
		});
	}
]);