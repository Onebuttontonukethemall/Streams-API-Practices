package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import com.github.streams.practice.numbers.problems.ignore.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class H_ReverseANumber {

  @Test
  void reverseANumber() {
    final var input = DummyData.fakerNumber();
    var mySolution = NumbersProblemSolution.reverseANumber(input);
    int yourSolution = Integer.parseInt(new StringBuilder(String.valueOf(input)).reverse().toString());
    System.out.println(yourSolution);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
