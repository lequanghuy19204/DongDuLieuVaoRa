//Viết chương trình Java để đọc nội dung của một file text và
// đếm số lượng từ trong file đó bằng cách sử dụng lớp Reader và Writer.

package bai3;
import java.io.*;
public class Bai3 {
    public static void main(String[] args) {
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("src/bai3/Report.docx"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Số lượng từ trong tệp là: " + wordCount);
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc tệp: " + e.getMessage());
        }
    }
}
