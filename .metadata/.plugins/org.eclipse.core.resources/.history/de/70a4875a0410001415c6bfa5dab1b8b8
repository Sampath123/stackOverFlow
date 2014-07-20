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
	$scope.data1.dataTable = new google.visualization.DataTable();

	// I contain the ng view values for template.

	loadRemoteData();

	// I apply the remote data to the local scope.
	function applyRemoteData(newComments) {

		$scope.Comments = newComments;
		// console.log($scope.Comments)

		$scope.data1.dataTable.addColumn("string", "Month")
		$scope.data1.dataTable.addColumn("number", "CommentCount")

		for (var x = 0; x < $scope.Comments.length; x++) {
			var dayVal = ($scope.Comments[x].date).toString().substring(10, 8);
			//console.log(dayVal);
			$scope.data1.dataTable.addRow([ "Jan" + dayVal,
					$scope.Comments[x].count ]);
		}

	}

	// I load the remote data from the server.
	function loadRemoteData() {

		// The comment service returns a promise.
		Userservice.getComments().then(function(Comments) {

			applyRemoteData(Comments);

		});

	}

	$scope.data1.title = " Number Of Comments vs time:"

});
myApp.controller("EditedCommentController", function($scope, Userservice) {

	// I contain the list of Users to be rendered.
	$scope.EditedComment = [];

	$scope.data1 = {};
	$scope.data1.dataTable = new google.visualization.DataTable();

	// I contain the ng view values for template.

	loadRemoteData();

	// I apply the remote data to the local scope.
	function applyRemoteData(newEditedComments) {

		$scope.EditedComment = newEditedComments;
		console.log($scope.EditedComment)

		$scope.data1.dataTable.addColumn("string", "Month")
		$scope.data1.dataTable.addColumn("number", "CommentCount")

		for (var x = 0; x < $scope.EditedComment.length; x++) {
			var dayVal = ($scope.EditedComment[x].date).toString().substring(
					10, 8);
			console.log(dayVal);
			$scope.data1.dataTable.addRow([ "Jan" + dayVal,
					$scope.EditedComment[x].count ]);
		}

	}

	// I load the remote data from the server.
	function loadRemoteData() {

		// The comment service returns a promise.
		Userservice.getEditedComments().then(function(EditedComments) {

			applyRemoteData(EditedComments);

		});

	}

	$scope.data1.title = " Number Of Edited comments vs time:"

});

myApp.controller("UserController", function($scope, Userservice) {

	// I contain the list of Users to be rendered.
	$scope.Users = [];
	$scope.data1 = {};
	$scope.data1.dataTable = new google.visualization.DataTable();

	// I contain the ng view values for template.

	loadRemoteData();

	// I apply the remote data to the local scope.
	function applyRemoteData(newUsers) {

		$scope.Users = newUsers;
		//console.log($scope.Users)

		$scope.data1.dataTable.addColumn("string", "User")
		$scope.data1.dataTable.addColumn("number", "CommentCount")

		for (var x = 0; x < $scope.Users.length; x++) {
			console.log($scope.Users[x].count);
			$scope.data1.dataTable.addRow([
					"User( id = " + $scope.Users[x].id + ")",
					$scope.Users[x].count ]);
		}

	}

	// I load the remote data from the server.
	function loadRemoteData() {

		// The comment service returns a promise.
		Userservice.getUsers().then(function(Users) {

			applyRemoteData(Users);

		});

	}

	$scope.data1.title = " Top User vs comment count:"

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

	$scope.data1.title = " Reputation vs Number Of Comments correlation:"

});
