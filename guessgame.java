
import java.util.*;
import java.util.Random;
public class guessgame {
    public static void main(String args[])
    {
        System.out.println("welcome to guess game");
        System.out.println("u can select as per your choice....");
        System.out.println("select 1->3 chances,select 2->4 chances,select 3->5 chances");
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        int t=0;
        switch(i)
        {
            case 1:
            t=3;
            break;
            case 2:
            t=4;
            break;
            case 3:
            t=5;
            break;
            default:
            break;
        }
       /*  if((t!=1)||(t!=2)||(t!=3))
        System.out.println("Exit game!!!");
        else
        System.out.println("your try count is: "+t);*/
        System.out.println("your tries is: "+t);
        int n=t;
        Random random=new Random();
        int cnt=0;
        System.out.println("i am thinking  of a number between 1-100");
        for(int j=1;j<=t;j++)
        { 
            n--;
            cnt++;
            System.out.println("enter your guess");
            Scanner s =new Scanner(System.in);
            int num=s.nextInt();
            int ran=random.nextInt(101);
            if((num!=ran)){
                System.out.println("your guess is not too much high");
                System.out.println("u have"+n+"left");
            }
            else
            {
                System.out.println("your guess is not too much low");
                System.out.println("u won in "+n+"chances");
                break;

            }
        
         }
         if(cnt==t)
         System.out.println("you lose");
         System.out.println("-------------------------");

        

    }
}
