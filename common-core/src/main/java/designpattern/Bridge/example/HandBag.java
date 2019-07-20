package designpattern.Bridge.example;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/20
 */
//扩展抽象化角色：挎包
public class HandBag extends Bag {
    public String getName() {
        return color.getColor() + "HandBag";
    }
}
