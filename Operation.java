import java.util.Scanner;
class Operation
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n1=10;
	int n2=2;
	int a;
	System.out.println("Enter your choice\n 1.Add\n 2.Sub\n 3.Mul\n 4.Div\n 5.Mod");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:a=n1+n2;
	       break;
	case 2:a=n1-n2;
	       break;
	case 3:a=n1*n2;
	       break;
	case 4:a=n1/n2;
	       break;
	case 5:a=n1%n2;
	       break;
	default:System.out.println("Invalid input");
		return;

	}
	System.out.println("Output is " + a);
}
}

