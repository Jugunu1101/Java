// class recursion {
//     static int fact(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//         return n * fact(n-1) ;
//     }
//     public static void main (String []args){
//         System.out.print("Fact = "+fact(10));
//     }
// }


// fibo serise using recursion 

// class recursion {
//     static int fibo(int n){ 
//         int a=0 ;    // 5
//      if(n==0){
//         return 0;
//      }
//      if(n==1){
//         return 1;
//      }
//           return  fibo(n-1) + fibo(n-2);             
//     }
//     public static void main (String []args){
//      
//    System.out.print("Fibo serise = "+fibo(8));
//     }
// }



//print hlo 5 time
// class recursion{
//     public static void main(String []args){
//         hloPrint(5);
//     }
//     static void hloPrint(int n){
//         if(n<=0){
//             return ;
//         }
//         hloPrint(n-1);
//         System.out.println("Hlo duniya");
//     }
// }



// reverse a number
// class recursion{
//     static int rev=0;
//     static void no_reverse(int no){
//         if(no==0){
//             return;
//         } 
//         int last_digit=no%10;
//         rev=rev * 10 +last_digit;
//         no_reverse(no/10);
//     }
//     public static void main(String []args){
//         int n=1234;
//         System.out.println(n);
//         no_reverse(n);
//         System.out.print(rev);
//     }

// }



// array is sorted or not
class recursion{
    static boolean ans=false;;
    static void is_sorted(int []arr,int i){
        if(i==arr.length-1){
            ans=true;
            return ;
        }
        if(arr[i] > arr[i+1] )
        {
            return ;
        }
        i++;
        is_sorted(arr,i);
        
    }
    public static void main (String []args){
        int []arr={1,2,3,5,6,7};
        is_sorted(arr,0);
        System.out.print("The Arr is sorted = "+ans);
    }
}