package tutorialweek04;
import java.util.Scanner;

public class WorkQN4 {

    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        Scanner input = new Scanner(System.in);
        System.out.println("The lamp is currently " + (l1.isON ? "ON." : "OFF."));
        System.out.print("Change the situation(ON = true,off = False): ");
        boolean user = input.nextBoolean();
        if(l1.isON == user) {
        	if(user) {
        		System.out.println("The lamp is already on");
        	}else {
        		System.out.println("The lamp is already off ");
        	}
        } else {
            if (user) {
                l1.turnON();
            } else {
                l1.turnOFF();
            }
        }
//        System.out.print("Do you want to turn on/off the lamp: ");
//        String user = input.nextLine();
//        user = user.toLowerCase(); 
//
//        if (user.equals("on")) { 
//            l1.turnON();
//        } else if (user.equals("off")) { 
//            l1.turnOFF();
//        } else {
//            System.out.println("Invalid Input.");
//        }
         input.close();
    }
}

class Lamp {
    boolean isON;

    void turnON() {
//    	isON = true;
        System.out.println("Light is on.");
    }

    void turnOFF() {
//    	isON = true;
        System.out.println("Light is off.");
    }
}
