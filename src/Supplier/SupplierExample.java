package Supplier;

import java.util.List;

import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        // Usar Supplier com expressão lambda para fornecer saudação personalizada
        //Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        // Usar Supplier para obter uma lista com  saudações
        List<String> listaSaudacao = Stream.generate(() -> "Olá, seja bem vindo(a)!")
        .limit(2)
        .toList();

        // Imprimindo
        listaSaudacao.forEach(s -> System.out.println(s));
       
        System.out.println("Imprimindo por metodo de referencia");
        listaSaudacao.forEach(System.out::println);
    }
}
