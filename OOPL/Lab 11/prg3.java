import java.awt.*;
import java.applet.*;

/*<applet code="prg3" width=200 height=100>
</applet>*/

public class prg3 extends Applet implements Runnable{
	String msg="I am sleepy ";
	Thread t=null;

	public void init(){}

	public void start(){
		t=new Thread(this);
		t.start();
	}

	public void run(){
		char ch;

		while(true){
			try{
				repaint();
				Thread.sleep(250);
				ch=msg.charAt(0);
				msg=msg.substring(1,msg.length());
				msg+=ch;
			}catch(InterruptedException e){}
		}
	}

	public void paint(Graphics g){
		g.drawString(msg,30,30);
	}
}