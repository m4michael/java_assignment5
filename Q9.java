import java.util.Scanner;
class Q9{
	
	public static void main(String arg[]){
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a prime=");
		int n=sc.nextInt();
		
		if(prime(n) && prime(n-2)){
			
			System.out.print(n+" can be expressed as sum of two prime numbers");
		}
		else{
			System.out.print(n+" cant be expressed as sum of two prime numbers");
		}
		
		
		
	}

	
	static boolean prime(int m){
		int temp=0;
		
		if(m<1)
			return false;
		
		for(int l=2;l<=m-1;l++){
			
			if(m%l==0){
				return false;
			}
			
			
		}
		
	
			return true;
		
		
	}
}
			
			
		