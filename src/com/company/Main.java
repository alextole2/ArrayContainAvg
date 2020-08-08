package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            numbers.add(scanner.nextInt());
        }
        int sum = numbers
                .stream()
                .reduce(0, Integer::sum);
        BigDecimal avg = new BigDecimal(sum / N);
        System.out.print(avg);
    }
}
