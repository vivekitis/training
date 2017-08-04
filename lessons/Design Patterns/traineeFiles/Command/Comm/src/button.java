import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Ankit.sa on 7/21/2017.
 */
public class button {
   /* static void printlog(List<Command> history)
    {
        System.out.println("**************Log************");
        for(Command command:history) {
            System.out.println(command.name);
        }
        System.out.println("**************************");
    }*/
  /* static List<Command> history = new ArrayList<Command>();
   static void storeAndExecute(final Command cmd) {
       history.add(cmd); // optional
       cmd.visit();
   }*/
    public static void main(final String[] arguments){



        final Employee emp1 = new Employee("Andheri","A"); // Object of reciever
        final Employee emp2 = new Employee("Dadar","B");
        //suppose A want verification in morning and b in evening
        final Command verify1 = new MorningCommand(emp1); //object of Switchup command
        final Command verify2 = new EveningCommand(emp2); //object of switchdown command

        Queue queue = new Queue();  //object of class queue having 2 arraylist for morning and evening
        queue.addmorning(verify1);
        queue.addevening(verify2);

        final VerifierCompany company = new VerifierCompany(); //object of invoker

        company.Run(queue);


        /*
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        boolean morning=true,evening = false;
       if(dayOfWeek==6)
        {
            if(morning)
                for(Command command:queue.getmorning()) {
                    storeAndExecute(command);
                }
            if(evening)
                for(Command command:queue.getevening()) {
                    storeAndExecute(command);
                }
        }
*/

    }

}
