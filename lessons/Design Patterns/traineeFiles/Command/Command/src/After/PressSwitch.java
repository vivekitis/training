package After;

import After.Command;
import After.FlipDownCommand;
import After.FlipUpCommand;
import After.Light;

/**
 * Created by Ankit.sa on 7/20/2017.
 */

/* The test class or client */
public class PressSwitch {
    public static void main(final String[] arguments){



        final Light lamp = new Light(); // Object of reciever

        final Command switchUp = new FlipUpCommand(lamp); //object of Switchup command
        final Command switchDown = new FlipDownCommand(lamp); //object of switchdown command

        final Switch mySwitch = new Switch(); //object of invoker

        mySwitch.storeAndExecute(switchUp);

        mySwitch.storeAndExecute(switchDown);


    }
}
