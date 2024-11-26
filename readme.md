### Conexión con la API News
Ya tienes la API News con su respectiva llave funcionando sin ningún problema (En caso de que API News sufriera una caída, contactarse con el relator para gestionar un cambio de API), así que es hora de realizar las configuraciones pertinentes para crear una aplicación de noticias.
1. Gestiona correctamente la configuración de las constantes para tener una construcción ordenada de la API.
2. Utiliza Retrofit para manejar las conexiones de datos que se vayan a generar. No olvides seguir el flujo de navegación para construir correctamente el backend.
3. Debes utilizar Gson para transformar los datos a objetos y poder interactuar con ellos a la hora de realizar el apartado visual y/o interactivo de la aplicación.
4. Analiza la API y crea las data class necesarias para obtener los siguientes datos:
- id
- name
- author
- title
- description
- url
- urlToImage
5. Avanza con la configuración hasta crear el ViewModel y dos funciones: La primera debe permitir capturar la totalidad de noticias en una lista y la segunda, capturar una noticia por su id o name (Analizar cual te conviene más según la respuesta de datos que proporcione la API).
6. Una vez tengas lista la parte del Backend de tu proyecto, súbelo a tu GitHub y copia el enlace dentro de un archivo .txt que subirás a la plataforma del nodo.