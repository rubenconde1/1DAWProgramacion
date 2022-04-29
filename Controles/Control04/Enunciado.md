ControlFicheros

Crea una aplicación con las siguientes características:

Una clase persona con los atributos: nif, nombre, apellidos.
Esos atributos deben ser accesibles para las clases hijas y no accesibles para el resto de clases.
El acceso a esos atributos se hace mediante getters y setters adecuados.

Una clase cliente que hereda de persona con los atributos id, nif, nombre, apellidos, email.
Dichos atributos no deben ser accesibles desde fuera de la clase.
Dicho acceso se realizará mediante los getters y setters apropiados.
Sobreescribe el método toString para mostrar los atributos de un cliente de forma tabular.

Crea una clase PersistenciaCliente con un método write que recibe un ArrayList de clientes de tal forma que escribe en un fichero, llamado "clientes.dat", todos los clientes recibidos en el ArrayList.
Cada cliente se escribe en una línea con los atributos separados por comas.
Crear un método que se llama read, que recibe como parámetro el nombre del fichero a leer y devuelve un ArrayList con los clientes que ha conseguido leer.