import java.util.*;
class LinearS{
    public static void main(String []args) {
        int []arr={1,2,4,5,6,7,8,9,89,10,67,78,90,100,21,14,24};
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the element you want to search = ");
        int target=sc.nextInt();
        int ans=LinearSearch(arr,target);
        if(ans<0){   
            System.out.println("The element not found");
        }
        else {
             System.out.printf("The element %d is found ",ans);
        }
    }

   static int LinearSearch(int []arr,int target){
        for(int element :arr){
            if(element==target){
                return element;
            }
        }
        return -1;
    }
    }