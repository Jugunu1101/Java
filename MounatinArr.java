// leetcode 852  mounatin array  
// finding peek of a sorted arr
class MounatinArr{
    public static void main (String []args){
    int []arr={0,2,3,1,0};
    int ans=MArray(arr);
    System.out.println("the peek element is at index "+ans);
    }

    static int MArray(int []arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid] >arr[mid+1]){
                //means element is in left side
                e=mid;
            }
            else {
                //other wise in rigth side
                s=mid+1;
            }
        }
        return s;   // or e=end
    }
}
