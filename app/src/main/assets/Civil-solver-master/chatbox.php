<?php
session_start();
include 'database2.php';
/*This was made by Othman El Mzalni (Youtube Channel : Self Learning)*/
 ?>
<html>
<head>
  <title>Open forum</title>

<meta charset="utf-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<style>

    /* chatbox */


  body{
  margin: 0 auto;
  padding: 0 auto;
  background-image: url("./images/bg.jpg");
  background-size: cover;
  background-repeat: no-repeat;
}
#form {
    max-width: 400px;
    height: 450px;
    margin-top: 50px;
    transition: 0.4s;
    margin-left: 20px;
    margin-right: 20px;
    background: #0000006c;
    border: 1.3px solid transparent;
}

#form:hover {
    border: 1.3px solid white;
    border-radius: 14px;
    background: #0000006c;
    box-shadow: 0px 0px 6px 0px rgba(255, 255, 255, 0.31), 0 4px 20px 0 rgba(0, 0, 0, 0.19);
}

#form img {
    height: 120px;
}

#form h3 {
    margin-top: 10px;
}

#form input {
    width: 85%;
    border: none;
    background: transparent;
    font-family: 'Open Sans', sans-serif;
    color: white;
    font-size: 15px;
    padding: 10px;
    margin-top: 20px;
}

#form button a {
    color: white;
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

.headdd {
    font-family: 'Open Sans', sans-serif;
    font-size: 30px;
    margin-top: 12px;
}

::-webkit-input-placeholder {
    /* Chrome/Opera/Safari */
    color: white;
}

::-moz-placeholder {
    /* Firefox 19+ */
    color: white;
}

:-ms-input-placeholder {
    /* IE 10+ */
    color: white;
}

:-moz-placeholder {
    /* Firefox 18- */
    color: white;
}</style>
        <link rel="stylesheet" href="css/animate.css" type="text/css">

      
        <!-- Latest compiled and minified CSS -->
        

<!-- Optional theme -->
        
<!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>
        
  <center>
<form action="" method="post" id="form">
<img src="images/logo.png" title="Chat Room">
<input  type="text" style="border-bottom:1px solid white;" name="name" placeholder="User Name" required="required">
<input  type="password" style="border-bottom:1px solid white;" name="pwd" placeholder="Password" required="required">
<br/>
<br>
<button type="submit" name="login" class="buttonss">Login</button>
<span style="color:white;font-family: 'Open Sans',
  sans-serif;">Or</span>
<button type="submit" name="reg" class="buttonss">Sign Up</button>
<br/><br/>
 
<?php include 'login.php'; ?>
</form>
</center>
</body>
</html>
