package computer;


public interface Video {

    void playVideo();
    void pauseVideo();
    void stopVideo();

    default void sayHello(){
        System.out.println("Hello from default Video");
    }
}
