
import java.util.HashSet;


public class pallindromicSubsequence{
    
   public static void main(String[] args) {
    String s="bbcbaba";
    int n=s.length();
    HashSet<String> pall=new HashSet<>();
    for(int i=1;i<n-1;i++){
        char mid=s.charAt(i);

        HashSet<Character> left=new HashSet<>();
        for(int j=0;j<i;j++){
            left.add(s.charAt(j));
        }

        //right store
        for(int k=i+1;k<n;k++){
            if(left.contains(s.charAt(k)))
                pall.add(""+s.charAt(k)+mid+s.charAt(k));
            }

        }
        System.out.println(pall.size());

    }
       
   }
