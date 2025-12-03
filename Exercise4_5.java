public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}


/* Cevap 1:
*main: clink(2*buzz) => clink(4)
*  clink System.out.print("It's ");
*  clink zoop("breakfast ", 4);
*    zoop yazdırır breakfast (bu aynı satırın devamı olarak yazılır
*    çünkü öce It's yazılmıştı) println olduğu için satır sonu olur
*    bob==4 olduğu için else branch: System.out.println("!"); yeni satırda !
*/

/* Cevap 2:
*just for
*any not more 
*It's breakfast 
*!
*/
