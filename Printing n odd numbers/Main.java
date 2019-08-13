import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count=1;
      int temp=1;
      for(temp=1;temp<=2*n;temp++)
      {
        if(count%2==1)
        {
          System.out.println(count);
        
        }
        count=count+1;
      }
	}
}