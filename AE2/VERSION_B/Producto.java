package AE2.VERSION_B;

public class Producto {
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    // Constructor por defecto
    public Producto() {
        this.codigo = "P000";
        this.descripcion = "Producto genérico";
        this.cantidad = 1;
        this.precioUnitario = 0.0;
    }

    // Constructor parametrizado
    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }

    // Calcular subtotal
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    // Aplicar descuento
    public double aplicarDescuento(double porcentaje) {
        double subtotal = calcularSubtotal();
        double descuento = subtotal * (porcentaje / 100);
        return subtotal - descuento;
    }

    // Incrementar cantidad
    public void incrementarCantidad(int valor) {
        this.cantidad += valor;
    }

    // toString
    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", subtotal=" + calcularSubtotal() +
                '}';
    }
}