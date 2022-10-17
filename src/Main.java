import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("What is your name? ");
//        String name = scanner.nextLine();
//
//        System.out.println("How old are you? ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("What your favourite food? ");
//        String food = scanner.nextLine();
//
//        // Response section
//        System.out.println("Hello "+name);
//        System.out.println("You are "+age+" years old");
//        System.out.println("You like "+food);

        String name = JOptionPane.showInputDialog("Enter your Name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");

    }
}