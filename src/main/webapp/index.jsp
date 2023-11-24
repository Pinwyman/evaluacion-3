<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
   <title>Login</title>
</head>
<body>
<form action="controladora" method="POST">
      <label>Usuario: </label>
      <input type="text" name="usuario"/><br/>
      <label>Contraseña:</label>
      <input type="text" name="password"/><br/>
      <input type="submit" value="Enviar"/>
</form>
</body>
</html>

