package designpattern.Builder;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/13
 *
 * 它是包含多个组成部件的复杂对象，由具体建造者来创建其各个滅部件
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show()
    {
        //显示产品的特性
    }
}
