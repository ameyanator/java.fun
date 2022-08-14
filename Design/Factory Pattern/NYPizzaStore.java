public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if(type.equals("Cheese")) {
            return new NewYorkStyleChessePizza();
        } else {
            System.out.println("Store doesn't make this type of pizza yet");
            return null;
        }
    }
}