import java.util.Scanner;

publicc class Scanner {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //inicializa a variável sc
    
    String x;
    
    x = sc.next(); // Lê uma palavra
    System.out.println("Voce digitou: " + x);    
    
    x = sc.nextInt(); //Lê um inteiro
    System.out.println("Voce digitou: " + x);    
    
    sc.close(); //encerra a variável sc
  }
}
