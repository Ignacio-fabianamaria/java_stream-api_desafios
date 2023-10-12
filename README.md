# JAVA - STREAM API

A API de Stream em Java é parte do pacote java.util.stream e fornece uma maneira poderosa e flexível de processar e manipular sequências de dados. É especialmente útil ao lidar com coleções, como List, Set e Map. A API de Stream permite que você execute operações em elementos de uma sequência de maneira declarativa e funcional.

Dentro da API de Stream, existem quatro interfaces funcionais que desempenham papéis importantes:

- **Consumer**: A interface `Consumer` é frequentemente utilizada em operações terminais para realizar ações em elementos da coleção. Por exemplo, ao usar o método `forEach` em um Stream, um `Consumer` pode ser usado para executar ações nos elementos, como imprimir ou salvar em um arquivo. Isso permite a realização de operações de efeito colateral nos elementos.

- **Supplier**: A interface `Supplier` é útil ao criar Streams ou em operações intermediárias. Ela fornece elementos ou valores sob demanda. Por exemplo, ao criar um Stream usando `generate`, um `Supplier` pode gerar valores à medida que são necessários. Isso é útil para trabalhar com sequências potencialmente infinitas de dados.

- **Function**: A interface `Function` desempenha um papel fundamental em operações de mapeamento, onde um valor de entrada é transformado em um valor de saída. Ela é usada em operações como `map`, `flatMap` e `collect`, permitindo que os elementos da coleção sejam transformados de acordo com a função definida.

- **Predicate**: A interface `Predicate` é usada em operações de filtragem para determinar se um elemento atende a uma condição específica. O `Predicate` é passado para operações como `filter`, permitindo que você mantenha apenas os elementos que satisfaçam a condição estabelecida.

Em conjunto, essas interfaces funcionais e a API de Stream fornecem uma maneira eficaz de trabalhar com coleções de dados em Java. Ao utilizar essas interfaces, você pode realizar uma variedade de operações de processamento de dados de forma elegante e concisa, ao mesmo tempo que mantém o código mais legível e expressivo. Isso é especialmente útil ao lidar com grandes volumes de dados ou ao realizar operações complexas de transformação e filtragem. A combinação de Streams e interfaces funcionais torna a programação funcional em Java uma abordagem poderosa para lidar com dados.# java_stream-api_desafios
