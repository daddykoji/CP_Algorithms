class Diamond23 {
  public static void main(String[] args) {
      int n=123456789,m=0;
      while(n!=0){
          m=(10*m)+(n%10);
          n=n/10;}
          System.out.println("m="+m);
          System.out.println("n="+n);}}