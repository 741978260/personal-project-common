package designpattern.Builder;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/13
 *
 * 实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
 *
 */
public class ConcreteBuilder extends Builder {
    public void buildPartA() {
        product.setPartA("建造 partA");
    }

    public void buildPartB() {
        product.setPartA("建造 partB");
    }

    public void buildPartC() {
        product.setPartA("建造 partC");
    }
}
