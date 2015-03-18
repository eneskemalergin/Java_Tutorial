// Author : Enes Kemal Ergin
/*
This Lesson includes;
	- Graphics 2.1
		- Frames and Panels
		- Nested Panels
		- images

*/

import java.awt.*;
import javax.swing.*;

public class Lesson5{
	public static void main(String[] args){

		JFrame frame = new JFrame ("This is window pane");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel primary = new JPanel();
		primary.setBackground(Color.red);
		primary.setPreferredSize(new Dimension(250, 75));

		JLabel label1 = new JLabel("This is first label");
		JLabel label2 = new JLabel("This is second label");
		// Adds label to panel
		primary.add(label1);
		primary.add(label2);

		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);


		// Nested Panelss...
         JFrame frame = new JFrame ("Nested Panels");
         frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
         // Set up first subpanel
         JPanel subPanel1 = new JPanel();
         subPanel1.setPreferredSize (new Dimension(150, 100));
         subPanel1.setBackground (Color.green);
         JLabel label1 = new JLabel ("One");
         subPanel1.add (label1);
         // Set up second subpanel
         JPanel subPanel2 = new JPanel();
         subPanel2.setPreferredSize (new Dimension(150, 100));
         subPanel2.setBackground (Color.red);
         JLabel label2 = new JLabel ("Two");
         subPanel2.add (label2);
         // Set up primary panel
         JPanel primary = new JPanel();
         primary.setBackground (Color.blue);
         primary.add (subPanel1);
         primary.add (subPanel2);
         frame.getContentPane().add(primary);
      	frame.pack();
      	frame.setVisible(true);

      	// Images
      JFrame frame = new JFrame ("Label Demo");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      ImageIcon icon = new ImageIcon ("devil.gif");
      JLabel label1, label2, label3;
      label1 = new JLabel ("Devil Left", icon, SwingConstants.CENTER);
      label2 = new JLabel ("Devil Right", icon, SwingConstants.CENTER);
      label2.setHorizontalTextPosition (SwingConstants.LEFT);
      label2.setVerticalTextPosition (SwingConstants.BOTTOM);
      label3 = new JLabel ("Devil Above", icon, SwingConstants.CENTER);
      label3.setHorizontalTextPosition (SwingConstants.CENTER);
      label3.setVerticalTextPosition (SwingConstants.BOTTOM);
      JPanel panel = new JPanel();
      panel.setBackground (Color.cyan);
      panel.setPreferredSize (new Dimension (200, 250));
      panel.add (label1);
      panel.add (label2);
      panel.add (label3);
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
	} 
}