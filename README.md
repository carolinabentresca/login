# login

# TEMA : login-registro-SpringMVC

#PROYECTO JAVA WEB : Web Application

#CARPETA "WEB-INF" :
  
  - applicationContext.xml : Archivo de config.
  - dispatcher-Servlet.xml : Archivo de config.
  - web.xml : Archivo de config.  
  - jsp :   "index.jsp" / "registro.jsp" / "bien.jsp"/ "datos.jsp" /
  "mod.jsp" / "ok.jsp" / "okUpdate.jsp".
  
#PAQUETE "Config" : 
  
  - CLASE "Conexion" :   Conexion a la base de datos "logeo", mediante JDBC.
  
#PAQUETE "Entity" :   
  
  - CLASE "usuarios" :   Clase entidad, de la tabla "log".
  
#PAQUETE "Controller" : 
  
  - CLASE "Controlador" :  Se encarga de atender los mensajes que manda
    el usuario desde el menu principal "index.htm" y selecciona las vistas
    "registro.htm","bien.htm","datos.htm","mod.htm","ok.htm","okUpdate.htm", que son utilizadas para 
     mostrar el modelo (los datos manejados por la app).
  
