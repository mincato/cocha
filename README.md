# Cocha Hotels: Meta-Search

## Tecnologías
* CentOS release 6.6 (Final)
* JDK 1.8.0_31 (en cualquier 1.8.0 podría funcionar)
* JBoss EAP 6.4.0.GA
* Apache Camel 2.15.3
* Spring 4.1.6.RELEASE
* MySQL 5.1.73
* Maven 3.3.3

## GitLab
https://gitlab.com/centaurico.mate-search/meta-search

## Proyectos
* Mate-Search: Artefacto WAR para desplegar en JBoss EAP 6.4
* Hotel Mapper: Artefacto WAR para desplegar en JBoss EAP 6.4
* Destination Mapper: Artefacto WAR para desplegar en JBoss EAP 6.4
* Feed Downloader: Artefacto WAR para desplegar en JBoss EAP 6.4
* Canonical Model: Artefacto JAR para incluir como librería en otros proyectos
* Util: Artefacto JAR para incluir como librería en otros proyectos

## Armado de Ambiente de Desarrollo

### Oracle JDK Java 8
Descargar e Instalar el Oracle JDK de Oracle:
http://www.oracle.com/technetwork/es/java/javase/downloads/index.html

Configurar las variables de entorno:
export JAVA_HOME=/usr/lib/jvm/java-8-oracle/

### Maven 3.3.3
Descargar y Descomprimir Maven 3.3.3:
https://maven.apache.org/download.cgi

Configurar las variables de entorno:
export M2_HOME=/opt/apache/apache-maven-3.3.3
export M2=$M2_HOME/bin
export PATH=$M2:$PATH

### JBoss 6.4.0
Descargar y Descomprimir el ZIP (versión standalone) de JBoss EAP 6.4.0:
http://www.jboss.org/products/eap/download/

Configurar las variables de entorno:
export JBOSS_HOME=/opt/jboss/jboss-eap-6.4

En la carpeta .m2 de Maven, renombrar el repository existente y el settings.xml que exista y crear un settings.xml con el contenido de este archivo:
https://github.com/jboss-developer/jboss-eap-quickstarts/blob/6.4.x/settings.xml

### Eclipse
Para importar los proyectos Maven en eclipse, primero se deben convertir en proyectos Eclipse, parados sobre el ROOT del proyecto y usando el comando:

mvn eclipse:eclipse -DdownloadSources=true