// celling of number means  >= target 
//   target =10    the result will 10 or greater the 10 but smaller then rest greater number
class CellingOfNo{
    public static void main (String args[]){
        int []arr={1,3,4,5,6,11,12,14,16,19,20,26,29,30};
        int target=31;
        int c=CellingNo(arr,target);
         System.out.println("The given no is : "+target);
        System.out.print("The celling no is : "+c);
    }
    static int CellingNo(int []arr,int target){
        // binary search 
        if(target > arr[arr.length-1]){
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
    return arr[s];
    }

}