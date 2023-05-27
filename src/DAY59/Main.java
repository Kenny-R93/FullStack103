package DAY59;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            // 1. Read integers from two text files called "input1.txt" and "input2.txt". Each integer is on a new line in the respective files.
            BufferedReader input1 = new BufferedReader(new FileReader("src/DAY59/input1.txt"));
            BufferedReader input2 = new BufferedReader(new FileReader("src/DAY59/input2.txt"));
            BufferedWriter merged = new BufferedWriter(new FileWriter("src/DAY59/merged.txt")); // Creates m

            mergeBothFiles(input1, input2, merged); // 2. Merge the contents of the two input files, Merge the contents of the two input files, maintaining the original order of the integers, and write the result to a new text file called "merged.txt".
            printNumbersInConsole();                // 3. Identify the integers that are present in both input files.
            commonIntegers();

        } catch (                                   // 5. Handle any exceptions that might occur during the process, such as FileNotFoundException, IOException, and NumberFormatException
                FileNotFoundException e) {
            System.err.println("One or more input files not found! Please ensure the file is located in the selected directory." + e.getMessage());
        } catch (IOException e) {
            System.err.println("Input/Output Exception: "+ e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format in file. If a space is taking a line, remove the space. Only integers should be in this file. " + e.getMessage());
        }
    }

    private static void mergeBothFiles(BufferedReader input1, BufferedReader input2, BufferedWriter merged) {
        String first;
        String second;

        try {
            while (true) {
                first = input1.readLine();
                second = input2.readLine();


                if (first == null && second == null) { // files cannot be null
                    break;
                }

                if (first != null) {
                    int number1 = Integer.parseInt(first); // buffer readers reads in String, use parseINT to convert
                    merged.write(first);                   // reads line from input1.txt, writes it into merged.txt
                    merged.newLine();                      // write onto next or new line
                }

                if (second != null) {
                    int number2 = Integer.parseInt(second); // buffer readers reads in String, use parseINT to convert
                    merged.write(second);                   // reads line from input2.txt, writes it into merged.txt
                    merged.newLine();                       // write onto next or new line
                }
            }
            System.out.println("Input1.txt and Input2.txt have been merged!"); // print in console to ensure it has worked
            input1.close(); // close the file after not using it anymore stream
            input2.close();
            merged.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format in file. If a space is taking a line, remove the space. Only integers should be in this file. " + e.getMessage() );
        }

    }


    private static void commonIntegers() {
        try {
            BufferedReader input1 = new BufferedReader(new FileReader("src/DAY59/input1.txt"));
            BufferedReader input2 = new BufferedReader(new FileReader("src/DAY59/input2.txt"));
            BufferedWriter common = new BufferedWriter(new FileWriter("src/DAY59/common.txt"));

            Set<Integer> commonIntegers = new HashSet<>(); // As the while loops run, the common numbers are added into the HashSet which does not take any duplicate values.

            String line;
            while ((line = input1.readLine()) != null) {   // input1 numbers (except duplicates) are put into the hashset
                int number = Integer.parseInt(line);
                commonIntegers.add(number);
            }


            while ((line = input2.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (commonIntegers.contains(number)) { // Here, number and commonIntegers come from input1 and is compared with contains(input2 line). If input2 contains same integers as input1, then below it writes into the common.txt file.
                    common.write(Integer.toString(number));
                    common.newLine();
                }
            }
            System.out.println(" "); // adding space to separate content in the console
            System.out.println("Common Integers from both txt files have been added to the common.txt file!");
            input1.close();
            input2.close();
            common.close();

        } catch (FileNotFoundException e) {
            System.err.println("One or more input files not found! Please ensure the file is located in the selected directory.");
        } catch (IOException e) {
            System.err.println("An error occurred while reading/writing the files. Please troubleshoot further why this is occurring.");
        } catch (NumberFormatException e) {
            System.err.println("One or more files contain invalid integers. If a space is taking a line, remove the space. Only integers should be in this file.");
        }
    }

    private static void printNumbersInConsole() { // only reading the integers in the file
        try {
            BufferedReader input1 = new BufferedReader(new FileReader("src/DAY59/input1.txt"));
            BufferedReader input2 = new BufferedReader(new FileReader("src/DAY59/input2.txt"));

            String consoleLine;

            System.out.println(" "); // adding space to separate content in the console
            System.out.println("Integers inside input1.txt:");
            while ((consoleLine = input1.readLine()) != null) {
                System.out.println(consoleLine);
            }

            System.out.println(" "); // adding space to separate content in the console
            System.out.println("Integers inside input2.txt:");
            while ((consoleLine = input2.readLine()) != null) {
                System.out.println(consoleLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


