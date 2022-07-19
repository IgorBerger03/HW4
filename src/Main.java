public class Main {
    public static void main(String[] args) {
        // Задание 1
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.print("\n");
        int n = 11;
        while (n > 1) {
            n--;
            System.out.print(n + " ");
        }

        // Задание 2
        System.out.print("\n");
        int friday = 1;
        while (friday < 32) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }

        // Задание 3
        int year = 2022;
        int startYear = year - 200;
        int endYear = year + 100;
        for (year = startYear; year <= endYear; year++) {
            if  (year % 79 == 0) {
                System.out.println(year);
            }

        }




    }
}