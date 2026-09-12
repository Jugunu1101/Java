// outter loop first   see = how many time it is runnig then
// inner loop second   see = how many time it is printing , runnig 
import java.util.Scanner;
class pattern {
    public static void main (String args[]){
    // System.out.print("Enter the no of line :");
     Scanner sc=new Scanner(System.in);                 //  * * * *
    //     int n =sc.nextInt();                          //   * * *
    //     for(int i=n;i>0;i--){                        //    * * 
    //         for(int j=0;j<i;j++){                    //    * 
    //             System.out.print("* ");
    //         }
    //            System.out.println(" ");
    //     }

    // System.out.print("Enter the no of line :");        //  *
    //  int p =sc.nextInt();                             //   * *      
    //       for(int i=1;i<=p;i++){                     //    * * *
    //         for(int j=0;j<i;j++){                   //     * * * *
    //             System.out.print("* ");
    //         }
    //     System.out.println(" ");
    //     }
    


    System.out.print("Enter the no of line :");                 //  *
    int n1=sc.nextInt();                                         //   * * 
    for(int i=0;i<2*n1;i++){                                   //
        int c= i>n1 ? 2*n1-i : i;                              //    * * *
        for(int j=0;j<c;j++){                                //    * * * *
            System.out.print("* ");                         //      * * *
        }                                                  //       * *
        System.out.print("\n");                           //        * 
    }                                                    
    }
}



