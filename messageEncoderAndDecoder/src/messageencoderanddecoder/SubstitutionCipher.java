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
    private int shifter=0;
    

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
    
}
