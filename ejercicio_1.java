public class ejercicio_1 {
public static void main (String args[]){
  int con=1;
    
    
        for(int x=1;x<=5;x++){
 
            for(int yd=0;yd<=5-x;yd++){
                System.out.print(" ");
            }
 
            for(int y=1;y<=con;y++){
                System.out.print("*");    
            }
            con=con+2;
            System.out.println();
        }
        con=con-3;
    
        for(int x=1;x<=5;x++){
 
            for(int yd=0;yd<=x;yd++){
                System.out.print(" ");
            }
 
            for(int y=1;y<=con-1;y++){
                System.out.print("*");
            }
            con=con-2;
            System.out.println();
        }     
    }
    }