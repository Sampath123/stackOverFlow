 <div ng-controller="EditedCommentController">
  <div class="col-md-12">
  <h1>Edited Comments Over Time </h1>
  </div>
  <div google-chart="ColumnChart" ng-model="data1" class="bigGraph"></div>	
  <table class="table table-bordered table-hover">
     <thead >
  	   	<tr>
			<td>User ID</td>
			<td>Comment Count</td>
		</tr>
	 </thead>
	 <tbody>
	 	<tr ng-repeat="editedcomment in EditedComment">
		<td>{{ editedcomment.date}} </td>
		<td> {{ editedcomment.count }} </td>
	</tbody>    
 </table>        
</div>
