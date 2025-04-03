package jappuccini.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jappuccini.model.Student;

/**
 * IOStreams02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E790_IOStreams02 {

   private static File file;
   private static List<Student> students;

   @SuppressWarnings("resource")
   public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      file = new File("src/main/resources/students.bin");
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

   @SuppressWarnings("unchecked")
   public static void read() {
      try (FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
         students = (ArrayList<Student>) objectInputStream.readObject();
      } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
      }
   }

   public static void write() {
      try (FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
         objectOutputStream.writeObject(students);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

}
