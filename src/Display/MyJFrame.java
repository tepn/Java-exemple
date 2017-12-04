/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Display;

import animalKingdom.Vertebrate;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JLayeredPane;

/**
 *
 * @author tepn
 */
public class MyJFrame extends JFrame {
    public MyJPanel panel;
    JLayeredPane content;
    
    public MyJFrame(ArrayList<Vertebrate> vertebrates) {
        content = new JLayeredPane();
        content.setPreferredSize(new Dimension(600, 600));
        
        panel = new MyJPanel(vertebrates);
        panel.setBounds(0,0,600, 600);
        panel.setPreferredSize(new Dimension(600, 600));
        content.add(panel);
        
        setTitle("Projet Planchon");
        setSize(600, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        setContentPane(content);
        pack();
    }
}
