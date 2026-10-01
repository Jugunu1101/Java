// print hlo 5 times
class recursion{
    public static void main(String []args){
    hloPrint(5);
    }
    static void hloPrint(int n){
        if(n < 0){
            return ;
        }  
        System.out.println("Hlo duniya");
        hloPrint(n-1);
    }
}
