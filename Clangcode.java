import java.util.*;
import java.*;
import java.io.*;

class TicTacToe{

   public static void main(string  args[]) {
       int a[ 3][3];

       int  game ()
       {
       for(int i=1;i<=3;i++)
       {
           for(int j=1;j<=3;j++)
           {
               a[i][j]=0;
           }
       }

       }
       int getuserinput(int f)
       {
           System.out.println("Enter the Postion Number");

           Scanner First =new Scanner(system.in);
           Scanner Second =new Scanner(system.in);
           validinput(First,Second,f);
       }
       int validinput(int k,int l,int m)
       {
           int temp;
           if(a[k][l]==0)
           {
               System.out.println("Element is inserted");
               makemove(k,m,l);

           }
           else
           {
               System.out.println("Try again");
               System.out.println("Want to insert again 1.yes"+ /n+" 2.no");
               Scanner temp =new Scanner(system.in);
               if(temp==1)
               {
                   getuserinput(m);
               }
               else
               {
                   exit(0);
               }

           }
       }

       int makemove(int c,int d,int e)
       {
           //f=1 for first
           //f=2 for second
           a[c][d]=e;
           System.out.println("Player" + e +"Insertion has been done");
           printboard();
           iswins(e);

       }
       int printboard()
       {
           System.out.println("\n \n");
           for(int i=1;i<=3;i++)
           {
               for(int j=1;j<=3;j++)
               {
                   a[i][j]=0;
               }
           }

       }
   }



}
