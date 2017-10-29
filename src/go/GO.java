package go;
import java.util.Scanner;

public class GO {

    public static void main(String[] args) {
       int n,x=0,c=1,cd=0,p;
        Scanner leer=new Scanner(System.in);
        System.out.println("Cantidad de primos: ");n=leer.nextInt();
       int primo[]=new int[n];
       
       for(int i=2;c<n+1;i++)
       {
            if(i<8)
                {for(int j=1;j<=i;j++)
                {if(i%j==0){x++;}
                }
                if(x==2){primo[c-1]=i;c++;}
                x=0;
                }
            else
                {
                for(int j=1;j<((i/2)+1);j++)
                {if(i%j==0){x++;}}
                if(x==1){primo[c-1]=i;c++;}
                x=0;
                

                }
       }
    for(int i=0;i<primo.length;i++)
     {System.out.print(primo[i]+" ");}
        
        
    }//main
    
}//public class
