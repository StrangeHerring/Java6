package geekbrains.java6;

public class Cat extends Animals {
    double jumprange = 2;
    int runrange = 200;
    int swimrange = 0;
    @Override
    void jump(){
        System.out.println("Кошка прыгнула на " + jumprange);
    }
    void run(){
        System.out.println("Кошка пробежала" + runrange);
    }
    void swim(){
        System.out.println("Кошка проплыла" + swimrange);
    }
}
class Cat_action {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.jump();
        cat.run();
        cat.swim();
    }
}