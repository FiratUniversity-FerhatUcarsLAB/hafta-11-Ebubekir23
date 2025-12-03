public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

/* Stack Diyagrami
*ping() çalışıyor(yerel değişken yok, parametre yok)
*baffle() ping çağırdı baffle'ın blimp parametresi yok
*Systemm.out.println("wug") çalışmıştı
*zoop() baffle()'ı çağırmıştı zoop'un sonraki satırı System.out.print("You wugga ")
*main() en altta main önce "No, I " yazdırmıştı
*/

/* Tam Çıktı
*No, I wug.
*You wugga wug.
*I wug.
*/
