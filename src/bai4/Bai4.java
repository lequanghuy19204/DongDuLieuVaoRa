package bai4;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bai4 {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        String formattedDateTime = currentDateTime.format(formatter);

        String directoryName = "Thư mục của tôi";
        String fileName = "file_" + formattedDateTime + ".txt";

        File directory = new File(directoryName);
        if (!directory.exists()) {
            boolean directoryCreated = directory.mkdir();
            if (directoryCreated) {
                System.out.println("Thư mục mới đã được tạo: " + directory.getAbsolutePath());
            } else {
                System.out.println("Không thể tạo thư mục mới.");
                return;
            }
        }

        File file = new File(directory, fileName);
        try {
            boolean fileCreated = file.createNewFile();
            if (fileCreated) {
                System.out.println("Tệp mới đã được tạo: " + file.getAbsolutePath());
            } else {
                System.out.println("Không thể tạo tệp mới.");
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi tạo tệp mới: " + e.getMessage());
        }
    }
}

