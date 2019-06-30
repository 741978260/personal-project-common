package designpattern.strategypattern;

/**
 * <p>策略模式主要由这三个角色组成，环境角色(Context)、抽象策略角色(Strategy)和具体策略角色(ConcreteStrategy)。
 * 环境角色(Context)：持有一个策略类的引用，提供给客户端使用。
 * 抽象策略角色(Strategy)：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
 * 具体策略角色(ConcreteStrategy)：包装了相关的算法或行为。</p>
 * 其主要目的是通过定义相似的算法，替换if else 语句写法，并且可以随时相互替换。
 *
 * 使用场景：
 * 如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为；
 * 一个系统需要动态地在几种算法中选择一种;
 * 如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现;
 * <p>
 * Created by Mumu on 2019/6/27
 */
//定义一个环境角色，提供一个计算的接口供客户端使用
public class CalculatorContext {
    private CalculateStrategy calculateStrategy;

    public CalculatorContext(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public int executeStrategy(int a, int b) {
        return calculateStrategy.doOperation(a, b);
    }

    public static void main(String[] args) {
        int a=4,b=2;
        CalculatorContext calculatorContext = new CalculatorContext(new OperationAdd());
        System.out.println(calculatorContext.executeStrategy(a,b));
    }
}
