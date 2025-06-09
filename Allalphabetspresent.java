package javafullstack;

public class Allalphabetspresent {
	

	    public static boolean isPangram(String sentence) {
	       
	        boolean[] alphabetPresent = new boolean[26];
	        int count = 0;

	        for (int i = 0; i < sentence.length(); i++) {
	            char c = Character.toLowerCase(sentence.charAt(i));
	            if (c >= 'a' && c <= 'z') {
	                int index = c - 'a';
	                if (!alphabetPresent[index]) {
	                    alphabetPresent[index] = true;
	                    count++;
	                    if (count == 26) return true;
	                }
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        String sentence = "The quick brown fox jumps over the lazy dog";

	        if (isPangram(sentence)) {
	            System.out.println("The sentence is a pangram.");
	        } else {
	            System.out.println("The sentence is NOT a pangram.");
	        }
	    }
	}

	


