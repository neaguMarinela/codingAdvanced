package absint;

/**
 * An interface could extend one or more interfaces, yet optional
 *
 */
public interface AnInterface extends OtherInterface, SomeOtherInterface {
    
	public static int STATIC_FIELD_1 = 1;
    public static String STATIC_FIELD_2 = "STATIC_FIELD_2";
    
    public String var_1 = null;
    public String var_2 = null;
    
    // other Object fields of any type

}
