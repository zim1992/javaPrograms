/**
 * This program which is run in the background and supposed to calculate how many letters were used in a sentence.
 */

package counting.amount.of.letters.in.a.sentence;

/**
 *
 * @author Corjan Zee
 */
public class runner {
private int a = 0,b= 0,c= 0,d= 0,e= 0,f= 0,g= 0,h= 0,i= 0,j= 0,k= 0,l= 0,m= 0,n= 0,o= 0,p= 0,q= 0,r= 0,s= 0,t= 0,u= 0,v= 0,w= 0,x= 0,y= 0,z= 0;    
char[] sentenceArray;


public runner(String sentence){
sentenceArray = sentence.toCharArray();
}
/**
 * LetterCounter counts how may of each letter is used in each sentence. 
 */
public void lettercounter(){
    for(int stringPostion = 0;stringPostion<(sentenceArray.length);stringPostion++){
         if((sentenceArray[stringPostion]=='a')||(sentenceArray[stringPostion]=='A')){
             a++;
         }
         if((sentenceArray[stringPostion]=='b')||(sentenceArray[stringPostion]=='B')){
             b++;
         }
         if((sentenceArray[stringPostion]=='c')||(sentenceArray[stringPostion]=='C')){
             c++;
         }
         if((sentenceArray[stringPostion]=='d')||(sentenceArray[stringPostion]=='D')){
             d++;
         }
         if((sentenceArray[stringPostion]=='e')||(sentenceArray[stringPostion]=='E')){
             e++;
         }
         if((sentenceArray[stringPostion]=='f')||(sentenceArray[stringPostion]=='F')){
             f++;
         }
         if((sentenceArray[stringPostion]=='g')||(sentenceArray[stringPostion]=='G')){
             g++;
         }
         if((sentenceArray[stringPostion]=='h')||(sentenceArray[stringPostion]=='H')){
             h++;
         }
         if((sentenceArray[stringPostion]=='i')||(sentenceArray[stringPostion]=='I')){
             i++;
         }
         if((sentenceArray[stringPostion]=='j')||(sentenceArray[stringPostion]=='J')){
             j++;
         }
         if((sentenceArray[stringPostion]=='k')||(sentenceArray[stringPostion]=='K')){
             k++;
         }if((sentenceArray[stringPostion]=='l')||(sentenceArray[stringPostion]=='L')){
             l++;
         }
         if((sentenceArray[stringPostion]=='m')||(sentenceArray[stringPostion]=='M')){
             m++;
         }
         if((sentenceArray[stringPostion]=='n')||(sentenceArray[stringPostion]=='N')){
             n++;
         }
         if((sentenceArray[stringPostion]=='o')||(sentenceArray[stringPostion]=='O')){
             o++;
         }
         if((sentenceArray[stringPostion]=='p')||(sentenceArray[stringPostion]=='P')){
             p++;
         }
         if((sentenceArray[stringPostion]=='q')||(sentenceArray[stringPostion]=='Q')){
             q++;
         }
         if((sentenceArray[stringPostion]=='r')||(sentenceArray[stringPostion]=='R')){
             r++;
         }
         if((sentenceArray[stringPostion]=='s')||(sentenceArray[stringPostion]=='S')){
             s++;
         }
         if((sentenceArray[stringPostion]=='t')||(sentenceArray[stringPostion]=='T')){
             t++;
         }
         if((sentenceArray[stringPostion]=='u')||(sentenceArray[stringPostion]=='U')){
             u++;
         }
         if((sentenceArray[stringPostion]=='v')||(sentenceArray[stringPostion]=='V')){
             v++;
         }
         if((sentenceArray[stringPostion]=='w')||(sentenceArray[stringPostion]=='W')){
             w++;
         }
         if((sentenceArray[stringPostion]=='x')||(sentenceArray[stringPostion]=='X')){
             x++;
         }
         if((sentenceArray[stringPostion]=='y')||(sentenceArray[stringPostion]=='Y')){
             y++;
         }
         if((sentenceArray[stringPostion]=='z')||(sentenceArray[stringPostion]=='Z')){
             z++;
         }
        
       }
    int letterAmountArray [] = new int[26];
        letterAmountArray[0] = a;
        letterAmountArray[1] = b;
        letterAmountArray[2] = c;
        letterAmountArray[3] = d;
        letterAmountArray[4] = e;
        letterAmountArray[5] = f;
        letterAmountArray[6] = g;
        letterAmountArray[7] = h;
        letterAmountArray[8] = i;
        letterAmountArray[9] = j;
        letterAmountArray[10] = k;
        letterAmountArray[11] = l;
        letterAmountArray[12] = m;
        letterAmountArray[13] = n;
        letterAmountArray[14] = o;
        letterAmountArray[15] = p;
        letterAmountArray[16] = q;
        letterAmountArray[17] = r;
        letterAmountArray[18] = s;
        letterAmountArray[19] = t;
        letterAmountArray[20] = u;
        letterAmountArray[21] = v;
        letterAmountArray[22] = w;
        letterAmountArray[23] = x;
        letterAmountArray[24] = y;
        letterAmountArray[25] = z;
        System.out.print("{");
        for(int arrayPoint = 0;arrayPoint<26;arrayPoint++){
        System.out.print(letterAmountArray[arrayPoint]);
        System.out.print(",");
        }
        System.out.println("}");
        System.out.println("{a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,}");
}

}

