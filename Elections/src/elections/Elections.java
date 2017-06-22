/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elections;
import java.util.Scanner;
/**
 *
 * @author Corjan Zee
 */
public class Elections {

    /**This Program was built by Corjan Eugene Zee Student Number 394986
     * The objective of this program is to be able to vote for both the President and VicePresedent. 
     * This is achieved by following a bunch of commands which have been 
     * 
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        VoteRecorder.setCandidatePresedent("Annie Kennedy","Bob Hope");

        VoteRecorder vote = new VoteRecorder();
        vote.setCandidateVicePresedent("John"," McClain","Susan","Bush");
        vote.resetVotes();
       int exiter;
        do{
            System.out.println("Please state who you would like to vote for?");        
            vote.getAndConfirmVotes();
            System.out.println("For a new voter press 1 \nto exit the voting program press 2");
            exiter = keyboard.nextInt();
        }while(exiter!=2);
        System.out.println("Presedential Votes:"+vote.getCurrentVotePresendent());
        System.out.println("VicePresedential Votes:"+vote.getCurrentVoteVicePresendent());
        }
}
