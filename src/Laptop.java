public class Laptop extends Producto implements Vendible {
    private String procesador;
    private String memoriaRam;

    public Laptop(String marca, Double precio, int cantidadStock, String nombre, String procesador, String memoriaRam) {
        super(marca, precio, cantidadStock, nombre);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    @Override
    void mostrarDetalles() {

            System.out.println("Laptop: " + nombre + ", Marca: " + marca + ", Procesador: " + procesador +
                    ", Memoria RAM: " + memoriaRam + "GB, Precio: " + precio + ", Stock: " + cantidadStock);
        }


    @Override
    public void calcularPrecioVenta(int cantidad) {
        double precioTotal = precio * cantidad;
        if (cantidad > 5) {
          precioTotal *= 0.10;
        }
        System.out.println("precio total"+precioTotal);
    }
}

