
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class decimalToBCD2 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(0, "0000");
        map.put(1, "0001");
        map.put(2, "0010");
        map.put(3, "0011");
        map.put(4, "0100");
        map.put(5, "0101");
        map.put(6, "0110");
        map.put(7, "0111");
        map.put(8, "1000");
        map.put(9, "1001");

        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the number: ");
        int num=sc.nextInt();


        String numStr=String.valueOf(num);
        StringBuilder bcdResult=new  StringBuilder();
        for (int i = 0; i < numStr.length(); i++) {
            int digit=Character.getNumericValue(numStr.charAt(i));
            bcdResult.append(map.get(digit)).append(" ");
            
        }

        System.out.println("BCD value of "+num+ " is: " +bcdResult.toString().trim());
    }
    
}
