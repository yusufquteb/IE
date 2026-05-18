<?php
session_start();
setcookie("chat_room","Messages",time() +3600 * 10,"/",TRUE,TRUE);
include 'database2.php';
include 'inc/fun.php';
if (!isset($_SESSION['user_name'])) {
  header("location:index.php");
}else{
 ?>
<!DOCTYPE html>
<html>
<head>
  <title>Open forum</title>
  <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/home_style.css" type="text/css">
  <link rel="stylesheet" href="css/button.css" type="text/css">
   <link rel="stylesheet" href="css/animate.css" type="text/css">
   <style>
     .inputplace{
       position:fixed;
       width:100%;
       bottom: 1px;
    z-index: 2000;
     }
.hidebutton{
      position: absolute;
    top: -6px;
    
    z-index: 1000;
  background: rgb(9, 80, 9);
    box-shadow: 0 4px 10px 0 rgba(0, 0, 0, 0.2), 0 4px 20px 0 rgba(0, 0, 0, 0.19);
    font-size: 14px;
    border: 1px solid transparent;
    transition: 0.2s;
    font-family: sans-serif;
    cursor: pointer;
    WIDTH: fit-content;
    padding: 8px;
    margin: 10px;
    color: white;
    border-radius: 5px;

}
.hidebutton:hover {
    color: rgb(3, 65, 3);
    background: white;
}

     #posts{
  background: white;
  border: 1.7px solid #6c6b6b;
  border-radius: 10px;
  margin-top: 5px;
font-family: sans-serif;
  margin-left: 7px;
}

#users{
  font-size:18px;
  font-family: sans-serif;
}
hr{
 margin-top: 15px;
      margin-bottom: 15px;
      border-top: 1px solid #7e817e;
      /* border-top: 1px solid #03A9F4; */
      }
#posts p {
  margin-left: 20px;
  margin-top: 5px;
  margin-right:10px;
  overflow-wrap:break-word;
}
   .buttonss {
    background: rgb(9, 80, 9);
    box-shadow: 0 4px 10px 0 rgba(0, 0, 0, 0.2), 0 4px 20px 0 rgba(0, 0, 0, 0.19);
    font-size: 17px;
    border: 1px solid transparent;
    transition: 0.2s;
    font-family: sans-serif;
    cursor: pointer;
    WIDTH: fit-content;
    padding: 8px;
    margin: 10px;
    color: white;
    border-radius: 5px;
}

.buttonss:hover {
    color: rgb(3, 65, 3);
    background: white;
}
h3{
  font-family: 'Open Sans',
      sans-serif;
}
</style>
   <link rel="stylesheet" href="css/bootstrap.css" type="text/css">
   
   <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
   <!-- Latest compiled and minified CSS -->
 

<!-- Optional theme -->
   
<link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
<script src="https://use.fontawesome.com/37923a8b65.js"></script>
<!-- Latest compiled and minified JavaScript -->
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
  <?php
  $user = $_SESSION['user_name'];
       $get_user = "SELECT * FROM users WHERE user_name='$user'";
       $run_user = mysqli_query($con,$get_user);
       $row = mysqli_fetch_array($run_user);

       $user_id = $row['user_id'];
       $user_name = $row['user_name'];
       echo "
       <h3 align='center'>Welcome $user_name</h3>";
   ?>
  <div>
    <div class="container-fluid">
      <div class="row">
    
    <div class="col-sm-8" id="msg">

<form action="" method="post" id="form" style="margin-bottom: 22px;">
  <div id="txt" style="    height: 87vh;
    overflow-y: auto;
    padding-left: 10px;
    padding-bottom: 20px;
    padding-right: 10px">
<?php get_post(); ?>
  </div>
  <div class="inputplace">
  <div style="display:-webkit-inline-box;width:70%;">
<input type="text" name="msg" class="form-control" placeholder="Write Your Message Here!" required="required">
<button type="submit" name="send" class="buttonss" style="margin:0 0 0 10px;width:80px;font-size:22px;"><i class="fa fa-comments-o" aria-hidden="true"></i></button></div>
</div> 
<?php insert_msg(); ?>
 
</form>
<a  href="logout.php">  <button style="position:fixed;top:2px;right:13px;z-index:1000;" class="buttonss"><i class="fa fa-sign-out" aria-hidden="true"></i>Logout</button></a>
</div>

    
<div  class="col-sm-4" style="height: 87vh;
    overflow-y: auto" >
    <button onclick="hidefun()" id="hidedbutt" class="hidebutton">
Hide members
    </button>
    <script type="text/javascript">
                                        function hidefun() {
                                            // get the clock 
                                            var myClock = document.getElementById('user');

                                            // get the current value of the clock's display property 
                                            var displaySetting = myClock.style.display;

                                            // also get the clock button, so we can change what it says 
                                            var clockButton = document.getElementById('hidedbutt');

                                            // now toggle the clock and the button text, depending on current state
                                            if (displaySetting == 'block') {
                                                // clock is visible. hide it
                                                myClock.style.display = 'none';
                                                clockButton.innerHTML="Show members";
                                            } else {
                                                myClock.style.display = 'block';
                                                clockButton.innerHTML="Hide members";
                                            }
                                        }
                                    </script>
    <div id="user">
    
  <h4 align="center" style="font-family: 'Open Sans',
      sans-serif;">All Members :</h4>

  <hr>
<?php get_user(); ?>

    </div>

</div>

    </div>
</div>


</body>
</html>
<?php  }
/*This was made by Othman El Mzalni (Youtube Channel : Self Learning)*/
?>
