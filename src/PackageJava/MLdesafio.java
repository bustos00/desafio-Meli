package PackageJava;

public class MLdesafio {


	    public static void main(String[] args) {
	    	/* Complete a seguinte fun��o para que a mesma devolva todos 
	    	 * os poss�veis n�meros de 4 d�gitos, onde cada um seja menor ou igual a<maxDigit>, 
	    	 * e a soma dos d�gitos de cada n�mero gerado seja 21 
	    	 * Exemplo maxDigit=6: 3666, 4566... */
	        int maxDig = 9999;


	        for (int minDig = 1000; minDig <= maxDig; minDig++){
	            String numero = String.valueOf(minDig);

	            char[] digitos = numero.toCharArray();

	            int valor0 = Integer.parseInt(String.valueOf(digitos[0]));
	            int valor1 = Integer.parseInt(String.valueOf(digitos[1]));
	            int valor2 = Integer.parseInt(String.valueOf(digitos[2]));
	            int valor3 = Integer.parseInt(String.valueOf(digitos[3]));

	            int soma = valor0 + valor1 + valor2 + valor3;

	            if (soma == 21){
	                System.out.println(minDig);
	            }
	        }
	    }
	}