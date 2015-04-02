package sdu.capstone.wastenot;

import java.util.ArrayList;

/**
 * Created by Holden on 3/27/2015.
 */

/*
    Sample request for a name from DataStorage:
    DataStorage d = new DataStorage();
    d.getType("batteries").get(0).getName(); - Returns "Arundel Recycling Center, Inc."
    Everything is based off that. Use for each loops I guess...
 */
public class DataStorage {

    private ArrayList<Center> shingles = new ArrayList<Center>();
    private ArrayList<Center> bricks = new ArrayList<Center>(); //Damn son
    private ArrayList<Center> batteries = new ArrayList<Center>();
    private ArrayList<Center> cardboard = new ArrayList<Center>();
    //private ArrayList<Center> garden = new ArrayList<Center>();
    //private ArrayList<Center> dental = new ArrayList<Center>(); //Ignoring this for now.
    private ArrayList<Center> electronics = new ArrayList<Center>();
    private ArrayList<Center> fluorescents = new ArrayList<Center>();
    private ArrayList<Center> organics = new ArrayList<Center>();
    private ArrayList<Center> glass = new ArrayList<Center>();
    private ArrayList<Center> gypsum = new ArrayList<Center>();
    private ArrayList<Center> toners = new ArrayList<Center>();
    private ArrayList<Center> metals = new ArrayList<Center>();
    private ArrayList<Center> oil = new ArrayList<Center>();
    private ArrayList<Center> mercury = new ArrayList<Center>();
    private ArrayList<Center> paper = new ArrayList<Center>();
    private ArrayList<Center> plastics = new ArrayList<Center>();
    private ArrayList<Center> salvage = new ArrayList<Center>();
    private ArrayList<Center> unusual = new ArrayList<Center>();
    private ArrayList<Center> textiles = new ArrayList<Center>();
    private ArrayList<Center> tiles = new ArrayList<Center>();
    private ArrayList<Center> pallets = new ArrayList<Center>();
    private ArrayList<Center> wood = new ArrayList<Center>();
    private ArrayList<Center> other = new ArrayList<Center>();


    public DataStorage() {
        init();
    }

    private void init() {
        shinglesInit();
        bricksInit();
        batteriesInit();
        cardboardInit();
        elecInit();
        lampsInit();
    }


    private void shinglesInit() {
        shingles.add(new Center("Brandywine Enterprises", "5800 Sheriff Road\n" +
                "Fairmont Heights, MD 20743-6302",
                "(301) 925-8100", "bmcalwee@brandywineco.com", "Brenda McAlwee"));
        shingles.add(new Center("Reliable Contracting", "1 Churchview Road\n" +
                "Millersville, MD 21108",
                "(410) 987-0313", null, null));
        shingles.add(new Center("Roll-Off Express", "2900 Dede Road \n" +
                "Finksburg, MD 21048",
                "((410) 526-3535", "rolloffjack@aol.com", null));
        shingles.add( new Center("Roofs to Roads", "1005 Rising Ridge Road\n" +
                "Mt. Airy, MD 21771",
                "(301) 831-0888", null, "www.fromrooftoroad.com"));
        shingles.add(new Center("TurboHaul", "11700 Old Baltimore Pike\n" +
                "Beltsville, MD 207055",
                "(301) 931-6993", "kevindaly@turbohaul.com", null));
    }

