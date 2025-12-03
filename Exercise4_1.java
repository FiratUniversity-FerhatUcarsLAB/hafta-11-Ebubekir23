public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {
        
		String day = "Cuma";
		String month = "Mart";
		int date = 3;
		int year = 2006;

		printAmerican(day, date, month, year);
		printEuropean(day, date, month, year);

    }
}
