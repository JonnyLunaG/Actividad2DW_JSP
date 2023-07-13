<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    if(session.getAttribute("email")==null){
        response.sendRedirect("/index.jsp"); 
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <link rel="stylesheet" href="/css/consultStyle.css">
    <link rel="stylesheet" href="/css/styleIndex.css">
    <title>SISTEMA</title>
</head>
<body>
    <div id="contenedor">
        <%@ include file="/includes/headerIndex.jsp" %>        
        <div>
            <center>
                    <br>
                    <img src="/images/marcas.png" width="700" margin-bottom="20px">
            </center>
        </div>

    </div>
</body>
</html>