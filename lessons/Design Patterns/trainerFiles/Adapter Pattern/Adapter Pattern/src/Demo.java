/**
 * Created by aldrin.m on 7/19/2017.
 */
public class Demo {
    public static void main(String args[]){
        Creditcard targetInterface=new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}
