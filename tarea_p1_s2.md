Introducción a REST y Quarkus
¿Qué es un servicio REST y cuáles son sus principios fundamentales?
Un servicio REST (Representational State Transfer) es un estilo de arquitectura para diseñar servicios web. Sus principios fundamentales incluyen:

Cliente-Servidor: Separación de responsabilidades entre cliente y servidor.

Sin estado (Stateless): Cada solicitud del cliente contiene toda la información necesaria para ser procesada.

Cacheable: Las respuestas deben indicar si son cacheables para mejorar el rendimiento.

Interfaz uniforme: Uso de métodos HTTP estándar y URIs para acceder a los recursos.

Sistema en capas: La arquitectura puede estar compuesta por capas que interactúan entre sí.

¿Qué beneficios tiene Quarkus para el desarrollo de microservicios REST?
Quarkus ofrece varios beneficios para el desarrollo de microservicios REST, tales como:

Tiempo de inicio rápido: Optimiza el tiempo de inicio de las aplicaciones, ideal para entornos de contenedores y serverless.

Bajo consumo de memoria: Reduce el uso de memoria, permitiendo una mayor densidad de instancias en el mismo hardware.

Desarrollo en vivo: Permite la recarga en caliente de cambios en el código sin reiniciar la aplicación.

Integración con tecnologías modernas: Soporte nativo para frameworks y bibliotecas como Hibernate, Kafka, y OpenAPI.

Explica la diferencia entre los métodos HTTP: GET, POST, PUT y DELETE.
GET: Recupera información de un recurso específico. Es idempotente y seguro.

POST: Envía datos al servidor para crear un nuevo recurso. No es idempotente.

PUT: Actualiza un recurso existente o crea uno nuevo si no existe. Es idempotente.

DELETE: Elimina un recurso específico. Es idempotente.

¿Qué significa que un servicio REST sea "stateless" y por qué es importante?
Que un servicio REST sea "stateless" significa que cada solicitud del cliente contiene toda la información necesaria para ser procesada, sin depender de información almacenada en el servidor de solicitudes anteriores. Esto es importante porque:

Escalabilidad: Facilita la distribución de las solicitudes entre múltiples servidores.

Simplicidad: Reduce la complejidad del servidor al no tener que mantener el estado de las solicitudes.

¿Cómo optimiza Quarkus el tiempo de inicio y ejecución para mejorar el rendimiento de las aplicaciones REST?
Quarkus optimiza el tiempo de inicio y ejecución mediante:

Compilación nativa: Utiliza GraalVM para compilar aplicaciones a código nativo, reduciendo el tiempo de inicio y el consumo de memoria.

Carga diferida: Carga solo los componentes necesarios en tiempo de ejecución, mejorando la eficiencia.

Optimización en tiempo de compilación: Realiza optimizaciones en tiempo de compilación para reducir la sobrecarga en tiempo de ejecución.