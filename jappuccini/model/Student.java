package jappuccini.model;

import java.io.Serializable;

/**
 * Studierender
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public record Student(String name, int age) implements Serializable {

}
/* version 1.0: public record Student(String name, int age) {...} */
