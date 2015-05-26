package sdu.capstone.wastenot;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import java.util.Locale;

/**
 * Created by Holden on 4/9/2015.
 * Perfected by Vinny on 4/11/2015
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

        //Like this....
        textView.setText(center.getName());

        final String address = center.getAddress();
        //address.replace('\n', ' ');
        final TextView textViewAddress = (TextView) findViewById(R.id.textViewAddress);
        textViewAddress.setText(address);
        //textViewAddress.setText(Html.fromHtml("<u>" + address + "</u>"));
        textViewAddress.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                address.replace(' ', '+');
                address.replace('\n', '+');
                address.replace(',', '+');
                String uri = String.format(Locale.ENGLISH, "geo:0,0?q=%s", address);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

        final String phoneNumber = center.getPhone();
        if(phoneNumber != null) {
            final TextView textViewPhone = (TextView) findViewById(R.id.textViewPhone);
           // textViewPhone.setText(phoneNumber);
            textViewPhone.setText(Html.fromHtml("<u>" + phoneNumber + "</u>"));
            textViewPhone.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));
                    startActivity(intent);
                }
            });
        }

        final String email = center.getEmail();
        if(email != null) {
            final TextView textViewEmail = (TextView) findViewById(R.id.textViewEmail);
           // textViewEmail.setText(email);
            textViewEmail.setText(Html.fromHtml("<u>" + email + "</u>"));
            textViewEmail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("message/rfc822");
                    intent.putExtra(Intent.EXTRA_EMAIL, new String[] { email });
                    if(intent.resolveActivity(getPackageManager()) != null)
                        startActivity(intent);
                }
            });
        }

        final String website = center.getWebsite();
        if(website != null) {
            final TextView textViewWebsite = (TextView) findViewById(R.id.textViewWebsite);
         //   textViewWebsite.setText(website);
            textViewWebsite.setText(Html.fromHtml("<u>" + website + "</u>"));
            textViewWebsite.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Uri webpage = Uri.parse("http:" + website);
                    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(intent.resolveActivity(getPackageManager()) != null)
                        startActivity(intent);
                }
            });
        }

        //Want to remember null checks, and to display:
        //Name, address (onClick GMaps), phone (call), email (duh), website (link) -- all is interactive
    }
}
