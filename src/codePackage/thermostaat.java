package codePackage;
import java.util.Scanner;

public class thermostaat
{
    public static int z = 1;
    public static int onOff = 1;

    public static void main(String[] args) {

        while (z == 1) {
            thermostaat testing = new thermostaat(true, 2.20f,30.00f,15.00f,2.50f, 12.00f, 12.00f);
            System.out.println(testing.progActive);

            thermostaat starter = new thermostaat();
            starter.thermostaatMenu();
        }
    }
    boolean operational;
    boolean progActive;
    float minTemp;
    float maxTemp;
    float curTemp;
    float stepSize;
    float nightTemp;
    float dayTemp;

    float history[] = new float[10];
    Scanner global = new Scanner(System.in);


    //constructor with no parameters
    public thermostaat() {
        this.operational = true;
        this.progActive = false;
        this.minTemp = -20.50f;
        this.maxTemp = 34.50f;
        this.curTemp = 20.50f;
        this.stepSize = 0.50f;
        this.nightTemp = 4.50f;
        this.dayTemp = 10.00f;
    }

    //constructor with parameters
    public thermostaat(boolean progActive, float minTemp, float maxTemp, float curTemp, float stepSize, float nightTemp, float dayTemp) {
        this.progActive = progActive;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.curTemp = curTemp;
        this.stepSize = stepSize;
        this.nightTemp = nightTemp;
        this.dayTemp = dayTemp;
    }

    //methods
    public void thermostaatMenu() {
        try
        {
            if (onOff == 0 || onOff == 1) {

                System.out.println("=========================================================\r\n" +
                        "|                  Yigit's Thermostat                     |\r\n" +
                        "|    1.Turn off                                           |\r\n" +
                        "|    2.Turn on                                            |\r\n" +
                        "|    3.Show current system                                |\r\n");
                if (onOff == 1) {
                    System.out.println("|     Online                                              |\r\n");
                } else if (onOff == 0) {
                    System.out.println("|     Offline                                             |\r\n");
                }
                System.out.println("=========================================================");
            }

            Scanner scan = new Scanner(System.in);
            int scannerValue;
            scannerValue = scan.nextInt();

            switch (scannerValue) {
                case 1 -> {
                    onOff = 0;
                }

                case 2 -> {
                    onOff = 1;
                }

                case 3 -> {
                    thermostaat test2 = new thermostaat();
                    test2.setCurTemp(500);
                    test2.SysOutputter();
                }

                default -> {
                    System.out.println("Not possible!");
                    thermostaatTester.onOff = 100;
                }
            }
        }
        catch(Exception e){
            System.out.println("You can only use int input, original error code: " + e);
        }
    }// einde methode thermostaatmenu

    public void SysOutputter(){
        System.out.println("============================");
        System.out.println("progActive                 :  "  + this.progActive);
        System.out.println("Minimum temprature         :  " + this.minTemp);
        System.out.println("Maximum temprature         :  " + this.maxTemp);
        System.out.println("Current temprature         :  " + this.curTemp);
        System.out.println("Step size                  :  " + this.stepSize);
        System.out.println("Night temprature           :  " + this.nightTemp);
        System.out.println("============================\r\n");
        System.out.println("Write anything");
        global.nextLine();

    }

    public void addHistory(float temp) {
        try {
            //for () {
               // history[i] = temp;
            //}
        }
        catch(Exception e){

        }
    }

    public void setStepSize() {
        try {

        }
        catch(Exception e){

        }
    }

    //setters and getters are under me :}

    //getters voor (mogelijk) nodig zou zijn.
    public float getCurTemp() {
        return curTemp;
    }
    public float getDayTemp() {
        return dayTemp;
    }
    public float getMaxTemp() {
        return maxTemp;
    }
    public float getMinTemp() {
        return minTemp;
    }
    public float getNightTemp() {
        return nightTemp;
    }
    public float getStepSize() {
        return stepSize;
    }
    public float[] getHistory() {
        return history;
    }

    //setters (mogelijk) nodig zou zijn.
    public void setCurTemp(float curTemp) {
        this.curTemp = curTemp;
    }
    public void setDayTemp(float dayTemp) {
        this.dayTemp = dayTemp;
    }
    public void setHistory(float[] history) {
        this.history = history;
    }
    public void setMaxTemp(float maxTemp) {
        this.maxTemp = maxTemp;
    }
    public void setMinTemp(float minTemp) {
        this.minTemp = minTemp;
    }
    public void setNightTemp(float nightTemp) {
        this.nightTemp = nightTemp;
    }
    public void setOperational(boolean operational) {
        this.operational = operational;
    }
    public void setProgActive(boolean progActive) {
        this.progActive = progActive;
    }
    public void setStepSize(float stepSize) {
        this.stepSize = stepSize;
    }
}
