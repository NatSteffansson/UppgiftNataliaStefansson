package InlämnigsUppgift;

public class TextProcessor {
    //❖ Räknar raderna, antal tecken och antal ord (separerade med blanksteg)
    // ❖ Har koll på det längsta ordet
    // ❖ Har koll på om användaren har skrivit ordet stop eller inte
    private String longestWord;//här skapar vi vårt objekts 'processor' instance variables.
    private String input;     //vanligtvis behöver vi inte initialisera våra instance variables
    private int lineCounter; //eftersom de är initialiserade by default till null, 0 och false beroende av variables typ.
    private int wordCounter;
    private int characterCounter;
    private boolean isStopLoop;

    public void processInput(String input) { //vi skapar en metod för att bearbeta input från användare
        this.input = input; //vi refererar till instance variable med 'this.' för att spara inkommande input i klassens version av input
        lineCounter++;
        wordCounter += input.split("\\s").length;
        characterCounter += input.length();
        String[] words = input.split(" ");
        for (String word : words) { //enhanced for loop. Vi bestämmer att varje indexposition/värden
            // som existerar i vårt array hanteras av en String kallad word.
            if (longestWord==null||word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }
    public boolean isStopLoop() { //vi skapar metod för att stoppa vår loop in main metoden så snart som användaren skriver ordet stop
        if ("stop".equals(input)) { //eftersom by default input lik null vi behöver byta plats på input och stop i vår if-sats, annars får vi fel.
            this.isStopLoop = true; //här vill vi igen referera till instance variable och tilldela värde true till den så snart som använder skriver 'stop'.
        }
        return isStopLoop;
    }
    public String getLongestWord() {
        return longestWord;
    }
    public int getNumberLines() {
        return lineCounter-1; //vi vill exkludera raden med ordet 'stop'.
    }
    public int getNumberWords() {
        return wordCounter;
    }
    public int getNumberCharacters() {
        return characterCounter;
    }
}
