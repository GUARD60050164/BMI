import java.util.*;
class BMI
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Weight(kg.) ==> "); double w = sc.nextDouble();
		System.out.print("Height(cm.) ==> "); double h = sc.nextDouble();
		double bmi = w/(h*h);
		System.out.println("BMI ==> " + bmi);
	}
}
