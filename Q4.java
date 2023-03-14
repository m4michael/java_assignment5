class Q4{

    public static void main(String arg[]){

        System.out.println("Armstrong numbers from 1 to 1000 are");

        int arm, rem, num, orig ,count;
        for (int i=1;i<=1000;i++){

            arm=0; count=0;
            orig=i; num=i;

            while(num>0){

                num=num/10;
                count++;
            }

            num=orig;

            while(num>0){

                rem=num%10;
                arm=(int)(arm+ Math.pow(rem,count));
                num=num/10;
            }

            if(arm==orig){
                System.out.println(i);

            }


            }

            
        }


    }
