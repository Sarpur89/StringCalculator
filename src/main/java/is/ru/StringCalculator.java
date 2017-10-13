package is.ru.stringcalculator;

public class StringCalculator {
		
	public static int add(String text) {		
		if(text.equals("")) {
			return 0;
		}
		else {
			if(text.contains(",")) {
				text = replaceNewline(text);
				String numbers[] = text.split(",");
				String negativeNumbers = "";
				for(String curr : numbers) {
					if(toInt(curr) < 0) {
						negativeNumbers += curr + " ";
					}
				}
				if(!negativeNumbers.equals("")) {
					throw new IllegalArgumentException("Negatives not allowed" + negativeNumbers);
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
}