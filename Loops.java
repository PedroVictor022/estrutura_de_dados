public class Loops {
  public static void main(String[] args) {
    int age = 18;
    String res;

    // OPERATORS: == > < >= <= != ! 
    if(age >= 18) {
      System.out.println("Usuario e maior de idade");
    } else {
      System.out.println("Usuario e menor de idade");
    }

    // Ternario
    res=(age >= 18 ? "E maior de 18 anos" : "E menor de 18 anos");
    System.out.println("Resultado: " + res);


    int pos=1;

    switch(pos) {
      case 1: 
        System.out.println("Primeiro lugar");
        break;
      case 2: 
        System.out.println("Segundo lugar");
        break;
      case 3: 
        System.out.println("Segundo lugar");
        break;
      default: 
        System.out.print("Nao ganhou nada");
        break;
    }

  }
}
