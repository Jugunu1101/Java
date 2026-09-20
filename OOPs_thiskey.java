import java.util.*;
class Student{
    String name;
    int age;
    int classs;
    Student(String n,int a,int c){
        this.name=n;     // not imp to use this
        this.age=a;
        this.classs=c;
    }
    Student(){
        // calling consturstor using constructor using this keyword
        //it will call parametrized consturctor 
     
        this("defautl person",19,12);
           System.out.print(" i am calling parametrized consturstor");
    }
    // Object destroy hone se pehle message
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is garbage collected");
    }
}
class OOPs_thiskey{
    public static void main (String []args){
        Student kunal=new Student("kunal",22,12);
        Student hero=new Student();

        System.out.println("the name of stu is :"+ kunal.name);
        System.out.print("the name of stu is :"+ hero.name);

    }
}