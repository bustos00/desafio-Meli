package PackageJava;

public class MLdesafio {


	    public static void main(String[] args) {
	    	/* Complete a seguinte função para que a mesma devolva todos 
	    	 * os possíveis números de 4 dígitos, onde cada um seja menor ou igual a<maxDigit>, 
	    	 * e a soma dos dígitos de cada número gerado seja 21 
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