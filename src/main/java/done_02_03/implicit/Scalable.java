package done_02_03.implicit;

public interface Scalable {

    // implicitly public abstract
    public abstract void setScale(double scale);

    // implicitly public static final
    public static final double DEFAULT_SCALE = 1.0;


    // implicitly public
    public static boolean isScalable(Object obj) {
        return obj instanceof Scalable;
    }

    // implicitly public
    public default void resetScale() {
        setScale(DEFAULT_SCALE);
    }
}