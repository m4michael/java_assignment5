class Q7{
	
	public static void main(String arg[]){
		int r=5;
		
		for(int i=1;i<=r;i++){
			for(int j=1;j<=r;j++){
				if(i==((r+1)/2)||j==((r+1)/2)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
			
			