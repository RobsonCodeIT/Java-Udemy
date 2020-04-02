import java.util.Scanner;

publicc class Scanner {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //inicializa a variável sc
    
    String x;
    int y;
    Double z;
    
    x = sc.next(); // Lê uma palavra
    System.out.println("Voce digitou: " + x);    
    
    y = sc.nextInt(); //Lê um inteiro
    System.out.println("Voce digitou: " + y);     

    z = sc.nextDouble(); //Lê um Double. Pega a formação da llocalidade (Locale.US)
    System.out.println("Voce digitou: " + z);   
    
    sc.close(); //encerra a variável sc
  }
}
