package ipac;

import javax.swing.JPanel;


/**
 *
 * @author ASUS
 */
public class IPAC {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Maximum_Host a = new Maximum_Host();
        a.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maximum_Host().setVisible(true);
            }
        });
    }
    
}
