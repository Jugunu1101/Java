// 1D array  

// import java.util.*;
// class LinearS{
//     public static void main(String []args) {
//         int []arr={1,2,4,5,6,7,8,9,89,10,67,78,90,100,21,14,24};
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the element you want to search = ");
//         int target=sc.nextInt();
//         int ans=LinearSearch(arr,target);
//         if(ans<0){   
//             System.out.println("The element not found");
//         }
//         else {
//              System.out.printf("The element %d is found ",ans);
//         }
//     }

//    static int LinearSearch(int []arr,int target){
//         for(int element :arr){
//             if(element==target){
//                 return element;
//             }
//         }
//         return -1;
//     }
//     }



// 2D array
import java.util.*;
class LinearS{
    public static void main(String []args){
        int [][]arr={ {1,2,3},
                        {4,5,6,7,},
                        {9,10,13,14,15,16}
                        };
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to search :");
        int target=sc.nextInt();
        int []ans=LinearSearch(arr,target);   
        System.out.print(Arrays.toString(ans));

    }
    static int[] LinearSearch(int [][]arr,int target ){
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]==target){
                    return new int[]{r,c};
                }
            }  
        }
    return new int[]{-1,-1};
    }
}