
public class Principal {
        public static void main(String[] args) {
            CarritoDeCompras carrito = new CarritoDeCompras();
            Item item1 = new Item("Camiseta", 20.99);
            Item item2 = new Item("Pantalones", 34.99);
    
            GestorDeCompras.agregarItem(carrito, item1);
            GestorDeCompras.agregarItem(carrito, item2);
    
            GestorDeCompras.imprimirDetalle(carrito);
        }
    }
    

