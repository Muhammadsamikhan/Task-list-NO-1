import java.util.*;
public class Task4{

	public static void main(String[] args){
	double x,y,z,per1,per2,cpn;


	System.out.println("Enter matric marks");
	Scanner matric=new Scanner(System.in);
	x=matric.nextInt();

	System.out.println("Enter Inter marks");
	Scanner inter=new Scanner(System.in);
	y=inter.nextInt();

	System.out.println("Enter test marks");
	Scanner test=new Scanner(System.in);
	z=test.nextInt();

	 per1 = (x/850.0)*100;
	 per2 = (y/1100.0)*100;
       	 cpn  =	((per1/100)*10) + ((per2/100)*30) + ((z/100)*60);

	System.out.println("Your Matric Percentage is " + per1);
	System.out.println("Your Inter Percentage is " + per2);
	System.out.println("Your CPN is " + cpn);		
    }
}