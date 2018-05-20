(function () {
    'use strict'
    angular.module('accountant')
        .component("showState", {
            templateUrl:'components/state/show-statetable.component.html',
            controller: ['$http', ShowStateController],
            controllerAs: 'model'
        });

    function ShowStateController($http) {
        var model = this;
        model.requestData = {};

        model.$onInit = function () {
            console.log("onInit function works");
        };
        model.jump=function () {
            console.log("jmp function works");
            $http({
                method:'GET',
                url:'http://localhost:8088/showAll',
                params: model.requestData
            }).then(function mySuccess(response) {
                console.log("showAll function works");
                model.listOfAll = response.data.listOfAll;
            });
        };
    };
})();