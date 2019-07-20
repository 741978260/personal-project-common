package designpattern.factorymethod;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/13
 */
public class ConcreteFactory1 implements AbstractFactory {
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
