# Archetype #

### Proyectos ###

* Frontend: AngularJS
* Backend: Java (Spring) + MyBatis

Descripción:
============
Este proyecto es un arquetipo para la UI Correctora del Meta Search de Hoteles. En este proyecto se crea una capa de persistencia con Spring Data + MyBatis.

El Front-End está preparado para correr en un Node.js, con el fin de que en un ambiente de desarrollo se pueda trabajar de forma cómoda.

El Back-End es una aplicación Java, armada con Maven, que expone servicios REST con JAX-RS (Apache CXF) y utiliza Spring + MyBatis. Para deployar el Front-End más el Back-End en un Tomcat, el perfil "grunt-build" de Maven se encarga de empaquetar todo en un único WAR listo para copiar a la carpeta "webapps" del contenedor de Servlets.

¡IMPORTANTE!
=============

Si no se construyó nunca el frontend, es necesario que se descarguen todos los node_modules. Parado en el ROOT del proyecto frontend, ejecutar primero el siguiente comando:

> npm install

Esto sólo debe hacerse una vez, o todas las veces que haya habido cambios de librerías en el frontend.

Para desplegar la aplicación web en Tomcat:
===========================================

Parado sobre la carpeta backend del proyecto, ejecutar:

> mvn clean package -Pgrunt-build && cp target/mate-search-backoffice.war $CATALINA_HOME/webapps

Si todo sale bien, la aplicación estará disponible en localhost:8080/mate-search-backoffice.

Para compilar solamente el backend:
===================================

Cuando se está desarrollando en el Back-End Java y no hubo cambios en ningún archivo del Front-End, se puede compilar sólo la parte de Back-End y empaquetar los .class y resources junto con los archivos del Front-End que ya se tenían procesados. Esto es conveniente, ya que la tarea "grunt build" es costosa y demora bastante.

Parado sobre la carpeta backend del proyecto, ejecutar:

> mvn clean package && cp target/mate-search-backoffice.war $CATALINA_HOME/webapps

Si todo sale bien, la aplicación estará disponible en localhost:8080/mate-search-backoffice.

Para levantar sólo el frontend y trabajar en caliente:
=======================================================

Parado sobre la carpeta frontend del proyecto, ejecutar:

> grunt

Si todo sale bien, la aplicación estará disponible en localhost:3000, apuntando a los servicios REST provistos por Tomcat. El Tomcat tiene que estar levantado con el backend ecuchando en el puerto 8080.

