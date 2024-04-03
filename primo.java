package proce;

import java.util.Scanner;

public class primo {
	static int primo_fun(int x) 
	{
		int z=2;
		int p=2,sw=0,j=1;
		while(j<=x) {
			sw=0;
			for(int i=2;i<p;i++) {
				if(p%i==0) 
				{
					sw=1;
				}
			}
			if(sw==0) 
			{
				z=p;
				j++;
			}
			p=p+1;
		}
		return z;
	}

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		int n,x,i,j=1,c,p;
		System.out.println("Intro n:");
		n = lee.nextInt();
		c = primo_fun(j);
		p = 1;
		for (i = 1; i <= n; i++) {
			x = lee.nextInt();
			p++;
			if(p>c)
			{
				System.out.println(x+c);
				p=1;
				j++;
				c=primo_fun(j);
			}
		}
	}

}
