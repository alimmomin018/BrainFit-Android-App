<?php
    $con = mysqli_connect("000webhost.com", "id1250642_admin", "qwerty123", "id1250642_user");
    
    $username = $_POST["username"];
    $password = $_POST["password"];
    
    $statement = mysqli_prepare($con, "SELECT * FROM user WHERE username = ? AND password = ?");
    mysqli_stmt_bind_param($statement, "ss", $username, $password);
    mysqli_stmt_execute($statement);
    
    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $userID, $name, $username, $age, $password);
    
    $response = array();
    $response["success"] = false;  
    
    while(mysqli_stmt_fetch($statement)){
        $response["success"] = true;  
        $response["name"] = $name;	
        $response["username"] = $username;
        $response["age"] = $age;
        $response["password"] = $password;
    }
    
    echo json_encode($response);
?>