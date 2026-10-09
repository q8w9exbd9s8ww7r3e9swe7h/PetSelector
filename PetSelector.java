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
    String animal = "pet rock";
    Boolean nameStartsWithConsonant = name.matches("^[^(aeiouAEIOU)].*");
    if (!color.matches("red|green|blue")) {
      System.out.println("Invalid color!");
      return;
    }
    else if (!season.matches("fall|winter|summer|spring")) {
      System.out.println("Invalid season!");
      return;
    }
    else if (!name.matches("^[A-Za-z].*")) {
      System.out.println("Invalid name!");
      return;
    }
    if (color.equals("blue")) {
      if (season.equals("fall")) {
        animal = "alligator";
      }
      else if (season.equals("spring")) {
        animal = "ostrich";
      }
      else if (nameStartsWithConsonant && season.equals("winter")) {
        animal = "axolotl";
      }
    }
    else if (color.equals("green")) {
      if (nameStartsWithConsonant && season.equals("winter")) {
        animal = "giraffe";
      }
      else if (!season.equals("fall")) {
        animal = "dog";
      }
    }
    else if (color.equals("red")) {
      if (nameStartsWithConsonant) {
        animal = "panda";
      }
      else  {
        animal = "porcupine";
      }
    }
    else if (season.equals("summer")) {
      animal = "pony";
    }
    System.out.println("Your perfect pet is: " + animal);
  }
}
