
public class Questao3 {

	 static int countPS(String str) {
	        String temp = "";
	        StringBuffer stf;
	        int count = 0;

	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j <= str.length(); j++) {
	            	
	                temp = str.substring(i, j);
	                    
	                if (temp.length() >= 2) {

	                    stf = new StringBuffer(temp);
	                    stf.reverse();

	                    if (stf.toString().compareTo(temp) == 0)
	                        count++;
	                }
	            }
	        }

	        return count;
	    }
	      
	    public static void main(String args[]) throws Exception {

	        String str = "google"; //escrever a palavra que gostaria de checar a quantidade de palíndromos
	        System.out.println(countPS(str));
	    }
	} 