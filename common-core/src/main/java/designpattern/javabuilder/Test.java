package designpattern.javabuilder;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/10
 */
public class Test {
    public static void main(String[] args) {

        //Java Builder模式 链式
        final Person person = new Person.Builder().name("彩礼").age(18).sex(false).build();
        System.out.println(person.getAge() + "/" + person.getName() + "/" + person.isSex());
    }
}
