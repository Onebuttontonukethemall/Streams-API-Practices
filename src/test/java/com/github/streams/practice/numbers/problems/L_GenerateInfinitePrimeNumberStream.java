package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class L_GenerateInfinitePrimeNumberStream {

  @Test
  void intStreamOfPrimeNumber() {
    final var mySolution = NumbersProblemSolution.generateIntStreamOfPrimeNumberStream(5);
    Predicate<Integer> isPrime = n -> {
      if(n <= 1) return false;
      for(int i = 2; i*i <= n; i++) {
        if(n%i == 0) {
          return false;
        }
      } return true;
    };
    final var yourSolution = IntStream.range(0, 12).filter(i -> isPrime.test(i)).boxed().toList();

    System.out.println(mySolution);


    Assertions.assertEquals(mySolution, yourSolution);
  }
}
