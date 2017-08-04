/**
 * Created by Ankit.sa on 7/21/2017.
 */

public class EveningCommand extends Command {
    private Employee emp;

    public EveningCommand(final Employee employee) {
        this.emp = employee;
    }
    @Override// Command
    public void visit() {
        emp.isverified = true;
        System.out.println("Address verified this evening for Employee"+emp.getName()+"\nVerified Address : "+emp.getAddress());
    }
}

