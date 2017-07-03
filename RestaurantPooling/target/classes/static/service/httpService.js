(function () {

    'use strict';

    function HttpService($http, environmentConfig) {

        var sugarCoreUrl = environmentConfig.api;

        this.getsugarCoreUrl = function() {
            return sugarCoreUrl;
        };

        this.get = function (module, id) {
            var url = sugarCoreUrl + module;

            if (id)
                url = url + '' + id;

            return $http.get(url);
        };

        this.getExternal = function (module) {
            return $http.get(module);
        };

        this.post = function (module, payload) {
            return $http.post(sugarCoreUrl + module, payload);
        };

        this.put = function (module, payload) {
            return $http.put(sugarCoreUrl + module, payload);
        };

        this.delete = function (module, id) {
            return $http.delete(sugarCoreUrl + module + id);
        };

    }

    HttpService.$inject = [ '$http', 'environmentConfig' ];

    angular.module('app').service('httpService', HttpService);

}());