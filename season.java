

    import java.util.Scanner;

    public class season {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер месяца:");
            int month = scanner.nextInt();
            String res;
            switch (month) {
                case 1:
                case 2:
                case 12:
                    res = "Зима";
                    break;
                case 3:
                case 4:
                case 5:
                    res = "Весна";
                    break;
                case 6:
                case 7:
                case 8:
                    res = "Лето";
                    break;
                case 9:
                case 10:
                case 11:
                    res = "Осень";
                    break;
                default:
                    res = "Нет такого месяца!";
            }
            System.out.println(res);
        }
    }

