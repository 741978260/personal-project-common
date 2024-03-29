package designpattern.factorymethod;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/13
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {

        try {
            Product a;
            AbstractFactory af;

            af = (AbstractFactory) ReadXML1.getObject();
            a = af.newProduct();

            a.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
