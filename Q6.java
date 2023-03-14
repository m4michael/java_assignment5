class Q6{
	
	public static void main(String arg[]){
		int r=5;int a=64;
		
		for(int i=1;i<=r;i++){
			
			for(int j=1;j<=r-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print((char)(a+k));
			}
			System.out.println();
		}
		
		 r--; int num=1;
		
		for(int l=1;l<=r;l++){
			for(int m=1;m<=l;m++){
				System.out.print(" ");
			}
			for(int n=2*r-l;n>=l;n--){
				System.out.print((char)(a+num++));
			}
			num=1;
			System.out.println();
		}
	}
}

			

