import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough");
        System.out.println("Adding sauce");
        System.out.print("Adding toppings -");
        for(String topping : toppings) {
            System.out.print(" " + topping);
        }
        System.out.println();
    }

    void bake() {
        System.out.println("Bake for 25 mins at 350");
    }

    void cut() {
        System.out.println("Cut the pizza into slices");
    }

    void box() {
        System.out.println("Place the pizza into official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}