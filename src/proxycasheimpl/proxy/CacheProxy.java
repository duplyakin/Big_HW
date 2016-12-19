package proxycasheimpl.proxy;

import com.lessonxxx.proxycasheimpl.annotations.CacheType;

import java.lang.reflect.Proxy;

public class CacheProxy {

    private CacheType cacheType;
    private String filenamePrefix;
    private boolean archive;
    private Class<?>[] identityFields;
    private long maxCollectionSize;


    public CacheProxy(){

    }



    public<T> T cache (Class<T> interfaceClass, T instance){

        CachingInvocationHandler handler = new CachingInvocationHandler(instance);
        T result = (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(),
                new Class[] { interfaceClass },
                handler);
        return result;

    }

}
