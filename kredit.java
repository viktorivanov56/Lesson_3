
    import java.util.Scanner;

    public class kredit {


            public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                System.out.print("Введите сумму вклада: ");
                float sum = in.nextFloat();
                System.out.print("Введите срок вклада в месяцах: ");
                int period = in.nextInt();
                int i = period;

                while (i > 0){
                    sum += sum * 0.07;
                    i--;
                }
                System.out.printf("После %d месяцев сумма вклада составит %f", period, sum);
                in.close();
            }
        }

