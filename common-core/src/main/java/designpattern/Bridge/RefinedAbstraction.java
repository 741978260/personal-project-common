package designpattern.Bridge;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/20
 */
//扩展抽象化角色
public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    public void Operation() {
        imple.OperationImpl();
    }
}
