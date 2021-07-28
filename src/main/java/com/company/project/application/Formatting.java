package com.company.project.application;

import java.util.Calendar;
import java.util.Date;

/**
 * Example class that no longer contains bad style.
 */
public class Formatting {

  // indentation is +2 spaces for each level, enforcing this makes you code much easier to read
  public static final String DATE_PATTERN_GER = "dd.MM.yyyy";

  /**
   * Checks if the given date fits the current year. Returns true if that is the case.
   */
  public static boolean isCurrentYear(Date date) {
    Calendar calInput = Calendar.getInstance();
    calInput.setTime(date);

    Calendar calNow = Calendar.getInstance();

    // brackets should always be used with statements like if, else, while, ...
    if (calInput.get(Calendar.YEAR) == calNow.get(Calendar.YEAR)) {
      return true;
    }

    return false;
  }

  /**
   * Checks if the given date fits the current month. Returns true if that is the case.
   */
  // using the K&R style for blocks makes your code much easier to read
  public boolean isCurrentMonth(Date date) {
    Calendar calInput = Calendar.getInstance();
    calInput.setTime(date);

    Calendar calNow = Calendar.getInstance();

    return (calInput.get(Calendar.MONTH) == calNow.get(Calendar.MONTH));
  }


}
