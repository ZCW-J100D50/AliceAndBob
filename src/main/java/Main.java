/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        Main mainOne = new Main();

        // call the compute() method on that new object
        mainOne.compute();
    }

    public void compute() {
        // Get input string of name from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        // Create conditional to check name against Alice and Bob
        if(name.equals("Alice") || name.equals("Bob")){
            // Print greeting to screen if Alice or Bob are true
            System.out.println("Hello " + name + "!");
            // Print "You are neither Alice nor Bob." otherwise
        }else{
            System.out.println("You are neither Alice nor Bob.");
        }

    }
}
