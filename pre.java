class pre{
    public static void main (String args[]){
        //precedence && associativity 
        int a =9/3-5*2;
        /*
                left or rigth 
                9/3-5*2
                3 - 5*2
                3-10=-7
        */
        int b = 5*2-9/3;
          /*
                left or rigth 
                5*2-9/3
                10-9/3
                7    
        */
System.out.println("a ="+a);
System.out.println("b ="+b);
    }
}