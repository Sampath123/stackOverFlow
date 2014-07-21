var myApp =angular.module('myApp', [ 
  'myApp.services',
  'myApp.controllers',
  'google-chart',
  
]);

myApp.config(['$routeProvider',
                   function($routeProvider) {
                     $routeProvider.
                     when('/dashboard', {
                         templateUrl: '/dashboard.html',
                         controller: 'DashBoardController'
                       }). 
                       when('/dashboard/comments', {
                           templateUrl: '/comments.html',
                           controller: 'CommentController'
                         }). 
                       when('/dashboard/edited-comments', {
                           templateUrl: '/editedComments.html',
                           controller: 'EditedCommentController'
                         }).
                         when('/dashboard/top-users', {
                             templateUrl: '/topUser.html',
                             controller: 'UserController'
                           }).
                           when('/dashboard/correlation', {
                               templateUrl: '/correlation.html',
                               controller: 'UserController'
                             }). 
                       otherwise({
                         redirectTo: '/dashboard'
                       });
                   }]);

