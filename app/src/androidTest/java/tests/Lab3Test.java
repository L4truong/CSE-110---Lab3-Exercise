package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.l4truong.lab3.MainActivity;
import com.example.l4truong.lab3.R;

/**
 * Created by l4truong on 4/13/2016.
 */
public class Lab3Test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public Lab3Test() {

        super(MainActivity.class);

    }

    public void test_first() {
        mainActivity = getActivity();

        assertEquals(mainActivity.subtract(50, 40), 10);
        assertEquals(mainActivity.subtract(121, 41), 80);

    }
}
