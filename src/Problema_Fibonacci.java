import java.util.Scanner;
/**
 * Sequencia de Fibonacci
 * @author OMAR
 */
public class Problema_Fibonacci {
		
		  public static void main(String[] args) {
			/**
			 * Inicia l'escaner per introduir les comandes
			 * @param Scannner sc  
			 */
	          Scanner sc = new Scanner(System.in);
	          
	        
	          /**
	           * numero d'intents amb els quals vols obtenir la llista de la sequencia de fibonacci
	           * @param p = sc.nextInt();
	           * 
	           * bucle del numero d'intents donat per int p
	           * @param for (int r = 0; r < p; r++)
	           */
	          int p;
	          p = sc.nextInt();
	          
	  		for (int r = 0; r < p; r++) { 
	  			
	  			/**
	  			 * Indica fins a quants nombres de la secuencia de fibonacci vols que et doni
	  			 * @param int limite = sc.nextInt();
	  			 */
	          int limite = sc.nextInt();
	          
	          /**
	           * bucle de la sequencia de fibonacci 
	           * @param  for(int i = 0; i<limite; i++)
	           * imprimeix la sequencia de fibonacci que s'ha fet al metode funcion.
	           * @param System.out.print(funcion(i) + ", ");
	           */
	          
	          for(int i = 0; i<limite; i++){ ///bucle de la sequencia de fibonacci
	               System.out.print(funcionr(i) + ", ");
	          } 
	     }
	  		}
		  /**
	    	  * Aqui es crea la sequncia de fibonacci que consisteix en que apartir de 0,1 
	    	  * es sumen els dos numero i fan el seguent com per exemple 0+1=1 llavor la sequencia sera 0,1,1 
	    	  * seguit de 1+1=2 aixi continuament 0,1,1,2 creant la sequencia de fibonacci
	    	  * @param num dona els nombres inicials 
	    	  * @return dona els nombres de la sequencia de fibonacci cridanse a si mateix continuamnet fins 
	    	  * arribar al limit de la sequencia que se li ha donat
	    	  */
	     public static int funcionr(int num){//sequencia de fibonacci
	    	
	          if(num == 0 || num==1)
	               return num;
	          else
	               return funcionr(num-1) + funcionr(num-2);
	     }
	 
	}