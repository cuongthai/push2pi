package org.pestrada.android_tdd_playground;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
public class MainActivity extends Activity {

  /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  /**
  public void changeText(View view) {
    TextView textView = (TextView) findViewById(R.id.textView1);
    textView.setText("new text");
  }
  */

}
