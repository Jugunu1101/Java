import java.util.Scanner ;
class practice {
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no which factorialyou wanted :");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
         System.out.printf("The factriol of %d is = %d ",n,fact);
    }
}