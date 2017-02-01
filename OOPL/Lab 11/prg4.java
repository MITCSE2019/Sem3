import java.awt.*;
import java.applet.*;

/*
<applet code="prg4" width=200 height=200>
<param name="num1" value=70>
<param name="num2" value=15>
</applet>
*/
public class prg4 extends Applet{

	int num1;
	int num2;

	int GCD(int n1, int n2) {
	    
	    if(n2 == 0){
	        return n1;
	    }
	    return GCD(n2, n1%n2);
	}

	public void start(){
		num1=Integer.parseInt(getParameter("num1"));
		num2=Integer.parseInt(getParameter("num2"));
	}
	public void paint(Graphics g){
		g.drawString("Gcd of "+num1+","+num2+" is "+GCD(num1,num2),10,10);
	}
}