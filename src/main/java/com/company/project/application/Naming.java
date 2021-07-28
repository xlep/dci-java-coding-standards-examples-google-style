package com.company.project.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Example class that no longer contains bad style.
 */
public class Naming {

  // constants should use all capital letters
  public static final String DATE_PATTERN_CONSTANT = "dd.MM.yyyy";

  // method names start with a lowercase letter
  public static boolean isTrue() {
    return true;
  }

  // parameter names should use CamelCase
  public static boolean isBoolean(Boolean inputValue) {
    return inputValue instanceof Boolean;
  }

  public Date parseDateString(String inputString) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN_CONSTANT);
    return dateFormat.parse(inputString);
  }

}
