class CountNo{
    public static void main (String []args){
        int []arr={12,15,16,17,4,5,6,78,3,5,97,534,347,44,98644,7530,34,1,2};
        int count=0;
        count=Even_digit(arr);
        System.out.print("The no of even digit in arr is : "+count);
        
    }
    static int Even_digit(int []arr){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}