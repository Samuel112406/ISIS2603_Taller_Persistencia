# Taller Persistencia

## Diseño de las relaciones. 
¿En cuál de las entidades (Proyecto o Tarea) quedó la columna de la llave foránea (project_id) en la base de datos? Explica por qué esto es necesario.
R/La llave foránea queda en la entidad Tarea debido a que la relación con proyecto es de 1:N ( muchas tareas para 1 proyecto) y esto permite consultar que tareas tiene un proyecto con mayor facilidad.

Integridad de Datos: Describe qué configuración específica utilizaste para que al borrar un Proyecto desaparezcan sus Tareas. ¿Cuál es la diferencia conceptual entre borrar la tarea de la lista del proyecto vs borrar el proyecto entero?
R/ Lo hice por medio del mapeado y utilizando el orphanRemoval = true y el CascadeType.ALL que es que si elimino el proyecto los orfanos valga la redundancia van a ser eliminado y esto es distinto a borrar una tarea de la lista del proyecto debido a que en el primer caso si un proyecto x tiene 10 tareas al eliminar el proyecto x se eliminan las 10 tareas y en el segundo caso al borrar una de las 10 tareas todavía le quedan otras 9 tareas al proyecto.

R/ El método findByEstado(String estado) funciona porque Spring Data JPA interpreta el nombre del método y genera automáticamente una busqueda filtrando por el atributo estado de TareaEntity. Esto se traduce a una consulta SQL que selecciona todas las tareas cuyo estado sea igual al valor ingresado.

## Enlaces de interés

- [BookstoreBack](https://github.com/Uniandes-isis2603/bookstore-back) -> Repositorio de referencia para el Back
