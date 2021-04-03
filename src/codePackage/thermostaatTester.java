package codePackage;
import java.util.*;

public class thermostaatTester {

    public static void main(String[] args) {
        /*
        Scanner in = new Scanner(System.in);

        float test = in.nextFloat();

        thermostaat object1 = new thermostaat();
        thermostaat terk = new thermostaat();

        object1.setCurTemp(test);

        System.out.println(object1);

        terk.thermostaatSwitch();
        */
        thermostaat terk = new thermostaat();
        boolean onOrOff = false;
        if (onOrOff == false) {
            System.out.println("Thermostat turned off!");
        }
        else if(onOrOff == true) {
            System.out.println("Thermostat turned on!");
        }
        Scanner in = new Scanner(System.in);
        onOrOff = in.nextBoolean();


        terk.thermostaatSwitch();
    }

}
