import java.util.*;
class condition {
    public static void main (String []args){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        age=sc.nextInt();

    // if(age>18){
    //     System.out.println("You can drive now!");
    // }

    switch(age){
        case 18:
            System.out.println("you can drive ");
            break;
        case 17:
            System.out.println("you can't drive ");
            break;
        case 60:
             System.out.println("you can't drive  becaue you are over aged");
            break;
        default:
             System.out.println("Drive slow enjoy the car ");    
    }

    }
}