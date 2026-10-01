class SortedInfiniteArr{
    public static void main(String []args){
      int []arr={1,2,3,4,5,6,7,8,9,10,11,16,18,19,28,59};
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a element :");
        int target=sc.nextInt();
        int answer=ans(arr,target);
         System.out.print("the element is found at :"+answer);
    }
    static int ans(int []arr,int target){
        int start=0;
        int end =1;
        while(target > arr[end]){
            start=end+1;
            end=end+(end-start +1)*2;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int []arr,int target,int st,int ed){
        int s= st ;    
        int e=  ed;
        while(s <= e){
            int mid=s + (e-s) /2; 
            if(arr[mid]== target){
                return mid;
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