import java.util.Scanner;
class Q10{
    public static void main(String arg[] ){

Scanner sc=new Scanner(System.in);

System.out.print("Enter number of bulbs=");

int n=sc.nextInt();

System.out.print("Bulb number ");

for(int i=1;i*i<=n;i++){
    System.out.print(i*i+ " ");
}
System.out.print("will be ON");


}




    }