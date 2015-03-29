package sdu.capstone.wastenot;

/**
 * Created by Holden on 3/15/2015.
 */
public class Center {
    private long id;
    private String name = null;
    private String address = null;
    private String phone = null;
    //private String fax = null;
    private String email = null;
    private String website = null;
   /// private String[] types = null; // Storing types by external array Very Important (create separately for safety)


    //If an element is not present, null will be in it's place
    public Center(String name, String address, String phone,/* String fax,*/ String email, String website) {
        this.name = name;
        this.address = address;
        this.phone = phone;
       // this.fax = fax;
        this.email = email;
        this.website = website;
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

}
