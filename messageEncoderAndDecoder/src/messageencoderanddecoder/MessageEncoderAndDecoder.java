/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageencoderanddecoder;

import java.util.Scanner;

/**
 *
 * @author corjan
 */
public class MessageEncoderAndDecoder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String sent = "Hello World This is me";
        SubstitutionCipher message = new SubstitutionCipher();
        message.decode(sent);
        System.out.println("This Program will be used to decode and encode messages");
        boolean programExiter = false;
        while(!programExiter){
            System.out.println("Please select from the following menu which option you would like to select\n"
                            + "1) Encode a Message\n"
                            + "2) Decode a Message\n"
                            + "3) View the shifter\n"
                            + "4) Adjust the shifting value\n"
                            + "5) Exit");
            int optionSelected = keyboard.nextInt();
            keyboard.nextLine();
            switch(optionSelected){
                case 1: System.out.println("You will be Encoding a message.\n\nPlease type the sentence you wish to encode.");
                        message.encode(keyboard.nextLine());
                        System.out.println("\nThe message you have typed has been encoded and is as follows\n");
                        System.out.println(message.getEncodedMessage());
                        break;
                case 2: System.out.println("You will be Decoding a message.\n\nPlease type out the message you wish to decode");
                        message.decode(keyboard.nextLine());
                        System.out.println("\nThe message which typed out was decoded to the following message.");
                        System.out.println(message.getDecodedMessage());
                        break;
                case 3: System.out.println("The shifter number is: "+message.getShifter());
                        break;
                case 4: System.out.println("You will be adjusting the shifting value for the program");
                        message.setShifter(keyboard.nextInt());
                        break;
                case 5: programExiter = true;
                        break;
                default: System.err.println("ERROR: The following option you have selected is not in the menu please retry");
                        break;
            }
        }
    }
    
}
