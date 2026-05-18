<!DOCTYPE html>

<?php include 'database.php';
?>

  
 <?php 
 
if (isset($_POST["insertButton"])) {
    $projectName = $_POST["diaryname"];
    $projectType = $_POST["diarytype"];
    $location = $_POST["diarylocation"];
    $slno = $_POST["slno"];
    $activity = $_POST["activity"];
    $scfrom = $_POST["scfrom"];
    $scto = $_POST["scto"];
    $noofdays = $_POST["noofdays"];
    $labname = $_POST["labname"];
    $labnumber = $_POST["labnumber"];
    $matname = $_POST["matname"];
    $matnumber = $_POST["matnumber"];
    $cost = $_POST["cost"];

    $slno1 = $_POST["slno1"];
    $activity1 = $_POST["activity1"];
    $scfrom1 = $_POST["scfrom1"];
    $scto1 = $_POST["scto1"];
    $noofdays1 = $_POST["noofdays1"];
    $labname1 = $_POST["labname1"];
    $labnumber1 = $_POST["labnumber1"];
    $matname1 = $_POST["matname1"];
    $matnumber1 = $_POST["matnumber1"];
    $cost1 = $_POST["cost1"];

    $slno2 = $_POST["slno2"];
    $activity2 = $_POST["activity2"];
    $scfrom2 = $_POST["scfrom2"];
    $scto2 = $_POST["scto2"];
    $noofdays2 = $_POST["noofdays2"];
    $labname2 = $_POST["labname2"];
    $labnumber2 = $_POST["labnumber2"];
    $matname2 = $_POST["matname2"];
    $matnumber2 = $_POST["matnumber2"];
    $cost2 = $_POST["cost2"];

    $slno3 = $_POST["slno3"];
    $activity3 = $_POST["activity3"];
    $scfrom3 = $_POST["scfrom3"];
    $scto3 = $_POST["scto3"];
    $noofdays3 = $_POST["noofdays3"];
    $labname3 = $_POST["labname3"];
    $labnumber3 = $_POST["labnumber3"];
    $matname3 = $_POST["matname3"];
    $matnumber3 = $_POST["matnumber3"];
    $cost3 = $_POST["cost3"];

$sql = "INSERT INTO ajmal_project (projectName, ProjectType, locationn, slNo, activity, schFrom, schTo ,nDays , labourName ,labourNo,materialName,materialNo,cost,slNo1, activity1, schFrom1, schTo1 ,nDays1 , labourName1 ,labourNo1,materialName1,materialNo1,cost1,slNo2, activity2, schFrom2, schTo2 ,nDays2 , labourName2 ,labourNo2,materialName2,materialNo2,cost2,slNo3, activity3, schFrom3, schTo3 ,nDays3 , labourName3 ,labourNo3,materialName3,materialNo3,cost3) VALUES ('$projectName','$projectType','$location','$slno','$activity','$scfrom','$scto','$noofdays','$labname','$labnumber','$matname','$matnumber','$cost','$slno1','$activity1','$scfrom1','$scto1','$noofdays1','$labname1','$labnumber1','$matname1','$matnumber1','$cost1','$slno2','$activity2','$scfrom2','$scto2','$noofdays2','$labname2','$labnumber2','$matname2','$matnumber2','$cost2','$slno3','$activity3','$scfrom3','$scto3','$noofdays3','$labname3','$labnumber3','$matname3','$matnumber3','$cost3')";
 
 
   if(mysql_query($sql,$conn)){
        echo "<script>
        alert('Inserted successsfully'); </script>";
   }else{
        echo "<script>
        alert('Not inserted'); </script>";
   }

 mysql_close($conn);


}

 
// if($sql === FALSE) { 
//     die(mysql_error()); // TODO: better error handling
// }

// }

?>

<?php 
 
