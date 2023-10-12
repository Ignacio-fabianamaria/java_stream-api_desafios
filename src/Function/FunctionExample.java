package Function;

import java.util.Arrays;
import java.util.List;



public class FunctionExample {
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        //Usar a função para dobrar todos os numeros no stream() e armazena-los em outra lista
        List<Integer> numerosdobrados = numeros.stream().map(n -> n * 2).toList();

        //Imprimindo
        numerosdobrados.forEach(System.out::println);
;    }
}
