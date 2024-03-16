import java.util.List;

/**
 * GestorDeCompras
 */
public class GestorDeCompras {

     public static void agregarItem(CarritoDeCompras carrito, Item item) {
        carrito.agregarItem(item);
    }

    public static void removerItem(CarritoDeCompras carrito, Item item) {
        carrito.removerItem(item);
    }

    public static void imprimirDetalle(CarritoDeCompras carrito) {
        carrito.imprimirDetalle();
    }

    public static double calcularTotal(CarritoDeCompras carrito) {
        double total = 0;
        List<Item> items = carrito.getItems();
        for (Item item : items) {
            total += item.getPrecio();
        }
        return total;
    }
}