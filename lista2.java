import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("digite sua idade");
    boolean pode=false;
    Scanner teclado = new Scanner(System.in);
    int idade = teclado.nextint();

    if(idade < 16){
      pode = false;
      System.out.println("não pode votar");
    }else if(idade > 16 && idade > 18){
      pode = true;
      System.out.println("pode votar");
    }else{
      pode = true;
      System.out.println("é obrigatorio votar");
    }

  }
}
