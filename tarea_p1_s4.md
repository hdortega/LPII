Implementación del Patrón Repository en Quarkus
¿Qué es el patrón de diseño Repository y cuál es su principal objetivo en aplicaciones REST?
El patrón de diseño Repository es una abstracción que separa la lógica de acceso a datos de la lógica de negocio. Su principal objetivo en aplicaciones REST es proporcionar una capa intermedia que maneje las operaciones de persistencia, permitiendo que la lógica de negocio no dependa directamente de la base de datos.

Explica cómo separar la lógica de negocio del acceso a datos al implementar el patrón Repository
Para separar la lógica de negocio del acceso a datos al implementar el patrón Repository, se pueden seguir estos pasos:

Crear una interfaz Repository: Define los métodos de acceso a datos que serán utilizados por la lógica de negocio.

Implementar la interfaz Repository: Crea una clase que implemente la interfaz y contenga la lógica específica de acceso a datos.

Inyectar el Repository en la lógica de negocio: Utiliza inyección de dependencias para proporcionar una instancia del Repository a la clase que contiene la lógica de negocio.

¿Qué técnicas se pueden usar para realizar consultas básicas (findAll, findById) en una clase Repository?
En una clase Repository, se pueden usar las siguientes técnicas para realizar consultas básicas:

Métodos de consulta predefinidos: Utilizar métodos como findAll() y findById() proporcionados por frameworks como Quarkus.

Consultas personalizadas: Definir métodos personalizados en la interfaz Repository y utilizar anotaciones como @Query para especificar las consultas.

Criteria API: Utilizar la API de criterios para construir consultas dinámicas de manera programática.

¿Cuáles son las ventajas de implementar el patrón Repository en aplicaciones REST?
Las ventajas de implementar el patrón Repository en aplicaciones REST incluyen:

Separación de responsabilidades: Mantiene la lógica de negocio y el acceso a datos separados, facilitando el mantenimiento y la escalabilidad.

Reutilización de código: Permite reutilizar la lógica de acceso a datos en diferentes partes de la aplicación.

Facilidad de pruebas: Facilita la creación de pruebas unitarias y de integración al permitir el uso de mocks para el acceso a datos.

Flexibilidad: Permite cambiar la implementación de acceso a datos sin afectar la lógica de negocio.