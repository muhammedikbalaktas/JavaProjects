public class Main {

    public static String reverseString(String input){
        StringBuilder output= new StringBuilder();

        for(int i=input.length()-1;i>=0;i--){
            output.append(input.charAt(i));
        }

        return output.toString();
    }
    public static void main(String[] args) {
        String name="muhammed is good boy";
        System.out.println(reverseString(name));

    }
}
