package AE2.VERSION_B;

public class Principal {
    public static void main(String[] args) {
        Producto p1 = new Producto("P001", "Laptop Dell", 2, 1500.0);
        System.out.println(p1);

        p1.incrementarCantidad(3);
        System.out.println(p1);

        System.out.println("Subtotal: $" + p1.calcularSubtotal());
        System.out.println("Total con 20% descuento: $" + p1.aplicarDescuento(20));

        Producto p2 = new Producto();
        System.out.println(p2);

        p2.setCodigo("P002");
        p2.setDescripcion("Mouse inalámbrico");
        p2.setCantidad(10);
        p2.setPrecioUnitario(25.5);
        System.out.println(p2);
        System.out.println("Subtotal: $" + p2.calcularSubtotal());
        System.out.println("Total con 15% descuento: $" + p2.aplicarDescuento(15));
    }
}