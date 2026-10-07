import java.util.Scanner;
// name: Leo Brennan
// Description: this program helps Vermin Supreme decide which pet to give to each citizen when elected
class PetSelector {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your favorite color (Either red, blue or green): ");
    String color = scanner.nextLine();
    System.out.print("Enter your favorite season (winter, spring, summer, fall): ");
    String season = scanner.nextLine();
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    scanner.close();
    Boolean nameStartsWithLetter = name.matches("^[A-Za-z]");
    Boolean nameStartsWithConsonant = name.matches("^[^(aeiouAEIOU)]");
  }
}
