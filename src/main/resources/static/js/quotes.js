var app = angular.module('quoteApp',[]);

app.controller('quoteCtrl', function($scope, $http) {
	$scope.quotes=[];
	$scope.quotesByGame=[];
	$scope.quotesGame=[];
	
	$scope.newQuote={
		"id": 0,
		"quoteText": "",
		"game": ""
	};
	
	$scope.getQuotes = function() {
		$http.get("api/quote").then(
			//success
			function(response){
				$scope.quotes = response.data;
			}
		);
	};
	
	$scope.getQuotesByGamePar = function(x) {
		$http.get("api/quote/game/"+x).then(
				//success
				function(response){
					$scope.quotesByGame = response.data;
				}
			);		
	};
	
	$scope.saveQuote = function() {
		$http.post("api/quote", $scope.newQuote).then(
			function(){
				//success
				$scope.quotes.push({
					"quoteText": $scope.newQuote.quoteText,
					"game": $scope.newQuote.game
				});
				$scope.newQuote={
					quoteText: '',
					game: ''
				};				
			}
		);
	};
	
	//onload
	$scope.getQuotes();
});
