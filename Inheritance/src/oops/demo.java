package oops;
class Animal{
    void run(){
        System.out.println("I am running!");
    }
}
class cow extends Animal {
    void eat() {
        System.out.println("Cow like to eat a grass");
    }
}
    public class demo {
        public static void main(String[] args) {
            cow c=new cow();
            c.eat();
            c.run();
        }
    }