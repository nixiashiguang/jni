package lesson.jnichapter;

/**
 * created by link on 2017/5/26 : 23.
 * email : libingyang119@163.com
 */

public class JniHello {
    //记得要加static，否则会出现无法找到方法的错误
   static{
       System.loadLibrary("hi_jni");
    }
    public static native String jniTellMeWhy(String string);
}
