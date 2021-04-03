package codePackage;
import java.util.*;

public class thermostaatTester {

    public static void main(String[] args) {
        int z = 1;
        boolean onOrOff;

        while (z == 1) {
            thermostaat test = new thermostaat();

            test.thermostaatHulp();

            Scanner in = new Scanner(System.in);
            onOrOff = in.nextBoolean();

            if (onOrOff == false){
                System.out.println("Thermostat turned off! \r\n");
                z = 0;
            }
            else if (onOrOff == true){
                System.out.println("Thermostat turned on!");
                test.thermostaatMenu();
            }

        }

    }

}
