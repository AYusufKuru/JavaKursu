package Odevler;

public class _3_Soru_1 {
    public static void main(String[] args) {
        //Bu String'i oluşturun. "Removes white space from both ends of a string"
        //String'deki kelime sayısını yazdırınız.

        String text = "Removes white space from both ends of a string";
        int spaceCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                spaceCount++;


        }
        System.out.println("Word count = " + (spaceCount+1));

    }
}
