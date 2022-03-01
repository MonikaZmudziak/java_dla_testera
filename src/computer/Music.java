package computer;



public interface Music {

    // Cannot create object fields
    // We can create only final fields -> by defatult public, static and final

    // public static final String NAME = "Music";

    String NAME ="MUSIC";

    // We can create only abstract methods (without body)

    //public abstract void playMusic();
    void playMusic();
    void pauseMusic();
    void stopMusic();

    // Java 8 - we can create methods with body but we have to use default methods

    default void sayHello(){
        System.out.println("Hello from default Music");
    }

    // public static methods

    static String getName(){
        privateMethod();
        return NAME;
    }

    // JAVA 9 - private static methods

    private static void privateMethod(){
        System.out.println("Hello from private method");
    }




}
