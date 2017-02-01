import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
/*
 <object CODE="RectApplet.class" WIDTH=400 HEIGHT=200>
 </object>
 */
 public class RectApplet extends JApplet
 {
 	int x,y,p,q;
    JLabel area=new JLabel("area");
 	public void start()
 	{
        setLayout(new FlowLayout());
        add(area);

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
 		super.paint(g);
        double ar=(p-x)*(q-y);
        if(ar<0)
            ar=0;
        area.setText("Area is : "+ar);
 		g.setColor(Color.blue);
        g.fillRect(x,y,(p-x),(q-y));
		
 	}
 }