var app = angular.module('app', []);
app.controller('loginController', function($scope, $http, $location) {
	$scope.login = function(username, password){
		var url = "http://localhost:8090/User/logar/";
		var data = {
            username: username,
            password: password
        };
		
		$http.post(url, data).then(function (response) {
			$scope.postResultMessage = "Sucessful!";
		}, function (response) {
			$scope.postResultMessage = "Fail!";
		});
		
	}
});

app.controller('restaurantsController', function($scope, $http) {
    $http.get('http://localhost:8090/restaurants/all').
        then(function(response) {
         $scope.rests = response.data;
        });
});

app.controller('usuariosController', function($scope, $http) {
    $http.get('http://localhost:8090/User/all').
        then(function(response) {
         $scope.users = response.data;
        });
});
 
