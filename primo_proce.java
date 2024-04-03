package proce;

import java.util.Scanner;

public class primo_proce {
	public static int p=2,z=2;
	static void primo_proced() 
	{
		int k=1, sw=0;
		while(k<=1) {
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
				k++;
			}
			p=p+1;
		}
	}

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		int n,x,i,t;
		System.out.println("Intro n:");
		n = lee.nextInt();
		primo_proced();
		t = 1;
		for (i = 1; i <= n; i++) {
			x = lee.nextInt();
			t++;
			if(t>z)
			{
				System.out.println(x+z);
				t=1;
				primo_proced();
			}
		}
	}

}
