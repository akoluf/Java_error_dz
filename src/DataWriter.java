import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {
    public void writeDataToFile(String[] data) throws IOException {
        String surname = data[0];
        File file = new File(surname + ".txt");
        FileWriter writer = new FileWriter(file, true);
        writer.write("<" + data[0] + ">" + "<" + data[1] + ">" + "<" + data[2] + ">" + "<" + data[3] + ">" + "<" + data[4] + ">" + "<" + data[5] + ">" + "\n");
        writer.close();
        System.out.println("Данные успешно записаны в файл " + file.getName());
    }
}