import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
/*
 <object CODE="ShapeApplet.class" WIDTH=400 HEIGHT=200>
 </object>
 */
 public class ShapeApplet extends JApplet
 {
 	int x,y,p,q;
    JButton j1,j2,j3,j4,j5;
    String s="";
 	public void start()
 	{
        setLayout(new FlowLayout());	
	    j1=new JButton("RoundRect");
        add(j1); 
        j2=new JButton("oval");
        add(j2);
        j3=new JButton("arc");
        add(j3);
        j4=new JButton("line");
        add(j4);
        j5=new JButton("Polygon");
        add(j5);
        j1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
 			{       s="RoundRect";  }
            });
        j2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
 			{       s="oval";  }
            });
        j3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
 			{       s="arc";  }
            });
        j4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
 			{       s="line";  }
            });
        j5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {       s="Polygon";  
                    repaint();
            }
            });
 		addMouseListener(new MouseAdapter()
 		{
 			public void mousePressed(MouseEvent me)
 			{
 				x=0;
 				y=0;
 				x=me.getX();
 				y=me.getY();
 		
 			}
 		
 		});
 		addMouseMotionListener(new MouseMotionAdapter()
 		{
 				public void mouseDragged(MouseEvent me)
 			{
 				p=0;
 				q=0;
 				p=me.getX();
 				q=me.getY();
 				repaint();
 				
 			}
 		});
 	}
 	public void paint(Graphics g){
        int xp[]={170,220,220,170};
        int yp[]={100,100,150,150};
 		super.paint(g);
 		g.setColor(Color.blue);
 		if(s=="RoundRect") 
        g.fillRoundRect(x,y,(p-x),(q-y),10,10);
        else if(s=="oval")
	g.fillOval(x,y,(p-x),(q-y));
        else if(s=="arc")
        g.fillArc(x,y,(p-x),(q-y),0,120);
        else if(s=="line") 
        g.drawLine(x,y,p,q);
        else if(s=="Polygon")
        g.drawPolygon(xp,yp,4);
 		showStatus("Mouse coordinates are "+p+","+q);
 	}
 }