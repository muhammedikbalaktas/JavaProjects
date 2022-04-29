public class Main {
    public static boolean isAutomorphic(int number){
        if(number<0)return false;

        int sqr=number*number;

        while(number>0){
            if(number%10!=sqr%10) return false;
            number/=10;
            sqr/=10;
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(isAutomorphic(6));
        System.out.println(isAutomorphic(23));
        System.out.println(isAutomorphic(5));
        System.out.println(isAutomorphic(76));

    }
}
