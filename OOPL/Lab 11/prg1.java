import java.awt.*;
import java.applet.*;

/*<applet code="prg1" width=300 height=100></applet>*/

public class prg1 extends Applet{

	public void init(){
		setForeground(Color.green);
		setBackground(Color.cyan);
	}

	public void paint(Graphics g){
		g.drawString("Welcome to applet programming",20,20);
		showStatus("This is shown in the status window");
	}
}