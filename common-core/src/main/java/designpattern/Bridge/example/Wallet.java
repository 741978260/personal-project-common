package designpattern.Bridge.example;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/20
 */
public class Wallet extends Bag {
    public String getName() {
        return color.getColor();
    }
}
