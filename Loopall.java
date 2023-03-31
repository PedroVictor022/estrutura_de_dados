import java.util.Scanner;

public class Loopall {
  public static void main(String[] args) {
    System.out.println("Informe um valor: ");
    Scanner input = new Scanner(System.in);

    for(int count = 0; count < 5; count++) {
      System.out.println("Contador em: " + count);
    }
    System.out.println("Final do loop for");

    int inputNumber = input.nextInt();
    int count = 0;
    while(count < inputNumber) {
      System.out.println(count + " Contador");
      count++;
    }
    System.out.println("Final do loop while");
  }

}
