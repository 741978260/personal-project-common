package designpattern.Builder;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/13
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
