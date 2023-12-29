/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domusdash;

import com.formdev.flatlaf.themes.FlatMacLightLaf; 
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import views.ManagerUser;

/**
 *
 * @author PC
 */
public class DomusDash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            ManagerUser managerUser = new ManagerUser();
            managerUser.setVisible(true);
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
    
}
