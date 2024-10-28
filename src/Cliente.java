import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nombre;
    private String correo;
    private List<Producto> productosComprados;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.productosComprados = new ArrayList<>();
    }

    public void comprarProducto(Producto producto, int cantidad) {
        producto.cantidadStock -= cantidad;
        for (int i = 0; i < cantidad; i++) {
            productosComprados.add(producto);
        }
    }

    public void mostrarCompra() {
        double costoTotal = 0;
        for (Producto producto : productosComprados) {
            producto.mostrarDetalles();

        }
        System.out.println("Costo Total: " + costoTotal);
    }
}