import java.util.*;

public class Strings {
    
    // ***********************************************************************
    // Difficulty: 0
    // Count the number of vowels in a given string

    // public static int getCount(String str) {
    //     int vowelsCount = 0;
    //     for(char c : str.toCharArray()) {
    //         vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    //     }
    //     return vowelsCount;
    // }

    // Alternative one-line regex solution:
    // public static int getCount(String str) {
    //     return str.replaceAll("(?i)[^aeiou]", "").length();
    // }

    // public static void main(String[] args) {
    //     System.out.println(getCount("test"));      
    //     System.out.println(getCount("middle"));    
    //     System.out.println(getCount("testing"));   
    //     System.out.println(getCount("A"));         
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Get the character at the given index within the String.

    // public static void main(String[] args) {
    //     String str = "Java Exercises!";
    //     System.out.println("Original String = " + str);
    //     // Get the character at positions 0 and 10.
    //     int index1 = str.charAt(0);
    //     int index2 = str.charAt(10);

    //     // Print out the results.
    //     System.out.println("The character at position 0 is " + (char) index1);
    //     System.out.println("The character at position 10 is " + (char) index2);
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Compare two strings lexicographically.

    // public static int compare(String str1, String str2) {
    //     return str1.compareTo(str2);
    // }

    // public static void main(String[] args) {
    //     String s1 = "Hello";
    //     String s2 = "Howdy";
    //     String s3 = "Howdy";
    //     System.out.println(compare(s1, s2));
    //     System.out.println(compare(s2, s1));
    //     System.out.println(compare(s2, s3));
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Compare two strings lexicographically, ignoring case differences.

    // public static int compare(String str1, String str2) {
    //     return str1.compareToIgnoreCase(str2);
    // }

    // public static void main(String[] args) {
    //     String s1 = "Hello";
    //     String s2 = "Howdy";
    //     String s3 = "howdy";
    //     System.out.println(compare(s1, s2));
    //     System.out.println(compare(s2, s1));
    //     System.out.println(compare(s2, s3));
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Concatenate a given string to the end of another string. (Do not use '+')

    // public static String concatenate(String str1, String str2) {
    //     return str1.concat(str2);
    // }

    // public static void main(String[] args) {
    //     String s1 = "Hello";
    //     String s2 = " world!";
    //     System.out.println(concatenate(s1, s2));
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Test if a given string contains the specified sequence of char values.

    // public static boolean contains(String str1, String str2) {
    //     return str1.contains(str2);
    // }

    // public static void main(String[] args) {
    //         String s1 = "Hello";
    //         String s2 = "Hello world!";
    //         System.out.println(contains(s1, s2));
    //         System.out.println(contains(s2, s1));
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Create a new String object with the contents of a character array.

    // public static String createString(char[] chars) {
    //     return String.valueOf(chars);
    // }

    // public static void main(String[] args) {
    //     char[] chars = { 'h', 'e', 'l', 'l', 'o' };
    //     System.out.println(createString(chars));
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Check whether a given string ends with the contents of another string.
    
    // public static boolean ends(String str1, String str2) {
    //     return str1.endsWith(str2);
    // }

    // public static void main(String[] args) {
    //         String s1 = "world";
    //         String s2 = "world!";
    //         String s3 = "Hello world!";
    //         System.out.println(ends(s3, s1));
    //         System.out.println(ends(s3, s2));
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Compare if two strings are equal, ignoring case considerations.
    
    // public static boolean compare(String str1, String str2) {
    //     return str1.equalsIgnoreCase(str2);
    // }

    // public static void main(String[] args) {
    //     String s1 = "Hello";
    //     String s2 = "Howdy";
    //     String s3 = "howdy";
    //     System.out.println(compare(s1, s2));
    //     System.out.println(compare(s2, s3));
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Print current date and time in the specified format.
    /*
        Current Date and Time:
        June 19,2017 
        3:13 pm
    */

    // public static void main(String[] args) {
    //     Calendar c = Calendar.getInstance();
    //     System.out.println("Current Date and Time:");     
    //     System.out.format("%tB %te, %tY%n", c, c, c);
    //     System.out.format("%tl:%tM %tp%n", c, c, c);
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Get the contents of a given string as a byte array.

    // public static void main(String[] args) {
    //     String s1 = "Hello";
    //     System.out.println(s1.getBytes());
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Get the contents of a given string as a character array.

    // public static void main(String[] args) {
    //     String s1 = "Hello";
    //     char[] c1 = s1.toCharArray();
    //     System.out.println(c1[0]);
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Return the middle character of the word. If the word's length is even,return the middle 2 characters.

    // public static String getMiddle(String word) {
    //     int length = word.length();
    //     return (length % 2 != 0) 
    //         ? String.valueOf(word.charAt(length / 2)) 
    //         : word.substring(length / 2 - 1, length / 2 + 1);
    // }

