import java.lang.Math;
public class Main {


    public static boolean isNeon(int input){

        int i=0;

        if(input<0)return  false;
        int num=input*input;
        while(num>0){
                i+=num%10;
                num=num/10;

        }
        if(i==input)return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(isNeon(9));
        System.out.println(isNeon(45));
        System.out.println(isNeon(0));

    }
}
