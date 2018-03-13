package m03;
import java.util.Scanner;
public class Fiboonachi {

	  public static void main(String[] args) {
	
          Scanner sc = new Scanner(System.in);
          
        
     
          int p;
          p = sc.nextInt();
          
  		for (int r = 0; r < p; r++) { 
  		
          int limite = sc.nextInt();
     
          for(int i = 0; i<limite; i++){ ///bucle de la sequencia de fibonacci
               System.out.print(funcion(i) + ", ");
          }
     }
  		}
 
     public static int funcion(int num){//sequencia de fibonacci
    
          if(num == 0 || num==1)
               return num;
          else
               return funcion(num-1) + funcion(num-2);
     }
 
}