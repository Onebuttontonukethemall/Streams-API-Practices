package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import com.github.streams.practice.numbers.problems.ignore.data.DummyData;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class K_IntArray2DToListConverter {
  @Test
  void convertInt2DArrayToList() {
    final int[][] input = DummyData.random2DPrimitiveArray();

    var mySolution = NumbersProblemSolution.convertInt2DArrayToList(input);
    var yourSolution = Arrays.stream(input).map(i -> Arrays.stream(i).boxed().toList()).toList();

    System.out.println(mySolution);
    System.out.println(yourSolution);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
