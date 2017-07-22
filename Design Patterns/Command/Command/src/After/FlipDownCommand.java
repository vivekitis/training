package After; /**
 * Created by Ankit.sa on 7/20/2017.
 */

import After.Command;

/** The After.Command for turning off the light - ConcreteCommand #2 */
public class FlipDownCommand implements Command {
    private Light theLight;

    public FlipDownCommand(final Light light) {
        this.theLight = light;
    }

    @Override    // After.Command
    public void execute() {
        theLight.turnOff();
    }
}