import java.util.*;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        String strCheck = "Hello valod inch ka chka valod axper jan jan";
        List<String> duplicateWords = findDuplicateWords(strCheck);
        for (String duplicateWord : duplicateWords) {
            System.out.println(duplicateWord);
        }

        int[] intCheck = {1, 3, 5, 12, 4, 3, 5, 1, 13, 12, 3, 1, 1};
        Map<Integer, Integer> duplicatedNumbersCount = findDuplicatedNumbersCount(intCheck);
        for (Map.Entry<Integer, Integer> entry : duplicatedNumbersCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        String charCheck = "Hello valod inch ka chka valod axper jan jan";
        Map<Character, Integer> duplicatedCharsCount = findDuplicatedCharsCount(charCheck);
        for (Map.Entry<Character, Integer> entry : duplicatedCharsCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private static List<String> findDuplicateWords(String str) {
        List<String> duplicateStrings = new ArrayList<>();
        String[] strArr = str.toLowerCase().split(" ");
        for (int i = 0; i < strArr.length; i++) {
            int tmpCount = 0;
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])) {
                    tmpCount++;
                    strArr[j] = "-";
                }
            }
            if (!strArr[i].equals("_") && tmpCount > 0) {
                duplicateStrings.add(strArr[i]);
            }
        }
        return duplicateStrings;
    }

    private static Map<Integer, Integer> findDuplicatedNumbersCount(int[] arr) {
        Map<Integer, Integer> duplicateNumbers = new HashMap<>();
        List<Integer> tmpNumbers = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int elem : arr) {
            int frequency = Collections.frequency(tmpNumbers, elem);
            if (frequency > 1 && !duplicateNumbers.containsKey(elem)) {
                duplicateNumbers.put(elem, frequency);
            }
        }
        return duplicateNumbers;
    }

    private static Map<Character, Integer> findDuplicatedCharsCount(String str) {
        Map<Character, Integer> duplicateChars = new HashMap<>();
        List<Character> tmpChars = str.toLowerCase().chars().mapToObj(value -> (char) value).collect(Collectors.toList());

        for (Character ch : tmpChars) {
            int frequency = Collections.frequency(tmpChars, ch);
            if (frequency > 1 && !duplicateChars.containsKey(ch)) {
                duplicateChars.put(ch, frequency);
            }
        }
        return duplicateChars;
    }
}
