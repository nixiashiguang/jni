package lesson.gradlecompile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * 利用gradle编译jni。
 */
public class MainActivity extends AppCompatActivity {

    private String TAG = "jni";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: " + jniTellMeWhy("xxxxxx"));
    }
    private native String jniTellMeWhy(String str);

    static {
        System.loadLibrary("hi_jni");
    }
}
