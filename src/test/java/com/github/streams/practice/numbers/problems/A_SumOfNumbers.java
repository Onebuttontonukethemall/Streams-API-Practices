package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Calculates the sum of all elements in an integer array.
 *
 * <p>Example: <br>
 * Input: [5, 6, 7, 8]
 *
 * <p>Output: 26
 */
class A_SumOfNumbers {

  @Test
  void testSumOfUniqueDigitsTest() {
    final var input = List.of(5, 6, 7, 8, 5, 5, 8, 8, 7);
    long mySolution = NumbersProblemSolution.sumOfNumbers(input);
    long yourSolution = input.stream().reduce(0, (a, b) -> a + b);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
