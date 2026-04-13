/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package /*quickchat*/;

/**
 *
 * @author Student
 */
public class QuickChat {

    String pin;
    String email;
    String id;
    
    boolean checkPin(String pin) {
        if (pin.length() == 4 && pin.matches("\\d+")) {
            return true;
        } else {
            System.out.println("pin must be exactly 4 digits");
            return false;
            
        }
         
    }
    
    boolean checkemail(String email) {
        if (email.contains("@") && email.contains(".")) {
            return false;
        } else {
            System.out.println("email must contain @ & .");
            return true;
        }
    }
        
    }
    boolean checkid(String id) {
        if (id.contains("_") && id.length()<= 5) {
            return true;
        } else {
            System.out.println("id must contain _ & length <= 5");
            return false;
        }
    }

