package tutego.model;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Eingaben
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Inputs implements Serializable {

  public static class Input implements Serializable {
    private static final long serialVersionUID = 1L;
    public String input;
  }

  private static final String PATH = "tutego/resources/inputs.bin";
  private static final long serialVersionUID = 1L;

  public static Inputs getInputs() {
    try (FileInputStream fileInputStream = new FileInputStream(new File(PATH));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
      Inputs inputs = (Inputs) objectInputStream.readObject();
      for (Input input : inputs.inputs) {
        System.out.println(input.input);
      }
      return inputs;
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (EOFException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new Inputs();
  }

  public List<Input> inputs = new ArrayList<>();

  private Inputs() {}

  public void addInput(Input input) {
    inputs.add(input);
    saveInputs();
  }

  private void saveInputs() {
    try (FileOutputStream fileOutputStream = new FileOutputStream(new File(PATH));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
      objectOutputStream.writeObject(this);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
