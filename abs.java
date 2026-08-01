import java.util.*;
abstract class demo1{
    int x,y;
    void fun1(){
        x=9;
        y=9;
    }
   abstract void fun2();
   demo1(){
     System.out.println("this is parent class ");
   }
   }

class demo2 extends demo1{
    int z;
    // overriding because it inherite the method of parent 
    //and it has a abs-function and if it is inhratited by demo2 we can't make the obejct of child class
    void fun2(){
        System.out.println("this is function of child class ");
    }
    demo2(){
     System.out.println("this is child class ");
   }
}
class abs{
public static void main(String []args){
    demo2 obj=new demo2();
    obj.fun2();
}
}