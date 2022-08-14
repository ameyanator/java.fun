import java.io.*;

public class PizzaTestDriver {
    public static void main(String args[]) throws IOException {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza("Cheese");
        Pizza chicagoPizza = chicagoStore.orderPizza("Cheese");
    }
}