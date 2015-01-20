var app = angular.module("PWA_project", ["ngResource", "ngRoute"]); 

app.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/Produits', {
            templateUrl: 'products.html',
            controller: 'prodController'
        }).when('/Accueil', {
            templateUrl: 'index.html'
        }).otherwise({
            redirectTo: '/Accueil'
        });
    }]);

app.controller("catController", ['$scope', '$resource', function ($scope, $resource) {     
        var Cat = $resource(
                'http://localhost:8084/PWA_Banque_RestServer/categories/:identifiant',
                {},
                {
                    query: {method: 'GET', isArray:true},
                    save: {method: 'PUT'},
                    delete: {method: 'DELETE', params: {identifiant: '@name'}}
                }
        );

        $scope.categories = Cat.query();

        $scope.newCat = new Cat();
        $scope.addCategory = function () {
            $scope.newCat.$save();
            $scope.newCat = new Cat();
            $scope.categories = Cat.query();
        };

        $scope.delCategory = function (delCat) {
            delCat.$delete(function () {
                $scope.categories = Cat.query();
            });
        };   
}]);

app.controller("prodController", ['$scope', '$resource', function ($scope, $resource) {
        var Prod = $resource(
                'http://localhost:8084/PWA_Banque_RestServer/products/:identifiant',
                {},
                {
                    query: {method: 'GET', isArray: true},
                    save: {method: 'POST'},
                    update: {method: 'PUT', params: {identifiant: '@name'}},
                    delete: {method: 'DELETE', params: {identifiant: '@name'}}
                }
        );

        function Subscription() {
            this.name;
            this.price;
            this.duration;     
        }

        $scope.products = Prod.query();

        $scope.newProd = new Prod();
        $scope.addProduct = function () {
            $scope.newProd.$save();
            $scope.newProd = new Prod();
            
            $scope.products = Prod.query();
        };
        

        $scope.sub = new Subscription();
        
        $scope.addSub = function (prod) {
            prod.$update($scope.sub, false);
            
            $scope.sub = new Subscription();
        };

        $scope.delSub = function (prod, delSub) {
            prod.$update(delSub, true);
        };

        $scope.delProduct = function (delProd) {
            delProd.$delete(function () {
                $scope.products = Prod.query();
            });
        };
    }]);