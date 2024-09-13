import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Crear instancias de Usuario, Bibliotecario y Libro
        Usuario usuario1 = new Usuario("Juan", "Pérez");
        Usuario usuario2 = new Usuario("María", "Gómez");

        Bibliotecario bibliotecario = new Bibliotecario("Carlos", "Ramírez");

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "12345");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "67890");
        Libro libro3 = new Libro("1984", "George Orwell", "11223");

        // 2. Simulación de préstamos
        bibliotecario.prestarLibro(libro1, usuario1);
        bibliotecario.prestarLibro(libro2, usuario1);
        bibliotecario.prestarLibro(libro3, usuario1);

        // Simulación de préstamo con límite de libros
        bibliotecario.prestarLibro(libro3, usuario1); // Este préstamo debería fallar porque ya tiene 3 libros

        // 3. Simulación de devolución de libros
        bibliotecario.devolverLibro(libro2, usuario1);

        // 4. Mostrar datos de usuarios y bibliotecarios
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        bibliotecario.mostrarDatos();

        // 5. Contar el total de libros prestados
        List<Libro> libros = new ArrayList<>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);

        long librosPrestadosPOO = libros.stream()
                .filter(libro -> !libro.estaDisponible())  // Filtrar los libros que no están disponibles (prestados)
                .count();
        System.out.println("Total de libros prestados (POO): " + librosPrestadosPOO);

        // 6. Contar el total de libros prestados usando Programación Funcional
        long librosPrestadosFuncional = libros.stream()
                .map(Libro::estaDisponible)                // Mapear para obtener el estado de disponibilidad
                .filter(disponible -> !disponible)         // Filtrar los que no están disponibles
                .count();
        System.out.println("Total de libros prestados (Funcional): " + librosPrestadosFuncional);
    }
}
