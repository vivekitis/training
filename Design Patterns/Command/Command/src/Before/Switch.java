package Before;

/**
 * Created by anurag.ka on 7/21/2017.
 */
public class Switch {
    public void execute(Flip flip, Light light){
        if(flip.getClass()==FlipUp.class){
            light.turnOn();
        }
        else if(flip.getClass()==FlipDown.class){
            light.turnOff();
        }
    }
}