if (isset($_POST["excetbutton"])) {
   
    $aslno = $_POST["aslno"];
   
    $ascfrom = $_POST["ascfrom"];
    $ascto = $_POST["ascto"];
    $anoofdays = $_POST["anoofdays"];
    $alabname = $_POST["alabname"];
    $alabnumber = $_POST["alabnumber"];
    $amatname = $_POST["amatname"];
    $amatnumber = $_POST["amatnumber"];
    $acost = $_POST["acost"];

    $aslno1 = $_POST["aslno1"];
   
    $ascfrom1 = $_POST["ascfrom1"];
    $ascto1 = $_POST["ascto1"];
    $anoofdays1 = $_POST["anoofdays1"];
    $alabname1 = $_POST["alabname1"];
    $alabnumber1 = $_POST["alabnumber1"];
    $amatname1 = $_POST["amatname1"];
    $amatnumber1 = $_POST["amatnumber1"];
    $acost1 = $_POST["acost1"];

    $aslno2 = $_POST["aslno2"];
    
    $ascfrom2 = $_POST["ascfrom2"];
    $ascto2 = $_POST["ascto2"];
    $anoofdays2 = $_POST["anoofdays2"];
    $alabname2 = $_POST["alabname2"];
    $alabnumber2 = $_POST["alabnumber2"];
    $amatname2 = $_POST["amatname2"];
    $amatnumber2 = $_POST["amatnumber2"];
    $acost2 = $_POST["acost2"];

    $aslno3 = $_POST["aslno3"];
   
    $ascfrom3 = $_POST["ascfrom3"];
    $ascto3 = $_POST["ascto3"];
    $anoofdays3 = $_POST["anoofdays3"];
    $alabname3 = $_POST["alabname3"];
    $alabnumber3 = $_POST["alabnumber3"];
    $amatname3 = $_POST["amatname3"];
    $amatnumber3 = $_POST["amatnumber3"];
    $acost3 = $_POST["acost3"];
$namew = $_POST["ppnamm"];

$sqll = "UPDATE ajmal_project SET slNo ='$aslno' , schFrom='$ascfrom', schTo='$ascto' ,nDays='$anoofdays' , labourName='$alabname' ,labourNo='$alabnumber',materialName='$amatname',materialNo='$amatnumber',clost='$acost',slNo1='$aslno1', schFrom1='$ascfrom1', schTo1='$ascto1' ,nDays1='$anoofdays1' , labourName1='$alabname1' ,labourNo1='$alabnumber1',materialName1='$amatname1',materialNo1='$amatnumber1',clost1='$acost1',slNo2='$aslno2', schFrom2='$ascfrom2', schTo2='$ascto2' ,nDays2='$anoofdays2' , labourName2='$alabname2' ,labourNo2='$alabnumber2',materialName2='$amatname2',materialNo2='$amatnumber2',clost2='$acost2',slNo3='$aslno3', schFrom3='$ascfrom3', schTo3='$ascto3' ,nDays3='$anoofdays3' , labourName3='$alabname3' ,labourNo3='$alabnumber3',materialName3='$amatname3',materialNo3='$amatnumber3',clost3='$acost3' WHERE projectName= '$namew'" ;
 
 


   if(mysql_query($sqll,$conn)){
        echo "<script>
        alert('Excecuted successsfully'); </script>";
   }else{
      echo "<script>
        alert('Not excecuted'); </script>";
        
   }

 mysql_close($conn);


}

 


?>





<html>

<head>

    <title>Civil engineering</title>

    <script src="js/strcDesin.js"></script>
    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/main.css">
    
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
   
    <link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jspdf/0.9.0rc1/jspdf.min.js"></script>

    <style>
    .tablink {
    background-color: #ff6f5c;
    color: rgb(75, 68, 68);
    float: left;
    border: none;
    font-family: 'Open Sans',
    sans-serif;
   
    transition: 0.2s;
    outline: none;
    cursor: pointer;
    padding: 14px 16px;
    font-size: 18px;
    width: 33.33%;
}
.active,
.tablink:hover {
    background-color: rgb(255, 255, 255);
    color: #000000;

    
}
.tablink1 {
    background-color: #ff6f5c;
    color: rgb(75, 68, 68);
    float: left;
    border: none;
    font-family: 'Open Sans', sans-serif;
    transition: 0.2s;
    outline: none;
    height: 65px;
    cursor: pointer;
    padding: 14px 16px;
    font-size: 18px;
    width: 50%
}

.active,
.tablink1:hover {
    background-color: rgb(255, 255, 255);
    color: #000000;
}
.tabcontent {
   box-shadow: 0 1px 10px 4px rgba(0, 0, 0, 0.39);
    display: none;
    padding: 100px 20px;
    height: 100%;
}
    #Home {
    background: white;
}
        #News {
    background: rgb(255, 255, 255);
}
     #Contact {
     background: rgb(255, 255, 255);
 }
    </style>
    
</head>
<body>
    <center>
        <h1 style="font-family: 'Open Sans',345
         sans-serif;
         font-weight: 600;">Construction diary</h1>
    </center>
    
<div class="container-fluid">


    
        <div class="row">
            <div class="col-sm-9">
                <button class="tablink" onclick="openPage('Home', this, 'white')" id="defaultOpen">Create</button>
<button class="tablink" onclick="openPage('News', this, 'white')">Excecute</button>
<button class="tablink" onclick="openPage('Contact', this, 'white')">Analise</button>
                <div id="Home" class="tabcontent">
<div id="createButton" style="margin-top:20px" onclick="toggleload1()" class="loadscreate">Create new diary
    <i class="fa fa-plus" style="padding:0px 10px;" aria-hidden="true"></i>
</div>
<script type="text/javascript">
    function toggleload1() {
        // get the clock 
        var myClock = document.getElementById('diarydet');

        // get the current value of the clock's display property 
        var displaySetting = myClock.style.display;

        // also get the clock button, so we can change what it says 
        var clockButton = document.getElementById('createButton');

        // now toggle the clock and the button text, depending on current state
        if (displaySetting == 'block') {
            // clock is visible. hide it
            myClock.style.display = 'none';
        } else {
            myClock.style.display = 'block'
        }
       
    }
</script>

<div  id="diarydet"  style="display:none;margin-top:30px;" >
    <form action="" method="post">
<input required id="diname" style=" padding: 5px;
  min-width: 300px;
  font-family: 'Open sans',
  sans-serif;margin:5px 0;" type="text" name="diaryname"  placeholder="enter name of diary"><br>
    <input style=" padding: 5px;
  min-width: 300px;
  font-family: 'Open sans',
  sans-serif;margin:5px 0;" required id="ditype" class="inputt" type="text" name="diarytype"   placeholder="enter type">
    <br>
    <input style=" padding: 5px;
  min-width: 300px;
  font-family: 'Open sans',
  sans-serif;margin:5px 0;" type="text" class="inputt" name="diarylocation"  placeholder="enter location">
    <br>
    <div     onclick="toggleload()"  id="createButton2" style="margin-top: 9px;" class="submitdiary">Save
        <i class="fa fa-check" style="padding:0px 10px;" aria-hidden="true"></i>
