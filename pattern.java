// outter loop first   see = how many time it is runnig then
// inner loop second   see = how many time it is printing , runnig 
import java.util.Scanner;
class pattern {
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);  
    // System.out.print("Enter the no of line :");
               
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
    


    // System.out.print("Enter the no of line :");                  //   *
    // int n1=sc.nextInt();                                        //    * * 
    // for(int i=0;i<2*n1;i++){                                   //     * * *
    //     int c= i>n1 ? 2*n1-i : i;                             //      * * * *
    //     for(int j=0;j<c;j++){                                //       * * * 
    //         System.out.print("* ");                         //        * * 
    //     }                                                  //         * 
    //     System.out.print("\n");                                    
    // } 


    System.out.print("Enter the no of line :");                  
    int n2=sc.nextInt();                                        
    for(int r=0;r<2*n2;r++){                         //         * 
        int c=r>n2?2*n2-r:r;                        //         * *    
        int space=n2-c;                            //         * * *  
        for(int s=0;s<space;s++){                 //         * * * *                       
            System.out.print(" ");               //           * * *                  
        }                                       //             * * 
        for(int col=0;col<c;col++){             //              *                             
            System.out.print("* ");                                  
        }                                                
        System.out.print("\n");                                    
    }                                                   
    }
}



