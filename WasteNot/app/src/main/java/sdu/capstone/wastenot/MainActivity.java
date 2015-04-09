package sdu.capstone.wastenot;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.AdapterView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Spinner list;
    private DataStorage data = new DataStorage();
    private boolean isSpinnerTouched = false;

ArrayList<Center> Shingles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Shingles = data.getType("shingles");

      //  final ListView lv = (ListView) findViewById(R.id.rcListView);
     //   lv.setAdapter(new MyCustomBaseAdapter(this, Shingles));
        initSpinner();

    }



    public void initSpinner() {
        list = (Spinner) findViewById(R.id.list_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.recycle_array, android.R.layout.simple_spinner_item);
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            // Apply the adapter to the spinner
            list.setAdapter(adapter);
            //list.setOnItemSelectedListener(new SpinnerListener(getApplicationContext()));

        list.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                isSpinnerTouched = true;
                return false;
            }
        });


            list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                    if(!isSpinnerTouched) return;
                    Toast.makeText(parent.getContext(), "Selected Category : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), ListActivity.class);
                    i.putExtra("Type", parent.getItemAtPosition(pos).toString());
                    startActivity(i);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // Another interface callback
                }
            });
        }
/*

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
        Toast.makeText(parent.getContext(), "Selected Category : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(), ListActivity.class);
        i.putExtra("Type",parent.getItemAtPosition(pos).toString());
        startActivity(i);
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
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
