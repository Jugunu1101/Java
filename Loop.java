// for loop
//while loop
// do while loop
class Loop{
    public static void main (String []args){
      int i=0;
      do {
          i++;
          if(i==2){
            System.out.println("i am skiped "+ i);
            continue ;
          }
    System.out.println("hello :" + i);
      } while(i<5);

    }
}