package InlämnigsUppgift;

public class TextProcessor {
    //❖ Räknar raderna, antal tecken och antal ord (separerade med blanksteg)
    // ❖ Har koll på det längsta ordet
    // ❖ Har koll på om användaren har skrivit ordet stop eller inte
    private String longestWord;//här skapar vi vårt objekts 'processor' instance variables.
    //vanligtvis behöver vi inte initialisera våra instance variables
    private int lineCounter; //eftersom de är initialiserade by default till null, 0 och false beroende av variables typ.
    private int wordCounter;
    private int characterCounter;
    private boolean isStopLoop;

    public void processInput(String input) { //vi skapar en metod för att bearbeta input från användare
        if (input.equals("stop")) {
            this.isStopLoop = true;
        } else {
            lineCounter++;
            wordCounter += input.split("\\s").length;
            characterCounter += input.length();
            String[] words = input.split(" ");
            for (String word : words) { //enhanced for loop. Vi bestämmer att varje indexposition/värden
                // som existerar i vårt array hanteras av en String kallad word.
                if (longestWord == null || word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
    }

    public boolean isStopLoop() {
        return isStopLoop;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public int getNumberLines() {
        return lineCounter;
    }

    public int getNumberWords() {
        return wordCounter;
    }

    public int getNumberCharacters() {
        return characterCounter;
    }
}
