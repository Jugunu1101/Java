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
class recursion {
    static int fibo(int n){ 
        int a=0 ;    // 5
     if(n==0){
        return 0;
     }
     if(n==1){
        return 1;
     }
          return  fibo(n-1) + fibo(n-2);             
    }
    public static void main (String []args){
        System.out.print("Fibo serise = "+fibo(8));
    }
}