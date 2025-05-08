package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Calculates the sum of unique elements in an array. <br>
 * Example: <br>
 * Input: [5, 6, 7, 8, 5, 5, 8, 8, 7]<br>
 * Output: 26
 */
class B_SumOfUniqueNumbers {

  @Test
  void testSumOfUniqueDigitsTest() {
    final var input = List.of(5, 6, 7, 8, 5, 5, 8, 8, 7);
    long mySolution = NumbersProblemSolution.sumOfUniqueNumbers(input);
    long yourSolution = input.stream().distinct().reduce(0, (a, b) -> a + b);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
