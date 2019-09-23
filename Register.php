<?php
    $con = mysqli_connect("000webhost.com", "id1250642_admin", "qwerty123", "id1250642_user");
    
    $name = $_POST["name"];    
    $username = $_POST["username"];	
    $password = $_POST["password"];
    $age = $_POST["age"];
    $statement = mysqli_prepare($con, "INSERT INTO user (name, username, age, password) VALUES (?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "ssis", $name, $username, $age, $password);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>