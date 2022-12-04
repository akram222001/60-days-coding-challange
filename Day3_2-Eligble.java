import java.util.Scanner;
public class p5_eligble {
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        if(x>18)
        {
            System.out.print("Adult");
        }
        else 
        {
             System.out.print("This Is Not Adult");
        }
    }
}
