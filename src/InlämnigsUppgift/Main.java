package InlämnigsUppgift;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextProcessor processor = new TextProcessor(); //vi skapa ett nytt objekt av klassen TextProcessor med hjälp av
        // konstruktor
        System.out.println("In the next line you can write something. In order to stop the program type 'stop'.");
        System.out.println("Enter something: ");
        while (!processor.isStopLoop()) {//vi använder while loop för att läsa in input från användare så länge
            //som vårt villkor är sant. '!' framför vår loop betyder motsats
            String input = scanner.nextLine();
            processor.processInput(input); //här kallar vi på vår metod och bearbetar input.
        }
        System.out.println("The number of lines is: " + processor.getNumberLines());
        System.out.println("The number of characters is: " + processor.getNumberCharacters());
        System.out.println("The number of words is: " + processor.getNumberWords());
        System.out.println("The longest word is: " + processor.getLongestWord());
    }
}
