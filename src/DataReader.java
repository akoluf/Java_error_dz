import java.util.Scanner;

public class DataReader {
    private final Scanner scanner;

    public DataReader() {
        this.scanner = new Scanner(System.in);
    }

    public String[] readData() {
        System.out.println("Введите следующие данные в указанном порядке, разделенные пробелом:");
        System.out.println("Иванов Иван Иванович 01.02.1990 79000000000 m");
        String input = scanner.nextLine();
        return input.split(" ");
    }

    public void close() {
        scanner.close();
    }
}