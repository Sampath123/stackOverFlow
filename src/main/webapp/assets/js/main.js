"use strict";

/*We need to manually start angular as we need to
wait for the google charting libs to be ready*/  
google.setOnLoadCallback(function () {  
    angular.bootstrap(document.body, ['my-app']);
});
google.load('visualization', '1', {packages: ['corechart']});


var myApp = myApp || angular.module("my-app",["google-chart"]);

myApp.controller("IndexCtrl",function($scope){  
    $scope.data1 = {};
    $scope.data1.dataTable = new google.visualization.DataTable();
    $scope.data1.dataTable.addColumn("string","Month")
    $scope.data1.dataTable.addColumn("number","CommentCount")
    $scope.data1.dataTable.addRow(["Jan1",10]);
    $scope.data1.dataTable.addRow(["Jan2",1]);
    $scope.data1.dataTable.addRow(["Jan3",5]);
    $scope.data1.dataTable.addRow(["Jan4",3]);
    $scope.data1.dataTable.addRow(["Jan5",4]);
    $scope.data1.dataTable.addRow(["Jan6",5]);
    $scope.data1.dataTable.addRow(["Jan7",5]);
    $scope.data1.dataTable.addRow(["Jan8",2]);
    $scope.data1.title=" Number Of Comments over time"

   
});
