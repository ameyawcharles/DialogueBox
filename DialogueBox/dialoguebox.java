package com.mycompany.dialoguebox;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class DialogueBox {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;
        String fullName;
        
        System.out.println("Enter first name: ");
        firstName = sc.nextLine();
        
        System.out.println("Enter last name: ");
        lastName = sc.nextLine();
        
        
        
        fullName = firstName + " " + lastName;
        
        
        JOptionPane.showMessageDialog( null, "Hello" + " " + fullName);
        System.exit(0);
    }
}