    private void bricksInit() {
        bricks.add(new Center("Aggregate Industries", "8615 Dorsey Run Road\n" +
                "Jessup, MD 20794",
                "(301) 317-0300",  null, null));
        bricks.add(new Center("Alternative Aggregate Recycling, Inc.", "1001 Edison Highway\n" +
                "Baltimore, Md 21213",
                "(410) 483-1012", null, null));
        bricks.add(new Center("Aggregate Industries", "8615 Old Dorsey Run Road\n" +
                "Jessup, MD 20794",
                "(410) 483-1012",  null, null));
        bricks.add(new Center("Annapolis Junction", "8615 Old Dorsey Run Road\n" +
                "Jessup, MD 20794",
                "(301) 776-5900", null, null));
        bricks.add(new Center("Auston Contracting, Inc.", "1202 Pauls Lane\n" +
                "Joppa, MD 21085",
                "(410) 335-1016", "auston1@verizon.net", null));
        bricks.add(new Center("Baltimore Recycling Center", "1030 Edison Highway\n" +
                "Baltimore, MD 21213",
                "(410) 534-2990",  null, null));
        bricks.add(new Center("Barnabas Stone", "4714 Clifton road\n" +
                "Temple Hills, MD 20784",
                "(301) 423-1200",  null, null));
        bricks.add(new Center("Benjer, Inc.", "P O Box 695\n" +
                "White Marsh, MD 21162",
                "(410) 335-2267", "benjer@benjerinc.com", null));
        bricks.add(shingles.get(0)); //Repeat: Brandywine Enterprises
        bricks.add(new Center("Clean Earth of Maryland, Inc.", "1469 Oak Ridge Place\n" +
                "Hagerstown, MD 21742",
                null, "cleanrock@aol.com", null));
        bricks.add(new Center("Community Forklift", "4671 Tanglewood Drive\n" +
                "Edmonston/Hyattsville, MD 20781",
                "(301) 985-5180",  "donations@communityforklift.com", "www.communityforklift.com"));
        bricks.add(new Center("Days Cove Road Rubble Landfill ", "6425 Days Cove Road\n" +
                "White Marsh, MD 21162",
                "(410) 335-3778", null, null));
        bricks.add(new Center("DC Rock", "1721 South Capitol Street, SW\n" +
                "Washington, DC 20003",
                "(202) 554-1250", null, null));
        bricks.add(new Center("Dependable Sand, Stone & Recycling, Inc.", "13155 Ocean Gateway\n" +
                "PO Box 130\n" +
                "Queen Anne, MD 21657",
                "(410) 822-6363", null, null));
        bricks.add(new Center("Diamond Waste Services", "508 Glenbrook Road\n" +
                "Glen Burnie, MD 21061",
                "(410) 350-7000", "anita.crehan@diamond-waste.com", null));
        bricks.add(new Center("Environmental Alternative Recycling, LLC", "1030 Edison Highway\n" +
                "PO Box 9977\n" +
                "Baltimore, MD 21224",
                "(410) 534-2990", null, null));
        bricks.add(new Center("Global Resource Recyclers, Inc.", "2600 Marble Court\n" +
                "Forestville, MD 20747",
                "(301) 568-2050", "hgreen@chamberlaincontractors.com", null));
        bricks.add(new Center("Habitat ReStore", "1109 East Patrick Street\n" +
                "Frederick, MD 21701",
                "(301) 662-2988", null, null));
        bricks.add(new Center("Harvest RGI, LLC", "7800 Kabik Court\n" +
                "Woodbine, MD 21797",
                "(410) 795-7666", "dlundberg@harvestpower.com", "www.harvestpower.com/midatlantic"));
        bricks.add(new Center("Honeygo Run Reclamation Company", "10710 Philadelphia Road \n" +
                "Perry Hall, MD 21128",
                "(410) 335-9500", null, null));
        bricks.add(new Center("Key Recycling Center", "3810 fort Armistead Road\n" +
                "Baltimore, MD 21226",
                "(410) 360-5263", "keyrecyclingcenter@gmail.com", null));
        bricks.add(new Center("L & J Waste Recycling LLC", "222 N. Calverton Road\n" +
                "Baltimore, MD 21223",
                "(410) 566-2323", "lenzie@ljwasterecycling.com", null));
        bricks.add(new Center("Lafarge North America (Cockeysville)", "10000 Beaver Dam Road\n" +
                "Cockeysville, MD 21030",
                "(410) 683-9000", null, null));
        bricks.add(new Center("Lafarge North America (Frederick)", "100 East South Street\n" +
                "Frederick, MD 21704",
                "(301) 694-4819", null, null));
        bricks.add(new Center("Lafarge North America (Jessup)", "7970 Old Jessup Road\n" +
                "Jessup, MD 20794",
                "(410) 799-4897",  null, null));
        bricks.add(new Center("Lafarge North America (Towson)", "300 East Joppa Road, Suite 200\n" +
                "Towson, MD 21286",
                "(410) 847-3300",  "rick.cole@lafargecorpcom", null));
        //bricks.add(new Center("", "",
        //        "", null, null));
    }

