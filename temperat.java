import java.util.Scanner;

class temperat{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        double a = 15; double s = sc.nextDouble();

        if (s<a) System.out.print("Холодно(");
        if (s==a) System.out.print("Прохладно...");
        if(s>a) System.out.print("Тепло!");
    }
}
