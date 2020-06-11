package by.epamtr.java.string;

import java.math.BigInteger;
import java.util.Random;

public class OperationWithString {

	public static String[] getArrayWords(String line) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		return line.split("\\s*(\\s|,|!|\\.)\\s*");
	}

	
	public static String deleteExtraSpaces(String line) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		return line.replaceAll("\\s{2,}", " ");
	}

	
	public static String deleteWordsCertainLength(String line, int wordLength) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		StringBuilder result = new StringBuilder();
		String[] arrayStrings = line.split("\\s*(\\s|,|!|\\.)\\s*");
		for (int i = 0; i < arrayStrings.length; i++) {
			if (arrayStrings[i].length() != wordLength) {
				result.append(arrayStrings[i] + " ");
			}
		}
		return result.toString();
	}

	
	public static BigInteger AddingVeryLongNumbers(BigInteger a, BigInteger b) {
		if (a == null || b == null)
			throw new NullPointerException("passed argument is null");
		return a.add(b);
	}

	
	public static String replaceSubstring(String line, String oldSubstring, String newSubstring) {
		if (line == null || oldSubstring == null || newSubstring == null)
			throw new NullPointerException("passed argument is null");
		if (line.contains(oldSubstring))
			return line.replace(oldSubstring, newSubstring);
		return line;
	}

	
	public static boolean isPalindrom(String line) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		StringBuilder reverseLine = new StringBuilder(line).reverse();
		for (int i = 0; i < reverseLine.length(); i++) {
			if (reverseLine.charAt(i) == ' ') {
				reverseLine.deleteCharAt(i);
			}
		}
		if (reverseLine.toString().equalsIgnoreCase(reverseLine.reverse().toString()))
			return true;
		return false;
	}

	
	public static String addWhitespace(String line, int index, int numberWhitespace) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		if (index < 0 || index >= line.length() || numberWhitespace < 0) {
			throw new RuntimeException("index out of length string or number whitespace is negative");
		}
		StringBuilder result = new StringBuilder(line);
		result.insert(index, new char[numberWhitespace]);
		return result.toString();
	}

	
	public static String deleteLastWord(String line) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		String[] arrayStrings = line.split("\\s*(\\s|,|!|\\.)\\s*");
		StringBuilder result = new StringBuilder();
		if (arrayStrings.length > 1) {
			for (int j = 0; j < arrayStrings.length - 1; j++) {
				result.append(arrayStrings[j] + " ");
			}
		} else {
			return line;
		}
		return result.toString();
	}

	
	public static String swapWords(String line) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		String[] arrayStrings = line.split("\\s*(\\s|,|!|\\.)\\s*");
		StringBuilder result = new StringBuilder();
		Random rnd = new Random();

		for (int i = arrayStrings.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);

			String a = arrayStrings[index];
			arrayStrings[index] = arrayStrings[i];
			arrayStrings[i] = a;
		}
		for (int j = 0; j < arrayStrings.length; j++) {
			result.append(arrayStrings[j] + " ");
		}
		return result.toString();
	}

	
	public static int getNumberWords(String line) {
		if (line == null)
			return -1;
		String[] arrayStrings = line.split("\\s*(\\s|,|!|\\.)\\s*");
		return arrayStrings.length;
	}

	
	public static int calculateLengthShortestWord(String line) {
		if (line == null)
			return -1;
		String[] arrayStrings = line.split("\\s*(\\s|,|!|\\.)\\s*");
		int indexShortestWord = 0;
		int minWordLength = line.length();
		for (int i = 0; i < arrayStrings.length; i++) {
			if (arrayStrings[i].length() < minWordLength) {
				minWordLength = arrayStrings[i].length();
				indexShortestWord = i;
			}
		}
		return arrayStrings[indexShortestWord].length();
	}

	
	public static String replaceInLongestWordAwithB(String line) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		String[] arrayStrings = line.split("\\s*(\\s|,|!|\\.)\\s*");
		int indexLongestWord = 0;
		int maxWordLength = 0;
		for (int i = 0; i < arrayStrings.length; i++) {
			if (arrayStrings[i].length() > maxWordLength) {
				maxWordLength = arrayStrings[i].length();
				indexLongestWord = i;
			}
		}
		return arrayStrings[indexLongestWord].replace('b', 'a');
	}

	
	public static String replaceWhitespace(String line) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		return line.replaceAll("\\s+", "*");
	}

	
	public static void printWordsInReverseOrder(String line) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		String[] arrayStrings = line.split("\\s*(\\s|,|!|\\.)\\s*");
		for (int i = arrayStrings.length - 1; i >= 0; i--) {
			System.out.print(arrayStrings[i] + " ");
		}
	}

	
	public static int numberOccurrenceSubstringInString(String line, String substring) {
		if (line == null || substring == null)
			throw new NullPointerException("passed argument is null");
		int count = 0;
		if (line.length() < substring.length()) {
			return count;
		}
		for (int startIndex = 0; startIndex <= (line.length() - substring.length());) {
			if (line.indexOf(substring, startIndex) >= 0) {
				count++;
				startIndex = line.indexOf(substring, startIndex) + substring.length();
			} else {
				return count;
			}
		}
		return count;
	}

	
	public static int lengthOfString(String line) {
		return line.length();
	}

	
	public static String copySubstring(String line, int fromIndex, int toIndex) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		if (fromIndex < 0 || toIndex >= line.length() || fromIndex > toIndex) {
			throw new RuntimeException("index out of length string");
		}
		StringBuilder result = new StringBuilder();
		result.append(line, fromIndex, toIndex);
		return result.toString();
	}

	
	public static String deleteSubstring(String line, int fromIndex, int toIndex) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		if (fromIndex < 0 || toIndex >= line.length() || fromIndex > toIndex) {
			throw new RuntimeException("index out of length string");
		}
		StringBuilder result = new StringBuilder(line);
		result.delete(fromIndex, toIndex);
		return result.toString();
	}

	
	public static String insertSubstring(String original, String substring, int position) {
		if (original == null || substring == null)
			throw new NullPointerException("passed argument is null");
		if (position < 0 || position >= original.length()) {
			throw new RuntimeException("index out of length original string");
		}
		StringBuilder result = new StringBuilder(original);
		result.insert(position, substring);
		return result.toString();

	}

	
	public static String getReversedString(String line) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		StringBuilder result = new StringBuilder(line);
		return result.reverse().toString();
	}

	
	public static int countSymbolInString(String line, char symbol) {
		if (line == null)
			return -1;
		int count = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == symbol) {
				count++;
			}
		}
		return count;
	}

	
	public static String deleteDuplicateSymbols(String line) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < line.length(); i++) {
			if ((!(result.toString().contains(line.substring(i, i + 1))))) {
				result.append(line.charAt(i));
			}
		}
		return result.toString();
	}

	
	public static void separateEvenAndOddCharactersIntoDifferentLines(String line) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		StringBuilder evenCharacters = new StringBuilder();
		StringBuilder oddCharacters = new StringBuilder();

		for (int i = 0; i < line.length(); i++) {
			if ((i + 1) % 2 == 0) {
				evenCharacters.append(line.charAt(i));
			} else {
				oddCharacters.append(line.charAt(i));
			}
		}
		System.out.println(evenCharacters);
		System.out.println(oddCharacters);
	}

	
	public static void printPercentageRatioUpperAndLowerCase(String line) {
		if (line == null)
			throw new NullPointerException("passed argument is null");
		int countUpperCase = 0;
		int countLowerCase = 0;
		double percentageUpperCase = 0;
		double percentageLowerCase = 0;

		for (int i = 0; i < line.length(); i++) {
			if (Character.isUpperCase(line.charAt(i))) {
				countUpperCase++;
			} else {
				countLowerCase++;
			}
		}
		percentageUpperCase = 100.0 / line.length() * countUpperCase;
		percentageLowerCase = 100.0 / line.length() * countLowerCase;
		System.out.println("Upper case = " + percentageUpperCase + " %, \nLower case = " + percentageLowerCase + " %");
	}
}
