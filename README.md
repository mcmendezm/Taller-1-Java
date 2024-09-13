# Taller-1-Java

Este es un sistema básico de gestión de biblioteca en Java, que permite gestionar libros, usuarios y bibliotecarios, así como realizar préstamos y devoluciones de libros.

## Funcionalidades

- **Prestar libros**: Los usuarios pueden tomar prestados hasta un máximo de 3 libros.
- **Devolver libros**: Los usuarios pueden devolver los libros prestados.
- **Gestión por bibliotecarios**: Los bibliotecarios son responsables de realizar los préstamos y devoluciones.
- **Control de disponibilidad de libros**: Los libros tienen un estado de disponibilidad que cambia al ser prestados o devueltos.

## Tecnologías

- **Lenguaje**: Java
- **Control de versiones**: Git
- **Herramientas**: IntelliJ IDEA, Eclipse, o cualquier IDE compatible con Java.

## Estructura del Proyecto

- **Persona**: Clase abstracta base para `Usuario` y `Bibliotecario`.
- **Usuario**: Representa a los clientes que pueden pedir libros prestados.
- **Bibliotecario**: Administra los préstamos y devoluciones.
- **Libro**: Clase que gestiona los libros, con atributos como título, autor, ISBN y disponibilidad.
- **Main**: Clase principal que simula las operaciones del sistema.
## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/mcmendezm/Taller-1-Java.git

## Uso
Crear instancias de Usuario, Bibliotecario y Libro.
Utilizar el bibliotecario para prestar libros a los usuarios.
Realizar la devolución de libros y mostrar información de los usuarios.
```bash
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan", "Pérez");
        Bibliotecario bibliotecario = new Bibliotecario("Carlos", "Ramírez");
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "12345");

        // Prestar un libro
        bibliotecario.prestarLibro(libro1, usuario1);

        // Devolver un libro
        bibliotecario.devolverLibro(libro1, usuario1);

        // Mostrar datos del usuario
        usuario1.mostrarDatos();
    }
}
