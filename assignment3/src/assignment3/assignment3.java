package assignment3;
import java.util.Scanner;
 
public class assignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int i =0;
        int acD = 0;
        while(i<3){
            ++i;
        System.out.println("Enter password:");
        String password = scan.nextLine();
        if (password.contains("chEEzburg3rz")){
            System.out.println("Access granted");
        }
        else{
            System.out.println("Access denied");
            ++acD;
        }
        }
         if (acD==3){
             System.out.println("Deleting Memory!!!");
        }
         
        //-------------------- 
        
        System.out.println("Is it currently raining?");
        String rain = scan.nextLine();
        rain.toLowerCase();
        if (rain.contains("yes")){
            System.out.println("You should take the bus or a car.");
        }
        if (rain.contains("no")){
            System.out.println("How far in km do you need to travel?");
            double km = scan.nextDouble();
            if (km>10){
                System.out.println("You should take the bus or a car.");
            }
            else if (km>2){
                System.out.println("You should ride your bike.");
            }
            else if (km<2){
                System.out.println("You should walk");
            }
        }
        
        //-----------------------
      while(true){
        System.out.println("Line:");
        String robot = scan.nextLine();
        String robot1 = robot;
        robot1 = robot1.toLowerCase();
        int robotln = robot.length();
        char r = 'r';
        if (!robot1.contains("robot")){
            System.out.println("No robots here.");
        }
        else if (robot.contains(" robot ")){
           
            System.out.println("There is a small robot in the line.");
        }
        else if (robot.contains(" ROBOT ")){
            System.out.println("There is a big robot in the line.");
        }
        else if (robot.charAt(0)== 114){
            if (robot.contains("robot ")){
              System.out.println("There is a small robot in the line.");  
            }
        }
        else if (robot.charAt(0)== 82){
            if (robot.contains("Robot ")){
              System.out.println("There is a big robot in the line.");  
            }
        }
        else if (robot.charAt(robotln)== 116){
            if (robot.contains(" robot")){
              System.out.println("There is a small robot in the line.");  
            }
        }
        else if (robot.charAt(robotln)== 84){
            if (robot.contains(" Robot")){
              System.out.println("There is a big robot in the line.");  
            }
        }
        else {
            System.out.println("There is a medium sized robot in the line.");
        }
        
        }//wile true
      
    }
}