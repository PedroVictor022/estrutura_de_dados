public class Arrayvetor {
  public static void main(String[] args) {
    // Init array and define your length
    int[] arrNumbers = new int[5];
    arrNumbers[0] = 10;
    arrNumbers[1] = 12;
    arrNumbers[2] = 23;
    arrNumbers[3] = 190;
    arrNumbers[4] = 1;

    int[] otherNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    char[] respostas ={'a', 'b', 'c', 'd'};
    String[] listNames ={"PEDRO", "LUIZA", "ROBERTO", "MARIA"};

    // Iterable array
    for(int count = 0;count < arrNumbers.length;count++) {
      System.out.println(arrNumbers[count]);
    }

    System.out.println("--------------");

    for(int count = 0;count < otherNumbers.length;count++) {
      System.out.println(otherNumbers[count]);
    }
  }
}
