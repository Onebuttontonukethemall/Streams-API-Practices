package com.github.streams.practice.strings.problems;

import com.github.streams.practice.strings.StringProblemsSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

class B_LargestWordTest {
  /**
   * Find the largest word in a given string. <br>
   * <br>
   * Example string:
   *
   * <pre>
   * Input: "I am interested123455 to grow in my organization"
   * Output: "interested123455"
   * </pre>
   *
   * @author ZahidKhan
   * @see StringProblemsSolution#findLargestWordInTheString(String)
   */
  @Test
  public void findLargestWordInTheString() {
    final String input = "I am interested123455 to grow in my organization";
    final String mySolution = StringProblemsSolution.findLargestWordInTheString(input);

    String yourSolution = Arrays.stream(input.split(" ")).reduce((b1, b2) -> b1.length() > b2.length() ? b1:b2).get();
    System.out.println(yourSolution);
    System.out.println(mySolution);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
