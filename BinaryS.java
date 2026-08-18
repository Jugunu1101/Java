import java.util.*;
class BinaryS{
    public static void main(String []args){
        int []arr={1,2,3,4,5,6,7,8,9,10,11,16,18,19,28,59};
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a element :");
        int target=sc.nextInt();

        int ans=BinarySearch(arr,target);
        System.out.print("The element is at index : "+ ans);
    }

    static int BinarySearch(int []arr,int target){
        int s=0;                 
        int e=arr.length-1;  
        while(s <= e){
            int mid=s + (e-s) /2;
            if(arr[mid]== target){
                return mid+1;
            }
            else if(arr[mid] < target){       
                s=mid+1;                    
            }
            else {
                e=mid-1;
            }
        }
        return -1;
    }
}