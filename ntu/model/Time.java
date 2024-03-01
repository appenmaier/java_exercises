package ntu.model;

/**
 * Uhrzeit
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Time {

  private int hour;
  private int minute;
  private int second;

  public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }

  public Time nextSecond() {
    second++;

    if (second == 60) {
      second = 0;
      minute++;
    }

    if (minute == 60) {
      minute = 0;
      hour++;
    }

    if (hour == 24) {
      hour = 0;
    }

    return this;
  }

  public Time previousSecond() {
    second--;

    if (second == -1) {
      second = 59;
    }

    if (minute == -1) {
      minute = 59;
      hour--;
    }

    if (hour == -1) {
      hour = 23;
      second--;
    }

    return this;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  public void setTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  @Override
  public String toString() {
    return (hour < 10 ? "0" + hour : hour) + ":" + (minute < 10 ? "0" + minute : minute) + ":"
        + (second < 10 ? "0" + second : second);
  }

}
