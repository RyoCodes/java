import java.util.Scanner;

public class practise
{
  public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows: ");
        int n = sc.nextInt();
        System.out.println("Choose the type of pattern:");
        System.out.println("1.Pyramid");
        System.out.println("2.Reverse pyramid star pattern");
        System.out.println("3.Left triangle star pattern");
        System.out.println("4.Downward triangle star patter");
        System.out.println("5.Diamond star pattern");
        System.out.println("6.Mirrored right triangle star pattern");
        System.out.println("7.Right triangle star pattern");
        System.out.println("8.Right down mirror star pattern");
        System.out.println("9.Right Pascal's triangle");
        System.out.println("10.Left pascal's triangle pattern");
        System.out.println("11. Sandglass star pattern");
        int choice = sc.nextInt();
        int i, j;
        switch(choice)
        {
            case 1: 
            for (i=0; i<n; i++)   
            {  
              for (j=n-i; j>1; j--)   
              {    
                System.out.print(" ");   
              }   
             
              for (j=0; j<=i; j++ )   
             {    
              System.out.print("* ");   
             }   
             System.out.println();   
            }   
              break;

            case 2:
            for ( i = 1; i <= n; i++)
            {
              for (j = 1; j < i; j++)
                {
                    System.out.print(" ");
                }
              for (j = i; j <=n; j++)
                {
                    System.out.print(" *");
                }  
                System.out.println();
            }
               break;
            case 3:
            for(i=0; i<n; i++)
            {
 
               for(j=2*(n-i); j>=0; j--)
             {
               
                System.out.print(" ");
             }
            
         
             for(j=0; j<=i; j++)
             {
               
                System.out.print("* ");
             }
             
           
             System.out.println();
            }
            break;
            case 4:
            for ( i= n-1; i>=0 ; i--)
             {
              for (j=0; j<=i; j++)
              {
               System.out.print("*" + " ");
              }
              System.out.println();
             }
             break;
            case 5:
             int space = n - 1;
             for (j = 1; j<= n; j++)
              {
                for (i = 1; i<= space; i++)
                {
                  System.out.print(" ");
                }
                  space--;
                for (i = 1; i <= 2 * j - 1; i++)
                 {
                   System.out.print("*");
                 }
                  System.out.println("");
              }
                space = 1;
                for (j = 1; j<= n - 1; j++)
                 {
                    for (i = 1; i<= space; i++)
                     {
                       System.out.print(" ");
                     }
                     space++;
                    for (i = 1; i<= 2 * (n - j) - 1; i++)
                     {
                      System.out.print("*");
                     }
                      System.out.println("");
                  }
                  break;
              case 6:
              for ( i= 0; i<= n; i++)
              {
                  for (j=1; j<=n-i; j++)
                  {
                      System.out.print(" ");
                  }
                  for (int k=0;k<=i;k++)
                  {
                      System.out.print("*");
                  } 
                      System.out.println("");
              }
              break;
              case 7:
              for ( i= 0; i<= n-1 ; i++)
              {
                  for (j=0; j<=i; j++)
                   {
                     System.out.print(" ");
                   }
                for (int k=0; k<=n-1-i; k++)
                  {
                    System.out.print("*" + " ");
                  }
                     System.out.println();
              }
              break;
              case 8:
              for ( i= n; i>= 1; i--)
              {
                for ( j=n; j>i;j--)
                 {
                   System.out.print(" ");
                 }
                 for (int k=1;k<=i;k++)
                  {
                    System.out.print("*");
                  }
                 System.out.println("");
              }
              break;
              case 9:
              for ( i= 0; i<= n-1 ; i++)
              {
                  for (j=0; j<=i; j++)
                   {
                     System.out.print("*"+ " ");
                   } 
                   System.out.println(""); 
              } 
              for (i=n-1; i>=0; i--)
              {
                  for(j=0; j <= i-1;j++)
                  {
                      System.out.print("*"+ " ");
                  }
                  System.out.println("");
              }
              break;
              case 10:
              for ( i= 1; i<= n ; i++)
               {
                 for (j=i; j <n ;j++)            
                 {
                   System.out.print(" ");
                 }
                 for (int k=1; k<=i;k++)
                 {
                  System.out.print("*");
                 } 
                  System.out.println("");
               }
                for ( i=n; i>=1; i--)
                 {
                  for(j=i; j<=n;j++)
                   {
                    System.out.print(" ");
                   }
                   for(int k=1; k<i ;k++) 
                   {
                     System.out.print("*");
                   }
                    System.out.println("");
                  }
                  break;
              case 11:
              for (i= 0; i<= n-1 ; i++)
              {
                  for ( j=0; j <i; j++)
                  {
                      System.out.print(" ");
                  }
                  for ( int k=i; k<=n-1; k++) 
                  { 
                    System.out.print("*" + " "); 
                  }
                   System.out.println(""); 
              }
               for ( i= n-1; i>= 0; i--)
              {
                  for ( j=0; j< i ;j++)
                  {
                      System.out.print(" ");
                  }
                  for (int k=i; k<=n-1; k++)
                  {
                      System.out.print("*" + " ");
                  }
                  System.out.println("");
              }    

         
        } 
    
  
        

     sc.close(); 

    }
    
}
