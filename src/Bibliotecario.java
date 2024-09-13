public class Bibliotecario extends Persona implements Gestionable {
    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
    }
    // Usar los getters para acceder a los datos del bibliotecario
    @Override
    public void mostrarDatos() {
        System.out.println("Bibliotecario: " + getNombre() + " " + getApellido());
    }
    //logica para evaluar si puedo prestar un libro o ya tengo el maximo de libos permitidos
    @Override
    public void prestarLibro(Libro libro, Usuario usuario) {
        if (usuario.getPrestamos() >= 3) {
            System.out.println("El usuario ya tiene el máximo de préstamos permitidos.");
        } else if (!libro.estaDisponible()) {
            System.out.println("El libro no está disponible.");
        } else {
            libro.prestar();
            usuario.incrementarPrestamos();
            System.out.println("Libro prestado a " + usuario.getNombre());
        }
    }
//logica para llevar el conteo de los libros, coloco el libro como disponible nuevamente, reduce la cantidad de libros prestados del usuario y me muestra un mensaje indicando que ya entregaron los libros
    @Override
    public void devolverLibro(Libro libro, Usuario usuario) {
        libro.devolver();
        usuario.decrementarPrestamos();
        System.out.println("Libro devuelto por " + usuario.getNombre());
    }
}
