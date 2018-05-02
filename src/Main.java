import java.io.DataInputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        int aNumber = 10;
         String aString = new String("dope");
         int[] things = {1,2,3};
         System.out.println(things);

         for (int i = 0; i < things.length; i++) {
//             System.out.println(things[i]);

         }
        ArrayList<String> favoriteThings = new ArrayList<>();
        favoriteThings.add("Gucci Mane");
        favoriteThings.add("Meek Mill");
//        System.out.println(favoriteThings);
        int[] arrayList = {1, 2, 103, 4, 5, 6};
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(23);
//        System.out.println(integers);
        ArrayList<String> names = new ArrayList<>();
        names.add("Matthew");
        names.add("Ricardo");
        names.add("Sally");
        names.add("Ferguson");
        names.add("Nnamdi");
        names.add("Matthew");
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Gabon");
        countries.add("New Zealand");
        countries.add("Mozambique");
        countries.add("Chile");
        countries.add("France");
        countries.add("Republic of Guinea");
//        System.out.println(names);
//        switchFirstAndLastCountry(countries);
        System.out.println(isPalindrome("DaD"));


    }


    public static boolean isPalindrome(String string) {
        // input: word
        // output: boolean
        // constraints: none
        // edge cases: none

//        Example: "dad" -> "true" // "dope" -> "false"

        int lengthOfString = string.length();
        int halfOfLength = lengthOfString/2;
        System.out.println(halfOfLength);

        for (int i = 0; i < halfOfLength; i++) {
            String startingChar = Character.toString(string.charAt(i));
            String endingChar = Character.toString(string.charAt((lengthOfString - 1) - i) );
            System.out.println(startingChar + endingChar);
            if (!startingChar.toLowerCase().equals(endingChar.toLowerCase())) {
                return false;
            }
        }


        return true;

    }

    public static boolean isPalindromeRecursive(String string) {
//        input: string;
//        output: string;
//        constraints: tbd;
//        edge cases: Lowercase characters; I FORGOT THE EDGE CASE FOR STRINGS OF 2-3 LENGTH
//        Example: "gucci" -> no // "dad" -> true;
//        Approach: base case: if input length is 1 or less, return true // non-recursive case: return the boolean value of whether first and last value in string are equal AND the recursive call to truncated string ;
//        Time complexity: O(log n);
//        Space complexity: O(1);
        System.out.println(string.substring(1, string.length() - 1));
        if (string.length() <= 1) {
            return true;
        }
        if (string.length() <= 3) {
            String firstChar = Character.toString(string.charAt(0));
            String lastChar = Character.toString(string.charAt(string.length() - 1));
            return (firstChar.toLowerCase().equals(lastChar.toLowerCase()));
        }
        String firstChar = Character.toString(string.charAt(0));
        String lastChar = Character.toString(string.charAt(string.length() - 1));
        String truncatedString = string.substring(1, string.length() - 1);
//        return true;
        return (firstChar.toLowerCase().equals(lastChar.toLowerCase()) && isPalindromeRecursive(truncatedString));



    }

    public static String returnEveryOther() {
        //input: no parameters
        //output: string
//        constraints: TBD
//        edge cases: TBD
//         Example:  -> 'el'
//        Approach: for loop and concatenate a return string

        char[] charArray = {'h', 'e', 'l', 'l', 'o', 'b', 'r', 'u', 'h'};
        int charArrayLength = charArray.length;
        String returnString = "";

        for (int i = 0; i < charArrayLength; i++) {
            String currentChar = Character.toString(charArray[i]);
            System.out.println(currentChar);
            if (i % 2 != 0) {
                returnString = returnString.concat(currentChar);
            }
        }

        return returnString;
    }

    public static int returnMax(int[] arrayOfIntegers) {
//        input: array of integers,
//        output: integer,
//        constraints: TBD,
//        edge cases: TBD
//        Example: [1,2,3,4] -> 4
//        Approach: iterate through list and set a max variable to highest integer encountered
//          Time complexity:
//          Space complexity:
        int length = arrayOfIntegers.length;
        int max = arrayOfIntegers[0];
        for (int i = 0; i < length; i++) {
            if (arrayOfIntegers[i] > max) {
                max = arrayOfIntegers[i];
            }
        }
        return max;
    }

    public static int daysInMonth(String month) {
//        input: string;
//        output: integer;
//        constraints: TBD;
//        edgecases: TBD;
////        Example: 'December' -> 31  // 'Noctober' -> 0
//        Approach: have a hash table with keys and values mapping to existing months and days. Then check if there is a key matching
//                the specified input. if so return its corresponding value. If no key exists, then return 0;
//        Time Complexity: O(1);
//        Space Complexity: O(1);

        final HashMap<String, Integer> daysInMonth = new HashMap<>();
        daysInMonth.put("January", 31);
        daysInMonth.put("February", 28);
        daysInMonth.put("March", 31);
        daysInMonth.put("April", 30);
        daysInMonth.put("May", 31);
        daysInMonth.put("June", 30);
        daysInMonth.put("July", 31);
        daysInMonth.put("August", 31);
        daysInMonth.put("September", 30);
        daysInMonth.put("October", 31);
        daysInMonth.put("November", 30);
        daysInMonth.put("December", 31);


        if (daysInMonth.containsKey(month)) {
            return daysInMonth.get(month);
        }
        return 0;
    }

    public static int crazySum(ArrayList<Integer> arrayOfIntegers) {
//        input: array of integers;
//        output: integer;
//        constraints: TBD;
//        edge cases: TBD;
//        Example: [13, 42, 2, 4] -> 16;
//        Approach: iterate through array, either adding or subtracting and return a final value;
//        Time complexity: O(n);
//        Space complexity: O(1);

        int sum = 0;
        for (int i  = 0; i < arrayOfIntegers.size(); i++) {
            if (arrayOfIntegers.get(i) > 20) {
                sum = sum - 3;
            } else if (arrayOfIntegers.get(i) > 1) {
                sum = sum + arrayOfIntegers.get(i);
            }
        }

        return sum;
    }

    public static ArrayList<String> uniqueNamesOnly(ArrayList<String> nameList) {
//        input: array of strings;
//        output: array of strings;
//        constraints: tbd;
//        edge cases: tbd;
//        Approach: iterate through list of names, adding to hash map if doesnt exist and moving on if it does
//        iterate through hash table;
//        Time complexity: O(2n);
//        Space complexity: O(n);
        HashMap<String, String> uniqueNameTable = new HashMap<>();

        for (int i = 0; i < nameList.size(); i++) {
            String currentName = nameList.get(i);
//            System.out.println(currentName);
            if (uniqueNameTable.get(currentName) != null) {
                continue;
            }
            uniqueNameTable.put(currentName, currentName);
        }
//        System.out.println(uniqueNameTable);
        ArrayList<String> returnArray = new ArrayList<>();
        System.out.println(uniqueNameTable.values());
        returnArray.addAll(uniqueNameTable.values());
        return returnArray;
    }

    public static String omitVowels(String string) {
//        input: String;
//        output: string;
//        constraints: tbd;
//        edge cases: empty strings and Lowercase/Uppercase;
//        Example: "gucci mane" -> "gcc mn"
//        Approach: iterate through string and if char at current index is vowel then splice that char from string;
//        Time complexity: O(n);
//        Space complexity: O(1);
        ArrayList<String> vowelsList = new ArrayList<String>();
        vowelsList.add("a");
        vowelsList.add("e");
        vowelsList.add("i");
        vowelsList.add("o");
        vowelsList.add("u");

            System.out.println(string.substring(string.length() - 1));

        for (int i = 0; i < string.length(); i++) {
            if (vowelsList.contains( Character.toString(string.charAt(i)).toLowerCase() )) {
//                System.out.println("IT'S A VOWEL");
                string = string.substring(0, i) + string.substring(i + 1);
                continue;
            }
//            System.out.println("IT'S NOT A VOWEL");
        }

        return string;
    }

    public static void switchFirstAndLastCountry(ArrayList<String> countryList) {
//        input: Arraylist of countries;
//        output: nothing;
//        constraints: tbd;
//        edge cases: tbd;
//        example: ["Nigeria", "Angola", "Virgin Islands", "Namibia"];
//        Approach: Switch last and first countries using a temp holder then iterate through list printing to console;
//        Time Complexity: O(n);
//        Space Complexity: O(1);

        System.out.println(countryList);
//
        int length = countryList.size();
        String temp = countryList.get(0);
        countryList.set(0, countryList.get(length - 1));
        countryList.set(length - 1, temp);

        for (int i = 0; i < length; i++) {
            System.out.println(countryList.get(i));
        }

    }

    public static Integer createLLAndReturnIfOdd(Integer number) {
//        input: integer;
//        output: integer;
//        constraints: tbd;
//        edge cases: if not positive integer;
//        example:  5 -> A ll with nodes holding values 1 through 5, and returning 3 as return value;
//        Approach: for loop from 1 through input integer, adding to ll at each iteration. check if length is        odd, and if so return the value at half the length + 1, otherwise return -1 if not odd
//        Time Complexity: O(n);
//        Space Complexity: O(n);
        if (number <= 0) {
            return -1;
        }
        LinkedList<Integer> ll = new LinkedList<>();

        for (Integer i = 1; i <= number; i++) {
            ll.add(i);
        }
        int length = ll.size();
        System.out.println(length);
        if (length % 2 == 0) {
            return -1;
        }
        return ll.get(length/2);
    }

    public static String getFamilyMemberAge(String name) {
//        input: "String";
//        output: "String";
//        constraints: tbd;
//        edge cases: tbd;
//        Example: "Christine" -> "28"  // "Ricardo" -> "Does not exist"
//        Approach: initialize hash map of name age pairs. Check if input key exists in hash map. If it does, then return the corresponding value as string. If does not exist, return the not found string;
//        Time Complexity: O(1);
//        Space Complexity: O(1);
        DataInputStream in = new DataInputStream(System.in);
        Scanner userInput = new Scanner(System.in);
        System.out.println(userInput);
        String stringifiedUserInput = userInput.toString();

        HashMap<String, Integer> ageTable = new HashMap<>();
        ageTable.put("Ted", 30);
        ageTable.put("Christine", 28);
        ageTable.put("Onyedi", 27);
        ageTable.put("Ife", 25);

        System.out.println(stringifiedUserInput);
        if (ageTable.get(name) != null) {
            return ageTable.get(name).toString();
        }
        return "Such family member does not exist!";

    }


}
