package interviews;
import java.util.stream.Collectors;

public class Char_Sorted {

        public static void main(String[] args) {
            String str = "programming";
            // Convert the string to a Stream of characters
            str.chars()
                    // Convert the character codes back to characters
                    .mapToObj(ch -> (char) ch)
                    // Sort the characters in natural order (lexicographical order)
                    .sorted()
                    // Collect the sorted characters into a String
                    .collect(Collectors.toList())
                    .forEach(System.out::print);
        }
    }


