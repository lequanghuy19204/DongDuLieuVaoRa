//Tạo một đối tượng User với các thuộc tính: id (kiểu int), name (kiểu String), age (kiểu int).
//Lưu trữ thông tin của User vào file user.dat bằng cách sử dụng ObjectOutputStream.
// Đọc thông tin User từ file user.dat bằng cách sử dụng ObjectInputStream và
// hiển thị thông tin lên màn hình console.

package bai2;

import java.io.*;

public class Bai2 {
    public static void main(String[] args) {
        User user1 = new User(1, "le quang huy", 30);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/bai2/user.dat"))) {
            oos.writeObject(user1);
            System.out.println("Thông tin của User đã được ghi vào file user.dat.");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi thông tin User vào file: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/bai2/user.dat"))) {
            User userFromFile = (User) ois.readObject();
            System.out.println("Thông tin của User từ file user.dat:");
            System.out.println("ID: " + userFromFile.getId());
            System.out.println("Name: " + userFromFile.getName());
            System.out.println("Age: " + userFromFile.getAge());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi đọc thông tin User từ file: " + e.getMessage());
        }
    }
}
