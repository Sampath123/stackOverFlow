 <div ng-controller="CommentController">
 	<div class="container">
		<h1>Comments Over Time </h1>
	</div>
	<div class="col-sm-1-12">
     		<div form="form">   
   			<div class="form-group leftPlace">
          	<label for="name" required="required">Start Date</label>
          	<input type="date" class="form-control " id="startDate" placeholder="From Date">
        	</div>

        	<div class="form-group leftPlace">
         	<label for="name" required="required">End Date</label>
         	<input type="date" class="form-control " id="endDate" placeholder="To Date">
        	</div>    
         
           <div class="form-group leftPlace"><br>
             <button type="Show" class="btn btn-2 btn-lg" id="show" style="background-color: #A4C8EC;">Show </button>
           </div>
       </div>
   	</div>
    <div class=col-sm-12 ">
		<div google-chart="ColumnChart" ng-model="data1" class="bigGraph"></div>
	</div>	
</div>
	<table class="table table-bordered table-hover">
		<thead >
			<tr >
				<td>Date</td>
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
