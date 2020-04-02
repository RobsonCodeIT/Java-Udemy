import  java.util.Scanner;
import  java.util.Locale;

publicc class Scanner {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in); //inicializa a variável sc
    
    String  x;
    int     y;
    Double  z;
    char    a;
    
    x = sc.next(); // Lê uma palavra
    System.out.println("Voce digitou: " + x);    
    
    y = sc.nextInt(); //Lê um inteiro
    System.out.println("Voce digitou: " + y);     

    z = sc.nextDouble(); //Lê um Double. Pega a formação da llocalidade (Locale.US)
    System.out.println("Voce digitou: " + z);   
    System.out.printf("Voce digitou: %.2f%n", z); //print formatado
    
    a = sc.next().charAt(0); //O valor em charAT indica a posição do caractere que se deseja capturar
    System.out.println("Voce digitou: " + a);
    
    sc.close(); //encerra a variável sc
  }
}
