/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author vik
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.nio.file.Path;
import javax.swing.*;
import java.awt.Shape;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;
//import java.awt.geom.Point2D;
import java.awt.geom.GeneralPath;
import javax.swing.SwingUtilities;

public class WindowTriangle extends JFrame implements ActionListener{
	private Ttriangle triangle;     
	JTextField textA,textB,textC;
	JTextArea showHypotenuse;
	JButton controlButton;
        
        
	 WindowTriangle(){
          triangle=new Ttriangle();
    	  textA=new JTextField(5);
    	  textB=new JTextField(5);
          controlButton=new JButton("go");
          showHypotenuse=new JTextArea();
         
          
          
          JPanel p1=new JPanel();
          
          p1.add(new JLabel("Base:"));
          p1.setOpaque(true);
          p1.setBackground(Color.white);
          p1.add(textA);
          p1.add(new JLabel("Height:"));
          p1.add(textB);
          p1.add(controlButton);
       //   p1.setPreferredSize(new Dimension(300,150));
          controlButton.addActionListener(this);
       //   showHypotenuse.setPreferredSize(new Dimension(10,110));
          JPanel p2 = new JPanel();
          
          
        //  g.drawLine(20, 20, 30, 30);
          
          
                 
          add(p2,BorderLayout.CENTER);
          add(p1,BorderLayout.NORTH);          
          add(new JScrollPane(showHypotenuse),BorderLayout.SOUTH);
          setVisible(true);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          
                    
	}
    
      public void actionPerformed(ActionEvent e){
    	 // try{
    		  int a=(int) Double.parseDouble(textA.getText().trim());
    		  int b=(int) Double.parseDouble(textB.getText().trim());
    		  triangle.setBase(a);
    		  triangle.setHeight(b);
    		  String Hypo=triangle.getHypo();
                 
                  showHypotenuse.setText("Hypotenuse is "+ Hypo);
                  showHypotenuse.setLineWrap(true);   
                 
                  
                  
                  
                 
                  
                
    	//  }
    	//  catch (Exception ex){
         //   showHypotenuse.append("\n"+ex+"\n");
    		  
    	//  }
      }
  
      public void paint(Graphics g){
          super.paint(g);
          Graphics2D g2=(Graphics2D) g;
          Line2D lin=new Line2D.Float(50,200,50,500);
          Line2D lin2=new Line2D.Float(50,500,500,500);
          Line2D lin3=new Line2D.Float(50,200,500,500);
          
          g2.draw(lin);
          g2.draw(lin2);
          g2.draw(lin3);
        
      }
}