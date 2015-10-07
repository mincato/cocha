'use strict';

var angularApp = angular.module('mateSearchTestApp', ['ngRoute','route-segment','view-segment','ngMaterial']);

angularApp.config(function($routeProvider, $routeSegmentProvider) {

	$routeSegmentProvider
						 .when('/','service')
						 .segment('service',
								 {
							 		templateUrl : 'views/service.html',
							 		controller : 'serviceController'
								 })
  });
