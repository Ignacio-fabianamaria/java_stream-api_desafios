package Predicate;

import java.util.Arrays;
import java.util.List;


public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("macaco", "leão", "jacaré", "lontra", "leopardo", "gato");

       palavras.stream().filter(p -> p.startsWith("l")).forEach(System.out::println);
       System.out.println("-----------------------------------------------");
        palavras.stream().filter(p -> p.length() < 5).forEach(System.out::println);
    }
}
