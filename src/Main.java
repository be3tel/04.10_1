import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму");
        int doxod = scanner.nextInt();

        int result = 0;

        if(doxod < 100000)
        {
            int dox = 0;
            dox += doxod * 0.13;
            result = doxod - dox;
            System.out.println(result);
        }
        else
        {
            if(1000000 > doxod| doxod > 100000)
            {
                int dox = 0;
                dox += doxod * 0.18;
                result = doxod - dox;
                System.out.println(result);
            }
            else
            {
                if(doxod > 1000000)
                {
                    int dox = 0;
                    dox += doxod * 0.25;
                    result = doxod - dox;
                    System.out.println(result);

                }
            }
        }
    }
}