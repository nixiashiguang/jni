package lesson.ndkjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 1、新建好类HiJni然后创建好native方法。
 * 2、打开命令行进入../Ndk_jni/app/src/main/java 目录下
 * 3、编译HiJni.java 输入命令 javac lesson/ndk_jni/HiJni.java
 *    输入javah lesson.ndk_jni.HiJni 生成lesson_ndk_jni_HiJni.h文件。
 *              (1)在.h文件中函数名的格式是 java_包名类名方法名
 *              (2)JNIEnv * 是一个指向jni环境的指针，通过他可以访问JNI接口提供的方法。
 *              (3)jobjcet指的是调用该方法的对象也就是java中的this。
 *              (4)JNIEXPORT和JNICALL：jni中定义的宏；
 *              (5)extern “C”表示内部采用C语言的命名风格。
 * 4、实现声明的native方法，并配置Android.mk和Application.mk文件，然后创建jni目录，将.h文件复制到该目录下，
 *      并创建.c文件和Android.mk和Application.mk文件
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HiJni.setIntoJni("你好啊xxx");
      //但警方立刻电视机flak手机费老卡机

    }
}