    public void batteriesInit() {
        batteries.add(new Center("Arundel Recycling Center, Inc.", "7517 Connelly Drive\n" +
                "Hanover, MD 21076",
                "(410) 761-6595", null, "www.arundelrecycling.com"));
        batteries.add(new Center("B & B Lighting Supply, Inc.", "2901 Druid Park Drive, Suite A110\n" +
                "Baltimore, MD 21215",
                "(410) 523-7300",  "sbradford@bnblightingsupply.com", null));
        batteries.add(new Center("Batteries & Bulbs", "29 East Padonia Road\n" +
                "Timonium, MD 21093",
                "(410) 628-7999", "BP889@batteriesplus.net", "www.batteriesplusbulbs.com"));
        batteries.add(new Center("Broadview Waste Services (BWS Inc.)", "7610 Energy Parkway\n" +
                "Baltimore, MD 21226",
                "(410) 437-6590", "info@bwaste.com", "www.bwaste.com"));
        batteries.add(new Center("Cambridge Iron & Metal Company", "901 South Kresson Street\n" +
                "Baltimore, MD 21224",
                "(410) 327-7867", null, null));
        batteries.add(new Center("Clean Venture, Inc.", "2931 Whittington Avenue\n" +
                "Baltimore, MD 21230",
                "(410) 368-9170", "dave.roesler@cyclechem.com", "www.chclechem.com"));
        batteries.add(new Center("Commercial Retrofitters & Recyclers", "P O Box 1045\n" +
                "Dunkirk, MD 20754",
                "(301) 358-6324", "pgoff@commretrorecycle.com", "www.commretrorecycle.com"));
        batteries.add(new Center("Eco-Battery, Inc.", "510 McCormick Drive, Suite P-Q\n" +
                "Glen Burnie, MD 21061",
                "888-768-0844", null, "www.eco-batteryinc.com"));
        batteries.add(new Center("Geller Lighting Supply, Inc.", "3720 Commerce Drive \n" +
                "Baltimore, MD 21227",
                "(410) 247-3636", null, null));
        batteries.add(new Center("H.D. Metal Company", "909 Boundary Street\n" +
                "Salisbury, MD 21802",
                "(410) 546-1111",  null, null));
        batteries.add(new Center("M.O.U. Enterprises, Inc.", "200 Penrod Court, Suite F\n" +
                "Glen Burnie, MD 21061",
                "(410) 648-4072",  "mouenterprisesinc.com", "www.mouenterprisesinc.com"));
        batteries.add(new Center("Maryland Recycle Company (Elkridge)", "5618 Furnace Avenue\n" +
                "Elkridge, MD 21075",
                "(410) 796-0760",  null, null));
        batteries.add(new Center("Maryland Recycle Company (Glen Burnie)", "200 8th Avenue, NW\n" +
                "Glen Burnie, MD 21061",
                "(410) 760-9088",  "mdrecycle@aol.com", null));
        batteries.add(new Center("Maryland Recycle Company (Owings Mills)", "24 Gwynns Mill Court\n" +
                "Owings Mills, MD 21117",
                "(410) 363-3347", "metalprorecycling.com", null));
        batteries.add(new Center("Maryland Recycle Company (Rosedale)", "8920 Yellow Brick Road\n" +
                "Rosedale, MD 21237",
                "(410) 780-3060",  null, null));
        batteries.add(new Center("Metal Recyclers, LLC", "8312 Lokus Road\n" +
                "Odenton, MD 21113",
                "(410) 674-2000",  null, "www.metalrecyclersusa.com"));
        batteries.add(new Center("Ocean City Recycling Center", "210 65th Street\n" +
                "Ocean City, MD 21842",
                "(410) 524-5356",  null, null));
        batteries.add(new Center("Schultz & Sons Salvage", "24769 Meeting House Road\n" +
                "Denton, MD 21629",
                "(410) 479-2110", "recycle@shore.intercom.net", null));
        batteries.add(new Center("TurboHaul", "11700 Old Baltimore Pike\n" +
                "Beltsville, MD 20705",
                "(301) 931-6993",  "kevindaly@turbohaul.com", null));
        batteries.add(new Center("Waldorf Metal Company", "P.O. Box 1\n" +
                "Bryantown, MD 20617",
                "(301) 932-1220",  null, null));
        //batteries.add(new Center("", "",
        //        "",  null, null));
    }

