class Q5{


    public static void main(String arg[]){

        int row=5;int col=5;

        for (int i=1;i<=row;i++){


            for(int j=1;j<=col;j++){

                if(i==j||i+j==row+1){

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
