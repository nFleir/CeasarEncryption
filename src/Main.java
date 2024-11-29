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

        String enctypted_text = encryption(phrase, key);
        System.out.println(enctypted_text);
    }
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
    private static String encryption(String phrase,int key)
    {
        phrase = phrase.toLowerCase();
        StringBuilder encrypted_text = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++)
        {
            char current_char = phrase.charAt(i);
            if (Character.isLetter(current_char))
            {
                int char_position = alpha.indexOf(current_char);
                int key_val = (key + char_position) % 26;
                char replace_val = alpha.charAt(key_val);

                encrypted_text.append(replace_val);
            }
            else
            {
                encrypted_text.append(current_char);
            }
        }

        return encrypted_text.toString();
    }
}