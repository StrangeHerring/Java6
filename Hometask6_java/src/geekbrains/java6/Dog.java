package geekbrains.java6;

public class Dog extends Animals {
    double jumprange = 0.5;
    int runrange = 500;
    int swimrange = 10;
    @Override
    void jump(){
        System.out.println("Собака прыгнула на " + jumprange);
    }
    void run(){
        System.out.println("Собака пробежала" + runrange);
    }
    void swim(){
        System.out.println("Собака проплыла" + swimrange);
    }
}
class Dog_action{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.jump();
        dog.run();
        dog.swim();
    }
}

