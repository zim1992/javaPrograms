/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageencoderanddecoder;

/**
 *
 * @author corjan
 */
public class MessageEncoderAndDecoder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sent = "Hello World This is me";
        SubstitutionCipher message = new SubstitutionCipher();
        message.decode(sent);
        char [] sentToChar = sent.toCharArray();
        char [] shift;
        String newString="";
        
        for(char oldLetter:sentToChar){
            if(oldLetter==' '){
                newString=newString+((oldLetter));
            }else{
                newString=newString+((char) (3+(int) oldLetter));                
            }
        }
            
        System.out.println(newString);
    }
    
}
