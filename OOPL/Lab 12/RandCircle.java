import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.util.Random;
/*
 <object CODE="RandCircle.class" WIDTH=400 HEIGHT=200>
 </object>
 */
 public class RandCircle extends JApplet
 {
 	int x,y,p,q;
    JButton j1;
    JLabel jl1,jl2,jl3,jl4;
    String s="";
 	public void start()
 	{
        setLayout(new FlowLayout());	
	    j1=new JButton("Circle");
        add(j1); 
        jl1=new JLabel("Area");
        add(jl1);
        jl2=new JLabel("Radius");
        add(jl2);
        jl3=new JLabel("Diameter");
        add(jl3);
        jl4=new JLabel("Circumference");
        add(jl4);
        j1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
 			{       s="Circle";  
 					repaint();
 				}
            });

 	}
 	public void paint(Graphics g){
        
 		super.paint(g);
 		g.setColor(Color.blue);
        Random r=new Random();
        int rad=r.nextInt(200)+200;
 		g.drawOval(100,100,rad,rad);
 		double area= 3.142*rad*rad;
 		double dia = 2*rad;
 		double circum = 2*3.142*rad;
 		jl1.setText("Area is "+area);
 		jl2.setText("Radius is "+rad);
 		jl3.setText("Diameter is "+dia);
 		jl4.setText("Circumference is "+circum);
 		
 		
 	}
 }