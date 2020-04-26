class B extends A{
   int c ;
   int d;
B(int a,int b,int c,int d){
super(a,b);
this.c = c;
this.d =d;
}

public static void main(String args[]){
    B x = new B(1,2,3,4);
    System.out.println(x.a);
 }
}