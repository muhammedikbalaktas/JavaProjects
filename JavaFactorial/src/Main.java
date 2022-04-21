public class Main {
    public static int factorial_1(int input){
        int result=1;
        for(int i=1;i<=input;i++){
            result*=i;
        }
        return result;
    }
    public static int factorial_2(int input){//recursive solution
        if(input==1||input==0)return 1;
        else return input*factorial_2(input-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial_1(5));
        System.out.println(factorial_2(6));
    }
}
