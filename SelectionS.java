class SelectionS{
    public static void main(String []args){
        int []arr={1,6,4,5,2,9};
        SelSort(arr);
        dis(arr);
    }
    static void dis(int []arr){
        for(int i:arr){
            System.out.print(i +" ");
        }
         System.out.print("\n");
    }
    static void SelSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int maxx=arr[i];
            int index=i;
            for(int j=i;j<arr.length-1;j++){
                if(maxx > arr[j]){
                    maxx=arr[j];
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
}