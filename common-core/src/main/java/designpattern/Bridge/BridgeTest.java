package designpattern.Bridge;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/20
 */
public class BridgeTest {
    public static void main(String[] args) {
        Implementor imple = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imple);
        abs.Operation();
    }
}
