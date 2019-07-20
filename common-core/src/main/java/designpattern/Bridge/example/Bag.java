package designpattern.Bridge.example;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/20
 */
//抽象化角色：包
public abstract class Bag {
    protected Color color;
    public void setColor(Color color){
        this.color = color;
    }
    public abstract String getName();
}
