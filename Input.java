import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n1,n2, res;
  
    System.out.print("Digite um nome de usuario: ");
    String inputName = input.nextLine();
    System.out.println(inputName);
    System.out.println("----------");
    System.out.print("Digite dois numero que serao somados: ");
    n1 = input.nextInt();
    n2 = input.nextInt();
    res = n1 + n2;
    System.out.println("N1 + N2 e igual a: " + res);
  }
}
