class XOr{
    public static void main (String []args){
        int []arr={1,2,3,9,3,2,1,6,6,5,9};
        System.out.print("the unique element is : "+ unique_ele(arr));
    }
    private static int unique_ele(int []arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans ^ arr[i];
        }
        return ans;
    } 
}