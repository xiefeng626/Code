package DesignPattern.builder.theory;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();

        Director director = new Director(builder);

        //指挥者需要什么产品 具体的操作他不管 由建造者去创建
        Product product = director.construct();

        product.show();
    }
}
