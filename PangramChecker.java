public class PangramChecker {
    public static boolean isPangram(String sentence) {
        String lowercaseSentence = sentence.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (lowercaseSentence.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the lazy dog"; // Example sentence
        boolean isPangramResult = isPangram(inputSentence);
        System.out.println(isPangramResult); // This will print true
    }
}