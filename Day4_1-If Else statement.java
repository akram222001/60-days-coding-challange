import java.util.Scanner;
public class if else statement {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a==b)
    {
      System.out.print("A is equal");
    }
    else
    {
      if(a>b)
      {
        System.out.print("A is greater then");
      }
      else
      {
        System.out.print("A is less then");
      }
    }
  }
}
        
