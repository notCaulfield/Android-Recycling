package sdu.capstone.wastenot;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;


/**
 * Created by Holden on 3/1/2015.
 */
public class SpinnerListener implements OnItemSelectedListener {

    @Override
    public void onItemSelected(AdapterView parent, View view, int pos, long id) {
        Toast.makeText(parent.getContext(), "Selected Category : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView parent) {

    }


}
