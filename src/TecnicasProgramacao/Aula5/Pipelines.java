package TecnicasProgramacao.Aula5;

import java.util.stream.Stream;

public class Pipelines {
    public static void main(String[] args) {

        // Stream de números "aleatórios"
        Stream<Double> integerStream = Stream.generate(Math::random);

        // Filtre os números pares e positivos, ordenando e limitando a 10 elementos e, por fim, imprimindo o resultado
        integerStream                                   // [Fonte]
                .limit(10)                      // [Operação]
                .map(x -> {                             // [Operação]
                    x *= 10;
                    return (x *=10).intValue();
                })
                .filter(y -> (y > 0) && (y % 2 == 0))   // [Operação]
                .sorted()                               // [Operação]
                .forEach(System.out::println);          // [Transformação]
    }
    // [Fonte do dado] ===> [Operação] ===> [Transformação]
}
