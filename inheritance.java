import java.util.*;
// single inheritance ->
class parent{
    int x,y;
    void fun1(){
         System.out.println("this is parents class ");
    }
    void fun2(){
        Scanner s = new Scanner(System.in);
         System.out.println("enter X :");
         x=s.nextInt();

        System.out.println("enter y :");
        y=s.nextInt();
    }
}
class child extends parent{
    void display(){
        System.out.println("X ="+x);
        System.out.println("Y ="+y);
    }
}
// -<
class inheritance {
    public static void main (String []args){
        child obj=new child();
        obj.fun2();
        obj.display();
    }
}