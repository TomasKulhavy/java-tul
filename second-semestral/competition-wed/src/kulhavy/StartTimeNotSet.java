package kulhavy;

public class StartTimeNotSet extends RuntimeException {

    // runtimeexception dědí z exception, není povinně ošetřovatelný
    
    public StartTimeNotSet(String msg) {
        super(msg);
    }
    
}
