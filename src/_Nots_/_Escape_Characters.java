package _Nots_;

public class _Escape_Characters {
    public static void main(String[] args) {
       // Escape Characters
       //  \n -> yeni satır açıyor, alt satıra geçiyor
       //  \t -> sanki tab tuşuna basılmış gibi boşluk veriyor
       //  \b -> back-space bir karakter geri siler
       //  \" -> " tırnak yazmak için kullanılıyor
       //  \\ -> \ yazılacak ekrana
       //  \r -> satır başına geri ve satırı silip tekrar baştan yazıyormuş gibi yapar

        System.out.println("Merhaba\nDünya");
        System.out.println("Merhaba\tDünya");
        System.out.println("Merhaba\bDünya");
        System.out.println("Merhaba\"Dünya");
        System.out.println("Merhaba\\Dünya");
        System.out.println("Merhaba\nDünya");
    }
}
