package myPackages.p1;
public class Max{

	public static int max(int a,int b,int c){
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		return max;
	}

	public static float max(float a,float b,float c){
		float max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		return max;
	}

	public static int max(int a[]){
		int max=a[0];
		for(int x:a){
			if(max<x)
				max=x;
		}
		return max;
	}

	public static int max(int a[][]){
		int max=a[0][0];
		for(int [] x:a)
			for(int y:x){
				if(max<y)
					max=y;
			}
		return max;
	}

	
}