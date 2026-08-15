    // 1D array 
//  class Array {
//     public static void main (String args[]){
//         int []marks={12,13,14,15,16};
//         int n=marks.length;
//          System.out.println("Length of arr is :"+n);
//         for(int i=0;i<n;i++){
//             System.out.print(" "+ marks[i]);
//         }
//     }
//  }


//   2D array 
import java.util.Scanner;
class Array{
    public static void main (String []args){
        // int [][]arr=new int[2][2];   // 1
        // int [][]a={{1,2,3}, {1,2,3},{1,2,3}};
        int [][] arr=new int[2][];
    Scanner sc=new Scanner(System.in);
    // inserting into arr
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print("Enter numbers :");
            int n=sc.nextInt();
            arr[i][j]=n;
        }
    }
// printing arr
    System.out.println("The Value in array are");
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
              System.out.print(arr[i][j] +" ");
        }
          System.out.println();
    }
    }
}



