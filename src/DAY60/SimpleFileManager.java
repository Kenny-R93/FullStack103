package DAY60;

import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;


public class SimpleFileManager {
    //format date and time
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the path of the directory:");
        String inputPath = scanner.nextLine();

        try {
            Path directoryPath = Paths.get(inputPath);
            if (!Files.isDirectory((directoryPath))) {
                System.out.println("Invalid directory path entered.");
            }

            boolean exit = false;
            while (!exit) {  // 1. Display the contents of a specified directory, including file names, file sizes, and last modified dates
                System.out.println("Select an option");
                System.out.println("1. Display Directory Contents");
                System.out.println("2. Search for a file");
                System.out.println("3. Create a Directory");
                System.out.println("4. Delete a Directory");
                System.out.println("5. Copy a file");
                System.out.println("6. Move a file");
                System.out.println("7. Delete a file");
                System.out.println("8. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        displayDirectoryContents(directoryPath);
                        break;
                    case 2:
                        System.out.println("Enter the file name or extension to search for:");
                        String searchTerm = scanner.nextLine();
                        searchFiles(directoryPath, searchTerm);
                        break;
                    case 3:
                        System.out.println("Enter the name of the new directory:");
                        String newDir = scanner.nextLine();
                        createDirectory(directoryPath.resolve(newDir));
                        break;
                    case 4:
                        System.out.println("Enter the name of the directory to delete:");
                        String dirToDelete = scanner.nextLine();
                        deleteDirectory(directoryPath.resolve(dirToDelete));
                        break;
                    case 5:
                        System.out.println("Enter the source file name:");
                        String sourceFile = scanner.nextLine();
                        System.out.println("Enter the target file name:");
                        String targetFile = scanner.nextLine();
                        copyFile(directoryPath.resolve(sourceFile), directoryPath.resolve(targetFile));
                        break;
                    case 6:
                        System.out.println("Enter the source file name:");
                        String srcFile = scanner.nextLine();
                        System.out.println("Enter the target file name:");
                        String tgtFile = scanner.nextLine();
                        moveFile(directoryPath.resolve(srcFile), directoryPath.resolve(tgtFile));
                        break;
                    case 7:
                        System.out.println("Enter the name of the directory to delete:");
                        String fileToDelete = scanner.nextLine();
                        deleteFile(directoryPath.resolve(fileToDelete));
                        break;
                    case 8:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option");

                }

            }

        } catch (InvalidPathException e) {
            System.out.println("Invalid path: " + e.getMessage());
        }

    }
    // 1. Display the contents of a specified directory, including file names, file sizes, and last modified dates
    private static void displayDirectoryContents(Path directoryPath) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directoryPath)) {
            System.out.println("\nDirectory contents:");
            for (Path entry : stream) {
                BasicFileAttributes attrs = Files.readAttributes(entry, BasicFileAttributes.class);
                String type = attrs.isDirectory() ? "DIR" : "FILE";
                long size = attrs.size();
                LocalDateTime lastModified = LocalDateTime.ofInstant(attrs.lastModifiedTime().toInstant(), ZoneOffset.UTC);
                System.out.printf("%-10s %-10d %-20s %s%n", type, size, lastModified.format(formatter), entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error reading directory contents: " + e.getMessage());
        }
    }

    private static void searchFiles(Path dir, String searchTerm) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, searchTerm)) {
            System.out.println("\nSearch results:");
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error searching for files: " + e.getMessage());
        }
    }



    private static void createDirectory(Path dir) {
        try {
            Files.createDirectory(dir);
            System.out.println("Directory created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating directory: " + e.getMessage());
        }
    }

    private static void deleteDirectory(Path dir) {
        try {
            Files.delete(dir);
            System.out.println("Directory deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error deleting directory: " + e.getMessage());
        }
    }

    private static void copyFile(Path source, Path target) {
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }

    private static void moveFile(Path source, Path target) {
        try {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            System.out.println("Error moving file: " + e.getMessage());
        }
    }

    private static void deleteFile(Path file) {
        try {
            Files.delete(file);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error deleting file: " + e.getMessage());
        }
    }
}
