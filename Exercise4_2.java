/*
 * Ad Soyad: Ebubekir Yılmaz
 * Öğrenci No: 250541051
*/
import java.util.Scanner;

public class Exercise4_2 {

	  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

	    public static void main(String[] args) {
	        zippo("rattle", 13); // 1
	    }

	    public static void baffle(String blimp) {
	        System.out.println(blimp); // 4
	        zippo("ping", -5); // 5
	    }

	    public static void zippo(String quince, int flag) {
	        if (flag < 0) {
	            System.out.println(quince + " zoop"); // 6
	        } else {
	            System.out.println("ik"); // 2
	            baffle(quince); // 3
	            System.out.println("boo-wa-ha-ha"); // 7
	        }
	    }
	}

/* Cevap 2:
* baffle metdou ilk çağırıldığında blimp parametresinin değeri "rattl" dır
*/

/* Cevap 3:
*ik
*rattle
*ping zoop
*boo-wa-ha-ha
*/

/* Cevao 4:
*Hiçbir yerde birden fazla kez çalışmamıştır
*/