    private void cardboardInit() {
        cardboard.add(new Center("ABC Box Company", "1135 Leadenhall Street\n" +
                "Baltimore, MD 21230 ",
                "(410) 752-4535",  null, null));
        cardboard.add(new Center("", "",
                "",  null, null));
        cardboard.add(new Center("Arc of Washington County, Inc.", "1000 Florida Avenue\n" +
                "Hagerstown, MD 21740 ",
                "(204) 527-2204",  null, null));
        cardboard.add(new Center("Baltimore County Resource Recovery Facility", "10320 York Road\n" +
                "Cockeysville, MD 21030",
                "(410) 628-1130",  null, null));
        cardboard.add(new Center("Banks of Eden Farm", "4318 Allen Road \n" +
                "Salisbury, MD 21801 ",
                "(410) 749-8994",  null, null));
        cardboard.add(new Center("Benjer, Inc.", "P O Box 695\n" +
                "White Marsh, MD 21162",
                "(410) 335-2267",  null, null));
        cardboard.add(new Center("Better Composting, Inc.", "3132 Murray Road \n" +
                "Finksburg, MD 21048",
                "(410) 833-8330",  null, null));
        cardboard.add(new Center("Better Shredder, Inc.", "P O Box 591\n" +
                "Williamsport, MD 21795",
                "(866) 210-5433",  "bettershredder@earthlink.net", null));
        cardboard.add(shingles.get(0)); //Repeat: Brandywine Enterprises
        cardboard.add(new Center("CH Recycling Company (Baltimore)", "1532 Thames Street\n" +
                "Baltimore, MD 21231",
                "(410) 522-0110",  "jsloan@chrecycling.com", null));
        cardboard.add(new Center("Consolidated Waste", "7707 Brookville road\n" +
                "Chevy Chase, MD 20815",
                "(202) 269-3303",  null, null));
        cardboard.add(new Center("D C Intercel", "1401 Cherry Hill Road\n" +
                "Baltimore, MD 21225",
                "(410) 355-5800",  null, null));
        cardboard.add(bricks.get(14)); //repeat:Diamond Waste Services
        cardboard.add(new Center("Eagle Management Systems, Inc.", "6130 N. Capitol Street NW\n" +
                "Washington, DC 20011",
                "(202) 291-0200",  null, null));
        cardboard.add(new Center("Eagle Recycling LLC", "510 West Road\n" +
                "Salisbury, MD 21801",
                "(410) 677-3777",  "kaleb.eagle@gmail.com", null));
        cardboard.add(new Center("Eastern Recycling, LLC", "5107 North Point Boulevard\n" +
                "Sparrows Point, MD 21219",
                "(410) 477-7500",  "cmehiel@ersmd.com", null));
        cardboard.add(new Center("Encore Recycling", "13211 Virginia Manor Road\n" +
                "Laurel, MD 20707",
                "(410) 813-2610",  "moniquesampson@hotmail.com", null));
        cardboard.add(new Center("Georgetown Paper Stock of Rockville", "14820 Southlawn Lane\n" +
                "Rockville, MD 20850",
                "(301) 762-6990",  null, null));
        cardboard.add(new Center("H.D. Metal Company", "909 Boundary Street\n" +
                "P O Box 1\n" +
                "Salisbury, MD 21802",
                "(410) 546-1111",  null, null));
        cardboard.add(new Center("Hanna Paper Recycling", "8840 Greenwood Place\n" +
                "Savage, MD 20763",
                "(301) 604-3302",  null, null));
        cardboard.add(new Center("Infinity Recycling, Inc.", "300 Old McGinnis Lane \n" +
                "Chestertown, MD 21620",
                "(410) 778-5949",  null, "www.infinityrecycling.org"));
        cardboard.add(new Center("Integrity Recycling", "7921 Philadelphia Road\n" +
                "Rosedale, MD 21237",
                "(410) 866-4000",  null, null));
        cardboard.add(new Center("Kline Paper Mill Supplies, Inc.", "9475 Gerwig Lane\n" +
                "Columbia, MD 21046",
                "(410) 381-6363",  null, "www.klinepaper.com"));
        cardboard.add(bricks.get(21)); //repeat: L & J
        cardboard.add(new Center("Maryland Paper Company", "16151 Elliott Parkway \n" +
                "Williamsport, MD 21795-9803",
                "(301) 223-6550",  null, "www.marylandpaper.com"));
        cardboard.add(new Center("Modern Junk & Salvage", "1423 North Freemont Ave. \n" +
                "Baltimore, MD 21217 ",
                "(410) 669-8290",  null, null));
        cardboard.add(new Center("Nova Services, Inc.", "2500 Grays Road\n" +
                "Baltimore, MD 21222",
                        "(410) 388-2200",  "dkellermann@novarecycles.com", null));
        cardboard.add(new Center("Office Paper Systems, Inc.", "7650 Airpark Road\n" +
                "Gaithersburg, MD 20879-4156",
                "(301) 948-6301",  null, null));
        cardboard.add(new Center("Prince Georges Co. Materials Recovery Facility", "1000 Ritchie Road \n" +
                "Capitol Heights, MD 20743",
                "(301) 499-1707",  null, null));
        cardboard.add(shingles.get(2)); //repeat: Roll-off
        cardboard.add(new Center("Secondary Solutions", "P.O. Box 727\n" +
                "Funkstown, MD 21734-0727",
                "(301) 797-4237",  "ssolut1121@aol.com", null));
        cardboard.add(new Center("Simkins Industries, Inc.", "201 River Road \n" +
                "P.O. Box 3249 \n" +
                "Catonsville, MD 21228",
                "(410) 747-5100",  null, null));
        cardboard.add(new Center("The Owl Corporation", "1900 Graves Court\n" +
                "Baltimore, MD 21222",
                "(410) 282-0067",  "jlpaperbuyer@aol.com", "www.theowlcorp.com"));
        cardboard.add(shingles.get(4)); //repeat: Turbohaul
        cardboard.add(new Center("Universal Recycling, Inc.", "1000 Ritchie Road\n" +
                "Capital Heights, MD 20743-3706",
                "(301) 336-5932",  null, null));
        cardboard.add(new Center("Vangel Paper, Inc.", "3020 Nieman Avenue\n" +
                "Baltimore, MD 21230",
                "(410) 644-2600",  null, "www.vangelpaper.com"));
        cardboard.add(new Center("Waste Management of MD/Baltimore", "6333 Macaw Court \n" +
                "Elkridge, MD 21075",
                "(410) 796-701",  null, null));
        cardboard.add(new Center("Westreet Industries", "5107 North Point Blvd. \n" +
                "Baltimore, MD 21219",
                "(410) 477-7500",  null, null));
        cardboard.add(new Center("World Recycling, Inc.", "5600 Columbia Park Road \n" +
                "Cheverly, MD 20785",
                "(301) 386-3010",  null, null));
    }

