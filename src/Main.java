import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фразу");
        String phrase = scan.nextLine();

        System.out.println("Введите ключ");
        int key = scan.nextInt();
    }

    private static String encryption(String phrase, int key)
    {
        phrase = phrase.toLowerCase();


        return "";
    }
}