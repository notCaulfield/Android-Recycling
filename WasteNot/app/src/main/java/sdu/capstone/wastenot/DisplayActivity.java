package sdu.capstone.wastenot;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by Holden on 4/9/2015.
 */
public class DisplayActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_display);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        Bundle extras = getIntent().getExtras();
        Center center = null;
        if (extras != null) { //Don't really need this, but whatever
            center = (Center) extras.getSerializable("Center");
        }


        setContentView(R.layout.activity_display);
        final TextView textView = (TextView) findViewById(R.id.displayView);
        textView.setText(center.getName());
    }
}
