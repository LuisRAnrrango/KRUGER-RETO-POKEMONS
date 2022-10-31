# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
# 




##Creacion del Proyecto 
Para esto se instalo Spring tool Suite  y se creo el proyecto seeccionando Spring starter project
seleccionando las dependencias de Spring DATA, Spring Web y Jdbc Para Postgresql 
### creacion de los paquetes
Se crea 4 paquetes los cuales el model es para crear las entidades , el repository para crear la interface implementada  a JPARepository
, el paquete service el cual creamos una clase con los metodos para la logica, el paquete Rest clase se utilizo para crear para crear los endpoints.
### creacion de la clase Pokemon 
Esta clase se crea para la entidad del pokemon  detallando todos su atributos los cuaes se ide en el requerimiento , se crea el constructor con sus respectivos getter y setter
### creacion de LA Interface PokemonRepository
Esto es para hacer un implements a JPARepository  pasando la clase Pokemon  y el Long  del id de la clase
### creacion  de la clase PokemonService
En esta clase se hace la logica para la consulta a la base de datos , creando metodos que devuelvan la lista completa de Pokemos y un Pokemon de acuerdo a su ID.
### Creacion de la clase PokemonRest 
En esta clase creamos los endpoints mediante peticiones GETMapping ,Obteniendo los datos desde service y  los cuales se publican en formato JSON 

### Configuracion del archivo application.properies
En este archivo se realiza la configuracion de conexion de la base de datos PpostgresQl 
Cadena de conexion completa ...

Previo a esto se crea la base de Datos en Postgres  mediante la herramienta PgAdmin4 


 