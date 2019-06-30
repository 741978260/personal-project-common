package designpattern.strategypattern;

/**
 * <p>抽象策略角色</p>
 * Created by Lenovo on 2019/6/27
 */
public interface CalculateStrategy {
    //拥有一个计算的方法或行为
    int doOperation(int a, int b);
}