</div>

    
    <script type="text/javascript">
        function toggleload() {
             var thete = document.getElementById("diname");
    var rad = document.getElementById("ditype");
    if(thete.value=="" || rad.value==""){
alert("Please enter values..");

    }
        
   
    else {
var myClock = document.getElementById('formm');

            // get the current value of the clock's display property 
            var displaySetting = myClock.style.display;

            // also get the clock button, so we can change what it says 
            
            // now toggle the clock and the button text, depending on current state
            if (displaySetting == 'block') {
                // clock is visible. hide it
                myClock.style.display = 'none';
            } else {
                myClock.style.display = 'block';
                
                
            }
    }
            
            
            
          
        }
    
        </script>

    
<div  class="Diaryform" id="formm" style="display:none;">
    <h3 style="
        font-family: 'Open sans', sans-serif;
    font-weight: 600;
    font-size: 30px;
    letter-spacing: 1px;    position: sticky;
    left: 5px;">Planning:</h3>
        <table>
            <tr>
            <th rowspan="2">Sl:no</th>
            <th>Activity</th>
            <th colspan="2">Schedule</th>
            <th>No: of days</th>
            <th colspan="2">Labours</th>
            <th colspan="2">Materials</th>
            <th>Cost</th>
            </tr>
            <tr>
<th>&nbsp;</th>
<th style="text-align:center;">From</th>
<th style="text-align:center;">To</th>
<th >&nbsp;</th>
<th colspan="2">&nbsp;</th>
<th colspan="2">&nbsp;</th>
<th>&nbsp;</th>

            </tr>
            <tr>
                <td>
                    <input style="width:60px" type="number" name="slno" id="">
                </td>
                <td>
                    <input type="text" name="activity" id="" placeholder="activity name">
                </td>
                <td>
                    <input   type="date" name="scfrom" id="scfromm" >
                </td>
                <td>
                    <input  type="date" name="scto" id="sctoo">
                </td>
                <td>
                    <input type="number" name="noofdays" id="" placeholder="no of days">
                </td>
                <td>
                    <input type="text" name="labname" id="" placeholder="labour type">
                </td>
                <td>
                    <input style="width:60px" type="number" name="labnumber" id="" placeholder="no: of labours">
                </td>
                <td>
                    <input type="text" name="matname" id="" placeholder="material type">
                </td>
                <td>
                    <input style="width:60px" type="number" name="matnumber" id="" placeholder="no of materials">
                </td>
                <td>
                    <input type="number" name="cost" id="">
                </td>
            </tr>
            <tr>
                <td>
                    <input style="width:60px" type="number" name="slno1" id="">
                </td>
                <td>
                    <input type="text" name="activity1" id="" placeholder="activity name">
                </td>
                <td>
                    <input   type="date" name="scfrom1" id="scfromm" >
                </td>
                <td>
                    <input  type="date" name="scto1" id="sctoo">
                </td>
                <td>
                    <input type="number" name="noofdays1" id="" placeholder="no of days">
                </td>
                <td>
                    <input type="text" name="labname1" id="" placeholder="labour type">
                </td>
                <td>
                    <input style="width:60px" type="number" name="labnumber1" id="" placeholder="no: of labours">
                </td>
                <td>
                    <input type="text" name="matname1" id="" placeholder="material type">
                </td>
                <td>
                    <input style="width:60px" type="number" name="matnumber1" id="" placeholder="no of materials">
                </td>
                <td>
                    <input type="number" name="cost1" id="">
                </td>
            </tr>
            <tr>
                <td>
                    <input style="width:60px" type="number" name="slno2" id="">
                </td>
                <td>
                    <input type="text" name="activity2" id="" placeholder="activity name">
                </td>
                <td>
                    <input   type="date" name="scfrom2" id="scfromm" >
                </td>
                <td>
                    <input  type="date" name="scto2" id="sctoo">
                </td>
                <td>
                    <input type="number" name="noofdays2" id="" placeholder="no of days">
                </td>
                <td>
                    <input type="text" name="labname2" id="" placeholder="labour type">
                </td>
                <td>
                    <input style="width:60px" type="number" name="labnumber2" id="" placeholder="no: of labours">
                </td>
                <td>
                    <input type="text" name="matname2" id="" placeholder="material type">
                </td>
                <td>
                    <input style="width:60px" type="number" name="matnumber2" id="" placeholder="no of materials">
                </td>
                <td>
                    <input type="number" name="cost2" id="">
                </td>
            </tr>
            <tr>
                <td>
                    <input style="width:60px" type="number" name="slno3" id="">
                </td>
                <td>
                    <input type="text" name="activity3" id="" placeholder="activity name">
                </td>
                <td>
                    <input   type="date" name="scfrom3" id="scfromm" >
                </td>
                <td>
                    <input  type="date" name="scto3" id="sctoo">
                </td>
                <td>
                    <input type="number" name="noofdays3" id="" placeholder="no of days">
                </td>
                <td>
                    <input type="text" name="labname3" id="" placeholder="labour type">
                </td>
                <td>
                    <input style="width:60px" type="number" name="labnumber3" id="" placeholder="no: of labours">
                </td>
                <td>
                    <input type="text" name="matname3" id="" placeholder="material type">
                </td>
                <td>
                    <input style="width:60px" type="number" name="matnumber3" id="" placeholder="no of materials">
                </td>
                <td>
                    <input type="number" name="cost3" id="">
                </td>
            </tr>
        </table>
        <button name="insertButton"  class="submitdiary">Save<i class="fa fa-check" style="padding:0px 10px;" aria-hidden="true"></i></button>
       
    
