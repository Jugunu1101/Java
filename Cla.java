class Cla {
    public static void main (String []args){
        int i;
        int s=0;
        for( i=0;i<args.length;i++){
            int a=Integer.parseInt(args[i]);
            s+=a;
        }
     System.out.print("sum of all args is ="+s);
    }
}
