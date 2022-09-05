import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int testCase = Integer.parseInt(br.readLine());

        List<String> inputs = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {

            inputs.add(br.readLine());

        }


        final String ans = inputs.stream()

                .map(input -> isValidPassword(input) ? "yes" : "no")

                .collect(Collectors.joining("\n"));

        System.out.print(ans);

    }

    private static boolean isValidPassword(String input) {

        return input.length() >= 6 && input.length() <= 9;

    }

}