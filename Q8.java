import java.util.Scanner;

class Q8{
	public static void main(String arg[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of rows=");
		int row=sc.nextInt();
		
		int temp;int number=3;
		
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=row-i;j++){
				
				System.out.print(" ");
			}
			
			if(i==1){
				
				System.out.print("2");
			}
			
			else{
				
				for(int k=1;k<=i;){
					temp=0;
					
					for(int l=2;l<number;l++){
						
						if(number%l==0){
							temp++;
						}
					}
					
					if(temp==0){
						k++;
						System.out.print(number+" ");
					}
					
					number++;
					
				}
				
			}
			
			System.out.println();
		}
		
	}
}