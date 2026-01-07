<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Occurred</title>
        <style>
            body { font-family: Arial, sans-serif; text-align: center; margin-top: 50px; }
            h1 { color: #d9534f; }
            .error-box {
                border: 1px solid #d9534f;
                background-color: #f9d6d5;
                color: #a94442;
                padding: 15px;
                width: 60%;
                margin: 20px auto;
                border-radius: 5px;
                text-align: left;
            }
            .btn { 
                display: inline-block; 
                padding: 10px 20px; 
                background-color: #555; 
                color: white; 
                text-decoration: none; 
                border-radius: 5px; 
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
        <h1>Operation Failed!</h1>
        <p>Something went wrong while trying to process your request.</p>
        
        <div class="error-box">
            <strong>Debug Info:</strong><br>
            <code>${debugError}</code>
        </div>
        
        <a href="index.html" class="btn">Back to Home</a>
    </body>
</html>