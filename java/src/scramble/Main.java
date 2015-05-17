//Hornyak Laszlo
package scramble;

import java.util.Arrays;

public class main {
	
	private static String[] denied = {"?",",",".","!","-",";"};	
	
	private static String[] nums = {"0","1","2","3","4","5","6","7","8","9"};
	
	private static String simpleText = "The highway provides a route across several spurs of the Peninsular Ranges, linking the Los Angeles Basin with the Pomona Valley and San Gabriel Valley.";
	
	public static void main ( String [] arguments )
	{
	    System.out.println(scramble(simpleText));
	}
	
	public static String scramble(String text)
	{
		String[] splitText = text.split(" ");
		String[] word = null;
		int i = 0;
		String first = "";
		String last = "";
		String mark = "";
		String out = "";
		
		while (i < splitText.length) {
			word = splitText[i].split("");
			first = word[0];
			if (splitText[i].length() > 3 && !(isNum(first))) {								
				last = word[word.length-1];
				if (check(last)) {
					mark = last;
					last = word[word.length-2];
					word = Arrays.copyOfRange(word, 1, word.length-2);
				} else {
					word = Arrays.copyOfRange(word, 1, word.length-1);
					mark = "";
				}				
				word = reverse(word);
				out += first + convert(word) + last + mark;				
			} else {
				out += splitText[i];
			}	
			if (splitText.length != i && splitText.length > 1) {
				out += " ";
			}
			i++;
		}
			
		return out;
	}
	
	public static String[] reverse(String[] input)
	{
		String[] t = input;
		String buff;
		int i = 0;
		while (i < (input.length)/2) {
			buff = input[i];
			input[i] = input[input.length-i-1];
			input[input.length-i-1] = buff;
			i++;
		}
		return t; 
	}
	
	public static String convert(String[] input)
	{
		String out = "";
		int i = 0;
		
		while (i < input.length) {
			out += input[i];
			i++;
		}
		
		return out;
	}
	
	public static boolean check(String input)
	{
			
		boolean find = false;		
		int i = 0;
		
		while (i < denied.length) {
			if (denied[i].equals(input)) {
				find = true;
				break;
			}
			i++;
		}
		
		return find;
	}
	
	public static boolean isNum(String input)
	{
		boolean find = false;		
		int i = 0;
		
		while (i < nums.length) {
			if (nums[i].equals(input)) {
				find = true;
				break;
			}
			i++;
		}
		return find;
	}
}
