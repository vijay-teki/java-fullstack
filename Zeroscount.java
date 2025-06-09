package javafullstack;

public class Zeroscount {
	
	    public static void main(String[] args) {
	        String sequence = "101001"; 

	        int totalZeros = 0;
	        int zerosCount = 0;
	        for (int i = sequence.length() - 1; i >= 0; i--) {
	            char ch = sequence.charAt(i);
	            if (ch == '0') {
	                zerosCount++;
	            } else if (ch == '1') {
	                totalZeros += zerosCount;
	            }
	        }

	        System.out.println("Total zeros after each 1: " + totalZeros);
	    }
	}




