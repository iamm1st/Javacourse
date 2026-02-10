package lesson14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LongestWordFinder {

    public static void main(String[] args) {

        String inputFile = "src/lesson14/Romeo-and-Juliet-William-Shakespeare.txt";
        String outputFile = "src/lesson14/result.txt";

        String longestWord = "";

        // try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {

            String line;

            while ((line = reader.readLine()) != null) {

                // убир. знаки преп. и разб. строку на слова
                String[] words = line.replaceAll("[^a-zA-Z]", " ").split("\\s+");

                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        }

        catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write("Самое длинное слово:\n");
            writer.write(longestWord);
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла");
            e.printStackTrace();
        }

        System.out.println("Готово! Самое длинное слово записано в файл result.txt");
    }
}