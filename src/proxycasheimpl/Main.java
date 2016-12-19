package proxycasheimpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
	// write your code here
        Method m = Object.class.getDeclaredMethod("equals");
        Annotation[] annotations =m.getDeclaredAnnotations();
        //annotations[0].annotationType().

    }
}
