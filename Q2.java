import java.util.Scanner;

public class Q2 {

public static void main(String arg[]){

    Scanner sc=new Scanner(System.in);

    int sum=0;
   while(sc.hasNextLine()){

    int n=sc.nextInt();
    if(n>=0){

        sum=sum+n;
    }

    else{

        sum=-1;
        break;
    }



   }
   System.out.print("input is discarded as input is="+sum);

    }

}
    

