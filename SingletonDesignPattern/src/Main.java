public class Main {
    public static void main(String[] args) {
        SingletonPattern singletonPattern1 = SingletonPattern.getSingletonInstance();

        System.out.println(singletonPattern1.creativeMethod());
    }
}