"use strict";var angularApp=angular.module("mateSearchTestApp",["ngRoute","route-segment","view-segment"]);angularApp.config(["$routeProvider","$routeSegmentProvider",function(a,b){b.when("/","service").segment("service",{templateUrl:"views/service.html",controller:"serviceController"})}]);var serviceMateSearch=angular.module("mateSearchTestApp");serviceMateSearch.controller("serviceController",["$scope","$http","$location",function(a,b,c){a.hotel={},a.search=function(d){"all"==d.service&&b.get("http://"+c.host()+":"+c.port()+"/mate-search/mate/availability?idHotel="+d.idSupplier+"&arrival_date="+d.arrivalDate+"&departure_date="+d.departureDate).success(function(b){a.hotel=b,a.hotel.arrivalDate=d.arrivalDate,a.hotel.departureDate=d.departureDate,a.hotel.service=d.service}),"booking"==d.service&&b.get("http://"+c.host()+":"+c.port()+"/mate-search/booking/send?idHotel="+d.idSupplier+"&arrival_date="+d.arrivalDate+"&departure_date="+d.departureDate).success(function(b){a.hotel=b,a.hotel.arrivalDate=d.arrivalDate,a.hotel.departureDate=d.departureDate,a.hotel.service=d.service}),"ean"==d.service&&b.get("http://"+c.host()+":"+c.port()+"/mate-search/ean/send?idHotel="+d.idSupplier+"&arrival_date="+d.arrivalDate+"&departure_date="+d.departureDate).success(function(b){a.hotel=b,a.hotel.arrivalDate=d.arrivalDate,a.hotel.departureDate=d.departureDate,a.hotel.service=d.service}),"sabre"==d.service}}]),angular.module("mateSearchUiApp").run(["$templateCache",function(a){a.put("views/service.html",'<div ng-controller="serviceController"> <form novalidate id="fromAvailability"> ID Hotel: <input type="text" ng-model="hotel.idSupplier"><br> Arrival Date: <input type="text" ng-model="hotel.arrivalDate"><br> Departure Date: <input type="text" ng-model="hotel.departureDate"><br> <input type="radio" ng-model="hotel.service" value="all">All<br> <input type="radio" ng-model="hotel.service" value="booking">Booking<br> <input type="radio" ng-model="hotel.service" value="ean">EAN<br> <input type="radio" ng-model="hotel.service" value="sabre">Sabre<br> <input type="button" ng-click="search(hotel)" value="Search"> </form> <div class="md-list-item-text"> Result:<br> {{hotel.roomDetail.roomDescription}} </div> </div>')}]);