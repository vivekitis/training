package computers;

/**
 * Created by mahi.a on 7/19/2017.
 */

public class CompositeTest {
    public static void main(String[] args) {

        //Leaf parts
        Leaf mouse = new Leaf("Mouse", 200);
        Leaf keyboard = new Leaf("Keyboard", 400);
        Leaf RAM = new Leaf("RAM", 5000);
        Leaf HDD = new Leaf("Hard Disk Drive", 2000);
        Leaf CPU = new Leaf("CPU", 13000);

        Composite motherBoard = new Composite("MotherBoard"); //composite for motherboard
        motherBoard.addComponent(RAM);
        motherBoard.addComponent(CPU);

        Composite _case = new Composite("Case"); // composite for Case

        _case.addComponent(motherBoard);
        _case.addComponent(HDD);

        Composite peripheral = new Composite("Peripherals"); //composite for peripherals
        peripheral.addComponent(mouse);
        peripheral.addComponent(keyboard);

        Composite computer = new Composite("Computer"); //composite for whole computer
        computer.addComponent(_case);
        computer.addComponent(peripheral);

       /* computer.showPrice();//display whole price*/

        /*RAM.showPrice();
        CPU.showPrice();*/

        /*_case.showPrice();

        peripheral.showPrice();*/
        motherBoard.showPrice();

        mouse.showPrice(); //display mouse price
        keyboard.showPrice();
    }
}
