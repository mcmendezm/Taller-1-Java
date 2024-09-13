public class Usuario extends Persona {
    private int prestamos;

    public Usuario(String nombre, String apellido) {
        super(nombre, apellido);
        this.prestamos = 0;
    }
    //logica para llevar el conteo de libros prestados
    public int getPrestamos() {
        return prestamos;
    }

    public void incrementarPrestamos() {
        this.prestamos++;
    }

    public void decrementarPrestamos() {
        this.prestamos--;
    }
    // Usar los getters para acceder a los datos del usurio
    @Override
    public void mostrarDatos() {
        System.out.println("Usuario: " + getNombre() + " " + getApellido());
    }
}
