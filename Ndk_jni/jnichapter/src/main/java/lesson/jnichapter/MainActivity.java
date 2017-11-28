package lesson.jnichapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * 命令行编译，进入jni目录下，执行ndk-build命令
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       String s =  JniHello.jniTellMeWhy("学习jni tell me why");
        Log.e(TAG, "onCreate: " + s);
    }


}
