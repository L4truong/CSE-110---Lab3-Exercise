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

        //Button button = (Button) mainActivity.findViewById(R.id.button);
        //button.callOnClick();

        //EditText editText1 = (EditText) mainActivity.findViewById(R.id.text);
        //EditText editText2 = (EditText) mainActivity.findViewById(R.id.text2);
        //int num1 = Integer.parseInt(editText1.getText().toString());
        //int num2 = Integer.parseInt(editText2.getText().toString());
        //TextView textView = (TextView) mainActivity.findViewById(R.id.textView);
        //int tester = Integer.parseInt(textView.getText().toString());
        int num1 = 20;
        int num2 = 20;
        int sum = mainActivity.add(num1, num2);

        assertEquals(40, sum);
    }
}