    //May want to add more specific details on the Third page of Electronics... (leave for later)
    public void elecInit() {
        electronics.add(new Center("A Better Way Computer Recycling LLC", "6655 Amberton Drive, Suite K\n" +
                "Elkridge, MD 21075",
                "(410) 381-5588",  "jeremy@abetterwayrecycling.com", "www.abetterwayrecycling.com"));
        electronics.add(new Center("AMIT Recycling Solutions, Inc.", "8839 Kelso Drive, Suite E\n" +
                "Essex, MD 21221",
                "(443) 393-3371",  "info@amitrecycling.com", null));
        electronics.add(new Center("Annapolis Office Technologies", "561 E. Central Ave\n" +
                "Edgewater, MD 21037",
                "(443) 336-3018", "annapolisrecycling@verizon.net", "annapolisrecycling.com"));
        electronics.add(new Center("Arundel Computers", "7436 Ritchie Highway\n" +
                "Glen Burnie, MD 21061",
                "(410) 766-0862", "www.arundelcomputers.com", null));
        electronics.add(new Center("Better Shredder, Inc.", "P O Box 591\n" +
                "Williamsport, MD 21795",
                "(866) 210-5433", "bettershredder@earthlink.net", null));
        electronics.add(new Center("BPAI, LLC", "901 Curtain Avenue\n" +
                "Baltimore, MD 21218",
                "(410) 662-6380", "bpeters@bpaillc.com", null));
        electronics.add(new Center("Broadview Waste Services (BWS Inc.)", "7610 Energy Parkway\n" +
                "Baltimore, MD 21226",
                "(410) 437-6590", "info@bwaste.com", "www.bwaste.com"));
        electronics.add(new Center("C.N. Robinson Lighting", "4318 Washington Boulevard\n" +
                "Baltimore, MD 21227",
                "(410) 242-4172", "rob@cnrlight.com", null));
        electronics.add(new Center("Capital Recycling Services", "12036 Old Baltimore Pike\n" +
                "Beltsville, MD 20705",
                "(301) 699-6244", null, null));
        electronics.add(new Center("Capitol Asset Recycling, Inc.", "4721 Boston Way, Suite A\n" +
                "Lanham, MD 20706",
                "(240) 696-2572", null, null));
        electronics.add(new Center("CDM e-Cycling", "500 N. North Point Road\n" +
                "Baltimore, MD 21237",
                "(410) 485-4040", "mike@cdm4recycling.com", "www.cdm4recycle.com"));
        electronics.add(new Center("Cell Phones Fighting Cancer", "P O Box 381\n" +
                "Millersville, MD 21108",
                "(443) 494-9205", null, "www.cellphonesfightingcancer.org"));
        electronics.add(new Center("Chesapeake PC Users Group, Inc.", "1783 Forest Drive, #285\n" +
                "Annapolis, MD 21403",
                "(410) 923-1550", "jmmosk@comcast.net", "www.chesapeakepcusersgroup.org"));
        electronics.add(new Center("Commercial Retrofitters & Recyclers", "P O Box 1045\n" +
                "Dunkirk, MD 20754",
                "(301) 358-6324", "pgoff@commretrorecycle.com", "www.commretrorecycle.com"));
        electronics.add(new Center("Davis Memorial Goodwill Industries", "2200 South Dakota Avenue\n" +
                "Washington, DC 20018",
                "(202) 636-4225", "donations@goodwill.org", null));
        electronics.add(new Center("e-End USA", "2421 Monocacy Blvd., Unit E\n" +
                "Frederick, MD 21701",
                "(240) 529-1010", " steve@eendusa.com", "www.eendusa.com"));
        electronics.add(new Center("Electronic Solution Services", "1923 Lansdowne Road\n" +
                "Baltimore, MD 21227",
                "(410) 536-1111", "st@imt-pc.com", null));
        electronics.add(new Center("eRevival, LLC", "19344 Circle Gate Drive\n" +
                "Germantown, MD 20874",
                "(800) 696-8042", "contact@erevival.net", null));
        electronics.add(new Center("Freedom Electronics Recycling, Inc", "10307 Partnership Court, Suite 200\n" +
                "Williamsport, MD 21795",
                "(301) 223-4123",  "rschulman@freedomrecycling.com", null));
        electronics.add(new Center("Green Computer Recycling Inc.", "1212 East 25th Street\n" +
                "Baltimore, MD 21218",
                "(443) 682-7577",  "amalik@recyclegcr.com", "www.recyclegcr.com"));
        electronics.add(new Center("Lazarus Foundation", "6520 Freetown Road\n" +
                "Columbia, MD 21044",
                "(410) 531-8485",  null, "www.lazarus.org"));
        electronics.add(new Center("Lazarus", "6520 Freetown Road\n" +
                "Columbia, MD 21044",
                "(410) 531-8485",  null, "www.lazarus.org"));
        electronics.add(new Center("Nova Services, Inc.", "2500 Grays Road\n" +
                "Baltimore, MD 21222",
                "(410) 388-2200",  "dkellermann@novarecycles.com", null));
        electronics.add(new Center("Pasadena Recycling, LLC", "7946 Fort Smallwood Road\n" +
                "Baltimore, MD 21226",
                "(410) 255-9151",  "linchristian@pasadenarecyclingllc.com", null));
        electronics.add(new Center("Re-use Barn", "4200 Gardiner Road\n" +
                "Waldorf, MD 20601",
                "(301) 645-9451",  null, null));
        electronics.add(new Center("Retire-IT, LLC", "938 Dennison Avenue\n" +
                "Columbia, MD 43201",
                "(614) 522-2301",  null, "www.retire-it.com"));
        electronics.add(new Center("Second Chance Inc.", "1700 Ridgely Street\n" +
                "Baltimore, MD 21230",
                "(410) 385-1101",  "admin@secondchanceinc.org", "www.secondchanceinc.org"));
        electronics.add(new Center("Securis", "14231 Cherry Lane Court\n" +
                "Laurel, MD 20707",
                "(301) 363-4789",  "MD03@securis.com", "www.securis.com/central-maryland-2"));
        electronics.add(new Center("Securis Baltimore", "8841 Kelso Drive\n" +
                "Baltimore, MD 21220",
                "(443) 734-3344",  "gparks@securis.com", "www.securis.com/baltimore"));
        electronics.add(new Center("ShredStation Express of Maryland", "2731 Deer Ridge Drive\n" +
                "Silver Spring, MD 20904",
                "(301) 832-6227",  null, null));
        electronics.add(new Center("TurboHaul", "11700 Old Baltimore Pike\n" +
                "Beltsville, MD 20705",
                "(301) 931-6993",  "kevindaly@turbohaul.com", null));
        electronics.add(new Center("TurtleWings", "1771 Olive Street\n" +
                "Capitol Heights, MD 20743",
                "(301) 583-8399",  "info@turtlewings.com", "www.turtlewings.com"));
        electronics.add(new Center("UNICOR, Federal Prison Industries, Inc.", "1923 Vermont Avenue, NW\n" +
                "Washington, DC 20001",
                "(202) 305-3884",  null, "www.unicor.gov"));
        electronics.add(new Center("United Way Community Resource Bank", "6620 Amberton Drive\n" +
                "Elkridge, MD 21075",
                "(410) 379-5522",  "art.eich@uwcm.org", null));
    //    electronics.add(new Center("", "",
    //            "",  null, null));
    }

