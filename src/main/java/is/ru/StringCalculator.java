package is.ru.stringcalculator;

public class StringCalculator {
	
	private final String seperator = ",|\n";
	
	public static int add(String text) {		
		if(text.equals("")) {
			return 0;
		}
		else {
			if(text.contains(",")) {
				text = replaceNewline(text);
				String numbers[] = text.split(",");
				for(String curr : numbers) {
					if(toInt(curr) < 0) {
						throw new IllegalArgumentException("Input is a negative number");
					}
				}
				return sum(numbers);
			}
			return 1;
		}
	}
	
	private static int toInt(String number) {
		return Integer.parseInt(number);
	}
	
	private static int sum(String[] numbers) {
		int total = 0;
		for(String number : numbers) {
			total += toInt(number);
		}
		return total;
	}
	
	private static String replaceNewline(String numbers) {
		String replace = numbers.replaceAll("\n", ",");
		return replace;
	}
	
	//private static void checkNegativeInput(String[] numbers) {
		//for(String curr : numbers) {
			//if(toInt(curr) < 0) {
				//throw new Exception("Input is a negative number");
			//}
		//}
	//}
}