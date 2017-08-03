/**
 * Created by Ankit.sa on 7/21/2017.
 */
public class Employee {
    private String Address,name;
    boolean isverified;
     Employee(String address,String name){
        this.Address = address;
        this.name = name;
        this.isverified = false;
    }
    String getAddress()
    {
        return this.Address;
    }
    String getName()
    {
        return this.name;
    }

}
