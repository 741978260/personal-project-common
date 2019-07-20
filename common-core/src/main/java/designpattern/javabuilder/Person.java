package designpattern.javabuilder;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/10
 *
 * Java Builder模式
 * 主要是用一个内部类去实例化一个对象，避免一个类出现过多构造函数，而且构造函数如果出现默认参数的话，很容易出错
 *
 */
public class Person {
    private String name;
    private int age;
    private boolean sex;

    private Person(Builder builder) {
        name = builder.name;
        age = builder.age;
        sex = builder.sex;
    }

    //    public Person(String name){}
//    public Person(String name, int age){}
//    public Person(String name, int age, boolean sex){}
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean isSex() {
        return sex;
    }

    static class Builder{
        private String name;
        private int age;
        private boolean sex;

        public Builder name(String n){
            this.name = n;
            return this;
        }
        public Builder age(int a){
            this.age = a;
            return this;
        }
        public Builder sex(boolean s){
            this.sex = s;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }


}
