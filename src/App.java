import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int num = scanner.nextInt();

        scanner.close();

        int i = 1;

        System.out.println("Tabela de multiplicação por " + num);

        while (i <= 10) {
            int result = num * i;
            System.out.println("%s * %s = %s".formatted(num, i, result));
            i++;
        }
    }
}
