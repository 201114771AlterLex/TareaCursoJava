public class ejercicio_3 {

public static void main (String[] args) {

String j="ZYXWVUTSRQPONMLKJIHGFEDCBA";
String k[];
k = new String[30];

for(int x=0;x<=27;x++){
for (int i=x; i<=j.length()-1; i++){
k[i] = String.valueOf(j.charAt(i));
System.out.print(k[i]+" ");
} 
System.out.println(" ");
}
}

}