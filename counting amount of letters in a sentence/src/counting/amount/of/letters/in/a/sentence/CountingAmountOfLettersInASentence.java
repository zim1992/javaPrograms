/**
 *This program is used to count how many times a letter appears in a sentence 
 */

package counting.amount.of.letters.in.a.sentence;
import java.util.Scanner;

/**
 *
 * @author Corjan Zee
 */
public class CountingAmountOfLettersInASentence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("In this program we will be counting how many times each leter appears in a sentence");
       System.out.println("Below type a sentence. For example, The cat is eating food");
       Scanner keyboard = new Scanner(System.in);
       String sentence=keyboard.nextLine();
       runner counter = new runner(sentence);
       counter.lettercounter();
    }
    
}
