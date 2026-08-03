class opert{
    public static void main (String []args){
        int a=9;
        int b=5;
        System.out.println("Arithematic opertator");
        System.out.println("add : "+(a+b));
        System.out.println("add : "+(a-b));    
        System.out.println("add : "+(a*b));
        System.out.println("add : "+(a/b));
        System.out.println("add : "+(a%b));
        System.out.println("add : "+(--a));

        System.out.println("Assigenment opertator");
        int c= 0;
        c=a;
        int d =0;
        d+= c;
        int e =3;
        e-= d;
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e "+e);

        System.out.println("logical opertator");

         if (a !=b && a > b ){
            System.out.println(" && and ! operator ");
         }
         else if (a==b || a <b ){
            System.out.println(" ||  operator");
         }

        System.out.println("bitwise opertator");
         System.out.println("& : "+ (a & b));
        System.out.println(" |: "+  (a | b)) ;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}