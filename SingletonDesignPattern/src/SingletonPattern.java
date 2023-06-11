public class SingletonPattern {
    static private SingletonPattern instance;
    private SingletonPattern(){

    }
    public static SingletonPattern getSingletonInstance(){
        if(instance == null){
            instance = new SingletonPattern();
        }
        return instance;
    }
    public String creativeMethod(){
        return "I am a creative method";
    }
}
