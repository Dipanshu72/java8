package dipanshu;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringCalculator {
	
	private String delimiter;
	private String numbers;
	
	private StringCalculator(String delimiter, String numbers) {
		this.delimiter = delimiter;
		this.numbers = numbers;
		
	}
       private int sum() {	
    	   ensureNoNegativeNumbers();
    	   
    	   return getNumbers().sum();
		
		}
	
	
	private void ensureNoNegativeNumbers() {
		String negativenumberSequence = getNumbers().filter(n -> n<0)
				.mapToObj(Integer::toString)
				.collect(Collectors.joining(","));	
		if(!negativenumberSequence.isEmpty()) {					
 		   throw new IllegalArgumentException("negative number: "+ negativenumberSequence);
 	   }		
	}
	private IntStream getNumbers() {
		if(numbers.isEmpty()) {
			return IntStream.empty();
		}else {
		
		return Stream.of(numbers.split(delimiter))
				.mapToInt(Integer::parseInt)
				.map(n -> n%1000);
	}
	}
	public static int sum(String input) {
		
		return parseInput(input).sum();		
		
	}


	private static StringCalculator parseInput(String input) {
		if (input.startsWith("//")) {
			String[] ports = input.split("\n",2);
			return new StringCalculator(parseDelimiter(ports[0]), ports[1]);
			
		} else {
			return new StringCalculator(",|\n",input);
		}
	}
	private static String parseDelimiter(String header) {
		String delimiter = header.substring(2);
		if(delimiter.startsWith("[")) {
			delimiter = delimiter.substring(1, delimiter.length()-1);
		}
		return Stream.of(delimiter.split("]\\["))
				.map(Pattern::quote)
				.collect(Collectors.joining("|"));

		
	}
	
	

}