package exc07.prb02;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shell {
    String status = System.getProperty("user.dir");
    private Directory workingDirectory;

    public Shell() {
    }

    // ls
    public void listStatus() throws IOException {
        String folderPath = status;
        Path folder = Paths.get(folderPath);
        DirectoryStream<Path> files = Files.newDirectoryStream(folder);
        List<Path> filesAndFolders = new ArrayList<>();
        for (Path file : files) {
            filesAndFolders.add(file);
        }
        Collections.sort(filesAndFolders, (path1, path2) -> {
            try {
                return Files.getLastModifiedTime(path1).compareTo(Files.getLastModifiedTime(path2));
            } catch (IOException e) {
                return 0;
            }
        });
        for (Path file : filesAndFolders) {
            System.out.println(file.getFileName().toString());
        }
    }

    // pwd
    public void printWorkingDirectory() {
        System.out.println(System.getProperty("user.dir"));
    }

    // cd directory_name
    public void changeDirectory(String name) {
        Path newWorkingDirectoryPath;
        if(name.equals("..")){
            newWorkingDirectoryPath = Paths.get(status).getParent();
        }else {
            newWorkingDirectoryPath = Paths.get(status+"\\"+name);
        }
        System.setProperty(status, newWorkingDirectoryPath.toString());
        status = newWorkingDirectoryPath.toString();
    }

    // mkdir directory_name
    public void createDirectory(String name) throws IOException {
        String folderPath = status;
        Path folder = Paths.get(folderPath);
        if (!Files.exists(folder)) {
            Files.createDirectory(folder);
            System.out.println("Success");
        } else {
            System.out.println("Folder exist");
        }
    }

    // rmdir directory_name
    public Directory removeDirectory(String name) throws IOException {
        // دریافت مسیر فولدر مورد نظر
        String folderPath = status+"/"+name;

        // ایجاد یک شیء از کلاس Path
        Path folder = Paths.get(folderPath);

        // پاک کردن محتویات فولدر
        deleteFolder(folder);

        // چاپ پیام موفقیت
        System.out.println("فولدر با موفقیت حذف شد.");
        return null;
    }

    private static void deleteFolder(Path folder) throws IOException {
        if (Files.exists(folder)) {
            // دریافت لیست فایل ها و فولدرهای زیرمجموعه
            DirectoryStream<Path> files = Files.newDirectoryStream(folder);

            if (files != null) {
                // پاک کردن هر فایل یا فولدر زیرمجموعه
                for (Path file : files) {
                    if (Files.isDirectory(file)) {
                        deleteFolder(file);
                    } else {
                        Files.delete(file);
                    }
                }
            }

            // حذف فولدر اصلی
            Files.delete(folder);
        } else {
            // چاپ پیام خطا
            System.out.println("فولدر وجود ندارد.");
        }
    }

    // touch file_name
    public void createFile(String value)  {
        String filePath = status+"/"+value;

        Path file = Paths.get(filePath);

        if (!Files.exists(file)) {
            try {
                Files.createFile(file);
                System.out.println("Success");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("File exist");
        }
    }

    // rm file_name
    public File removeFile(String value) {
        String filePath = status+"/"+value;

        Path file = Paths.get(filePath);

        // حذف فایل
        try {
            Files.delete(file);

            // چاپ پیام موفقیت
            System.out.println("فایل با موفقیت حذف شد.");
        } catch (IOException e) {
            // چاپ پیام خطا
            System.out.println("خطا در حذف فایل: " + e.getMessage());
        }
        return null;
    }
}
