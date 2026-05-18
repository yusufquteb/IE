<?php include 'database.php';
?>
<?php
 if (isset($_POST["getanalisedi"])) {



     $namee = $_POST["analisediaryy"];
$dataPoints = array();
$dataPointss = array();

//Best practice is to create a separate file for handling connection to database
try{
    
     // Creating a new connection.
    // Replace your-hostname, your-db, your-username, your-password according to your database
    $link = new \PDO(   'mysql:host=localhost;dbname=test;charset=utf8mb4', //'mysql:host=localhost;dbname=canvasjs_db;charset=utf8mb4',
                        'username','' //'root',
                        , //'',
                        array(
                            \PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
                            \PDO::ATTR_PERSISTENT => false
                        )
                    );
    
     $handle = $link->prepare('SELECT cost,activity,clost
FROM ajmal_project
where  projectName="' .$namee. '"
UNION ALL
SELECT cost1,activity1,clost1
FROM ajmal_project
where cost>0 and clost>0 and projectName="' .$namee. '"
UNION ALL
SELECT cost2,activity2,clost2
FROM ajmal_project
where cost>0 and clost>0 and projectName="' .$namee. '"
UNION ALL
SELECT cost3,activity3,clost3
FROM ajmal_project
where cost>0 and clost>0 and projectName="' .$namee. '"');





      


   
  $handle->execute();
 
 
    


    
    $result = $handle->fetchAll(\PDO::FETCH_OBJ);
    
		
    foreach($result as $row){
        
        array_push($dataPoints, array("label"=> $row->activity, "y"=> $row->cost));
        array_push($dataPointss, array( "y"=> $row->clost));
        
        
        
    }
    
	$link = null;
}
catch(\PDOException $ex){
    print($ex->getMessage());
}
}

?>
<!DOCTYPE HTML>
<html>
<head>  
<script>
window.onload = function () {

var chart = new CanvasJS.Chart("chartContainer", {
	exportEnabled: true,
	animationEnabled: true,
	title:{
		text: "Project analise"
	},
	 
    animationEnabled: true, 
		animationDuration: 3000, 
	axisX: {
		title: "Activity names"
	},
	axisY: {
		title: "Cost on planning",
		titleFontColor: "#4F81BC",
		lineColor: "#4F81BC",
		labelFontColor: "#4F81BC",
		tickColor: "#4F81BC"
	},
	axisY2: {
		title: "Cost on excecution",
		titleFontColor: "#51cda0",
		lineColor: "#51cda0",
		labelFontColor: "#51cda0",
		tickColor: "#51cda0"
    },
     theme: "light2",    // "light1", "dark1", "dark2"
	toolTip: {
		shared: true
	},
	legend: {
		cursor: "pointer",
		itemclick: toggleDataSeries
	},
	data: [{
		type: "column",
		name: "Cost on planning",
		showInLegend: true,      
		yValueFormatString: "#,##0.# Rs",
		dataPoints: <?php echo json_encode($dataPoints, JSON_NUMERIC_CHECK); ?>
	},
	{
		type: "column",
		name: "Cost on excecution",
		axisYType: "secondary",
		showInLegend: true,
		yValueFormatString: "#,##0.# Rs",
		dataPoints: <?php echo json_encode($dataPointss, JSON_NUMERIC_CHECK); ?>
    },
   
]
});
chart.render();

function toggleDataSeries(e) {
	if (typeof (e.dataSeries.visible) === "undefined" || e.dataSeries.visible) {
		e.dataSeries.visible = false;
	} else {
		e.dataSeries.visible = true;
	}
	e.chart.render();
}

}
</script>
<meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
   <style>
   #chartContainer{

box-shadow: 0 6px 12px rgba(0,0,0,.175);
   }
   .canvasjs-chart-credit{
display:none;
   }
   </style>
  <title>Civil engineering</title>
</head>
<body>
<form action="" method="post">
<center><div id="diaryanal" style=";margin-top: 10px;">
    
    <input type="text" name="analisediaryy" id="anbkj" placeholder="enter the name of diary" style="padding: 5px;
    min-width: 300px;
    font-family: 'Open sans', sans-serif;">
    <button  name="getanalisedi" style="margin-top:10px;background: #4CAF50;" class="loadscreate">Get
        <i class="fa fa-refresh" style="padding:0px 10px;" aria-hidden="true"></i>
    </button>




</div>
</center>

<div id="chartContainer" style="height: 370px; width: 100%;"></div>

<form action="" method="post" >
<div style="display: flex;">
                <button id="viewbuttond" name="viewbutton" style="margin-top:20px" class="loadscreate">Show diary names
    <i class="fa fa-refresh" style="padding:0px 10px;" aria-hidden="true"></i>
    </button>
    <div id="hide" onclick="hidet()" style="margin-top:20px;margin-left: 10px" class="loadscreate">Hide
    <i class="fa fa-times" style="padding:0px 10px;" aria-hidden="true"></i>
    </div>
    </div>
    <script  type="text/javascript">
    function hidet(){
        var myClock = document.getElementById('hideform');

            // get the current value of the clock's display property 
            var displaySetting = myClock.style.display;

            // also get the clock button, so we can change what it says 
            
            // now toggle the clock and the button text, depending on current state
            if (displaySetting == 'none') {
                // clock is visible. hide it
                myClock.style.display = 'block';
            } else {
                myClock.style.display = 'none';
                
                
            }
    }
    
    </script>
<script>
function diarryxxc(){
   
    document.getElementById("anbkj").focus();
}
</script>
    <?php
    

if (isset($_POST["viewbutton"])) {
    // echo "sdfdsf";
     

mysql_select_db("test", $conn);

$result = "SELECT projectName FROM ajmal_project" ;
$sql=mysql_query($result);

   
?>
<div id="hideform" style="height: 500px; box-shadow: 0 4px 10px 0 rgba(0, 0, 0, 0.2), 0 4px 20px 0 rgba(0, 0, 0, 0.19);margin:20px;background: #f5f5f5;   max-width: 375px;
  padding: 13px;
  overflow-x: auto;margin-top: 20px;" >
  <?php
   if(mysql_num_rows($sql)>0){
    while ($row = mysql_fetch_array($sql)) {
        $var = $row['projectName'];
  
   ?>
  <div onclick="diarryxxc()" style=" padding: 4px;
  font-size: 22px;
  text-align: center;cursor:pointer;
  border: 0.5px solid black;"><?php  echo $var; ?></div>
  <?php }}
    else {
        echo "<script>
        alert('No diary names inserted'); </script>";
        // header('')
    }
    // echo "";
}
    ?>
</div>
    

  
 


    </form>
</form>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</body>

</html>