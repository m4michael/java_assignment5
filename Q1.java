import java.util.Scanner;
class Q1{
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=1;
        int b=1;
        int sum=1;

        System.out.println("Fibonacci series for " +n+" terms");


        for(int i=1; i<=n;i++){

            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }


            



        }



    }
