Conceptos Cliente-Servidor (Parte 2)
¿Cómo se realiza la autenticación y autorización en un sistema cliente-servidor basado en REST?
La autenticación y autorización en un sistema REST se realizan generalmente mediante tokens. El cliente envía sus credenciales al servidor, que verifica la autenticidad y devuelve un token de acceso. Este token se incluye en las cabeceras de las solicitudes posteriores para autenticar y autorizar al cliente.

¿Cuál es el papel de los códigos de estado HTTP en la comunicación entre cliente y servidor?
Los códigos de estado HTTP son fundamentales para la comunicación entre cliente y servidor, ya que indican el resultado de la solicitud realizada. Informan al cliente si la solicitud fue exitosa, si hubo un error, o si se requiere alguna acción adicional.

¿Por qué es fundamental devolver el código adecuado y cómo afecta la experiencia del cliente?
Devolver el código adecuado es crucial porque proporciona información clara y precisa sobre el estado de la solicitud. Un código incorrecto puede confundir al cliente y dificultar la resolución de problemas, afectando negativamente la experiencia del usuario.

¿Cómo se define un recurso y por qué es importante mantenerlo como una entidad distinta?
Un recurso en un sistema REST se define como cualquier entidad que puede ser accedida y manipulada mediante una URI (Uniform Resource Identifier). Mantener los recursos como entidades distintas es importante para asegurar una estructura clara y coherente, facilitando la gestión y el acceso a los datos.

¿Qué ventajas ofrece la comunicación sin estado ("stateless") en un servicio REST desde la perspectiva del cliente?
La comunicación sin estado en un servicio REST significa que cada solicitud del cliente contiene toda la información necesaria para ser procesada. Esto ofrece ventajas como la escalabilidad y la simplicidad, ya que el servidor no necesita almacenar el estado de las solicitudes anteriores.

¿Por qué es importante la idempotencia en las operaciones de un servicio REST?
La idempotencia es importante en las operaciones de un servicio REST porque garantiza que realizar la misma operación varias veces produce el mismo resultado. Esto es crucial para la fiabilidad y consistencia del sistema, especialmente en casos de reintentos debido a fallos de comunicación.