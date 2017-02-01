import java.awt.*;
import java.applet.*;
import java.util.Scanner;

/*<applet code="prg2" width=250 height=500>
	<param name=number value=10>
</applet>*/

public class prg2  extends Applet{
	int number;
	Scanner sc ;

	public void init(){
		sc=new Scanner(System.in);
	}
	public void start(){
		System.out.println("Enter a number");
		number=sc.nextInt();
	}
	public void paint(Graphics g){
		for(int i=0;i<10;i++)
			g.drawString(number+" * "+(i+1)+" = "+(number*(i+1)),20,10*i+20);
	}

}