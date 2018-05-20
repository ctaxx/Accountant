(function () {
    'use strict'
    var module = angular.module('accountant', ['ngRoute']);
    module.config(function ($routeProvider) {
            $routeProvider
                .when("/show-state", {template: "<show-state></show-state>"})
                .when("/add-in-state", {template: "<add-in-state></add-in-state>"})
                .otherwise({redirectTo:'/add-in-state'});
        });

}())