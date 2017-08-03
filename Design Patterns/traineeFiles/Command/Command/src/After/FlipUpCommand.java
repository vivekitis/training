package After; /**
 * Created by Ankit.sa on 7/20/2017.
 */

import After.Command;

/** The After.Command for turning on the light - ConcreteCommand #1 */

public class FlipUpCommand implements Command {
    private Light theLight;

    public FlipUpCommand(final Light light) {
        this.theLight = light;
    }

    @Override    // After.Command
    public void execute() {
        theLight.turnOn();
    }
}
