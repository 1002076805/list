package by.bsu.lists.list;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple","cat","Dog");

        TextCalculator calculator = new TextCalculator();
        //findWordsThatHasA
        List<String> resultHasA = calculator.findWordsThatHasA(input);
        System.out.println(resultHasA);
        //findWordsThatHasA
        List<String> resultWithCapital = calculator.findWordsThatStartWithCapital(input);
        System.out.println(resultWithCapital);
        //findNumberThatgreaterThanX
        List<Integer> resultThanX =Arrays.asList(11,22,44,66);
        List<Integer> resultThatgreaterThanX = calculator.findNumberThatgreaterThanX(resultThanX,15);
        System.out.println(resultThatgreaterThanX);

    }

}
