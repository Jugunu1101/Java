class Demo{
    int x,y;
    void fun1(){
        System.out.println("THe value of x is : "+x);
        System.out.println("THe value of y is : "+y);
    }
    // non-parametersized constructor 
    // Demo(){
    //     x=16;
    //     y=50;
    // }

    //parameterized constructor 
    Demo(int p, int q){
        x=p;
        y=q;
    } 
}
class constructor_{
    public static void main (String []args){
    Demo obj=new Demo(23,56);
    obj.fun1();
    }
}