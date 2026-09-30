// runtime poly
class runtime{
    void fun(int a,int b){
            System.out.println("Two no a + b = "+(a+b));
    }
    void fun(int a,int b,int c){
            System.out.print("Two no a + b + c = "+(a+b+c));
    }
}
class Polymorphism{
    public static void main (String[] args){
        runtime obj=new runtime();
        obj.fun(1,2);
        obj.fun(1,2,5);
    }
}