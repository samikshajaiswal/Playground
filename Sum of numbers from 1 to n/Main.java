import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count=0;
      int i=0;
      for(i=1;i<=n;i++)
        count=count+i;
      System.out.println(count);
	}
}