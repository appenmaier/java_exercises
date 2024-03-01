package ntu.model;

/**
 * Autor
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Author {

  private String email;
  private char gender;
  private String name;

  public Author(String name, String email, char gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public char getGender() {
    return gender;
  }

  public String getName() {
    return name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Author [email=" + email + ", gender=" + gender + ", name=" + name + "]";
  }

}
