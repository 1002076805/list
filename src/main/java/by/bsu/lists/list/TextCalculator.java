package by.bsu.lists.list;

import java.util.List;
import java.util.stream.Collectors;

public class TextCalculator {

    public List<String> findWordsThatHasA(List<String> text) {
        return text.stream().filter(X ->X.contains("a") ).collect(Collectors.toList());
    }

    public List<String> findWordsThatStartWithCapital(List<String> text) {
        return text.stream().filter(X ->X.matches("^[A-Z][a-z]+$") ).collect(Collectors.toList());
    }

    public List<Integer> findNumberThatgreaterThanX(List<Integer> number,int x) {
        return number.stream().filter(X ->X>x ).collect(Collectors.toList());
    }

}
