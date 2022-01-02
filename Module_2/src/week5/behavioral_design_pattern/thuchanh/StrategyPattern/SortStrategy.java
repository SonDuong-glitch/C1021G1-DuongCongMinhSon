package week5.behavioral_design_pattern.thuchanh.StrategyPattern;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
