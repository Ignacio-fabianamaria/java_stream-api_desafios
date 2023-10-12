package Consume;

import java.util.Arrays;
import java.util.List;

public class consumeExemplo {
  public static void main(String[] args) {
    //List com números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6,7,8);

    // Usando Consumer para imprimir os números pares da lista
    System.out.println("Números pares: ");
    numeros.forEach(n -> {
        if( n % 2 == 0)
          System.out.println( n + ", ");
      }
    );
    // Usanso Consumer para imprimir os números ímpares da lista
    System.out.println("Números ímpares: " );
    numeros.forEach(n -> {
      if(n % 2 != 0){
        System.out.println(n + ", ");
      }
    });
  }
   
}
