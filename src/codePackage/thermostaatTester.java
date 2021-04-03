package codePackage;
import java.util.*;

public class thermostaatTester {

    public static int z = 1;
    public static int onOff = 1;

    public static void main(String[] args) {

        while (z == 1) {
            thermostaat test = new thermostaat();

            test.thermostaatMenu();
        }
    }
}
