import java.util.Scanner;
public class hourMinAngle {
    public static int calculateAngle(int h,int m){
        if(h>12||h<0||m>60||m<0)
            System.out.println("Wrong Input!!!");

            if(h==12)
            h=0;
           
            if(m==60){
                m=0;
                h+=1;
                if(h==12)
                    h=h-12;  
            }
            int hour_angle=(int)(0.5*(h*60+m));
            int min_angle=(int)(6*m);
            int angle=Math.abs(hour_angle-min_angle);

            angle=Math.min(360-angle, angle);

            return angle;
        


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Hours hand: ");
        int h=sc.nextInt();
        System.out.println("Enter the minute hand: ");
        int m=sc.nextInt();
        System.out.println(calculateAngle(h, m)+" degree");
        
    }
}