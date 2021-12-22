package by.bsu.lists;

import by.bsu.lists.list.TextCalculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestCalculator {

    @Test
    public  void testFindWordsThatHasA(){
        List<String> input = Arrays.asList("apple","cat","dog");

        TextCalculator calculator = new TextCalculator();
        List<String> result = calculator.findWordsThatHasA(input);

        List<String> expect = Arrays.asList("apple","cat");
        Assert.assertEquals(expect,result);
    }

    @Test
    public  void testFindWordsThatHasANegative(){
        List<String> input = Arrays.asList("dor","windows","mouse");

        TextCalculator calculator = new TextCalculator();
        List<String> result = calculator.findWordsThatHasA(input);

        List<String> expect = Arrays.asList();
        Assert.assertEquals(expect,result);
    }

    @Test
    public  void testWordsThatStartWithCapital(){
        List<String> input = Arrays.asList("Apple","cat","dog");

        TextCalculator calculator = new TextCalculator();
        List<String> result = calculator.findWordsThatStartWithCapital(input);

        List<String> expect = Arrays.asList("Apple");
        Assert.assertEquals(expect,result);
    }

    @Test
    public  void testWordsThatStartWithCapitalNegative(){
        List<String> input = Arrays.asList("apple","cat","dog");

        TextCalculator calculator = new TextCalculator();
        List<String> result = calculator.findWordsThatStartWithCapital(input);

        List<String> expect = Arrays.asList();
        Assert.assertEquals(expect,result);
    }

    @Test
    public  void testNumberThatgreaterThanX(){
        List<Integer> resultThanX =Arrays.asList(11,22,44,66);

        TextCalculator calculator = new TextCalculator();
        List<Integer> result = calculator.findNumberThatgreaterThanX(resultThanX,15);

        List<Integer> expect = Arrays.asList(22,44,66);
        Assert.assertEquals(expect,result);
    }

    @Test
    public  void testNumberThatgreaterThanXNegative(){
        List<Integer> resultThanX =Arrays.asList(-14,11,22,44,-66);

        TextCalculator calculator = new TextCalculator();
        List<Integer> result = calculator.findNumberThatgreaterThanX(resultThanX,15);

        List<Integer> expect = Arrays.asList(22,44);
        Assert.assertEquals(expect,result);
    }

}
