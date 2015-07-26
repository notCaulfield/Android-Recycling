package sdu.capstone.wastenot;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;

//import com.google.android.gms.maps.model.LatLng;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;

/**
 * Created by Holden on 3/15/2015.
 */
public class Center implements Serializable {
    private long id;
    private String name = null;
    private String address = null;
    private String phone = null;
    //private String fax = null;
    private String email = null;
    private String website = null;
   // private List<Address> locs = null; //For Lat-Long calcs
    private double lat, lng;
   // Geocoder geo = null;
    //LatLng point = null;
   /// private String[] types = null; // Storing types by external array Very Important (create separately for safety)


    //If an element is not present, null will be in it's place
    public Center(String name, String address, String phone,/* String fax,*/ String email, String website) {
        this.name = name;
        this.address = address;
        this.phone = phone;
       // this.fax = fax;
        this.email = email;
        this.website = website;
       // geo = new Geocoder(context);
      //  try {
       //     locs = geo.getFromLocationName(address, 5);
       //     if(locs.size() > 0) {
        //        lat = locs.get(0).getLatitude();
        //        lng = locs.get(0).getLongitude();
        //    }
        //}  catch (IOException e) {
            //
        //}
      //  this.loc = new Address(new Locale())
    }

    //Returns String Array
    /*public String[] getTypes() {
        return types;
    }

    //Takes in String Array containing types of materials accepted
    public void setType(String[] str) {
        types = str;
    }*/

    //Once made we only need to get values, not change them - thus only getters
    //If a getter returns null, then do not display for that value

    //This is a terrible hack - which was never used thankfully
   // public Center setGeocoderContext(Context context) {
    //    geo = new Geocoder(context);
    //    return this;
    //}

    public String getWebsite() {

        return website;
    }

    public String getEmail() {

        return email;
    }

    /*public String getFax() {

        return fax;
    }*/

    public String getPhone() {

        return phone;
    }

    public String getAddress() {

        return address;
    }

    public String getName() {

        return name;
    }

    public long getId() {

        return id;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

}
