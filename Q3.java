import java.util.Scanner;
class Q3{


    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number=");
        int n=sc.nextInt();

        int fact=1;

        for(int i=1;i<=n;i++){

        
        fact=fact*i;
        }

        System.out.print("\nFactorial of "+n+"="+fact);


    }
}