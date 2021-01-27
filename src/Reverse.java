public class Reverse {

    public static void main (String[] args) {

        System.out.println(revers("Hello"));


    }

     public static String revers(String str) {
        String empty = "";
        for(int i = str.length()-1; i>=0; i--) {
            empty +=str.charAt(i);
        }
            return empty;

    }


}
