package jappuccini.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Fussballer
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Footballer(String name, Position position, LocalDate birthdate, int sizeInCm,
    FootballClub footballClub, int numberOfGames, int numberOfGoals) {

  public static List<Footballer> getFootballers() {
    FootballClub vflWolfsburg = new FootballClub("VfL Wolfsburg", 3, 1145);
    FootballClub eintrachtFrankfurt = new FootballClub("Eintracht Frankfurt", 1, 1500);
    FootballClub chelseaFC = new FootballClub("Chelsea FC", -1, -1);
    FootballClub olympiqueLyon = new FootballClub("Olympique Lyon", -1, -1);
    FootballClub bayernMuenchen = new FootballClub("Bayern Muenchen", 4, 1058);

    List<Footballer> footballers = new ArrayList<>();

    footballers.add(new Footballer("Merle Frohms", Position.GOALKEEPER, LocalDate.of(1995, 1, 28),
        173, vflWolfsburg, 41, 0));
    footballers.add(new Footballer("Svenja Huth", Position.MIDFIELDER, LocalDate.of(1991, 1, 25),
        163, vflWolfsburg, 81, 14));
    footballers.add(new Footballer("Kathrin Hendrich", Position.DEFENDER, LocalDate.of(1992, 4, 6),
        174, vflWolfsburg, 59, 5));
    footballers.add(new Footballer("Sara Doorsoun", Position.DEFENDER, LocalDate.of(1991, 11, 17),
        170, eintrachtFrankfurt, 46, 1));
    footballers.add(new Footballer("Felicitas Rauch", Position.DEFENDER, LocalDate.of(1996, 4, 30),
        170, vflWolfsburg, 34, 4));
    footballers.add(new Footballer("Melanie Leupolz", Position.MIDFIELDER,
        LocalDate.of(1994, 4, 14), 173, chelseaFC, 79, 13));
    footballers.add(new Footballer("Sara Daebritz", Position.MIDFIELDER, LocalDate.of(1995, 2, 15),
        171, olympiqueLyon, 98, 17));
    footballers.add(new Footballer("Lina Magull", Position.MIDFIELDER, LocalDate.of(1994, 8, 15),
        164, bayernMuenchen, 73, 22));
    footballers.add(new Footballer("Jule Brand", Position.MIDFIELDER, LocalDate.of(2002, 10, 16),
        177, vflWolfsburg, 33, 7));
    footballers.add(new Footballer("Klara Buehl", Position.STRIKER, LocalDate.of(2000, 12, 7), 173,
        bayernMuenchen, 36, 15));
    footballers.add(new Footballer("Alexandra Popp", Position.STRIKER, LocalDate.of(1991, 4, 6),
        174, vflWolfsburg, 129, 64));

    return footballers;
  }

}
