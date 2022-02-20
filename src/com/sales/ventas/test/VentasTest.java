package com.sales.ventas.test;
import com.sales.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Polo", 100.00);
        Producto producto3 = new Producto("Pantalon", 150.00);


        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        Orden orden3 = new Orden();
        orden1.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden3.agregarProducto(producto3);
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();

    }
}