</div>
    </form>
</div>

<button id="showdiary" onclick="showmydiary()" style="margin-top:20px" class="loadscreate">Show diary
    <i class="fa fa-refresh" style="padding:0px 10px;" aria-hidden="true"></i>
</button>

<script>
    
    function showmydiary() {
        var myClock = document.getElementById('dataform');
        var myclockw = document.getElementById('getdiaryname');

        // get the current value of the clock's display property 
        var displaySetting = myClock.style.display;

        // also get the clock button, so we can change what it says 

        // now toggle the clock and the button text, depending on current state
        if (displaySetting == 'none') {
            // clock is visible. hide it
            myClock.style.display = 'block';
            myclockw.focus();
        } else {
            myClock.style.display = 'none';


        }
    }
</script>

<div id="dataform" style="display:none;margin-top: 10px;">
    <form action="" method="post">
    <input type="text" name="getdiaryname" placeholder="enter the name of diary" style="padding: 5px;
    min-width: 300px;
    font-family: 'Open sans', sans-serif;">
    <button id="getdiary" name="getaction" style="margin-top:20px;background: #4CAF50;" class="loadscreate">Get
        <i class="fa fa-refresh" style="padding:0px 10px;" aria-hidden="true"></i>
    </button>



    </form>
</div>
<?php



if (isset($_POST["getaction"])) {
    mysql_select_db("test", $conn);
    $name = $_POST["getdiaryname"];
    


$resultt = "SELECT * FROM ajmal_project WHERE projectName='$name'";
$sqll=mysql_query($resultt);

?>
<?php
   if(mysql_num_rows($sqll)>0){
    while ($row = mysql_fetch_array($sqll)) {
        $no = $row['slNo'];
        $no1 = $row['slNo1'];
        $no2 = $row['slNo2'];
        $no3 = $row['slNo3'];
        $act = $row['activity'];
        $act1 = $row['activity1'];
        $act2 = $row['activity2'];
        $act3 = $row['activity3'];
        $schf = $row['schFrom'];
        $schf1 = $row['schFrom1'];
        $schf2 = $row['schFrom2'];
        $schf3 = $row['schFrom3'];
        $scht = $row['schTo'];
        $scht1 = $row['schTo1'];
        $scht2 = $row['schTo2'];
        $scht3 = $row['schTo3'];
        $ndays = $row['nDays'];
        $ndays1 = $row['nDays1'];
        $ndays2 = $row['nDays2'];
        $ndays3 = $row['nDays3'];
         $labname = $row['labourName'];
         $labname1 = $row['labourName1'];
         $labname2 = $row['labourName2'];
         $labname3 = $row['labourName3'];
         $labno = $row['labourNo'];
         $labno1 = $row['labourNo1'];
         $labno2 = $row['labourNo2'];
         $labno3 = $row['labourNo3'];

         $matname = $row['materialName'];
         $matname1 = $row['materialName1'];
         $matname2 = $row['materialName2'];
         $matname3 = $row['materialName3'];

          $matno = $row['materialNo'];
          $matno1 = $row['materialNo1'];
          $matno2 = $row['materialNo2'];
          $matno3 = $row['materialNo3'];

          $cost = $row['cost'];
          $cost1 = $row['cost1'];
          $cost2 = $row['cost2'];
          $cost3 = $row['cost3'];
         
        
  
   ?>
    <div style="width: 100%;
    padding: 20px 10px;
    margin-top: 20px;
    overflow-y: auto;">
   <table style="margin-top:10px;width:100%;">
       <tr>
            <th rowspan="2">Sl:no</th>
            <th>Activity</th>
            <th colspan="2">Schedule</th>
            <th>No: of days</th>
            <th colspan="2">Labours</th>
            <th colspan="2">Materials</th>
            <th>Cost</th>
            </tr>
            <tr>
<th>&nbsp;</th>
<th style="text-align:center;">From</th>
<th style="text-align:center;">To</th>
<th >&nbsp;</th>
<th colspan="2">&nbsp;</th>
<th colspan="2">&nbsp;</th>
<th>&nbsp;</th>

            </tr>
            <tr>
                <td><?php  echo $no; ?></td>
                <td><?php  echo $act; ?></td>
                <td><?php  echo $schf; ?></td>
                <td><?php  echo $scht; ?></td>
                <td><?php  echo $ndays; ?></td>
                <td><?php  echo $labname; ?></td>
                <td><?php  echo $labno; ?></td>
                <td><?php  echo $matname; ?></td>
                <td><?php  echo $matno; ?></td>
                <td><?php  echo $cost; ?></td>
                
            </tr>
            <tr>
                <td><?php  echo $no1; ?></td>
                <td><?php  echo $act1; ?></td>
                <td><?php  echo $schf1; ?></td>
                <td><?php  echo $scht1; ?></td>
                <td><?php  echo $ndays1; ?></td>
                <td><?php  echo $labname1; ?></td>
                <td><?php  echo $labno1; ?></td>
                <td><?php  echo $matname1; ?></td>
                <td><?php  echo $matno1; ?></td>
                <td><?php  echo $cost1; ?></td>
                
            </tr>
             <tr>
                <td><?php  echo $no2; ?></td>
                <td><?php  echo $act2; ?></td>
                <td><?php  echo $schf2; ?></td>
                <td><?php  echo $scht2; ?></td>
                <td><?php  echo $ndays2; ?></td>
                <td><?php  echo $labname2; ?></td>
                <td><?php  echo $labno2; ?></td>
                <td><?php  echo $matname2; ?></td>
                <td><?php  echo $matno2; ?></td>
                <td><?php  echo $cost2; ?></td>
                
            </tr>
             <tr>
                <td><?php  echo $no3; ?></td>
                <td><?php  echo $act3; ?></td>
                <td><?php  echo $schf3; ?></td>
                <td><?php  echo $scht3; ?></td>
                <td><?php  echo $ndays3; ?></td>
                <td><?php  echo $labname3; ?></td>
                <td><?php  echo $labno3; ?></td>
                <td><?php  echo $matname3; ?></td>
                <td><?php  echo $matno3; ?></td>
                <td><?php  echo $cost3; ?></td>
                
            </tr>
   </table>
    </div>
    <?php }}
    else {
        echo "<script>
        alert('Invalid entry'); </script>";
        // header('')
    }
     
}
    ?>
    <button id="printdiary" onclick="printmydiary()" style="margin-top:20px" class="loadscreate">Print diary
    <i class="fa fa-print" style="padding:0px 10px;" aria-hidden="true"></i>
