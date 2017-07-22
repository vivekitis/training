package Before;

/**
 * Created by anurag.ka on 7/21/2017.
 */
public class PressSwitch {
    public static void main(final String[] arguments){



        final Light lamp = new Light(); // Object of reciever

        final FlipUp switchUp = new FlipUp(); //object of Switchup command
        final FlipDown switchDown = new FlipDown(); //object of switchdown command

        final Switch mySwitch = new Switch(); //object of invoker

        mySwitch.execute(switchDown, lamp);
        mySwitch.execute(switchUp, lamp);


    }
}
