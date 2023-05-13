	package ptb_2;
import java.util.Scanner;
public class ptb2 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
          double a,b,c;
          double x1,x2,delta;
          System.out.println("nhap he so ....a:");
          a= sc.nextDouble();
          System.out.println("nhap he so b:");
          b= sc.nextDouble();
          System.out.println("nhap he so c");
          c= sc.nextDouble();
          delta= b*b - 4*a*c;
          if(delta < 0)
          {
              System.out.println("phuong trinh vo nghiem");
          }
          else if(delta == 0)
          {
              x1 = -b/(2*a);
              System.out.println("phuong trinh co mot nghiem kep x1=x2= "+x1);
          }
          else
          {
              x1=(-b-Math.sqrt(delta))/(2*a);
              x2=(-b+Math.sqrt(delta))/(2*a);
              System.out.println("phuong trinh co nghiem");
              System.out.println("x1= "+x1);
              System.out.println("x2= "+x2);Dadaddfefa
          }

    }
}
