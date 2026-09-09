class BubbleSort{
    public static void main(String []args){
    int []arr={1,5,6,90,4,8,9,10,0,7};
    dis(arr);
    System.out.print("lets start Sorting : ");
    BBSort(arr);
    System.out.print("Sorted arr is : ");
    dis(arr);
    }
    static void dis(int []arr){
        for(int i:arr){
            System.out.print(i +" ");
        }
         System.out.print("\n");
    }

    static void BBSort(int []arr){
        for(int i=0;i<arr.length-1;i++){   
             boolean swap=false;                 //len=8
          for(int j=0;j< arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                 swap=true;
             }
            }
            //it means arr sort ho gya h ab 
            if(swap==false){
                break;
            }
            dis(arr);
        }
    }
}