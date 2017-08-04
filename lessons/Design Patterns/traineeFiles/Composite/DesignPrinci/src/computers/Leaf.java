package computers;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by mahi.a on 7/19/2017.
 */

public class Leaf implements Component {

    int componentPrice;
    String componentName;

    public Leaf(String name, int price)
    {
        componentName = name;
        componentPrice = price;
    }

    @Override
    public void showPrice() {
        System.out.println(componentName + " : " + componentPrice);
    }

    public int getPrice(){
        return componentPrice;
    }
}