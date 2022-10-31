# PokemonKruger

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 14.0.6.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.

## Instalacion de Boostrap

Una vez creado el proyecto se procedio a instalar Boostrap con el comando npm install bootstrap@5.2.2

## Creacion de Componentes

Luego se creo 4 componetes los cuales cada uno se asigna para distinta funcionalidad

## 1 header

En este se agrega un Navbar para navegacion de la aplicacion

## 2 Home

Componente para Vista principal de los 10 Pokemons , consumiendo la API que se publico desde el Backend de Spring

## 3 detalle-pokemon

Vista detallada del Pokemon Elegido desde el Home

## 4 Error

Componente que muestra que la ruta que se esta buscando no se encuentra

## Creacion de Rutas

Luego se creo las rutas para los componentes Home, error y Detalle/id (con parametro)

## Creacion de Interface

Se creo una interface con el nombre ippokemon para mapear con el resultado de los endpoints que llegan del Backend

## Creacion de Services /

Se creo un service llamado Pokemon.service.ts el cual sirve para recibir la API que llega desde backend y le realizamos metodos para el retorno de todos los pokemons , y deigual forma para el metodo que retorna un pokemon

## Listar los Pokemons

Para esto se se declaro una vector de tipo Interface y se obtuvo la data que tiene el service , para su posterior paso a la vista del componente home.
En el Home se Inserto una card y mediante el uso de ngFor se recorre el vector de pokenmos y se va mostrando en la card.

## Ver Mas(Detalles)

En esta funcionalidad se creo un metodo en e Home el cual se llama detallepokemon y este recibe un parametro el cual es pasado desde la vista para redireccionar al componente detalle con el id por la url del pokemon seleccionado

## Recepcion de Id Y Vista detalle Pokemon

Para esto como se recibe el Id del pokemon a ver el detalle se accede a service el cual contiene una API que le paso el id y me devuelve un pokemon completo
Luego de esto lo almaceno en una variable y lo muestro por pantalla mediante la variable

## Buscar Pokemon

Para la busqueda primero se crea un input el cual sera donde el usuario ingresa las palabras a buscar
luego se crea un evento input el cual obtiene as letras que se digita por pantalla, se procede a hacer una copia del vector pokemos para poder hacer filter al vector copia pasando como parametro las letras de busqueda que vienen del evento y esto lo igualo al vector principal el cual hace que la vista se cambie dinamicamente de acuerdo a la busqueda que realice....
