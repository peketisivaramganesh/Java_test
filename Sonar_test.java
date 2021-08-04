import java.util.*;
class Sample
{
         public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to this pgm");
	System.out.println("Enter the array size");
	int size = sc.nextInt();
	int arr[]=new int[size];
	int max=0;
	System.out.println("Enter array elements");
	for(int k=0; k<size; k++)
	{
		arr[k]=sc.nextInt();
		if(arr[k]>=max)
		{
			max=arr[k];
		}
	}
	System.out.println("The max value is "+max);
	for(int i=1; i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	Sample obj =new Sample("Ganesh");
	obj.add(100,200);
	obj.sub(200,20);
	obj.mul(100,2);
	obj.div(1000,500);
	obj.sample(15,"ganesh");
	}
	void add(int a, int b)
	{
		int result = a+b;
		System.out.println(result);
	}
	void sub(int x, int y)
	{
		System.out.println("Result of 2 numbers is "+(x-y));
	}
	void mul(int p, int q)
	{
		System.out.println("Multiplication of two numbers is "+(p*q));
	}
	void div(int c, int d)
	{
		System.out.println("Divison of 2 numbers is "+(c/d));
	}
                      void sample(int a, String name)
	{
		System.out.println("the values are "+a+" and "+name);
	}
	Sample(String name)
	{
		System.out.println(name);
	}
}