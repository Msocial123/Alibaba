import java.util.Scanner;
public class AddTwoNumbers2 {

    public static void main(String[] args) {
        
        int num1, num2, sum, sub,mul;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);

	sub = num1 + num2;
	System.out.println("Subtraction of two numbers:" +sub);

	mul = num1 + num2 + num3;
	System.out.println("Multiplication of two numbers:" +mul);

    }
}
