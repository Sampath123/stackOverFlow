 <div ng-controller="CommentController">
 	<div class="container">
		<h1>Comments Over Time </h1>
	</div>
	<div class="col-md-12 col-sm-12 col-xs-12">
		<div google-chart="ColumnChart" ng-model="data1" class="bigGraph"></div>
	</div>	
	<table class="table table-bordered table-hover">
		<thead >
			<tr >
				<td>User ID</td>
				<td>Comment Count</td>
			</tr>
		</thead>
		<tbody>
			<tr ng-repeat="comment in Comments">
				<td>{{ comment.date}} </td>
				<td> {{ comment.count }} </td>
		    </tr>
	   </tbody>    
   </table>
</div>
