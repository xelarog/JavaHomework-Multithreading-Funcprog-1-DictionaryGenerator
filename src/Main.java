import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        // Реализация интерфейса Function, использование Stream API
        Function<String, List<String>> createDictionary = text -> {
            return Arrays.stream(text.split(" "))
                    .sorted()
                    .distinct()
                    .collect(Collectors.toList());
        };

        // Использование Function
        List<String> dict = createDictionary.apply(scanner.nextLine());

        // Применение Stream API
        dict.forEach(System.out::println);

    }
}


