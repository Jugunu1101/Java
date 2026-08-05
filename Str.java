import java.util.*;
class Str {
    public static void main(String []args){
    //string is  always immmutable 
    int a=9;
    float b =5.95f;
    System.out.printf("The vlaue of a is :%d  and the value of b is:%f \n",a , b); 

     
    String s="hello";
    int l=s.length();
    String c="BYY";
    int l2=c.length();
    System.out.printf("The length of s is %d  and length of c is %d",l,l2 );
    System.out.print("\n Upper case "+ s.toUpperCase());   // HELLO
    System.out.print("\n lower case "+ s.toLowerCase());   // byy
    System.out.print("\n It is immutable : "+ s);   

// trim() is used to remove space form end and starting of string
    String ch = "Hello   ";
    System.out.print("Without trim method :"+ch);
    System.out.print("\nWith trim method :"+ ch.trim());

// substring is used to cut a part part form that index to last
System.out.print("\nSubstring  :" + ch.substring(3))      ;  //hello =lo; 

// replace all the occuresne of that character/string  in string in new string
System.out.print("\nSubstring  :" + ch.replace('l','p'));      // heppo
    }
   

 }