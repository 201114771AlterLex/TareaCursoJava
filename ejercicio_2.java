public class ejercicio_2 {
	public static void main (String args[]){
		int i =0;
		int con=1;
		while(con<=9){
			for(i=1; i<=con; i++)
				System.out.print(""+i);
			System.out.println();
			con++;
		}
		while(con>1){
			con--;
			for(i=1; i<=con; i++)
				System.out.print(""+i);
			System.out.println();
		}
	}
}
