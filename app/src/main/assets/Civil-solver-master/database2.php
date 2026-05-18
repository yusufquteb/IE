<?php

$con = new mysqli("localhost", "username", "", "test");

/* check connection */
if ($con->connect_errno) {
    printf("Connect failed: %s\n", $con->connect_error);
    exit();
}



?>