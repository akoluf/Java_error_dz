import java.io.IOException;

public class DataProcessor {
    private final DataReader reader;
    private final DataValidator validator;
    private final DataWriter writer;

    public DataProcessor() {
        this.reader = new DataReader();
        this.validator = new DataValidatorImpl();
        this.writer = new DataWriter();
    }

    public void processData() {
        try {
            String[] data = reader.readData();
            validator.validate(data);
            writer.writeDataToFile(data);
        } catch (IllegalArgumentException | IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}