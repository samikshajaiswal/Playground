import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int fact=1;
      int i = 0;
      for(i=1;i<=n;i++)
      {
        fact=fact*i;
      }
      System.out.println(fact);
	}
}