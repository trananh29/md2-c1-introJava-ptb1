import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a,b,c;
        System.out.println("input a: ");
        a=sc.nextDouble();
        System.out.println("input b:  ");
        b= sc.nextDouble();
        System.out.println("input c:  ");
        c= sc.nextDouble();
        if (a!=0) {
            double answer = (c - b) / a;
            System.out.printf(" Equation pass with x= %f!\n",answer);
        } else{
            if (b==0) {
            System.out.print("The solution is al x!");
        } else {
            System.out.println("No solution");
        }
    }
}}
