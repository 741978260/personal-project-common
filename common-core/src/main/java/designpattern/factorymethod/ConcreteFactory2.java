package designpattern.factorymethod;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/13
 */
public class ConcreteFactory2 implements AbstractFactory {
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
