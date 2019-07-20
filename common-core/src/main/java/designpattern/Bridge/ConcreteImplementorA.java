package designpattern.Bridge;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/20
 */
//具体实现化角色
public class ConcreteImplementorA implements Implementor {
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问" );
    }
}
