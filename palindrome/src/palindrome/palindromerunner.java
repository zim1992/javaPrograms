/*
 This is the background program to a program which is supposed to test whether a word is a Palindromer ... a word can be written both ways 
 */

package palindrome;
import java.util.*;



/**
 *
 * @author Corjan Zee
 */
public class palindromerunner {
private String inputSentence;
private int oldSubstringPoint = 0;
private List arraylistPal = new ArrayList();

public palindromerunner(){

} 
public palindromerunner(String sentence){
    inputSentence = sentence;
    int amountOfpal = 0;
    for(int count=0;count<amountOfWords();count++){
        String individualWord = IndividualWords().toLowerCase();
        if(palindromeCheck(individualWord)){
            arraylistPal.add(individualWord);
            amountOfpal++;
        }
    }
    if(amountOfpal==0){
        System.err.println("Sorry no Palindromes were detected");
    }else{
        System.out.print("In the following sentence Palindromes were detected.\nWe counted:"+amountOfpal+" palandromes\nThey are as follows: ");
        Iterator palIterator = arraylistPal.iterator();
        while(palIterator.hasNext()){
            System.out.print(palIterator.next()+"\t");
        }
        System.out.println();
    }
}
/**
 * This is supposed to detect a word in a sentence.
 */
public String getSentence(){
    return inputSentence;
}
private int amountOfWords(){
    int amountOfWords = 0;
    for(int count=0;count<inputSentence.length();count++){
        if(spaceOrperiodDetection(count)){
            amountOfWords++;
        }
    }
    return amountOfWords;
}
private String IndividualWords(){
    int amount = 0;
    int count = oldSubstringPoint;
    while(inputSentence.length()!=count){
        if(spaceOrperiodDetection(count)){
            break;                        
        }else{
            amount++;
        }
        count++;
    }
    String returnString = inputSentence.substring(oldSubstringPoint,(oldSubstringPoint+amount));
    oldSubstringPoint+=amount+1;
    return returnString;
}
private boolean palindromeCheck(String word){
    for(int count=0;count<=(int)Math.ceil(word.length()/2);count++){
        if(word.substring(count, count+1).equals(word.substring(word.length()-count-1, word.length()-count))){
        }else{
            return false;
        }
    } 
    return true;
}
private boolean spaceOrperiodDetection(int checkPoint){
    return " ".equals(inputSentence.substring(checkPoint,checkPoint+1))||".".equals(inputSentence.substring(checkPoint,checkPoint+1));
}

}


