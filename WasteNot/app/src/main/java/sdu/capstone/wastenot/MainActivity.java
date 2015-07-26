package sdu.capstone.wastenot;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {
    private Spinner list;
    private boolean isSpinnerTouched = false;
    private ToggleButton toggle;
    private boolean sortByLocation = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initSpinner();
        initButton();
    }

    public void initButton() {
        toggle = (ToggleButton) findViewById(R.id.toggleButton);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                sortByLocation = isChecked;
                /*if (sortByLocation) {
                    System.out.println("Location");
                } else {
                    System.out.println("Alphabetical");
                }*/
            }
        });
    }

    public void initSpinner() {
        list = (Spinner) findViewById(R.id.list_spinner);
        //list.setSelection(0);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.recycle_array, android.R.layout.simple_spinner_item);
        //ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(getApplicationContext(), R.layout.spinner_item,R.id.list_spinner);
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            // Apply the adapter to the spinner
            list.setAdapter(adapter);

        list.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                list.setSelection(0);
                isSpinnerTouched = true;
                return false;
            }
        });


            list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                    if(!isSpinnerTouched) return;
                    if(!parent.getItemAtPosition(pos).toString().equals("Select a Type")) {
                        Toast.makeText(parent.getContext(), "Selected Category : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(getApplicationContext(), ListActivity.class);
                        i.putExtra("Type", parent.getItemAtPosition(pos).toString());
                        i.putExtra("SortBy", sortByLocation);
                        startActivity(i);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // Another interface callback
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
