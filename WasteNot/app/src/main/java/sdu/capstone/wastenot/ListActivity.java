package sdu.capstone.wastenot;

import android.app.Activity;
import android.content.Intent;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Holden on 4/9/2015.
 */
public class ListActivity extends Activity {
    DataStorage data = new DataStorage();
    ArrayList<Center> centers;
    double currLat, currLng = 0;
   // Geocoder geocoder = new Geocoder(getApplicationContext());
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        Bundle extras = getIntent().getExtras();
        String type = null;
        boolean sortBy = false; //false is the default Alphabetical Order
        if (extras != null) { //Don't really need this, but whatever
            type = extras.getString("Type");
            sortBy = extras.getBoolean("SortBy");
        }

        centers = data.getType(type);
        if(sortBy) { //Execute if sortBy is true - sortBy location/distance
            Location currLocation = (Location) extras.get("Location"); //Should work
            for(Center location : centers) {
                location.calcDistance(currLocation);
            }
            Collections.sort(centers, new LocationComparator());
        }

        setContentView(R.layout.activity_list);
        EditText title = (EditText) findViewById(R.id.title);
        title.setText(type + " Recycling");

        final ListView lv = (ListView) findViewById(R.id.rcListView);
        final MyCustomBaseAdapter adapter = new MyCustomBaseAdapter(this, centers);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Center item = (Center) adapter.getItem(position);

                Intent intent = new Intent(getApplicationContext(),DisplayActivity.class);
                //based on item add info to intent
                intent.putExtra("Center", item);
                startActivity(intent);
            }
        });

    }

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