</button>

<script>
    
    function printmydiary() {
        var myClock = document.getElementById('printform');
        var myclockw = document.getElementById('printdiaryname');

        // get the current value of the clock's display property 
        var displaySetting = myClock.style.display;

        // also get the clock button, so we can change what it says 

        // now toggle the clock and the button text, depending on current state
        if (displaySetting == 'none') {
            // clock is visible. hide it
            myClock.style.display = 'block';
            myclockw.focus();
        } else {
            myClock.style.display = 'none';


        }
    }
</script>

<div id="printform" style="display:none;margin-top: 10px;">
    <form action="" method="post">
    <input type="text" name="printdiaryname" placeholder="enter the name of diary" style="padding: 5px;
    min-width: 300px;
    font-family: 'Open sans', sans-serif;">
    <button id="getprintdiary" name="getprintaction" style="margin-top:20px;background: #4CAF50;" class="loadscreate">Get
        <i class="fa fa-refresh" style="padding:0px 10px;" aria-hidden="true"></i>
    </button>

    </form>
</div>
<?php



if (isset($_POST["getprintaction"])) {
    mysql_select_db("test", $conn);
    $name = $_POST["printdiaryname"];
    


$resultt = "SELECT * FROM ajmal_project WHERE projectName='$name'";
$sqll=mysql_query($resultt);

?>
<?php
   if(mysql_num_rows($sqll)>0){
    while ($row = mysql_fetch_array($sqll)) {
        $name = $row['projectName'];
        $type = $row['ProjectType'];
        $loc = $row['locationn'];
        $no = $row['slNo'];
        $no1 = $row['slNo1'];
        $no2 = $row['slNo2'];
        $no3 = $row['slNo3'];
        $act = $row['activity'];
        $act1 = $row['activity1'];
        $act2 = $row['activity2'];
        $act3 = $row['activity3'];
        $schf = $row['schFrom'];
        $schf1 = $row['schFrom1'];
        $schf2 = $row['schFrom2'];
        $schf3 = $row['schFrom3'];
        $scht = $row['schTo'];
        $scht1 = $row['schTo1'];
        $scht2 = $row['schTo2'];
        $scht3 = $row['schTo3'];
        $ndays = $row['nDays'];
        $ndays1 = $row['nDays1'];
        $ndays2 = $row['nDays2'];
        $ndays3 = $row['nDays3'];
         $labname = $row['labourName'];
         $labname1 = $row['labourName1'];
         $labname2 = $row['labourName2'];
         $labname3 = $row['labourName3'];
         $labno = $row['labourNo'];
         $labno1 = $row['labourNo1'];
         $labno2 = $row['labourNo2'];
         $labno3 = $row['labourNo3'];

         $matname = $row['materialName'];
         $matname1 = $row['materialName1'];
         $matname2 = $row['materialName2'];
         $matname3 = $row['materialName3'];

          $matno = $row['materialNo'];
          $matno1 = $row['materialNo1'];
          $matno2 = $row['materialNo2'];
          $matno3 = $row['materialNo3'];

          $cost = $row['cost'];
          $cost1 = $row['cost1'];
          $cost2 = $row['cost2'];
          $cost3 = $row['cost3'];
         
        
  
   ?>
    <div id="content" style="width: 100%;
    padding: 20px 10px;
    margin-top: 20px;
    border:1.4px solid black;
    overflow-y: auto;">
    <label>Project name:</label><label><?php  echo $name; ?></label><br>
    <label>Project type:</label><label><?php  echo $type; ?></label><br>
    <label>Location:</label><label><?php  echo $loc; ?></label>

   <table style="margin-top:10px;width:100%;">
       <tr>
            <th rowspan="2">Sl:no</th>
            <th>Activity</th>
            <th colspan="2">Schedule</th>
            <th>No: of days</th>
            <th colspan="2">Labours</th>
            <th colspan="2">Materials</th>
            <th>Cost</th>
            </tr>
            <tr>
<th>&nbsp;</th>
<th style="text-align:center;">From</th>
<th style="text-align:center;">To</th>
<th >&nbsp;</th>
<th colspan="2">&nbsp;</th>
<th colspan="2">&nbsp;</th>
<th>&nbsp;</th>

            </tr>
            <tr>
                <td><?php  echo $no; ?></td>
                <td><?php  echo $act; ?></td>
                <td><?php  echo $schf; ?></td>
                <td><?php  echo $scht; ?></td>
                <td><?php  echo $ndays; ?></td>
                <td><?php  echo $labname; ?></td>
                <td><?php  echo $labno; ?></td>
                <td><?php  echo $matname; ?></td>
                <td><?php  echo $matno; ?></td>
                <td><?php  echo $cost; ?></td>
                
            </tr>
            <tr>
                <td><?php  echo $no1; ?></td>
                <td><?php  echo $act1; ?></td>
                <td><?php  echo $schf1; ?></td>
                <td><?php  echo $scht1; ?></td>
                <td><?php  echo $ndays1; ?></td>
                <td><?php  echo $labname1; ?></td>
                <td><?php  echo $labno1; ?></td>
                <td><?php  echo $matname1; ?></td>
                <td><?php  echo $matno1; ?></td>
                <td><?php  echo $cost1; ?></td>
                
            </tr>
             <tr>
                <td><?php  echo $no2; ?></td>
                <td><?php  echo $act2; ?></td>
                <td><?php  echo $schf2; ?></td>
                <td><?php  echo $scht2; ?></td>
                <td><?php  echo $ndays2; ?></td>
                <td><?php  echo $labname2; ?></td>
                <td><?php  echo $labno2; ?></td>
                <td><?php  echo $matname2; ?></td>
                <td><?php  echo $matno2; ?></td>
                <td><?php  echo $cost2; ?></td>
                
            </tr>
             <tr>
                <td><?php  echo $no3; ?></td>
                <td><?php  echo $act3; ?></td>
                <td><?php  echo $schf3; ?></td>
                <td><?php  echo $scht3; ?></td>
                <td><?php  echo $ndays3; ?></td>
                <td><?php  echo $labname3; ?></td>
                <td><?php  echo $labno3; ?></td>
                <td><?php  echo $matname3; ?></td>
                <td><?php  echo $matno3; ?></td>
                <td><?php  echo $cost3; ?></td>
                
            </tr>
   </table>
    </div>
    <div id="editor"></div>
   <?php
   echo "<script>
   var doc = new jsPDF();
var specialElementHandlers = {
    '#editor': function (element, renderer) {
        return true;
    }
};

$(document).click(function () {
    doc.fromHTML($('#content').html(), 15, 15, {
        'width': 700,
            'elementHandlers': specialElementHandlers
    });
    doc.save('sample-file.pdf');
});
   </script>";
   }}
    else {
        echo "<script>
        alert('Invalid entry'); </script>";
        // header('')
    }
     
}
?>


    </div>
