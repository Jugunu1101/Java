// imp   it prints fact of any number

// import java.util.Scanner ;
// class practice {
//     public static void main (String args[]){
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter the no which factorialyou wanted :");
//         int n=sc.nextInt();
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact*=i;
//         }
//          System.out.printf("The factriol of %d is = %d ",n,fact);
//     }
// }



// find a given no present in the array or not

// import java.util.* ;
// class practice {
//     public static void main (String []args){
//         int []arr={1,2,3,4,5,6,7,8,9,10,16,100,26,79};
//         Scanner sc =new Scanner(System.in);
//         System.out.print("enter the no u wanted to find :");
//         int n=sc.nextInt();
//         boolean b=false;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==n){
//                   System.out.printf("The no %d in found at %d index",n,i);
//                   b=true;
//                   break;
//             }
//         }   
//          if(b!=true){
//                   System.out.printf("Not found");
//        }
// }
// }



// add the 2*2 matrix value

// class practice {
//     public static void main (String []args){
//         int [][]a1 ={ {1,2}, 
//                      {1,2}
//                      };
//         int [][]a2 ={ {1,2}, 
//                       {1,2}
//                       };
//         int [][]ans=new int[a1.length][a1[0].length];
//         for(int i=0;i<a1.length;i++){
//             for(int j=0;j<a1[i].length;j++){
//                 ans[i][j]=a1[i][j] + a2[i][j];
//             }
//         }

//   for(int i=0;i<ans.length;i++){
//             for(int j=0;j<ans[i].length;j++){
//                 System.out.print(ans[i][j] +" ");
//             }
//              System.out.println();
//         }
//  }
//   }



// reverse any array 

// import java.util.Scanner;
// class practice {
//     public static void main (String []args){
//         int []arr =new int[5];
//         Scanner sc =new Scanner(System.in);
//         for(int i=0;i<arr.length;i++){
//              System.out.print("Enter a number : ");
//              int n=sc.nextInt();
//              arr[i]=n;
//         }

//       for(int i=0;i<arr.length;i++){
//              System.out.print(arr[i] +" ");
//         }
//         System.out.println();
//     int f=0;
//     int l=arr.length-1;
//     while(f < l){
//          int temp=arr[f];
//         arr[f]=arr[l];
//         arr[l]=temp;
//         f++;
//         l--;
//     }    
//       for(int i=0;i<arr.length;i++){
//           System.out.print(arr[i] +" ");
//     }
//     }
// }


// fact using recursion

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



// fibonachi number
// import java.util.Scanner;
// class practice {
//     public static void main (String []args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int f=0;
//         int s=1;
//          System.out.print(f +" ");
//          System.out.print(s +" ");
//        int count=2;
//        while(count <=n){
//         int temp=f;        // first value 
//         f = s          ;     // second value
//         s= temp +f;              // first +second
//         System.out.print(s +" ");
//         count++;
//        }
//   System.out.print("The nth fibo number is :" +s);
//     }
// } 



// find the occurence of a digit in a number;
// import java.util.*;
// class practice {
//     public static void main (String []args){
//         // int digit=1234787976;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a digit : ");
//         int digit=sc.nextInt();

//         int remindar=1;
//         int count=0;
        
//         System.out.print("enter a number you wanted to find : ");
//         int find=sc.nextInt();

//         while(digit > 0){
//             remindar=digit%10;
//             digit=digit/10;  
//             if(remindar==find){
//                 count++;
//             }        
//         }
// // System.out.print("The occurence of give no is:"+ count);


//     }
//     }



//    3 digit armstrong number
// import java.util.*;
// class practice {
//     public static void main (String []args){
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         int c=n;

//     while(c >0){
//      int remindar=c%10;
//      remindar=remindar *remindar * remindar;
//      sum+=remindar;
//      c=c/10;
//     }

//     System.out.println("value of sum = "+sum);
//     if(sum==n){
//         System.out.print("Armstrong number");
//     }
//     else {
//         System.out.print("Not a armstrong number");
//     }
//     }
// }



// n digit armstrong number  
// import java.util.*;
// class practice {
//     public static void main (String []args){
//         Scanner sc= new Scanner(System.in);
//          System.out.print("enter a number");
//         int n=sc.nextInt();
//         int sum=0;
//         int temp=n;
//         int cnt=0;

//         while(temp>0){
//             temp=temp/10;
//             cnt++;
//         }
//         System.out.println("count ="+cnt);
//         temp=n ;                // store the n var real value

//       while(temp >0){
//        int remindar=temp%10;
//        int power=(int)Math.pow(remindar,cnt);
//        sum+=power;
//        temp=temp/10;
//     }

//     System.out.println("value of sum = "+sum);
//     if(sum==n){
//         System.out.print("Armstrong number");
//     }
//     else {
//         System.out.print("Not a armstrong number");
//     }
//     }
// }


// Prime or not
// class practice {
//     public static void main (String []args){
//         int n=12;
//         int cnt=0;
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//                 cnt++;
//                 break;
//             }
//         }
//         if(cnt > 0){
//             System.out.printf(" The  %d is  not a prime no",n);
//         }
//         else {
        
//              System.out.printf(" The  %d is a prime no",n);
//         }
//     }
// }




// find n number in range  which are not prime
class practice {
    public static void main (String []args){
        int n=15;
        for(int i=2;i<n;i++){
            if(n%i==0){
                 System.out.printf(" The  %d is  Not a prime No",i);
                 System.out.println("");
                 System.out.println(i);
            }
        }
    }
}