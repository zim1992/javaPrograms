/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elections;
import java.util.Scanner;


/**
 *This Program was built by Corjan Eugene Zee, Student Number 394986
 * The objective of this program is to be able to conduct and election and recall the values from an election.
 */
public class VoteRecorder {

    
    private static String candidateOne;
    private static String candidateTwo;
    private static String viceCandidateOne;
    private static String viceCandidateTwo;
    private static int voteCandiateOne;
    private static int voteCandiateTwo;
    private static int voteViceCandidateOne;
    private static int voteViceCandidateTwo;
    private int myVoteForPresident;
    private int myVoteForVicePresident;
    
    
/**
 *This will allocate the  
 * @param candidate1 - This the name of one the candidates who are nominating to be president
 * @param candidate2 - This the name of one the candidates who are nominating to be president
 */
   
    static void setCandidatePresedent(String candidate1, String candidate2) {
        candidateOne = candidate1;
        candidateTwo = candidate2;
    }
    static void setCandidatePresedent(int index,String candidate){
        if(index == 1){
            candidateOne = candidate;
        }
        if(index == 2){
            candidateTwo = candidate;
        }
        else{
            System.out.println("You can only choose and index of 1 or 2. Try it again using 1 or 2!!");
        }
    }
   static void  setCandidatePresedent(String can1FirstName,String can1LastName,String can2FirstName,String can2LastName){
        String can1 = can1FirstName +" "+can1LastName;
        candidateOne = can1;
        String can2 = can2FirstName +" "+can2LastName;
        candidateTwo = can2;
    }
   public String getCandidateOne(){
       return candidateOne;
   }
   public String getCandidateTwo(){
       return candidateTwo;
   }
   public String getviceCandidateOne(){
       return viceCandidateOne;
   }
   public String getviceCandidateTwo(){
       return viceCandidateTwo;
   }
   static void setCandidatePresedent(int index,String canFirstName, String canLastName){
       if(index == 1){
            String candidate = canFirstName +" "+canLastName;
            
            candidateOne = candidate;
        }
        if(index == 2){
            String candidate = canFirstName +" "+canLastName;
            candidateTwo = candidate;
        }
        else{
            System.out.println("You can only choose and index of 1 or 2. Try it again using 1 or 2!!");
        }
    }
    public static String getCurrentVotePresendent(){
       return "The amout of votes "+candidateOne+" received was "+voteCandiateOne+", and the amount of votes "+candidateTwo+" received was "+voteCandiateTwo+".";
       
    }
    
    public static void resetVotes(){
        voteCandiateOne = 0;
        voteCandiateTwo = 0;
        voteViceCandidateOne = 0;
        voteViceCandidateTwo = 0;
        
    }
    
    public static String getCurrentVoteVicePresendent(){
       return "The amout of votes "+viceCandidateOne+" received was "+voteViceCandidateOne+", and the amount of votes "+candidateTwo+" received was "+voteViceCandidateTwo+".";
      
     }
    public static void setCandidateVicePresedent(String can1FirstName,String can1LastName,String can2FirstName,String can2LastName){
        String can1 = can1FirstName +" "+can1LastName;
        viceCandidateOne = can1;
        String can2 = can2FirstName +" "+can2LastName;
        viceCandidateTwo = can2;
    }
     
    public void getAndConfirmVotes()
    {
       Scanner keyboard = new Scanner(System.in);
        int check;
        do{
            System.out.println(getAVote(candidateOne,candidateTwo));
            myVoteForPresident = keyboard.nextInt();
            System.out.println(confirmVotes(myVoteForPresident,candidateOne,candidateTwo));
            check = keyboard.nextInt();               
        }while(check!=1);
        do{
            System.out.println(getAVote(viceCandidateOne,viceCandidateTwo));
            myVoteForVicePresident = keyboard.nextInt();
            System.out.println(confirmVotes( myVoteForVicePresident,viceCandidateOne,viceCandidateTwo));
            check = keyboard.nextInt();
        }while(check!=1);
        recordVotes(myVoteForPresident,  myVoteForVicePresident);
    }
    
    
     private String getAVote(String name1,String name2){
        return"0 - Will represent that you wish not to vote"+"\n1 - "+name1+"\n2 - "+name2;
       
     }
     
     /**
     *Gets the votes for president and vice president for a voter.
     */
     private String getVotes(){
      String NameOfVotedPresedent;
      String NameOfVotedVicePresedent;
       switch(myVoteForPresident){
             case 1:NameOfVotedPresedent="You voted "+candidateOne+" as your Presedent";
                 break;
             case 2:NameOfVotedPresedent="You voted "+candidateTwo+" as your Presedent";
                 break;
             default:NameOfVotedPresedent="You did not vote for a Presedent";
                 break;
         }
         switch(myVoteForVicePresident){
             case 1:NameOfVotedVicePresedent = "You voted "+viceCandidateOne+" as your VicePresedent";
                 break;
             case 2:NameOfVotedVicePresedent = "You voted "+viceCandidateTwo+" as your VicePresedent";
                 break;
             default: NameOfVotedVicePresedent = "You did not vote for a VicePresedent";
                 break;
         }
        return  NameOfVotedPresedent+"\n"+NameOfVotedVicePresedent;
     }
     
     private String confirmVotes(int vote,String name1,String name2){
         String statement = "\nNow press \n1 - to say Yes\n2 - to say No";
         switch(vote){
             case 0:return "Did you decided not to vote?"+statement;                 
             case 1:return "Did you vote for "+name1+" ?"+statement;            
             case 2:return "Did you vote for "+name2+" ?"+statement;             
             default:return "Did you decided not to vote?"+statement;
             }
        
     }
     
     private void recordVotes(int a1,int a2){
         switch(a1){
             case 1:voteCandiateOne++;
                 break;
             case 2:voteCandiateTwo++;
                 break;
             default:
                 break;
         }
         switch(a2){
             case 1:voteViceCandidateOne++;
                 break;
             case 2:voteViceCandidateTwo++;
                 break;
             default:
                 break;
         }
         myVoteForPresident = 0;
         myVoteForVicePresident=0;
     }
    }
    
