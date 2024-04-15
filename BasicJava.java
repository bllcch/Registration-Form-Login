/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic.java;
import java.util.Scanner;

/**
 *
 * @author laila
 */
public class BasicJava {
       static Scanner scanner = new Scanner(System.in);
       static String fullName, age, status, gradeLevel, favoriteSubject, username, password;
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MainMenu();
       
    }
    public static void MainMenu() {
         System.out.println("WELCOME!!!");
        System.out.println("CHOOSE IN THE MENU WHERE YOU WANT TO GO:");
        System.out.println("[1] LOGIN"); 
        System.out.println("[2] REGISTRATION");
        System.out.println("[0] EXIT");
        System.out.println("ENTER THE NUMBER OF YOUR CHOICE: ");
        
          int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            case 0:
                exit();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                MainMenu();
        }
    }
    
    public static void register() {
        System.out.println("FILL UP FORM:");
         scanner.nextLine(); 
        System.out.println("ENTER YOUR FULL NAME:");
        fullName = scanner.nextLine();
        System.out.println("ENTER YOUR AGE:");
        age = scanner.nextLine();
        System.out.println("ENTER YOUR STATUS:");
        status = scanner.nextLine();
        System.out.println("ENTER YOUR GRADE LEVEL:");
        gradeLevel = scanner.nextLine();
        System.out.println("ENTER YOUR FAVORITE SUBJECT:");
        favoriteSubject = scanner.nextLine();
        System.out.println("ENTER YOUR USERNAME:");
        username = scanner.nextLine();
        System.out.println("ENTER YOUR PASSWORD:");
        password = scanner.nextLine();
        
        System.out.println("REGISTRATION SUCESSFULY!!!\n");

        MainMenu();
     }
    
    public static void login() {
        System.out.println("ENTER YOUR USERNAME (enter 0 to go back): ");
        String inputUsername = scanner.next();
        if (inputUsername.equals("0")) {
            MainMenu();
            return;
        }
        System.out.println("ENTER YOUR PASSWORD: ");
        String inputPassword = scanner.next();
        
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println( "\nHOME");
            System.out.println("USER INFO: ");
            System.out.println("FULLNAME: " + fullName);
            System.out.println("AGE: " + age);
            System.out.println("STATUS: " + status);
            System.out.println("GRADE LEVEL: " + gradeLevel);
            System.out.println("FAVORITE SUBJECT: " + favoriteSubject);
            System.out.println("USERNAME: " + username);
            System.out.println("[0] LOGOUT");

            int choice = scanner.nextInt();
            if (choice == 0) {
                MainMenu();
            } else {
                System.out.println("Invalid choice. Logging out...");
                MainMenu();
            }
        } else {
            System.out.println("Invalid username or password. Please try again.");
            login();
        }
    }
        
    public static void exit() {
        System.out.println("DO YOU WANT TO EXIT? (Y/n)");
        String input = scanner.next();
        if (input.equalsIgnoreCase("Y")) {
            System.out.println("THANK YOU!!!");
            System.exit(0);
        } else {
            MainMenu();
        }
    }
}
