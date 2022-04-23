public class Main {


    public static int reverseNumber(int input){
        int result=0;
        while (input>0){
            result+=input%10;
            input=input/10;
            result=result*10;
        }
        result=result/10;
        return result;

    }

    public static void main(String[] args) {

        System.out.println(reverseNumber(2022));

    }
}
