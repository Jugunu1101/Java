// floor of a number  <=  target 
// 1,2,3,5        ->  3<=5     
// use binary sort and return the end index
//   target =10    the result will 10 or less then 10 but grater  then rest smaller  number
class Floor{
    public static void main (String args[]){
        int []arr={2,3,4,5,6,11,12,14,16,19,20,26,29,30};
        int target=1;
        int c=FloorOfNo(arr,target);
        System.out.println("The give no is : "+target);
        System.out.print("The floor no is : "+c);
    }
    static int FloorOfNo(int []arr,int target){
        // binary search
        if(target < arr[0]){
            return -1;
        }
        int s=0;
        int e=arr.length-1;
        int m=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid] > target){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
    return arr[e];             // when the while terminate and element not found the 
                            // smaller element will be  arr[e]   e   target s 
    }
}