
public class Celular extends Producto implements Vendible{

    private int capacidadBateria;
    private  int camaraResolucion;

    public Celular(String marca, Double precio, int cantidadStock, String nombre, int capacidadBateria, int camaraResolucion) {
        super(marca, precio, cantidadStock, nombre);
        this.capacidadBateria = capacidadBateria;
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    void mostrarDetalles() {
        System.out.println("Celular: " + nombre + ", Marca: " + marca + ", Capacidad de Batería: " + capacidadBateria +
                "mAh, Resolución de Cámara: " + camaraResolucion + "MP, Precio: " + precio + ", Stock: " + cantidadStock);

    }
    @Override
    public void calcularPrecioVenta(int cantidad) {
        double precioTotal = precio * cantidad;
        if (cantidad > 5) {
            precioTotal *=0.10;

        }
        System.out.println("precio total"+precioTotal);
    }
}

