"use strict";
google.setOnLoadCallback(function() {
	angular.bootstrap(document.body, [ 'myApp' ]);
});
google.load('visualization', '1', {
	packages : [ 'corechart' ]
});
var myApp = myApp || angular.module("myApp", [ "google-chart" ]);

myApp = angular.module("myApp.controllers", []);

// I control the myApp for home page.
myApp.controller("DashBoardController", function($scope) {
	// I contain the list of Users to be rendered.
});

//I control the myApp for commentsDashboard.
myApp.controller("CommentController", function($scope, Userservice) {
	// I contain the list of Users to be rendered.
	$scope.Comments = [];
	$scope.data1 = {};
	$scope.month={"01":"Jan","02":"Feb","03":"March"};
	$scope.data1.dataTable = new google.visualization.DataTable();

	// I contain the ng view values for template.

	loadRemoteData();

	// I apply the remote data to the local scope.
	function applyRemoteData(newComments) {

		$scope.Comments = newComments;
		// console.log($scope.Comments)

		$scope.data1.dataTable.addColumn("string", "Month");
		$scope.data1.dataTable.addColumn("number", "CommentCount");
		console.log($scope.Comments.length);
		for (var x = 0; x < $scope.Comments.length; x++) {
			var dayVal = ($scope.Comments[x].date).toString().substring(10, 8);
			var keyVal=($scope.Comments[x].date).toString().substring(7, 5);		
			//console.log($scope.month[keyVal]);		
		    $scope.data1.dataTable.addRow([$scope.month[keyVal]+ dayVal,$scope.Comments[x].count ]);
		}

	}

	// I load the remote data from the server.
	function loadRemoteData() {

		// The comment service returns a promise.
		Userservice.getComments().then(function(Comments) {

			applyRemoteData(Comments);

		});

	}

	$scope.data1.title = " Number Of Comments vs Time:";

});
myApp.controller("EditedCommentController", function($scope, Userservice) {

	// I contain the list of Users to be rendered.
	$scope.EditedComment = [];

	$scope.data1 = {};
	$scope.editedCommentCount=false;
	$scope.month={"01":"Jan","02":"Feb","03":"March"};
	$scope.data1.dataTable = new google.visualization.DataTable();

	// I contain the ng view values for template.

	loadRemoteData();

	// I apply the remote data to the local scope.
	function applyRemoteData(newEditedComments) {

		$scope.EditedComment = newEditedComments;
		
		$scope.data1.dataTable.addColumn("string", "Month");
		$scope.data1.dataTable.addColumn("number", "CommentCount");
		console.log("called");
		console.log($scope.EditedComment.length);
        if($scope.EditedComment.length>=1){
            $scope.editedCommentCount=true;
		   for (var x = 0; x < $scope.EditedComment.length; x++) {
			var dayVal = ($scope.EditedComment[x].date).toString().substring(10, 8);
			var keyVal=($scope.EditedComment[x].date).toString().substring(7, 5);		
			console.log($scope.month[keyVal]);		
		    $scope.data1.dataTable.addRow([$scope.month[keyVal]+ dayVal,$scope.EditedComment[x].count ]);
		   }
        }
             	
	}

	// I load the remote data from the server.
	function loadRemoteData() {

		// The comment service returns a promise.
		Userservice.getEditedComments().then(function(EditedComments) {

			applyRemoteData(EditedComments);

		});

	}

	$scope.data1.title = " Number Of Edited Comments vs Time:";

});

myApp.controller("UserController", function($scope, Userservice) {

	// I contain the list of Users to be rendered.
	$scope.Users = [];
	$scope.data1 = {};
	$scope.month={"01":"Jan","02":"Feb","03":"March"};
	$scope.data1.dataTable = new google.visualization.DataTable();

	// I contain the ng view values for template.

	loadRemoteData();

	// I apply the remote data to the local scope.
	function applyRemoteData(newUsers) {

		$scope.Users = newUsers;
		//console.log($scope.Users)

		$scope.data1.dataTable.addColumn("string", "User");
		$scope.data1.dataTable.addColumn("number", "CommentCount");

		for (var x = 0; x < $scope.Users.length; x++) {
			console.log($scope.Users[x].count);
			$scope.data1.dataTable.addRow([$scope.Users[x].name,$scope.Users[x].count ]);
		}

	}

	// I load the remote data from the server.
	function loadRemoteData() {

		// The comment service returns a promise.
		Userservice.getUsers().then(function(Users) {

			applyRemoteData(Users);

		});

	}

	$scope.data1.title = " TopUser vs CommentCount:";

});

myApp.controller("CorrelationController", function($scope, Userservice) {

	// I contain the list of Users to be rendered.
	$scope.correlationData = [];

	$scope.data1 = {};
	$scope.data1.dataTable = new google.visualization.DataTable();

	// I contain the ng view values for template.

	loadRemoteData();

	// I apply the remote data to the local scope.
	function applyRemoteData(newCorrelationData) {

		$scope.correlationData = newCorrelationData;
		// console.log($scope.Comments)

		$scope.data1.dataTable.addColumn("number", "Reputation")
		$scope.data1.dataTable.addColumn("number", "CommentCount")

		for (var x = 0; x < $scope.correlationData.length; x++) {
			$scope.data1.dataTable.addRow([
					$scope.correlationData[x].reputation,
					$scope.correlationData[x].count ]);
		}

	}

	// I load the remote data from the server.
	function loadRemoteData() {

		// The comment service returns a promise.
		Userservice.getCorrelationData().then(function(correlationData) {

			applyRemoteData(correlationData);

		});

	}

	$scope.data1.title = " Reputation vs Number Of Comments Correlation:";

});