<div id="News" class="tabcontent">
    <button id="diaryex" onclick="diarryxx()" style="margin-top:20px;display: inherit;" class="loadscreate">Excecute
    <i class="fa fa-refresh" style="padding:0px 10px;" aria-hidden="true"></i>
</button>
<script>
    
    function diarryxx() {
        var myClock = document.getElementById('diaryget');

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
    var myClock = document.getElementById('diaryget');
    myClock.style.display = 'block';
    document.getElementById("idexcc").focus();
}

</script>
<div id="diaryget" style="display:none;margin-top: 10px;">
    <form action="" method="post">
    <input type="text" name="excecdiary" id="idexcc" placeholder="enter the name of diary" style="padding: 5px;
    min-width: 300px;
    font-family: 'Open sans', sans-serif;">
    <button id="exdirry" name="getdiaryact" style="margin-top:20px;background: #4CAF50;" class="loadscreate">Get
        <i class="fa fa-refresh" style="padding:0px 10px;" aria-hidden="true"></i>
    </button>



    
</div>
<?php
if (isset($_POST["getdiaryact"])) {
    mysql_select_db("test", $conn);
    $name = $_POST["excecdiary"];
    


$resultt = "SELECT * FROM ajmal_project WHERE projectName='$name'";
$sqll=mysql_query($resultt);

?>
<?php
   if(mysql_num_rows($sqll)>0){
    while ($row = mysql_fetch_array($sqll)) {
        $ano = $row['slNo'];
        $pname = $row['projectName'];
        $ptype = $row['ProjectType'];
        $ano1 = $row['slNo1'];
        $ano2 = $row['slNo2'];
        $ano3 = $row['slNo3'];
        $aact = $row['activity'];
        $aact1 = $row['activity1'];
        $aact2 = $row['activity2'];
        $aact3 = $row['activity3'];
        $aschf = $row['schFrom'];
        $aschf1 = $row['schFrom1'];
        $aschf2 = $row['schFrom2'];
        $aschf3 = $row['schFrom3'];
        $ascht = $row['schTo'];
        $ascht1 = $row['schTo1'];
        $ascht2 = $row['schTo2'];
        $ascht3 = $row['schTo3'];
        $andays = $row['nDays'];
        $andays1 = $row['nDays1'];
        $andays2 = $row['nDays2'];
        $andays3 = $row['nDays3'];
         $alabname = $row['labourName'];
         $alabname1 = $row['labourName1'];
         $alabname2 = $row['labourName2'];
         $alabname3 = $row['labourName3'];
         $alabno = $row['labourNo'];
         $alabno1 = $row['labourNo1'];
         $alabno2 = $row['labourNo2'];
         $alabno3 = $row['labourNo3'];

         $amatname = $row['materialName'];
         $amatname1 = $row['materialName1'];
         $amatname2 = $row['materialName2'];
         $amatname3 = $row['materialName3'];

          $amatno = $row['materialNo'];
          $amatno1 = $row['materialNo1'];
          $amatno2 = $row['materialNo2'];
          $amatno3 = $row['materialNo3'];

          $acost = $row['cost'];
          $acost1 = $row['cost1'];
          $acost2 = $row['cost2'];
          $acost3 = $row['cost3'];
         
        
  
   ?>
    
   <div style="width: 100%;
    padding: 20px 10px;
    margin-top: 20px;
    overflow-y: auto;">
   
   <h3 style="
        font-family: 'Open sans', sans-serif;
    font-weight: 600;
    font-size: 30px;
    letter-spacing: 1px;    position: sticky;
    left: 5px;">Excecution:</h3>
   <table style="margin-top:10px;">
       <tr>
           <th style="text-align:center;font-size: 17px;font-weight: 700;
    color: #3F51B5" colspan="5">Project Name:<input readonly value="<?php  echo $pname; ?>" style="    border: none;
    padding: 6px" type="text"  name="ppnamm"  ></th>
       <th style="text-align:center;font-size: 17px;font-weight: 700;
    color: #3F51B5"colspan="5">Project type:<input value="<?php  echo $ptype; ?>" style="    border: none;
    padding: 6px" type="text"   ></th>
       
        </tr>
       <tr>
            <th rowspan="2">Sl:no</th>
            <th>Activity</th>
            <th colspan="2">Schedule</th>
            <th>No: of days</th>
            <th colspan="2">Labours</th>
            <th colspan="2">Materials</th>
            <th>Cost</th>
            </tr>
            <tr>
<th>&nbsp;</th>
<th style="text-align:center;">From</th>
<th style="text-align:center;">To</th>
<th >&nbsp;</th>
<th colspan="2">&nbsp;</th>
<th colspan="2">&nbsp;</th>
<th>&nbsp;</th>

            </tr>
              <tr>
                <td>
                    <input value="<?php  echo $ano; ?>" style="width:60px" type="number"  name="aslno"  id="">
                </td>
                <td>
                    <input readonly value="<?php  echo $aact; ?>" type="text" name="aactivity" id="" placeholder="activity name">
                </td>
                <td>
                    <input value="<?php  echo $aschf; ?>"   type="date" name="ascfrom"  >
                </td>
                <td>
                    <input value="<?php  echo $ascht; ?>"  type="date" name="ascto" >
                </td>
                <td>
                    <input value="<?php  echo $andays; ?>" type="number" name="anoofdays" id="" placeholder="no of days">
                </td>
                <td>
                    <input value="<?php  echo $alabname; ?>" type="text" name="alabname" id="" placeholder="labour type">
                </td>
                <td>
                    <input value="<?php  echo $alabno; ?>" style="width:60px" type="number" name="alabnumber" id="" placeholder="no: of labours">
                </td>
                <td>
                    <input value="<?php  echo $amatname; ?>" type="text" name="amatname" id="" placeholder="material type">
                </td>
                <td>
                    <input value="<?php  echo $amatno; ?>" style="width:60px" type="number" name="amatnumber" id="" placeholder="no of materials">
                </td>
                <td>
                    <input value="<?php  echo $acost; ?>" type="number"name="acost" id="">
                </td>
            </tr>
                 <tr>
                <td>
                    <input value="<?php  echo $ano1; ?>" style="width:60px" type="number"  name="aslno1"  id="">
                </td>
                <td>
                    <input readonly value="<?php  echo $aact1; ?>" type="text" name="aactivity1" id="" placeholder="activity name">
                </td>
                <td>
                    <input value="<?php  echo $aschf1; ?>"   type="date" name="ascfrom1"  >
                </td>
                <td>
                    <input value="<?php  echo $ascht1; ?>"  type="date" name="ascto1" >
                </td>
                <td>
                    <input value="<?php  echo $andays1; ?>" type="number" name="anoofdays1" id="" placeholder="no of days">
                </td>
                <td>
                    <input value="<?php  echo $alabname1; ?>" type="text" name="alabname1" id="" placeholder="labour type">
                </td>
                <td>
                    <input value="<?php  echo $alabno1; ?>" style="width:60px" type="number" name="alabnumber1" id="" placeholder="no: of labours">
                </td>
                <td>
                    <input value="<?php  echo $amatname1; ?>" type="text" name="amatname1" id="" placeholder="material type">
                </td>
                <td>
                    <input value="<?php  echo $amatno1; ?>" style="width:60px" type="number" name="amatnumber1" id="" placeholder="no of materials">
                </td>
                <td>
                    <input value="<?php  echo $acost1; ?>" type="number"name="acost1" id="">
                </td>
            </tr>
           <tr>
                <td>
                    <input value="<?php  echo $ano2; ?>" style="width:60px" type="number"  name="aslno2"  id="">
                </td>
                <td>
                    <input readonly value="<?php  echo $aact2; ?>" type="text" name="aactivity2" id="" placeholder="activity name">
                </td>
                <td>
                    <input value="<?php  echo $aschf2; ?>"   type="date" name="ascfrom2"  >
                </td>
                <td>
                    <input value="<?php  echo $ascht2; ?>"  type="date" name="ascto2" >
                </td>
                <td>
                    <input value="<?php  echo $andays2; ?>" type="number" name="anoofdays2" id="" placeholder="no of days">
                </td>
                <td>
                    <input value="<?php  echo $alabname2; ?>" type="text" name="alabname2" id="" placeholder="labour type">
                </td>
                <td>
                    <input value="<?php  echo $alabno2; ?>" style="width:60px" type="number" name="alabnumber2" id="" placeholder="no: of labours">
                </td>
                <td>
                    <input value="<?php  echo $amatname2; ?>" type="text" name="amatname2" id="" placeholder="material type">
                </td>
                <td>
                    <input value="<?php  echo $amatno2; ?>" style="width:60px" type="number" name="amatnumber2" id="" placeholder="no of materials">
                </td>
                <td>
                    <input value="<?php  echo $acost2; ?>" type="number"name="acost2" id="">
                </td>
            </tr>
            <tr>
                <td>
                    <input  value="<?php  echo $ano3; ?>" style="width:60px" type="number"  name="aslno3"  id="">
                </td>
                <td>
                    <input readonly value="<?php  echo $aact3; ?>" type="text" name="aactivity3" id="" placeholder="activity name">
                </td>
                <td>
                    <input value="<?php  echo $aschf3; ?>"   type="date" name="ascfrom3"  >
                </td>
                <td>
                    <input value="<?php  echo $ascht3; ?>"  type="date" name="ascto3" >
                </td>
                <td>
                    <input value="<?php  echo $andays3; ?>" type="number" name="anoofdays3" id="" placeholder="no of days">
                </td>
                <td>
                    <input value="<?php  echo $alabname3; ?>" type="text" name="alabname3" id="" placeholder="labour type">
                </td>
                <td>
                    <input value="<?php  echo $alabno3; ?>" style="width:60px" type="number" name="alabnumber3" id="" placeholder="no: of labours">
                </td>
                <td>
                    <input value="<?php  echo $amatname3; ?>" type="text" name="amatname3" id="" placeholder="material type">
                </td>
                <td>
                    <input value="<?php  echo $amatno3; ?>" style="width:60px" type="number" name="amatnumber3" id="" placeholder="no of materials">
                </td>
                <td>
                    <input value="<?php  echo $acost3; ?>" type="number"name="acost3" id="">
                </td>
            </tr>
   </table>
   <button name="excetbutton" class="submitdiary">Save<i class="fa fa-check" style="padding:0px 10px;" aria-hidden="true"></i></button>
   </div>
    </form>
    <?php }}
    else {
        echo "<script>
        alert('Invalid entry'); </script>";
        // header('')
    }
}

    ?>
