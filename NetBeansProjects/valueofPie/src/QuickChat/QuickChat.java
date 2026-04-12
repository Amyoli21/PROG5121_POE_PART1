/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valueofpie;

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

    boolean checkEmail(String email) {
        return email.contains("@") && email.contains(".");
    } else static {
    System.out.println("email must contain @ & .");
   
    
      
    }
 
        
  


    boolean checkid() {
        if (id.contains()) {
            return true;
        }

    }
}
