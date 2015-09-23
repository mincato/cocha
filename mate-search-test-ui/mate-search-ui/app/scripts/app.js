'use strict';

/**
 * @ngdoc overview
 * @name mateSearchTestApp
 * @description
 * # mateSearchTestApp
 *
 * Main module of the application.
 */

var angularApp = angular.module('mateSearchTestApp', ['ngRoute','route-segment','view-segment']); 

angularApp.config(function($routeProvider, $routeSegmentProvider) {
	
	$routeSegmentProvider
						 .when('/','service')
						 .segment('service',
								 {
							 		templateUrl : 'views/service.html',
							 		controller : 'serviceController'
								 })
  });
