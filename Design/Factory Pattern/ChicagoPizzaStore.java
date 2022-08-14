public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        if(type.equals("Cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            System.out.println("We dont make this type of pizza yet");
            return null;
        }
    }
}