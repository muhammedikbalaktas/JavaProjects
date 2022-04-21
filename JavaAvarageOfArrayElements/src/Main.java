public class Main {
    public static double avarageOfArray(int arr[]){

        double result=0;
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
        }
        return result/arr.length;
    }
    public static void main(String[] args) {

        System.out.println(avarageOfArray(new int[]{1,2,3,4,5,6}));

    }
}
