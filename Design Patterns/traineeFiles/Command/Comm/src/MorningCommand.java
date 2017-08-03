/**
 * Created by Ankit.sa on 7/21/2017.
 */
/**
 * Created by Ankit.sa on 7/21/2017.
 */
public class MorningCommand extends Command {
    private Employee emp;

    public MorningCommand(final Employee employee) {
        this.emp = employee;
    }
    @Override// Command
    public void visit() {
        emp.isverified = true;
        System.out.println("Address verified this morning for Employee"+emp.getName() +"\nVerified Address : "+emp.getAddress());
    }
}