</form>
</div>
<div id="Contact" class="tabcontent">
<form method="post" action="charts.php">
    <button   style="margin-top:20px;display: inherit;" class="loadscreate">Analise
    <i class="fa fa-refresh" style="padding:0px 10px;" aria-hidden="true"></i>
</button>
</form>
</div>
</div>


        




      




            
            <div class="col-sm-3">
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

    <?php
    

if (isset($_POST["viewbutton"])) {
    // echo "sdfdsf";
mysql_select_db("test", $conn);

$result = "SELECT projectName FROM ajmal_project" ;
$sql=mysql_query($result);

   
?>
<div id="hideform" style="height: 500px;
    box-shadow: 0 4px 10px 0 rgba(0, 0, 0, 0.2), 0 4px 20px 0 rgba(0, 0, 0, 0.19);
    margin: 20px;
    background:white;
    max-width: 375px;
    padding: 13px;
    overflow-x: auto;
    margin-top: 20px;" >
  <?php
   if(mysql_num_rows($sql)>0){
    while ($row = mysql_fetch_array($sql)) {
        $var = $row['projectName'];
  
   ?>
  <div onclick="diarryxxc()" style=" padding: 4px;
  font-size: 22px;
  text-align: left;cursor:pointer;
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


            </div>
        </div>
    </div>
    
   
</body>
<script>
    function openPage(pageName, elmnt, color, color2) {
        var i, tabcontent, tablinks;
        tabcontent = document.getElementsByClassName("tabcontent");
        for (i = 0; i < tabcontent.length; i++) {
            tabcontent[i].style.display = "none";
        }
        tablinks = document.getElementsByClassName("tablink");
        for (i = 0; i < tablinks.length; i++) {
            tablinks[i].style.backgroundColor = "";
        }
        document.getElementById(pageName).style.display = "block";
        elmnt.style.backgroundColor = color;
        elmnt.style.color = color2;



    }
    // Get the element with id="defaultOpen" and click on it
    document.getElementById("defaultOpen").click();
</script>
</html>