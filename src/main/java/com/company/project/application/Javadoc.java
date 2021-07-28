package com.company.project.application;

/**
 * Example class that no longer contains bad style.
 */
// each public class (and each of their public members) need a Javadoc comment describing their use
public class Javadoc {

  /**
   * Evaluates if the input number is greater than zero.
   *
   * @return true if the input number is positive (greater than zero)
   */
  // @-statements in Javadoc should never be empty
  public boolean isPositive(int input) {
    return (input > 0);
  }

  /**
   * Evaluates if the first input number is greater than the second input. Returns true if the
   * first number is greater, false otherwise.
   */
  // make sure that you do not break the line limit in your code and documentation
  public boolean isGreaterThan(double firstNumber, double secondNumber) {
    return (firstNumber > secondNumber);
  }

}
