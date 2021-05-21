package dipanshu;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {
	
	private String delimiter;
	private String numbers;
	
	private StringCalculator(String delimiter, String numbers) {
		this.delimiter = delimiter;
		this.numbers = numbers;
		
	}
       private int sum() {
		
		return Arrays.stream(numbers.split(delimiter))
				.mapToInt(Integer::parseInt)
				.sum();
		}
	
	
	public static int sum(String input) {
		if(input.isEmpty())
		   return 0;
		
		return parseInput(input).sum();
		
		
		
	}


	private static StringCalculator parseInput(String input) {
		if (input.startsWith("//")) {
			String[] ports = input.split("\n",2);
			return new StringCalculator(ports[0].substring(2), ports[1]);
			
		} else {
			return new StringCalculator(",|\n",input);
		}
	}
	

}