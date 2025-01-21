Conceptos Cliente-Servidor
Explica el modelo cliente-servidor y sus componentes principales.
El modelo cliente-servidor es una arquitectura de red donde los clientes solicitan servicios y los servidores los proporcionan. Los componentes principales son:

Cliente: Dispositivo o aplicación que solicita servicios o recursos.

Servidor: Dispositivo o aplicación que proporciona servicios o recursos.

Red: Medio de comunicación que conecta clientes y servidores.

Describe el ciclo de vida de una solicitud HTTP en un sistema cliente-servidor.
Cliente envía solicitud: El cliente envía una solicitud HTTP al servidor.

Servidor recibe solicitud: El servidor recibe y procesa la solicitud.

Servidor genera respuesta: El servidor genera una respuesta HTTP basada en la solicitud.

Servidor envía respuesta: El servidor envía la respuesta al cliente.

Cliente recibe respuesta: El cliente recibe y procesa la respuesta.

¿Cuál es la diferencia entre el estado de la conexión y el estado de los datos en el contexto de una arquitectura cliente-servidor?
Estado de la conexión: Se refiere a la información sobre la conexión de red entre el cliente y el servidor, como la duración y el estado actual de la conexión.

Estado de los datos: Se refiere a la información sobre los datos que se están procesando o almacenando, como el contenido de una base de datos o los datos de una sesión de usuario.

Define la comunicación sin estado ("stateless") en REST y su importancia en el modelo cliente-servidor.
La comunicación sin estado en REST significa que cada solicitud del cliente contiene toda la información necesaria para ser procesada, sin depender de información almacenada en el servidor de solicitudes anteriores. Esto es importante porque:

Escalabilidad: Facilita la distribución de las solicitudes entre múltiples servidores.

Simplicidad: Reduce la complejidad del servidor al no tener que mantener el estado de las solicitudes.

¿Qué es un contrato de API y cómo ayuda en la interacción cliente-servidor?
Un contrato de API es una especificación que define cómo interactúan el cliente y el servidor a través de la API. Incluye detalles sobre los endpoints, métodos HTTP, parámetros y formatos de datos. Ayuda en la interacción cliente-servidor al:

Claridad: Proporciona una guía clara sobre cómo utilizar la API.

Consistencia: Asegura que las solicitudes y respuestas sigan un formato consistente.

Interoperabilidad: Facilita la integración entre diferentes sistemas y aplicaciones.