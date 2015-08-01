package sdu.capstone.wastenot;

import android.location.Location;

import java.io.Serializable;

/**
 * Created by Holden on 3/15/2015.
 */
public class Center implements Serializable {
    private String name = null;
    private String address = null;
    private String phone = null;
    private String email = null;
    private String website = null;
    private double lat, lng = 0;
    private double distance = 0;
   /// private String[] types = null; // Storing types by external array Very Important (create separately for safety)


    //If an element is not present, null will be in it's place
    public Center(String name, String address, String phone, String email, String website, double lat, double lng) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.website = website;
        this.lat = lat;
        this.lng = lng;
    }


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

    public String getPhone() {

        return phone;
    }

    public String getAddress() {

        return address;
    }

    public String getName() {

        return name;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public double getDistance() { return distance; }

    public void calcDistance(Location currLocation) {
        //TODO -- MATH
        Location centerLocation = new Location(""); //Provider name is not needed
        centerLocation.setLatitude(lat);
        centerLocation.setLongitude(lng);
       // System.out.println(currLocation);
       // System.out.println(centerLocation);
        distance = currLocation.distanceTo(centerLocation);
    }

}
