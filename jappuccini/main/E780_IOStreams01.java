package jappuccini.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jappuccini.model.Student;

/**
 * IOStreams01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E780_IOStreams01 {

   private static File file;
   private static List<Student> students;

   @SuppressWarnings("resource")
   public static void main(String[] args) throws IOException {

      Scanner scanner = new Scanner(System.in);

      file = new File("jappuccini/resources/students.txt");
      if (!file.exists()) {
         file.createNewFile();
      }

      students = new ArrayList<>();

      System.out.print("Moechtest Du Lesen (1) oder Schreiben (2): ");
      int answer = scanner.nextInt();

      if (answer == 1) {
         read();
      } else {
         Student student1 = new Student("Hans Maier", 19);
         Student student2 = new Student("Peter Mueller", 23);
         Student student3 = new Student("Lisa Schmid", 20);
         students.add(student1);
         students.add(student2);
         students.add(student3);
         write();
      }
      students.forEach(System.out::println);

   }

   public static void read() {
      try (FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
         String line;
         while ((line = bufferedReader.readLine()) != null) {
            String[] tokens = line.split(";");
            String name = tokens[0];
            int age = Integer.valueOf(tokens[1]);
            Student student = new Student(name, age);
            students.add(student);
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static void write() {
      try (FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
         for (Student s : students) {
            String line = s.name() + ";" + s.age();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

}
