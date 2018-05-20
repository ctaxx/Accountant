(function () {
    'use strict'

    angular.module('accountant')
        .component('addInState', {
            templateUrl: 'components/state/add-in-state.component.html',
            controller: ['$http', AddInStateController],
            controllerAs: 'model'
        });

    function AddInStateController($http) {
        var model = this;

        model.add = function () {
            console.log('add function works');
            model.requestData = {};
            model.requestData.id = 31;
            model.requestData.ordr = '2110';
            model.requestData.part = 'Валок';
            model.requestData.quantity = 11;
            model.requestData.currentState = 'wrk';
            console.log(model.requestData);
            $http({
                method: 'GET',
                url: 'http://localhost:8088/addPart',
                params: model.requestData
            }).then(function mySuccess(response){
                console.log("i get response ");
            });
        };

    };
})();