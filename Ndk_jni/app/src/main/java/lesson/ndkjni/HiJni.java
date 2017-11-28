package lesson.ndkjni;

/**
 * created by link on 2017/5/26 : 50.
 * email : libingyang119@163.com
 *
 */

public class HiJni {
    static {
        System.loadLibrary("jni-test");
    }
    public static native String getFromJni();
    public static native void setIntoJni(String str);
}
