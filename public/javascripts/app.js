var app = angular.module('umsApp', ['ngRoute','angularUtils.directives.dirPagination']).config(function ($routeProvider) {
    $routeProvider
    .when('/', { templateUrl: '/' })
    .otherwise({redirectTo: '/'})

});