    public void lampsInit() {
        fluorescents.add(new Center("B & B Lighting Supply, Inc.", "2901 Druid Park Drive, Suite A110\n" +
                "Baltimore, MD 21215",
                "(410) 523-7300",  "sbradford@bnblightingsupply.com", null));
        fluorescents.add(new Center("Batteries & Bulbs", "29 East Padonia Road\n" +
                "Timonium, MD 21093",
                "(410) 628-7999",  "BP889@batteriesplus.net", "www.batteriesplusbulbs.com"));
        fluorescents.add(new Center("Broadview Waste Services (BWS Inc.)", "7610 Energy Parkway\n" +
                "Baltimore, MD 21226",
                "(410) 437-6590",  "info@bwaste.com", "www.bwaste.com"));
        fluorescents.add(new Center("C.N. Robinson Lighting", "4318 Washington Boulevard\n" +
                "Baltimore, MD 21227",
                "(410) 242-4172",  "rob@cnrlight.com", null));
        fluorescents.add(new Center("Clean Venture, Inc.", "2931 Whittington Avenue\n" +
                "Baltimore, MD 21230",
                "(410) 368-9170",  null, "www.chclechem.com"));
        fluorescents.add(new Center("Commercial Retrofitters & Recyclers", "P O Box 1045\n" +
                "Dunkirk, MD 20754",
                "(301) 358-6324",  "pgoff@commretrorecycle.com", "www.commretrorecycle.com"));
        fluorescents.add(new Center("EQ-The Environmental Quality Company", "3508-B Fairfield Avenue\n" +
                "Baltimore, MD 21226",
                "(410) 354-2221",  null, "www.eqonline.com"));
        fluorescents.add(new Center("Geller Lighting Supply, Inc.", "3720 Commerce Drive \n" +
                "Baltimore, MD 21227",
                "(410) 247-3636",  null, null));
        fluorescents.add(new Center("Safety Kleen Corporation (Baltimore)", "1448 Desoto Road \n" +
                "Baltimore, MD 21230",
                "(410) 525-0001",  null, null));
    }
    /*
        Pre: A string which matches with a given Center Array
        Post:Returns the array storing the requested type of recycling centers, null if an invalid request -
        handling is expected on the other side, but there should not ba any invalid requests
        //TODO Alphonse, I (or you) can change the String request matches to the official strings.xml versions (i.e. shingles to "Asphalt Shingles") if you would prefer.
     */ //Was Center[]
    public ArrayList<Center> getType(String str) {
        if(str.equals("shingles")) {
            return shingles;
        } else if(str.equals("bricks")) {
            return bricks;
        } else if(str.equals("batteries")) {
            return batteries;
        } else if(str.equals("cardboard")) {
            return cardboard;
        } else if(str.equals("electronics")) {
            return electronics;
        } else if(str.equals("fluorescents") || str.equals("lamps")) {
            return fluorescents;
        }

        return null;
    }
}
