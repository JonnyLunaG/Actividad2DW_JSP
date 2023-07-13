<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=, initial-scale=1.0">
        <link rel="stylesheet" href="/css/consultStyle.css">
        <link rel="stylesheet" href="/css/styleIndex.css">
        <title>LOGIN DE USUARIOS</title>
    </head>
    <body>
        <header class="encabezado">
            <div class="ancho">
                <div class="logo">
                    <p>TodoVehi­culos</p>
                </div> 
                <nav>
                    <ul>
                        <li><a href="/">Inicio</a></li>
                        <li><a href="/views/usuarios/registrar.jsp">Registrarse</a></li>
                    </ul>
                </nav>
            </div>

        </header>

        <div id="contenedor">
            <div id="contenido">
                <div id="section">
                    <center>
                        <!-- Alertas y avisos -->
                        ${message}
                        ${Alert}
                        <form class="form-consult" action="/Usuarios" method="post">
                            <h4 class="titleform">LOGIN DE USUARIO</h4>
                            <img src="/images/login.png" width="120" heigth="120">
                            <ul>
                                <li>
                                    <label for="cedula">Cedula:</label>
                                    <input class="controls"  type="number" name="cedula" id="cedula" placeholder="ingrese el numero de cedula" required/>
                                </li>
                                <li>
                                    <label for="password">Password:</label>
                                    <input class="controls"  type="password" name="clave" id="clave" required/>
                                </li>
                            </ul>
                            <input class="btn-buttons"  type="submit" name="accion" value="login">
                        </form>
                    </center>
                </div>
            </div>
        </div>
    </body>
</html>