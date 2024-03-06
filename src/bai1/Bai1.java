//Viết chương trình Java để ghi một chuỗi dữ liệu vào một file
// bằng cách sử dụng lớp OutputStream trong package java.io.

package bai1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        try {
            OutputStream fos = new FileOutputStream("data.txt");
            fos.write(data.getBytes(StandardCharsets.UTF_8));
            fos.close();
            System.out.println("Ghi file thanh cong.");
        } catch (IOException e) {
            System.out.println("Khong doc duoc file.");
        }
    }
}
