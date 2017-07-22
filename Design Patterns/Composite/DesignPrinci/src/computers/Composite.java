package computers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahi.a on 7/19/2017.
 */

public class Composite implements Component {

    String componentName;
    int totalPrice = 0;
    List<Component> components = new ArrayList<>();

    public Composite(String name)
    {
        componentName = name;
    }

    public void addComponent(Component c)
    {
        components.add(c);
    }

    @Override
    public void showPrice()
    {
        System.out.println(componentName + " ");

        totalPrice += this.getPrice();

        System.out.println("Total Price :" + totalPrice);

        for(Component c : components)
        {
            c.showPrice();
        }
    }

    public void removeComponent(Component c)
    {
        components.remove(c);
    }

    public int getPrice(){
        int t = 0;
        for(Component c : components)
        {
            t += c.getPrice();
        }
        return t;
    }
}
