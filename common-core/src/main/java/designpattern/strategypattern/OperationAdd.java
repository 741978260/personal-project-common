package designpattern.strategypattern;

/**
 * <p>具体策略角色并实现方法</p>
 * Created by Mumu on 2019/6/27
 */
public class OperationAdd implements CalculateStrategy {
    public int doOperation(int a, int b) {
        return a + b;
    }
}
