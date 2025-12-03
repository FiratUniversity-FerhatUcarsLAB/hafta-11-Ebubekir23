/*
 * Ad Soyad: Ebubekir Yılmaz
 * Öğrenci No: 250541051
*/
public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
    }
}

// Cevap 1: Derleyici uyarı veya hata vermedi ancak konsola da hiçbir şey yazdırmadı
// Cevap 2: Derleyici hata verdi
