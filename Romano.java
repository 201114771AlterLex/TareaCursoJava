import java.util.*;
 /**
 4  *
 5  * @author Reynaldo
 6  */
  public class Romano {

     public static void main(String[] args) {
 
    int  x, i;
    int  Vn[]={100, 90, 50, 40,
                   10, 9, 5, 4, 1 };
      String Vc[]={"C","XC","L","XL",
                    "X","IX","V","IV","I"};
       
       System.out.println("Ingrese el numero a convertir a romano");
       Scanner in = new Scanner( System.in );
       
       while( true ){
           x = in.nextInt();
           if( x==0 ){
           	break;
           }
               
           System.out.printf( "%-4d   ", x);
        
           i = 0;
           while( x>0 && x<=100){
               if( x>=Vn[i] ){
                   System.out.print( Vc[i] );
                   x = x - Vn[i];
               }
               else{
               	i++;
               }
                   
               
           }
           System.out.println();
                      
       }
       
    }
 }