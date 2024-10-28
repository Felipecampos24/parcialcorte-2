public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", 3.000, 10, "lenovo LOQ", "Intel i7", "16 ");
        Celular celular = new Celular("xiaomi", 1.200, 10, "redmi note 10", 3000, 12);

        Cliente cliente1 = new Cliente("Juan Perez", "juan.perez15@gmail.com");
        Cliente cliente2 = new Cliente("Maria Gomez", "maria.gomez@gmail.com");

        cliente1.comprarProducto(laptop, 3);
        cliente2.comprarProducto(celular, 6);

        System.out.println("Compras de Juan:");
        cliente1.mostrarCompra();

        System.out.println("\nCompras de Maria:");
        cliente2.mostrarCompra();

        System.out.println("\nInventario actualizado:");
        laptop.mostrarDetalles();
        celular.mostrarDetalles();

    }
}