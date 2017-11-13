import java.util.Scanner;

/**
 * Created by ThinkPad on 13.11.2017.
 */
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("HelloWorld");
    String userInput;

    do {System.out.println("Aby wyjśc z aplikacji wpisz exit  a nastepie enter");
      Scanner scanner = new Scanner(System.in);
      userInput = scanner.nextLine();

    } while (!userInput.equals("exit"));

  }
}
