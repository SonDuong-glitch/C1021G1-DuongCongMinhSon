package week5.behavioral_design_pattern.thuchanh.StrategyPattern;

import java.util.List;

public class MergeSort implements SortStrategy{
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Merge Sort");
    }
}
