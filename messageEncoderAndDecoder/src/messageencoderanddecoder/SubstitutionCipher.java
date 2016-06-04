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
public class SubstitutionCipher implements MessageDecoder,  MessageEncoder{
    private String decodedMessage;
    private String encodedMessage;
    private int shifter;
    public SubstitutionCipher(){
        shifter = 0;
    }
    public SubstitutionCipher(int shifter){
        this.shifter = shifter;
    }
    
/**
 * Method used to decode messages. It takes the si
 * @param cipherText 
 */
    @Override
    public void decode(String cipherText) {
        char [] sentToChar = cipherText.toCharArray();
        String newString="";        
        for(char oldLetter:sentToChar){
            if(oldLetter==' '){
                newString=newString+((oldLetter));
            }else{
                newString=newString+((char) (shifter-(int) oldLetter));                
            }
        }
        decodedMessage = newString;        
    }
/**
 * This method is used to encode a desired message. It shifts the letters in each word by a desired amount.
 * @param cipherText - The input text which needs to be translated
 */
    @Override
    public void encode(String cipherText) {
        char [] sentToChar = cipherText.toCharArray();
        String newString="";        
        for(char oldLetter:sentToChar){
            if(oldLetter==' '){
                newString=newString+((oldLetter));
            }else{
                newString=newString+((char) (shifter+(int) oldLetter));                
            }
        }
        encodedMessage = newString;
       
        
    }
    public void setShifter(int shifter){
        this.shifter=shifter;
        
    }
    
    public String getDecodedMessage(){
        return decodedMessage;
    }
    public String getEncodedMessage(){
        return encodedMessage;
    }
    public int getShifter(){
        return shifter;
    }
    
}
