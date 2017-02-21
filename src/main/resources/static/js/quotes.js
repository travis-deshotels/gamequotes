var app = angular.module('quoteApp',[]);

app.controller('quoteCtrl', function($scope, $http) {
	$scope.quotes=[];
	$scope.quotesByGame=[];
	$scope.gameText='';
	
	$scope.getQuotes = function() {
		$http.get("api/quote").then(
			//success
			function(response){
				$scope.quotes = response.data;
			}
		);
	};
	
	$scope.getQuotesByGame = function() {
		$http.get("api/quote/game/"+$scope.gameText).then(
			//success
			function(response){
				$scope.quotesByGame = response.data;
			}
		);
	};
	
	$scope.getQuotes();
});
