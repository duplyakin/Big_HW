package proxycasheimpl.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)


public @interface Cache {
    CacheType cacheType();
    String filenamePrefix();
    boolean archive();
    Class<?>[] identityFields();
    long maxCollectionSize();
}
