<?php

$servername = "localhost";
$username = "username";
$password = "";
$conn =  mysql_connect($servername, $username, $password);

// Check connection
if (!$conn)
  {
  die('Could not connect: ' . mysql_error());
  } 


mysql_select_db("test" ,$conn)or die( mysql_error() );



?>