    // public static void main(String[] args) {
    //     String s1 = "Hello";
    //     String s2 = "Howdy";
    //     String s3 = "Hey you!";
    //     System.out.println(getMiddle(s1));
    //     System.out.println(getMiddle(s2));
    //     System.out.println(getMiddle(s3));
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Get the last index of a string within a string.
    
    // public static int getLastIndex(String needle, String haystack) {
    //     return haystack.lastIndexOf(needle, haystack.length()-1);
    // }

    // public static void main(String[] args) {
    //     String str = "The quick brown fox jumps over the lazy dog.";
    //     System.out.println(getLastIndex("a", str));     // 36
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Find whether a region in the current string matches a region in another string.

    // public static void main(String[] args) {
        
    //     String str1 = "Shanghai Houston Colorado Alexandria";
    //     String str2 = "Alexandria Colorado Houston Shanghai";

    //     // Determine whether characters 0 through 7 in str1 
    //     // match characters 28 through 35 in str2.
    //     boolean match1 = str1.regionMatches(0, str2, 28, 8);

    //     // Determine whether characters 9 through 15 in str1 
    //     // match characters 9 through 15 in str2.
    //     boolean match2 = str1.regionMatches(9, str2, 9, 8);

    //     // Display the results of the regionMatches method calls.
    //     System.out.println("str1[0 - 7] == str2[28 - 35]? " + match1);  // true
    //     System.out.println("str1[9 - 15] == str2[9 - 15]? " + match2);  // false
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Replace all the'd' characters with'f'characters.
    // public static void main(String[] args) {
    //     String str = "The quick brown fox jumps over the lazy dog.";

    //     // Replace all the 'd' characters with 'f' characters.
    //     String new_str = str.replace('d', 'f');

    //     // Display the strings for comparison.
    //     System.out.println("Original string: " + str);
    //     System.out.println("New String: " + new_str);
    // }
    
    // ***********************************************************************
    // Difficulty: 0
    // Replace each substring of a given string that matches the given regular expression with the given replacement.
    // Sample string:"The quick brown fox jumps over the lazy dog."
    // In the above string replace all the fox with cat.
    // public static void main(String[] args) {
    //     String str = "The quick brown fox jumps over the lazy dog.";

    //     // Replace all the 'dog' with 'cat'.
    //     String new_str = str.replace("fox", "cat");

    //     // Display the strings for comparison.
    //     System.out.println("Original string: " + str);
    //     System.out.println("New String: " + new_str);
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Check whether a given string starts with the contents of another string.
    // public static void main(String[] args) {
    //     String str1 = "Red is favorite color.";
    //     String str2 = "Orange is also my favorite color.";

    //     // The String to check the above two Strings to see
    //     // if they start with this value (Red).
    //     String startStr = "Red";

    //     // Do either of the first two Strings start with startStr?
    //     boolean starts1 = str1.startsWith(startStr);
    //     boolean starts2 = str2.startsWith(startStr);

    //     // Display the results of the startsWith calls.
    //     System.out.println(str1 + " starts with " + startStr + "? " + starts1);
    //     System.out.println(str2 + " starts with " + startStr + "? " + starts2);
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Get a substring of a given string between two specified positions.
    // public static void main(String[] args) {
    //     String str = "The quick brown fox jumps over the lazy dog.";

    //     // Get a substring of the above string starting from
    //     // index 10 and ending at index 26.
    //     String new_str = str.substring(10, 26);

    //     // Display the two strings for comparison.
    //     System.out.println("old = " + str);
    //     System.out.println("new = " + new_str);
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Create a character array containing the contents of a string.
    // public static void main(String[] args) {
    //     String str = "Java Exercises.";

    //     // Convert the above string to a char array.
    //     char[] arr = str.toCharArray();

    //     // Display the contents of the char array.
    //     System.out.println(arr);
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Convert all the characters in a string to lowercase.
    // public static void main(String[] args) {
    //     String str = "The Quick BroWn FoX!";

    //     // Convert the above string to all lowercase.
    //     String lowerStr = str.toLowerCase();

    //     // Display the two strings for comparison.
    //     System.out.println("Original String: " + str);
    //     System.out.println("String in lowercase: " + lowerStr);
    // }

    // ***********************************************************************
    // Difficulty: 0
    // Trim any leading or trailing whitespace from a given string.

    // public static void main(String[] args) {
    //     String str = " Java Exercises ";

    //     // Trim the whitespace from the front and back of the
    //     // String.
    //     String new_str = str.trim();

    //     // Display the strings for comparison.
    //     System.out.println("Original String: " + str);
    //     System.out.println("New String: " + new_str);
    // }
}