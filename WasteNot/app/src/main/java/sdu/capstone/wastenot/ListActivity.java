package sdu.capstone.wastenot;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by Holden on 4/9/2015.
 */
public class ListActivity extends Activity {
    //private Spinner list;
    private DataStorage data = new DataStorage();
    //ArrayList<Center> Shingles;
    ArrayList<Center> centers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        Bundle extras = getIntent().getExtras();
        String type = null;
        if (extras != null) { //Don't really need this, but whatever
            type = extras.getString("Type");
        }

        centers = data.getType(type);

        setContentView(R.layout.activity_list);
        //Shingles = data.getType("shingles");

        final ListView lv = (ListView) findViewById(R.id.rcListView);
        lv.setAdapter(new MyCustomBaseAdapter(this, centers)); //was Shingles
      //  initSpinner();

    }
/*
    public void initSpinner() {
        list = (Spinner) findViewById(R.id.list_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.recycle_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        list.setAdapter(adapter);
        list.setOnItemSelectedListener(new SpinnerListener());
    }
*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

