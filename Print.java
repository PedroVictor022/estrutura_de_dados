public class Print {
  public static void main(String[] args) {
    int age = 18;

    // print nao executa quebra de linha
    System.out.println("Curso de Java");

    // Executa uma quebra de linha ao final da linha
    System.out.print("Estrutura do print");

    // Permite uma configuracao de formatacao
    // %s - espera uma string | %d espera um inteiro
    System.out.printf("%s - %d","Java Course", 2023);
    System.out.println("");
    System.out.printf("Idade do usuario: %d", age);
  }
}
