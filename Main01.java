import java.util.Scanner;

public class Main01 {
  public static void main(String[] args) {
    bool Verificacao = false; 
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();
    System.out.printl(" "); // ou System.out.print("\n"); 
    if (idade >= 18) {
      System.out.println("Você é maior de idade!");
      Verificacao = true;
    } else {
      System.out.println("Você não é maior de idade!");
    }
  }
}
