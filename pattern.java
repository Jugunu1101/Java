import java.util.Scanner;
class pattern {
    public static void main (String args[]){
    System.out.print("Enter the no of line :");
    Scanner sc=new Scanner(System.in);                 //  * * * *
        int n =sc.nextInt();                          //   * * *
        for(int i=n;i>0;i--){                        //    * * 
            for(int j=0;j<i;j++){                    //    * 
                System.out.print("* ");
            }
               System.out.println(" ");
        }

    System.out.print("Enter the no of line :");        //  *
     int p =sc.nextInt();                             //   * *      
          for(int i=1;i<=p;i++){                     //    * * *
            for(int j=0;j<i;j++){                   //     * * * *
                System.out.print("* ");
            }
        System.out.println(" ");
        }
    }
}