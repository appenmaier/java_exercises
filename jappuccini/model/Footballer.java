package jappuccini.model;

import java.time.LocalDate;

/**
 * Fussballer
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Footballer(String name, Position position, LocalDate birthdate, int sizeInCm,
    FootballClub footballClub, int numberOfGames, int numberOfGoals) {

}
