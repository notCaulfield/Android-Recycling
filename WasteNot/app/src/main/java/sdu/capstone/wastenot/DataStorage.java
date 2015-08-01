package sdu.capstone.wastenot;

import java.util.ArrayList;

/**
 * Created by Holden on 3/27/2015.
 * Sample request for a name from DataStorage:
 * DataStorage d = new DataStorage();
 * d.getType("batteries").get(0).getName(); - Returns "Arundel Recycling Center, Inc."
 * Everything is based off that. Use for each loops I guess. Or ListView.
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
    //private ArrayList<Center> mercury = new ArrayList<Center>();
    private ArrayList<Center> paper = new ArrayList<Center>();
    private ArrayList<Center> plastics = new ArrayList<Center>();
    private ArrayList<Center> salvage = new ArrayList<Center>();
    //private ArrayList<Center> unusual = new ArrayList<Center>();
    private ArrayList<Center> textiles = new ArrayList<Center>();
    private ArrayList<Center> tires = new ArrayList<Center>();
    private ArrayList<Center> pallets = new ArrayList<Center>();
    private ArrayList<Center> wood = new ArrayList<Center>();
    private ArrayList<Center> other = new ArrayList<Center>();
  //  MyApplication app = new MyApplication();
   // Context context = app.getAppContext();

    public DataStorage() {
        //init();
    }

/*    private void init() {
        shinglesInit();
        bricksInit();
        batteriesInit();
        cardboardInit();
        elecInit();
        lampsInit();
        organicsInit();
        glassInit();
        gypsumInit();
        tonersInit();
        metalsInit();
        oilInit();
        paperInit();
        plasticsInit();
        textInit();
        tiresInit();
        palletsInit();
    }
*/

    private void shinglesInit() {
        shingles.add(new Center("Brandywine Enterprises", "5800 Sheriff Road\n" +
                "Fairmount Heights, MD 20743-6302",
                "(301) 925-8100", "bmcalwee@brandywineco.com", null, 38.907005, -76.904060));
        shingles.add(new Center("Reliable Contracting", "1 Churchview Road\n" +
                "Millersville, MD 21108",
                "(410) 987-0313", null, null, 39.048309, -76.651688));
        shingles.add(new Center("Roll-Off Express", "2900 Dede Road \n" +
                "Finksburg, MD 21048",
                "(410) 526-3535", "rolloffjack@aol.com", null, 39.493486, -76.883364));
        shingles.add( new Center("Roofs to Roads", "1005 Rising Ridge Road\n" +
                "Mt. Airy, MD 21771",
                "(301) 831-0888", null, "www.fromrooftoroad.com", 39.374277, -77.167880));
        shingles.add(new Center("TurboHaul", "11700 Old Baltimore Pike\n" +
                "Beltsville, MD 207055",
                "(301) 931-6993", "kevindaly@turbohaul.com", null, 39.045637, -76.893558));
    }

    private void bricksInit() {
        bricks.add(new Center("Aggregate Industries", "8615 Dorsey Run Road\n" +
                "Jessup, MD 20794",
                "(301) 317-0300",  null, null, 39.132731, -76.797287));
        bricks.add(new Center("Alternative Aggregate Recycling, Inc.", "1001 Edison Highway\n" +
                "Baltimore, Md 21213",
                "(410) 483-1012", null, null, 39.303099, -76.572817));
        //TODO Investigate below and bricks.get(0)
       // bricks.add(new Center("Aggregate Industries", "8615 Old Dorsey Run Road\n" +
       //         "Jessup, MD 20794",
       //         "(410) 483-1012",  null, null));
       // bricks.add(new Center("Annapolis Junction", "8615 Old Dorsey Run Road\n" +
        //        "Jessup, MD 20794",
        //        "(301) 776-5900", null, null));
        bricks.add(new Center("Auston Contracting, Inc.", "1202 Pauls Lane\n" +
                "Joppa, MD 21085",
                "(410) 335-1016", "auston1@verizon.net", null, 39.432649, -76.350174));
        bricks.add(new Center("Baltimore Recycling Center", "1030 Edison Highway\n" +
                "Baltimore, MD 21213",
                "(410) 534-2990",  null, null, 39.303099, -76.572817));
        bricks.add(new Center("Barnabas Stone", "4714 Clifton Road\n" +
                "Temple Hills, MD 20784",
                "(301) 423-1200",  null, null, 38.826250, -76.944929));
        bricks.add(new Center("Benjer, Inc.", "11106 Redline Rd\n" +
                "Middle River, MD 21162",
                "(410) 335-2267",  "benjer@benjerinc.com", null, 39.3871626,-76.4204383));
        bricks.add(new Center("Brandywine Enterprises", "5800 Sheriff Road\n" +
                "Fairmount Heights, MD 20743-6302",
                "(301) 925-8100", "bmcalwee@brandywineco.com", null, 38.907005, -76.904060)); //Repeat: Brandywine Enterprises
        bricks.add(new Center("Clean Earth of Maryland, Inc.", "1469 Oak Ridge Place\n" +
                "Hagerstown, MD 21742",
                null, "cleanrock@aol.com", null, 39.607860, -77.712824));
        bricks.add(new Center("Community Forklift", "4671 Tanglewood Drive\n" +
                "Edmonston/Hyattsville, MD 20781",
                "(301) 985-5180",  "donations@communityforklift.com", "www.communityforklift.com", 38.946417, -76.936615));
        bricks.add(new Center("Days Cove Road Rubble Landfill ", "6425 Days Cove Road\n" +
                "White Marsh, MD 21162",
                "(410) 335-3778", null, null, 39.395910, -76.391424));
        bricks.add(new Center("DC Rock", "1721 South Capitol Street, SW\n" +
                "Washington, DC 20003",
                "(202) 554-1250", null, null, 38.868048, -77.009117));
        bricks.add(new Center("Dependable Sand, Stone & Recycling, Inc.", "13155 Ocean Gateway\n" +
                "Wye Mills, MD 21679",
                "(410) 643-2900", null, null, 38.915242,-76.0618316));
        bricks.add(new Center("Diamond Waste Services", "508 Glenbrook Road\n" +
                "Glen Burnie, MD 21061",
                "(410) 350-7000", "anita.crehan@diamond-waste.com", null, 39.162405, -76.650888));
        bricks.add(new Center("Environmental Alternative Recycling, LLC", "8622 Ashwood Drive\n" +
                "Capitol Heights, MD 20743",
                "(410) 534-2990", null, null, 38.8823582,-76.8572206));
        bricks.add(new Center("Global Resource Recyclers, Inc.", "2600 Marble Court\n" +
                "Forestville, MD 20747",
                "(301) 568-2050", "hgreen@chamberlaincontractors.com", null, 38.855255, -76.862236));
        bricks.add(new Center("Habitat ReStore", "1109 East Patrick Street\n" +
                "Frederick, MD 21701",
                "(301) 662-2988", null, null, 39.408461, -77.390130));
        bricks.add(new Center("Harvest RGI, LLC", "7800 Kabik Court\n" +
                "Woodbine, MD 21797",
                "(410) 795-7666", "dlundberg@harvestpower.com", "www.harvestpower.com/midatlantic", 39.356371, -77.027474));
        bricks.add(new Center("Honeygo Run Reclamation Company", "10710 Philadelphia Road \n" +
                "Perry Hall, MD 21128",
                "(410) 335-9500", null, null, 39.381611, -76.433586));
        bricks.add(new Center("Key Recycling Center", "3810 Fort Armistead Road\n" +
                "Baltimore, MD 21226",
                "(410) 360-5263", "keyrecyclingcenter@gmail.com", null, 39.203741, -76.548037));
        bricks.add(new Center("L & J Waste Recycling LLC", "222 N. Calverton Road\n" +
                "Baltimore, MD 21223",
                "(410) 566-2323", "lenzie@ljwasterecycling.com", null, 39.290689, -76.657890));
        bricks.add(new Center("Lafarge North America (Cockeysville)", "10000 Beaver Dam Road\n" +
                "Cockeysville, MD 21030",
                "(410) 683-9000", null, null, 39.463882, -76.643881));
        bricks.add(new Center("Lafarge North America (Frederick)", "100 East South Street\n" +
                "Frederick, MD 21704",
                "(301) 694-4819", null, null, 39.404289, -77.393913));
        bricks.add(new Center("Lafarge North America (Jessup)", "7970 Old Jessup Road\n" +
                "Jessup, MD 20794",
                "(410) 799-4897",  null, null, 39.152981, -76.776533));
        bricks.add(new Center("Lafarge North America (Towson)", "300 East Joppa Road, Suite 200\n" +
                "Towson, MD 21286",
                "(410) 847-3300",  "rick.cole@lafargecorpcom", null, 39.401943, -76.598473));
        //bricks.add(new Center("", "",
        //        "", null, null));
    }

    public void batteriesInit() {
        batteries.add(new Center("Arundel Recycling Center, Inc.", "7517 Connelly Drive\n" +
                "Hanover, MD 21076",
                "(410) 761-6595", null, "www.arundelrecycling.com", 39.156744, -76.680951));
        batteries.add(new Center("B & B Lighting Supply, Inc.", "2901 Druid Park Drive, Suite A110\n" +
                "Baltimore, MD 21215",
                "(410) 523-7300",  "sbradford@bnblightingsupply.com", null, 39.324410, -76.659269));
        batteries.add(new Center("Batteries & Bulbs", "29 East Padonia Road\n" +
                "Timonium, MD 21093",
                "(410) 628-7999", "BP889@batteriesplus.net", "www.batteriesplusbulbs.com", 39.456280, -76.632304));
        batteries.add(new Center("Broadview Waste Services (BWS Inc.)", "7610 Energy Parkway\n" +
                "Baltimore, MD 21226",
                "(410) 437-6590", "info@bwaste.com", "www.bwaste.com", 39.176876, -76.547777));
        batteries.add(new Center("Cambridge Iron & Metal Company", "901 South Kresson Street\n" +
                "Baltimore, MD 21224",
                "(410) 327-7867", null, null, 39.282766, -76.559307));
        batteries.add(new Center("Clean Venture, Inc.", "2931 Whittington Avenue\n" +
                "Baltimore, MD 21230",
                "(410) 368-9170", "dave.roesler@cyclechem.com", "www.chclechem.com", 39.259167, -76.656604));
        batteries.add(new Center("Commercial Retrofitters & Recyclers", "15031-A Marlboro Pike\n" +
                "Upper Marlboro, MD 20772",
                "(301) 358-6324", "pgoff@commretrorecycle.com", "www.commretrorecycle.com", 38.818937,-76.741959));
        batteries.add(new Center("Eco-Battery, Inc.", "510 McCormick Drive, Suite P-Q\n" +
                "Glen Burnie, MD 21061",
                "(888) 768-0844", null, "www.eco-batteryinc.com", 39.160399, -76.675054));
        batteries.add(new Center("Geller Lighting Supply, Inc.", "3720 Commerce Drive \n" +
                "Baltimore, MD 21227",
                "(410) 247-3636", null, null, 39.249663, -76.673260));
        batteries.add(new Center("H.D. Metal Company", "909 Boundary Street\n" +
                "Salisbury, MD 21802",
                "(410) 546-1111",  null, null, 38.371327, -75.611185));
        batteries.add(new Center("M.O.U. Enterprises, Inc.", "200 Penrod Court, Suite F\n" +
                "Glen Burnie, MD 21061",
                "(410) 648-4072",  "mouenterprisesinc.com", "www.mouenterprisesinc.com", 39.177274, -76.626246));
        batteries.add(new Center("Maryland Recycle Company (Elkridge)", "5618 Furnace Avenue\n" +
                "Elkridge, MD 21075",
                "(410) 796-0760",  null, null, 39.216265, -76.707675));
        batteries.add(new Center("Maryland Recycle Company (Glen Burnie)", "200 8th Avenue, NW\n" +
                "Glen Burnie, MD 21061",
                "(410) 760-9088",  "mdrecycle@aol.com", null, 39.152908, -76.627288)); //TODO was 300?
        batteries.add(new Center("Maryland Recycle Company (Owings Mills)", "24 Gwynns Mill Court\n" +
                "Owings Mills, MD 21117",
                "(410) 363-3347", "metalprorecycling.com", null, 39.414526, -76.781506));
        batteries.add(new Center("Maryland Recycle Company (Rosedale)", "8920 Yellow Brick Road\n" +
                "Rosedale, MD 21237",
                "(410) 780-3060",  null, null, 39.341173, -76.478355));
        batteries.add(new Center("Metal Recyclers, LLC", "8312 Lokus Road\n" +
                "Odenton, MD 21113",
                "(410) 674-2000",  null, "www.metalrecyclersusa.com", 39.092429, -76.702939));
        batteries.add(new Center("Ocean City Recycling Center", "210 65th Street\n" +
                "Ocean City, MD 21842",
                "(410) 524-5356",  null, null, 38.387701, -75.066977));
        batteries.add(new Center("Schultz & Sons Salvage", "24769 Meeting House Road\n" +
                "Denton, MD 21629",
                "(410) 479-2110", "recycle@shore.intercom.net", null, 38.893018, -75.846955));
        batteries.add(new Center("TurboHaul", "11700 Old Baltimore Pike\n" +
                "Beltsville, MD 20705",
                "(301) 931-6993",  "kevindaly@turbohaul.com", null, 39.045637, -76.893558));
        batteries.add(new Center("Waldorf Metal Company", "12625 La Plata Rd\n" +
                "Bryantown, MD 20617",
                "(301) 932-1220",  null, null, 38.5580547,-76.8726689));
        //batteries.add(new Center("", "",
        //        "",  null, null));
    }

    private void cardboardInit() {
        cardboard.add(new Center("ABC Box Company", "1135 Leadenhall Street\n" +
                "Baltimore, MD 21230 ",
                "(410) 752-4535",  null, null, 39.276610, -76.618038));
        //cardboard.add(new Center("", "",
        //        "",  null, null));
        cardboard.add(new Center("Arc of Washington County, Inc.", "1000 Florida Avenue\n" +
                "Hagerstown, MD 21740 ",
                "(204) 527-2204",  null, null, 39.657308, -77.728221));
        cardboard.add(new Center("Baltimore County Resource Recovery Facility", "10320 York Road\n" +
                "Cockeysville, MD 21030",
                "(410) 628-1130",  null, null, 39.472208, -76.639996));
        cardboard.add(new Center("Banks of Eden Farm", "4318 Allen Road \n" +
                "Salisbury, MD 21801 ",
                "(410) 749-8994",  null, null, 38.312048, -75.647707));
        cardboard.add(new Center("Benjer, Inc.", "11106 Redline Rd\n" +
                "Middle River, MD 21162",
                "(410) 335-2267",  "benjer@benjerinc.com", null, 39.3871626,-76.4204383));
        cardboard.add(new Center("Better Composting, Inc.", "3132 Murray Road \n" +
                "Finksburg, MD 21048",
                "(410) 833-8330",  null, null, 39.490125, -76.887302));
        cardboard.add(new Center("Better Shredder, Inc.", "10701 Bower Ave\n" +
                "Williamsport, MD 21795",
                "(866) 210-5433",  "bettershredder@earthlink.net", null, 39.6084166,-77.7735591));
        cardboard.add(new Center("Brandywine Enterprises", "5800 Sheriff Road\n" +
                "Fairmount Heights, MD 20743-6302",
                "(301) 925-8100", "bmcalwee@brandywineco.com", null, 38.907005, -76.904060)); //Repeat: Brandywine Enterprises
        cardboard.add(new Center("CH Recycling Company (Baltimore)", "1532 Thames Street\n" +
                "Baltimore, MD 21231",
                "(410) 522-0110",  "jsloan@chrecycling.com", null, 39.280598, -76.595397));
        cardboard.add(new Center("Consolidated Waste", "7707 Brookville Road\n" +
                "Chevy Chase, MD 20815",
                "(202) 269-3303",  null, null, 38.987377, -77.071316));
        cardboard.add(new Center("D C Intercel", "1401 Cherry Hill Road\n" +
                "Baltimore, MD 21225",
                "(410) 355-5800",  null, null, 39.251968, -76.632679));
        cardboard.add(new Center("Diamond Waste Services", "508 Glenbrook Road\n" +
                "Glen Burnie, MD 21061",
                "(410) 350-7000",  "anita.crehan@diamond-waste.com", null, 39.162405, -76.650888)); //repeat:Diamond Waste Services
        cardboard.add(new Center("Eagle Management Systems, Inc.", "6130 N. Capitol Street NW\n" +
                "Washington, DC 20011",
                "(202) 291-0200",  null, null, 38.965201, -77.009164));
        cardboard.add(new Center("Eagle Recycling LLC", "510 West Road\n" +
                "Salisbury, MD 21801",
                "(410) 677-3777",  "kaleb.eagle@gmail.com", "www.eaglerecyclingllc.net", 38.372172, -75.607452));
        cardboard.add(new Center("Eastern Recycling, LLC", "5107 North Point Boulevard\n" +
                "Sparrows Point, MD 21219",
                "(410) 477-7500",  "cmehiel@ersmd.com", null, 39.241121, -76.455671));
        cardboard.add(new Center("Encore Recycling", "13211 Virginia Manor Road\n" +
                "Laurel, MD 20707",
                "(410) 813-2610", null, null, 39.068534, -76.888588));
        cardboard.add(new Center("Georgetown Paper Stock of Rockville", "14820 Southlawn Lane\n" +
                "Rockville, MD 20850",
                "(301) 762-6990",  null, null, 39.098131, -77.136337));
        //TODO PO BOX
        cardboard.add(new Center("H.D. Metal Company", "909 Boundary Street\n" +
                "Salisbury, MD 21802",
                "(410) 546-1111",  null, null, 38.371327, -75.611185));
        cardboard.add(new Center("Hanna Paper Recycling", "8840 Greenwood Place\n" +
                "Savage, MD 20763",
                "(301) 604-3302",  null, null, 39.130296, -76.812812));
        cardboard.add(new Center("Infinity Recycling, Inc.", "300 Old McGinnis Lane \n" +
                "Chestertown, MD 21620",
                "(410) 778-5949",  null, "www.infinityrecycling.org", 39.218866, -76.069004));
        cardboard.add(new Center("Integrity Recycling", "7921 Philadelphia Road\n" +
                "Rosedale, MD 21237",
                "(410) 866-4000",  null, null, 39.319867, -76.516008));
        cardboard.add(new Center("Kline Paper Mill Supplies, Inc.", "9475 Gerwig Lane\n" +
                "Columbia, MD 21046",
                "(410) 381-6363",  null, "www.klinepaper.com", 39.171046, -76.839479));
        cardboard.add(new Center("L & J Waste Recycling LLC", "222 N. Calverton Road\n" +
                "Baltimore, MD 21223",
                "(410) 566-2323", "lenzie@ljwasterecycling.com", null, 39.290689, -76.657890)); //repeat: L & J
        cardboard.add(new Center("Maryland Paper Company", "16151 Elliott Parkway \n" +
                "Williamsport, MD 21795-9803",
                "(301) 223-6550",  null, "www.marylandpaper.com", 39.617291, -77.809196));
        cardboard.add(new Center("Modern Junk & Salvage", "1423 North Freemont Ave. \n" +
                "Baltimore, MD 21217 ",
                "(410) 669-8290",  null, null, 39.304720, -76.637522));
        cardboard.add(new Center("Nova Services, Inc.", "2500 Grays Road\n" +
                "Baltimore, MD 21222",
                        "(410) 388-2200",  "dkellermann@novarecycles.com", null, 39.246002, -76.464447));
        cardboard.add(new Center("Office Paper Systems, Inc.", "7650 Airpark Road\n" +
                "Gaithersburg, MD 20879-4156",
                "(301) 948-6301",  null, null, 39.171040, -77.157309));
        cardboard.add(new Center("Prince Georges Co. Materials Recovery Facility", "1000 Ritchie Road \n" +
                "Capitol Heights, MD 20743",
                "(301) 499-1707",  null, null, 38.877910, -76.858081));
        cardboard.add(new Center("Roll-Off Express", "2900 Dede Road \n" +
                "Finksburg, MD 21048",
                "(410) 526-3535", "rolloffjack@aol.com", null, 39.493486, -76.883364)); //repeat: Roll-off
        cardboard.add(new Center("Secondary Solutions", "P.O. Box 727\n" +
                "Funkstown, MD 21734-0727",
                "(301) 797-4237",  "ssolut1121@aol.com", null, 39.6079175,-77.7075874));
        //TODO Marked comment
        //cardboard.add(new Center("Simkins Industries, Inc.", "201 River Road \n" +
        //        "P.O. Box 3249 \n" +
        //       "Catonsville, MD 21228",
        //        "(410) 747-5100",  null, null, 39.252973, -76.768238));
        cardboard.add(new Center("The Owl Corporation", "1900 Graves Court\n" +
                "Baltimore, MD 21222",
                "(410) 282-0067",  "jlpaperbuyer@aol.com", "www.theowlcorp.com", 39.257142, -76.499385));
        cardboard.add(new Center("TurboHaul", "11700 Old Baltimore Pike\n" +
                "Beltsville, MD 20705",
                "(301) 931-6993",  "kevindaly@turbohaul.com", null, 39.045637, -76.893558)); //repeat: Turbohaul
        cardboard.add(new Center("Universal Recycling, Inc.", "1000 Ritchie Road\n" +
                "Capital Heights, MD 20743-3706",
                "(301) 336-5932",  null, null, 38.877910, -76.858081));
        cardboard.add(new Center("Vangel Paper, Inc.", "3020 Nieman Avenue\n" +
                "Baltimore, MD 21230",
                "(410) 644-2600",  null, "www.vangelpaper.com", 39.256044, -76.654133));
        cardboard.add(new Center("Waste Management of MD/Baltimore", "6333 Macaw Court \n" +
                "Elkridge, MD 21075",
                "(410) 796-701",  null, null, 39.198374, -76.728948));
        cardboard.add(new Center("Westreet Industries", "5107 North Point Blvd. \n" +
                "Baltimore, MD 21219",
                "(410) 477-7500",  null, null, 39.241121, -76.455671));
        cardboard.add(new Center("World Recycling, Inc.", "5600 Columbia Park Road \n" +
                "Cheverly, MD 20785",
                "(301) 386-3010",  null, null, 38.916455, -76.910930));
    }

    //May want to add more specific details on the Third page of Electronics... (leave for later)
    public void elecInit() {
        electronics.add(new Center("A Better Way Computer Recycling LLC", "6655 Amberton Drive, Suite K\n" +
                "Elkridge, MD 21075",
                "(410) 381-5588",  "jeremy@abetterwayrecycling.com", "www.abetterwayrecycling.com", 39.188164, -76.749455));
        electronics.add(new Center("AMIT Recycling Solutions, Inc.", "8839 Kelso Drive, Suite E\n" +
                "Essex, MD 21221",
                "(443) 393-3371",  "info@amitrecycling.com", null, 39.335295, -76.474368));
        electronics.add(new Center("Annapolis Office Technologies", "561 E. Central Ave\n" +
                "Edgewater, MD 21037",
                "(443) 336-3018", "annapolisrecycling@verizon.net", "annapolisrecycling.com", 38.912347, -76.545242));
        electronics.add(new Center("Arundel Computers", "7436 Ritchie Highway\n" +
                "Glen Burnie, MD 21061",
                "(410) 766-0862", "www.arundelcomputers.com", null, 39.165799, -76.622818));
        electronics.add(new Center("Better Shredder, Inc.", "10701 Bower Ave\n" +
                "Williamsport, MD 21795",
                "(866) 210-5433", "bettershredder@earthlink.net", null, 39.6084166,-77.7735591));
        electronics.add(new Center("BPAI, LLC", "901 Curtain Avenue\n" +
                "Baltimore, MD 21218",
                "(410) 662-6380", "bpeters@bpaillc.com", null, 39.315476, -76.603260));
        electronics.add(new Center("Broadview Waste Services (BWS Inc.)", "7610 Energy Parkway\n" +
                "Baltimore, MD 21226",
                "(410) 437-6590", "info@bwaste.com", "www.bwaste.com", 39.176876, -76.547777));
        electronics.add(new Center("C.N. Robinson Lighting", "4318 Washington Boulevard\n" +
                "Baltimore, MD 21227",
                "(410) 242-4172", "rob@cnrlight.com", null, 39.239067, -76.682140));
        electronics.add(new Center("Capital Recycling Services", "12036 Old Baltimore Pike\n" +
                "Beltsville, MD 20705",
                "(301) 699-6244", null, null, 39.054069, -76.886234));
        electronics.add(new Center("Capitol Asset Recycling, Inc.", "4721 Boston Way, Suite A\n" +
                "Lanham, MD 20706",
                "(240) 696-2572", null, null, 38.953750, -76.839303));
        electronics.add(new Center("CDM e-Cycling", "500 N. North Point Road\n" +
                "Baltimore, MD 21237",
                "(410) 485-4040", "mike@cdm4recycling.com", "www.cdm4recycle.com", 39.300848, -76.536672));
        electronics.add(new Center("Chesapeake PC Users Group, Inc.", "1783 Forest Drive, #285\n" +
                "Annapolis, MD 21403",
                "(410) 923-1550", "jmmosk@comcast.net", "www.chesapeakepcusersgroup.org", 38.965912, -76.515283));
        electronics.add(new Center("Commercial Retrofitters & Recyclers", "15031-A Marlboro Pike\n" +
                "Upper Marlboro, MD 20772",
                "(301) 358-6324", "pgoff@commretrorecycle.com", "www.commretrorecycle.com", 38.818937,-76.741959));
        electronics.add(new Center("Davis Memorial Goodwill Industries", "2200 South Dakota Avenue\n" +
                "Washington, DC 20018",
                "(202) 636-4225", "donations@goodwill.org", null, 38.918932, -76.955953));
        electronics.add(new Center("e-End USA", "2421 Monocacy Blvd., Unit E\n" +
                "Frederick, MD 21701",
                "(240) 529-1010", " steve@eendusa.com", "www.eendusa.com", 39.447807, -77.385978));
        electronics.add(new Center("Electronic Solution Services", "1923 Lansdowne Road\n" +
                "Baltimore, MD 21227",
                "(410) 536-1111", "st@imt-pc.com", null, 39.253005, -76.667379));
        electronics.add(new Center("eRevival, LLC", "19344 Circle Gate Drive\n" +
                "Germantown, MD 20874",
                "(800) 696-8042", "contact@erevival.net", null, 39.174423, -77.266609));
        electronics.add(new Center("Freedom Electronics Recycling, Inc", "10307 Partnership Court, Suite 200\n" +
                "Williamsport, MD 21795",
                "(301) 223-4123",  "rschulman@freedomrecycling.com", null, 39.597161, -77.798040));
        electronics.add(new Center("Green Computer Recycling Inc.", "1212 East 25th Street\n" +
                "Baltimore, MD 21218",
                "(443) 682-7577",  "amalik@recyclegcr.com", "www.recyclegcr.com", 39.317235, -76.597851));
        electronics.add(new Center("Lazarus Foundation", "6520 Freetown Road\n" +
                "Columbia, MD 21044",
                "(410) 531-8485",  null, "www.lazarus.org", 39.194597, -76.881013));
        //electronics.add(new Center("Lazarus", "6520 Freetown Road\n" +
        //        "Columbia, MD 21044",
        //        "(410) 531-8485",  null, "www.lazarus.org"));
        electronics.add(new Center("Nova Services, Inc.", "2500 Grays Road\n" +
                "Baltimore, MD 21222",
                "(410) 388-2200",  "dkellermann@novarecycles.com", null, 39.246002, -76.464447));
        electronics.add(new Center("Pasadena Recycling, LLC", "7946 Fort Smallwood Road\n" +
                "Baltimore, MD 21226",
                "(410) 255-9151",  "linchristian@pasadenarecyclingllc.com", null, 39.170783, -76.535197));
        electronics.add(new Center("Re-use Barn", "4200 Gardiner Road\n" +
                "Waldorf, MD 20601",
                "(301) 645-9451",  null, null, 38.599362, -76.843652));
        electronics.add(new Center("Retire-IT, LLC", "938 Dennison Avenue\n" +
                "Columbia, MD 43201",
                "(614) 522-2301",  null, "www.retire-it.com", 39.981132, -83.008531));
        electronics.add(new Center("Second Chance Inc.", "1700 Ridgely Street\n" +
                "Baltimore, MD 21230",
                "(410) 385-1101",  "admin@secondchanceinc.org", "www.secondchanceinc.org", 39.273644, -76.630354));
        electronics.add(new Center("Securis", "14231 Cherry Lane Court\n" +
                "Laurel, MD 20707",
                "(301) 363-4789",  "MD03@securis.com", "www.securis.com/central-maryland-2", 39.087198, -76.855628));
        electronics.add(new Center("Securis Baltimore", "8841 Kelso Drive\n" +
                "Baltimore, MD 21220",
                "(443) 734-3344",  "gparks@securis.com", "www.securis.com/baltimore", 39.335295, -76.474368));
        electronics.add(new Center("ShredStation Express of Maryland", "2731 Deer Ridge Drive\n" +
                "Silver Spring, MD 20904",
                "(301) 832-6227",  null, null, 39.064568, -76.952712));
        electronics.add(new Center("TurboHaul", "11700 Old Baltimore Pike\n" +
                "Beltsville, MD 20705",
                "(301) 931-6993",  "kevindaly@turbohaul.com", null, 39.045637, -76.893558));
        electronics.add(new Center("TurtleWings", "1771 Olive Street\n" +
                "Capitol Heights, MD 20743",
                "(301) 583-8399",  "info@turtlewings.com", "www.turtlewings.com", 38.913275, -76.930063));
        electronics.add(new Center("UNICOR, Federal Prison Industries, Inc.", "1923 Vermont Avenue, NW\n" +
                "Washington, DC 20001",
                "(202) 305-3884",  null, "www.unicor.gov", 38.916170, -77.025801));
        electronics.add(new Center("United Way Community Resource Bank", "6620 Amberton Drive\n" +
                "Elkridge, MD 21075",
                "(410) 379-5522",  "art.eich@uwcm.org", null, 39.189099, -76.751226));
    //    electronics.add(new Center("", "",
    //            "",  null, null));
    }

    public void lampsInit() {
        fluorescents.add(new Center("B & B Lighting Supply, Inc.", "2901 Druid Park Drive, Suite A110\n" +
                "Baltimore, MD 21215",
                "(410) 523-7300",  "sbradford@bnblightingsupply.com", null, 39.324410, -76.659269));
        fluorescents.add(new Center("Batteries & Bulbs", "29 East Padonia Road\n" +
                "Timonium, MD 21093",
                "(410) 628-7999",  "BP889@batteriesplus.net", "www.batteriesplusbulbs.com", 39.456280, -76.632304));
        fluorescents.add(new Center("Broadview Waste Services (BWS Inc.)", "7610 Energy Parkway\n" +
                "Baltimore, MD 21226",
                "(410) 437-6590",  "info@bwaste.com", "www.bwaste.com", 39.176876, -76.547777));
        fluorescents.add(new Center("C.N. Robinson Lighting", "4318 Washington Boulevard\n" +
                "Baltimore, MD 21227",
                "(410) 242-4172",  "rob@cnrlight.com", null, 39.239067, -76.682140));
        fluorescents.add(new Center("Clean Venture, Inc.", "2931 Whittington Avenue\n" +
                "Baltimore, MD 21230",
                "(410) 368-9170",  null, "www.chclechem.com", 39.259167, -76.656604));
        fluorescents.add(new Center("Commercial Retrofitters & Recyclers", "15031-A Marlboro Pike\n" +
                "Upper Marlboro, MD 20772",
                "(301) 358-6324", "pgoff@commretrorecycle.com", "www.commretrorecycle.com", 38.818937,-76.741959));
        fluorescents.add(new Center("EQ-The Environmental Quality Company", "3508-B Fairfield Avenue\n" +
                "Baltimore, MD 21226",
                "(410) 354-2221",  null, "www.eqonline.com", 39.232982, -76.577236));
        fluorescents.add(new Center("Geller Lighting Supply, Inc.", "3720 Commerce Drive \n" +
                "Baltimore, MD 21227",
                "(410) 247-3636",  null, null, 39.249663, -76.673260));
        fluorescents.add(new Center("Safety Kleen Corporation (Baltimore)", "1448 Desoto Road \n" +
                "Baltimore, MD 21230",
                "(410) 525-0001",  null, null, 39.267817, -76.658911));
    }

    private void organicsInit() {
        organics.add(new Center("Banks of Eden Farm", "4318 Allen Road \n" +
                "Salisbury, MD 21801",
                "(410) 749-8994",  null, null, 38.312048, -75.647707));
        organics.add(new Center("Better Composting, Inc.", "3132 Murray Road \n" +
                "Finksburg, MD 21048",
                "(410) 833-8330",  null, null, 39.490125, -76.887302));
        organics.add(new Center("Earth Wise Compost & Recycling Center", "2209 Cox Road\n" +
                "Gambrills, MD 21054",
                "(410) 793-0127",  null, null, 38.986693, -76.688097));
        organics.add(new Center("Garrity Renewables LLC", "328 Bush Chapel Road\n" +
                "Aberdeen, MD 21001",
                "(410) 935-6404",  "justen@garrityrenewables.com", "www.garrityrenewables.com", 39.515422, -76.193571));
        organics.add(new Center("Prism Environmental Group, Inc.", "610 Somerset Road, Suite 103\n" +
                "Baltimore, MD 21210",
                "(410) 433-5804", "prism@us.net", null, 39.341856, -76.632120));
        organics.add(new Center("Valley Proteins, Inc.", "1515 Open Street \n" +
                "Baltimore, MD 21226",
                "(410) 355-4800",  null, null, 39.213983, -76.589969));
        organics.add(new Center("Waste Neutral", "2901 Waterview Avenue\n" +
                "Baltimore, MD 21230",
                "(443) 838-1826",  "keith@wasteneutral.com", null, 39.258598, -76.633708));
    }

    private void glassInit() {
        glass.add(new Center("Baltimore County Resource Recovery Facility", "10320 York Road\n" +
                "Cockeysville, MD 21030",
                "(410) 628-1130",  null, null, 39.472208, -76.639996));
        glass.add(new Center("BFI Waste Services, LLC (Hagerstown)", "11710 Green Castle Pike\n" +
                "Hagerstown, MD 21740",
                "(301) 223-5952",  null, null, 39.635426, -77.808982));
        glass.add(new Center("BFI Waste Services, LLC (Baltimore 2)", "5800 Chemical Road\n" +
                "Baltimore, MD 21226",
                "(410) 350-0325",  null, null, 39.209335, -76.568951));
        glass.add(new Center("BFI Waste Services, LLC (Fredrick)", "8145 Reichs Ford Road\n" +
                "Frederick, MD 21704",
                "(301) 694-6495",  null, null, 39.386127, -77.380182));
        glass.add(new Center("Consolidated Waste", "7707 Brookville Road\n" +
                "Chevy Chase, MD 20815",
                "(202) 269-3303",  null, null, 38.987377, -77.071316));
        glass.add(new Center("Design Recycle, Inc.", "4653 Hollins Ferry Road\n" +
                "Halethorpe, MD 21227",
                "(202) 374-4863",  null, null, 39.250494, -76.647148));
        glass.add(new Center("Diamond Waste Services", "508 Glenbrook Road\n" +
                "Glen Burnie, MD 21061",
                "(410) 350-7000",  "anita.crehan@diamond-waste.com", null, 39.162405, -76.650888));
        glass.add(new Center("Eagle Management Systems, Inc.", "6130 N. Capitol Street NW\n" +
                "Washington, DC 20011",
                "(202) 291-0200",  null, null, 38.965201, -77.009164));
        glass.add(new Center("Harford Sanitation", "440 Franklin Street \n" +
                "Bel Air, MD 21014",
                "(410) 838-5472",  null, null, 39.542335, -76.353543));
        glass.add(new Center("Infinity Recycling, Inc.", "300 Old McGinnis Lane \n" +
                "Chestertown, MD 21620",
                "(410) 778-5949",  null, "www.infinityrecycling.org", 39.218866, -76.069004));
        glass.add(new Center("Montgomery County Material Recovery Facility", "16105 Frederick Avenue \n" +
                "Derwood, MD 20855",
                "(301) 417-1433",  null, null, 39.115756, -77.16645));
        glass.add(new Center("Ocean City Recycling Center", "210 65th Street\n" +
                "Ocean City, MD 21842",
                "(410) 524-5356",  null, null, 38.387701, -75.066977));
        glass.add(new Center("Prince Georges Co. Materials Recovery Facility", "1000 Ritchie Road \n" +
                "Capitol Heights, MD 20743",
                "(301) 499-1707",  null, null, 38.877910, -76.858081));
        glass.add(new Center("Soil Safe, Inc.", "6700 Alexander Bell Drive, Suite 300\n" +
                "Columbia, MD 21046",
                "(410) 872-3990",  "info@soilsafe.com", "www.soilsafe.com", 39.184995, -76.807938));
        glass.add(new Center("Universal Recycling, Inc.", "1000 Ritchie Road\n" +
                "Capital Heights, MD 20743-3706",
                "(301) 336-5932",  null, null, 38.877910, -76.858081));
        glass.add(new Center("World Recycling, Inc.", "5600 Columbia Park Road \n" +
                "Cheverly, MD 20785",
                "(301) 386-3010",  null, null, 38.916455, -76.910930));
        //glass.add(new Center("", "",
        //        "",  null, null));
    }

    private void gypsumInit() {
        gypsum.add(new Center("Better Composting, Inc.", "3132 Murray Road \n" +
                "Finksburg, MD 21048",
                "(410) 833-8330",  null, null, 39.490125, -76.887302));
        gypsum.add(new Center("L & J Waste Recycling LLC", "222 N. Calverton Road\n" +
                "Baltimore, MD 21223",
                "(410) 566-2323",  "lenzie@ljwasterecycling.com", null, 39.290689, -76.657890));
        gypsum.add(new Center("United States Gypsum Company", "5500 Quarantine Road \n" +
                "Baltimore, MD 21226-1621",
                "(410) 355-6600",  "ccolman@usg.com", null, 39.212217, -76.552053));
    }

    private void tonersInit() {
        toners.add(new Center("Annapolis Office Technologies", "561 E. Central Ave\n" +
                "Edgewater, MD 21037",
                "(443) 336-3018",  "annapolisrecycling@verizon.net", "www.annapolisrecycling.com", 38.912347, -76.545242));
        toners.add(new Center("Atlantic Laser Service", "1826 White Oak Avenue\n" +
                "Baltimore, MD 21234",
                "(410) 668-9166",  null, null, 39.394204, -76.555977));
        toners.add(new Center("Automated Office Products", "9700A Martin Luther King, Jr. Hwy\n" +
                "Lanham, MD 20706",
                "(301)731-4000",  null, null, 38.950877, -76.838968));
        toners.add(new Center("Cartridge Technologies, Inc.", "15738 Crabbs Branch Way\n" +
                "Rockville, MD 20855",
                "(301) 417-7202",  "anamaria@ctimd.com", "www.ctimd.com", 39.111398, -77.155176));
        toners.add(new Center("Cove Manufacturing", "10745-3 Tucker Street \n" +
                "Beltsville, MD 20705-0938 ",
                "(800) 368-2769",  null, null, 39.025986, -76.908946));
        //toners.add(new Center("Imaging Supply Depot & Laser Life", "P.O. Box 972\n" +
        //        "Mount Airy, MD 21771",
        //        null,  "djones@imagingsupplies.com", "www.imagingsupplies.com"));
        //  Above - check to make sure no errors are thrown due to lack of #
        toners.add(new Center("Litz Green Recycling", "6655-D Mid Cities Avenue\n" +
                "Beltsville, MD 20705",
                "(240) 241-7623",  "info@litzgr.com", "www.litzgr.wixcom/54321litz#!", 39.053196, -76.890184));
        toners.add(new Center("Printer Solutions", "2137 Defense Highway, Suite 10\n" +
                "Crofton, MD 21114",
                "(301) 858-0470",  "rob@printersolutions.com", null, 38.991926, -76.698021));
        toners.add(new Center("Prism Environmental Group, Inc.", "610 Somerset Road, Suite 103\n" +
                "Baltimore, MD 21210",
                "(410) 433-5804",  "prism@us.net", null, 39.341856, -76.632120));
        toners.add(new Center("Securis", "14231 Cherry Lane Court\n" +
                "Laurel, MD 20707",
                "(301) 363-4789",  "MD03@securis.com", "www.securis.com/central-maryland-2/", 39.087198, -76.855628));
    }

    //TODO More here...
    private void metalsInit() {
        metals.add(new Center("1-800-GOT-JUNK?", "12031 Nebel Street\n" +
                "Rockville, MD 20852",
                "(800) 468-5865",  "baltimore@1800gotjunk.com", null, 39.052114, -77.110106));
        metals.add(new Center("1-888 TurboHaul", "11700 Old Baltimore Pike\n" +
                "Beltsville, MD 20705",
                "(301) 931-6993",  "kevindaly@turbohaul.com", null, 39.045637, -76.893558));
        metals.add(new Center("Allegany Scrap, Inc.", "2001 Kenilworth Avenue\n" +
                "Capital Heights, MD 20743",
                "(301) 777-2377",  null, null, 38.916084, -76.932401));
        metals.add(new Center("Allied Waste (Baltimore Processing Center)", "5800 Chemical Road\n" +
                "Baltimore, MD 21226",
                "(410) 350-0325",  null, "www.disposal.com", 39.209335, -76.568951));
        metals.add(new Center("Allstate Salvage, Inc.", "8491 Ocean Hwy\n" +
                "Pocomoke City, MD 21871",
                "(410) 957-4290",  null, null, 38.1136643,-75.6507957));
        metals.add(new Center("AMG Resources Corporation", "2415 Grays Road \n" +
                "Baltimore, MD 21222-5043",
                "(410) 477-0300",  null, "dmcsweeney@amgresources.com", 39.244905, -76.466702));
        metals.add(new Center("Ansam Metals Corporation", "1026 East Patapsco Avenue\n" +
                "Baltimore, MD 21225-2295",
                "(410) 355-8220",  "mail@ansammetals.com", null, 39.234032, -76.594870));
        metals.add(new Center("Arundel Recycling Center, Inc.", "7517 Connelly Drive\n" +
                "Hanover, MD 21076",
                "(410) 761-6595",  null, "www.arundelrecycling.com", 39.156744, -76.680951));
        metals.add(new Center("Auston Contracting, Inc.", "1202 Pauls Lane\n" +
                "Joppa, MD 21085",
                "(410) 335-1016",  null, null, 39.432649, -76.350174));
        metals.add(new Center("B & S Scrap", "182 Fingerboard Road\n" +
                "Oakland, MD 21550",
                "(301) 334-2676",  null, null, 39.420149, -79.479768));
        metals.add(new Center("Baltimore County Resource Recovery Facility", "10320 York Road\n" +
                "Cockeysville, MD 21030",
                "(410) 628-1130",  null, null, 39.472208, -76.639996));
        metals.add(new Center("Baltimore Scrap Corporation", "3100 Weedon Street \n" +
                "Baltimore, MD 21226",
                "(410) 355-4455",  "jross@baltimorescrap.com", "www.baltimorescrap.com", 39.240781, -76.577751));
        metals.add(new Center("Benjer, Inc.", "11106 Redline Rd\n" +
                "Middle River, MD 21162",
                "(410) 335-2267",  "benjer@benjerinc.com", null, 39.3871626,-76.4204383));
        metals.add(new Center("Berg Recycling", "1401 West Hamburg Street \n" +
                "Baltimore, MD 21230",
                "(410) 837-5575",  null, "www.bergrecycling.com", 39.277282, -76.633711));
        metals.add(new Center("Better Shredder, Inc.", "10701 Bower Ave\n" +
                "Williamsport, MD 21795",
                "(866) 210-5433",  "bettershredder@earthlink.net", null, 39.6084166,-77.7735591));
        metals.add(new Center("BFI Waste Services, LLC (Hagerstown)", "11710 Green Castle Pike\n" +
                "Hagerstown, MD 21740",
                "(301) 223-5952",  null, null, 39.635426, -77.808982));
        /*
        metals.add(new Center("", "",
                "",  null, null));
        */
    }

    private void oilInit() {
        oil.add(new Center("Broadview Waste Services (BWS Inc.)", "7610 Energy Parkway\n" +
                "Baltimore, MD 21226",
                "(410) 437-6590",  "info@bwaste.com", "www.bwaste.com", 39.176876, -76.547777));
        oil.add(new Center("C&R Industries Antifreeze Recyclers", "50722 Lafayette Place\n" +
                "Hyattsville, MD 20781",
                "(301) 441-4824",  null, null, 38.956125, -76.935348));
        oil.add(new Center("Clean Venture, Inc.", "2931 Whittington Avenue\n" +
                "Baltimore, MD 21230",
                "(410) 368-9170",  null, "www.chclechem.com", 39.259167, -76.656604));
        oil.add(new Center("Enviro Pro", "1406 Allwood Lane, Suite T3\n" +
                "Belcamp, MD 21017",
                "(855) 900-8473",  "sowens@environmental-pro.com", "www.environmental-pro.com", 39.476851, -76.251474));
        oil.add(new Center("EQ-The Environmental Quality Company", "3508-B Fairfield Avenue\n" +
                "Baltimore, MD 21226",
                "(410) 354-2221",  null, "www.eqonline.com", 39.232982, -76.577236));
        oil.add(new Center("Kroff Materials Reprocessing, Inc.", "4605 Richlynn Drive, Suite 200\n" +
                "Belcamp, MD 21017",
                "(410) 272-3993",  "jcipollone@kroffmr.com", null, 39.478689, -76.234448));
        oil.add(new Center("Safety Kleen Corporation (Baltimore)", "1448 Desoto Road \n" +
                "Baltimore, MD 21230",
                "(410) 525-0001",  null, null, 39.267817, -76.658911));
        oil.add(new Center("Tri-State On Site Recycling", "2000 Hoffmaster Road \n" +
                "Knoxville, MD 21758",
                null,  null, null, 39.370153, -77.718597));
                //TODO fuck this string
        oil.add(new Center("USA Oil Refining, LLC", "171 Childs Road\n" +
                "Elkton, MD 21921",
                "(410) 392-0971",  null, null, 39.651617, -75.865204));
        /*
        oil.add(new Center("", "",
                "",  null, null));
        */
    }

    private void paperInit() {
        paper.add(new Center("1-800-GOT-JUNK?", "12031 Nebel Street\n" +
                "Rockville, MD 20852",
                "(800) 468-5865",  "baltimore@1800gotjunk.com", null, 39.052114, -77.110106));
        paper.add(new Center("AAA Secured Shredding Services", "3113 Lauren Hill Drive\n" +
                "Finksburg, MD 21048",
                "(410) 861-8970",  "sales@securedshredding.com", null, 39.487544, -76.903978));
        paper.add(new Center("All-Shred, Inc.", "4831 Winchester Boulevard\n" +
                "Frederick, MD 21703",
                "(301) 874-1480",  "marykulina@allshredmd.com", null, 39.347175, -77.497459));
        paper.add(new Center("Allied Waste (Baltimore Processing Center)", "5800 Chemical Road\n" +
                "Baltimore, MD 21226",
                "(410) 350-0325",  null, "www.disposal.com", 39.209335, -76.568951));
        paper.add(new Center("Athelas National Recovery Institute", "9104 Red Branch Road \n" +
                "Columbia, MD 21045",
                "(410) 964-1241",  null, null, 39.231179, -76.817728));
        paper.add(new Center("Baltimore County Resource Recovery Facility", "10320 York Road\n" +
                "Cockeysville, MD 21030",
                "(410) 628-1130",  null, null, 39.472208, -76.639996));
        paper.add(new Center("Benjer, Inc.", "11106 Redline Rd\n" +
                "Middle River, MD 21162",
                "(410) 335-2267",  "benjer@benjerinc.com", null, 39.3871626,-76.4204383));
        paper.add(new Center("BFI Waste Services, LLC (Delmar)", "9140 Ocean Highway\n" +
                "Delmar, MD 21875",
                "(410)742-8246",  null, null, 38.443439, -75.560849));
        paper.add(new Center("BFI Waste Services, LLC (Finksburg)", "2940 Dede Road \n" +
                "Finksburg, MD 21048",
                "(410) 526-5149",  null, null, 39.492605, -76.883762));
        paper.add(new Center("BFI Waste Services, LLC (Hagerstown)", "11710 Green Castle Pike\n" +
                "Hagerstown, MD 21740",
                "(301) 223-5952",  null, null, 39.635426, -77.808982));
        paper.add(new Center("BFI Waste Services, LLC (Baltimore 2)", "5800 Chemical Road\n" +
                "Baltimore, MD 21226",
                "(410) 350-0325",  null, null, 39.209335, -76.568951));
        paper.add(new Center("BFI Waste Services, LLC (Fredrick)", "8145 Reichs Ford Road\n" +
                "Frederick, MD 21704",
                "(301) 694-6495",  null, null, 39.386127, -77.380182));
        paper.add(new Center("Broadview Waste Services (BWS Inc.)", "7610 Energy Parkway\n" +
                "Baltimore, MD 21226",
                "(410) 437-6590",  "info@bwaste.com", "www.bwaste.com", 39.176876, -76.547777));
        paper.add(new Center("Budget Shred", "9475 Gerwig Lane\n" +
                "Columbia, MD 21046",
                "(888) 747-3356",  "info@budgetshred.com", "www.budgetshred.com", 39.171046, -76.839479));
        paper.add(new Center("CH Recycling Company (Baltimore)", "1532 Thames Street\n" +
                "Baltimore, MD 21231",
                "(410) 522-0110",  "jsloan@chrecycling.com", "www.chrecycling.com", 39.280598, -76.595397));
        paper.add(new Center("Cintas Document Management", "6770 Oak Hall Lane, Suite 107\n" +
                "Columbia, MD 21046",
                "(240) 294-0389",  "pelosom@cintas.com", null, 39.184880, -76.822554));
        paper.add(new Center("Consolidated Waste", "7707 Brookville Road\n" +
                "Chevy Chase, MD 20815",
                "(202) 269-3303",  null, null, 38.987377, -77.071316));
        paper.add(new Center("CreaFill Fibers Corporation", "10200 Worton Road \n" +
                "Chestertown, MD 21620",
                "(410) 810-0779",  "fiber@cffcorp.com", null, 39.272542, -76.091155));
        paper.add(new Center("D C Intercel", "1401 Cherry Hill Road\n" +
                "Baltimore, MD 21225",
                "(410) 355-5800",  null, null, 39.251968, -76.632679));
        paper.add(new Center("Delmarva Recycling, Inc.", "909 Boundary Street\n" +
                "Salisbury, MD 21801",
                "(410) 546-1111",  null, null, 38.371327, -75.611185));
        paper.add(new Center("Dixie Pulp & Paper", "1401 Cherry Hill Road\n" +
                "Baltimore, MD 21225",
                "(410) 355-5800",  null, null, 39.251968, -76.632679));
        paper.add(new Center("Dutton Avenue Marketing", "6400 Baltimore National Pike \n" +
                "Baltimore, MD 21228",
                "(410) 788-7326",  null, null, 39.284346, -76.756711));
        paper.add(new Center("Eagle Management Systems, Inc.", "6130 N. Capitol Street NW\n" +
                "Washington, DC 20011",
                "(202) 291-0200",  null, null, 38.965201, -77.009164));
        paper.add(new Center("Eagle Recycling LLC", "510 West Road\n" +
                "Salisbury, MD 21801",
                "(410) 677-3777",  "kaleb.eagle@gmail.com", "www.eaglerecyclingllc.net", 38.372172, -75.607452));
        paper.add(new Center("Eastern Recycling, LLC", "5107 North Point Boulevard\n" +
                "Sparrows Point, MD 21219",
                "(410) 477-7500",  null, "www.ersmd.com", 39.241121, -76.455671));
        paper.add(new Center("Eco-Shred LLC", "5600 Columbia Park Road\n" +
                "Cheverly, MD 20785",
                "(301) 386-3010",  null, null, 38.916455, -76.910930));
        paper.add(new Center("Encore Recycling", "13211 Virginia Manor Road\n" +
                "Laurel, MD 20707",
                "(410) 813-2610", null, null, 39.068534, -76.888588));
        paper.add(new Center("Fibre Marketing Group", "120 Alco Place\n" +
                "Lansdowne, MD 21227",
                "(410) 247-3084",  null, null, 39.247657, -76.649758));
        paper.add(new Center("Garrity Renewables LLC", "328 Bush Chapel Road\n" +
                "Aberdeen, MD 21001",
                "(410) 935-6404",  "justen@garrityrenewables.com", "www.garrityrenewables.com", 39.515422, -76.193571));
        paper.add(new Center("Georgetown Paper Stock of Rockville", "14820 Southlawn Lane\n" +
                "Rockville, MD 20850",
                "(301) 762-6990",  null, null, 39.098131, -77.136337));
        paper.add(new Center("Hanna Paper Recycling", "8840 Greenwood Place\n" +
                "Savage, MD 20763",
                "(301) 604-3302",  null, "www.hannapaper.com", 39.130296, -76.812812));
        paper.add(new Center("Infinity Recycling, Inc.", "300 Old McGinnis Lane \n" +
                "Chestertown, MD 21620",
                "(410) 778-5949",  null, "www.infinityrecycling.org", 39.218866, -76.069004));
        paper.add(new Center("Kline Paper Mill Supplies, Inc.", "9475 Gerwig Lane\n" +
                "Columbia, MD 21046",
                "(410) 381-6363",  null, "www.klinepaper.com", 39.171046, -76.839479));
        paper.add(new Center("Modern Junk & Salvage", "1423 North Freemont Ave. \n" +
                "Baltimore, MD 21217",
                "(410) 669-8290",  null, null, 39.304720, -76.637522));
        paper.add(new Center("Montgomery County Material Recovery Facility", "16105 Frederick Avenue \n" +
                "Derwood, MD 20855",
                "(301) 417-1433",  null, null, 39.115756, -77.16645));
        paper.add(new Center("Nova Services, Inc.", "2500 Grays Road\n" +
                "Baltimore, MD 21222",
                "(410) 388-2200",  "dkellermann@novarecycles.com", "www.novarecycles.com", 39.246002, -76.464447));
        paper.add(new Center("Ocean City Recycling Center", "210 65th Street\n" +
                "Ocean City, MD 21842",
                "(410) 524-5356",  null, null, 38.387701, -75.066977));
        paper.add(new Center("Prince Georges Co. Materials Recovery Facility", "1000 Ritchie Road \n" +
                "Capitol Heights, MD 20743",
                "(301) 499-1707",  null, null, 38.877910, -76.858081));
        paper.add(new Center("Proshred Security", "1550 Caton Center Drive\n" +
                "Baltimore, MD 21227",
                "(410) 242-9224",  null, null, 39.256380, -76.682254));
        paper.add(new Center("Roll-Off Express", "2900 Dede Road \n" +
                "Finksburg, MD 21048",
                "(410) 526-3535",  "rolloffjack@aol.com", null, 39.493486, -76.883364));
        paper.add(new Center("The Owl Corporation", "1900 Graves Court\n" +
                "Baltimore, MD 21222",
                "(410) 282-0067",  "jlpaperbuyer@aol.com", "www.theowlcorp.com", 39.257142, -76.499385));
        paper.add(new Center("The Shredding Company, Inc.", "9125 Industrial Court\n" +
                "Gaithersburg, MD 20877",
                "(301) 845-4499",  "chris@shreddingcompanydc.com", "www.shreddingcompanydc.com", 39.119301, -77.188030));
    }

    private void plasticsInit() {
        plastics.add(new Center("Advanced Recycling, LLC", "10302 Little Patuxent Parkway, Suite 300\n" +
                "Columbia, MD 21044",
                "(301) 362-1119",  null, null, 39.216545, -76.858150));
        plastics.add(new Center("Allied Waste (Baltimore Processing Center)", "5800 Chemical Road\n" +
                "Baltimore, MD 21226",
                "(410) 350-0325",  null, null, 39.209335, -76.568951));
        plastics.add(new Center("Arc of Washington County, Inc.", "1000 Florida Avenue\n" +
                "Hagerstown, MD 21740",
                "(204) 527-2204",  null, null, 39.657308, -77.728221));
        plastics.add(new Center("Arundel Recycling Center, Inc.", "7517 Connelly Drive\n" +
                "Hanover, MD 21076",
                "(410) 761-6595",  null, "www.arundelrecycling.com", 39.156744, -76.680951));
        plastics.add(new Center("Baltimore County Resource Recovery Facility", "10320 York Road\n" +
                "Cockeysville, MD 21030",
                "(410) 628-1130",  null, null, 39.472208, -76.639996));
        plastics.add(new Center("BFI Waste Services, LLC (Hagerstown)", "11710 Green Castle Pike\n" +
                "Hagerstown, MD 21740",
                "(301) 223-5952",  null, null, 39.635426, -77.808982));
        plastics.add(new Center("BFI Waste Services, LLC (Baltimore 2)", "5800 Chemical Road\n" +
                "Baltimore, MD 21226",
                "(410) 350-0325",  null, null, 39.209335, -76.568951));
        plastics.add(new Center("BFI Waste Services, LLC (Fredrick)", "8145 Reichs Ford Road\n" +
                "Frederick, MD 21704",
                "(301) 694-6495",  null, null, 39.386127, -77.380182));
        plastics.add(new Center("C.R. Daniels, Inc.", "3451 Ellicott Center Drive \n" +
                "Ellicott City, MD 21043",
                "(410) 461-2100",  null, null, 39.276718, -76.814647));
        plastics.add(new Center("Consolidated Waste", "7707 Brookville Road\n" +
                "Chevy Chase, MD 20815",
                "(202) 269-3303",  null, null, 38.987377, -77.071316));
        plastics.add(new Center("Eagle Management Systems, Inc.", "6130 N. Capitol Street NW\n" +
                "Washington, DC 20011",
                "(202) 291-0200",  null, null, 38.965201, -77.009164));
        plastics.add(new Center("Eagle Recycling LLC", "510 West Road\n" +
                "Salisbury, MD 21801",
                "(410) 677-3777",  "kaleb.eagle@gmail.com", "www.eaglerecyclingllc.net", 38.372172, -75.607452));
        plastics.add(new Center("Eastern Recycling, LLC", "5107 North Point Boulevard\n" +
                "Sparrows Point, MD 21219",
                "(410) 477-7500",  null, "www.ersmd.com", 39.241121, -76.455671));
        plastics.add(new Center("Nova Services, Inc.", "2500 Grays Road\n" +
                "Baltimore, MD 21222",
                "(410) 388-2200",  "dkellermann@novarecycles.com", "www.novarecycles.com", 39.246002, -76.464447));
        plastics.add(new Center("Ocean City Recycling Center", "210 65th Street\n" +
                "Ocean City, MD 21842",
                "(410) 524-5356",  null, null, 38.387701, -75.066977));
        plastics.add(new Center("Prince Georges Co. Materials Recovery Facility", "1000 Ritchie Road \n" +
                "Capitol Heights, MD 20743",
                "(301) 499-1707",  null, null, 38.877910, -76.858081));
        plastics.add(new Center("Secondary Solutions", "P.O. Box 727\n" +
                "Funkstown, MD 21734-0727",
                "(301) 797-4237",  "ssolut1121@aol.com", null, 39.6079175,-77.7075874));
    }

    private void textInit() {
        textiles.add(new Center("Debois Textiles, Inc.", "1835 Washington Boulevard\n" +
                "Baltimore, MD 21230",
                "(800) 769-6399",  null, null, 39.274985, -76.642620));
        textiles.add(new Center("Delmarva Recycling, Inc.", "909 Boundary Street\n" +
                "Salisbury, MD 21801",
                "(410) 546-1111",  null, null, 38.371327, -75.611185));
        textiles.add(new Center("ROW Clothing Enterprises", "2523 Gwynns Falls Parkway \n" +
                "Baltimore, MD 21216",
                "(410) 523-5340",  null, null, 39.315837, -76.657135));
    }

    private void tiresInit() {
        tires.add(new Center("Auston Contracting, Inc.", "1202 Pauls Lane\n" +
                "Joppa, MD 21085",
                "(410) 335-1016",  "auston1@verizon.net", null, 39.432649, -76.350174));
        tires.add(new Center("Catalyst & Chemical Systems, Inc. of MD", "2100 Muir Way\n" +
                "Bel Air, MD 21015",
                "(410) 569-1200",  null, null, 39.498999, -76.318218));
        tires.add(new Center("Design Recycle, Inc.", "4653 Hollins Ferry Road\n" +
                "Halethorpe, MD 21227",
                "(202) 374-4863",  "jeiassociates@aol.com", null, 39.250494, -76.647148));
        tires.add(new Center("Emanuel Tire Company", "1300 Moreland Avenue\n" +
                "Baltimore, MD 21216",
                "(410) 947-0725",  null, "www.emanueltire.com", 39.304504, -76.655666));
        tires.add(new Center("Enviro Pro", "1406 Allwood Lane, Suite T3\n" +
                "Belcamp, MD 21017",
                "(855) 900-8473",  "sowens@environmental-pro.com", "www.environmental-pro.com", 39.476851, -76.251474));
        tires.add(new Center("L & J Waste Recycling LLC", "222 N. Calverton Road\n" +
                "Baltimore, MD 21223",
                "(410) 566-2323",  "lenzie@ljwasterecycling.com", null, 39.290689, -76.657890));
        tires.add(new Center("REC-Creative, Inc.", "2719 Bird View Road\n" +
                "Westminster, MD 21157",
                "(410) 876-0848",  null, null, 39.499736, -76.950144));
        tires.add(new Center("Safety Ring", "7300 Pyle Road\n" +
                "Bethesda, MD 20817",
                "(301) 229-7250",  null, null, 38.982230, -77.130286));
        tires.add(new Center("TurboHaul", "11700 Old Baltimore Pike\n" +
                "Beltsville, MD 20705",
                "(301) 931-6993",  null, "kevindaly@turbohaul.com", 39.045637, -76.893558));
    }

    private void palletsInit() {
        pallets.add(new Center("Blue Ribbon Pallets", "1679 Blue Ribbon Road \n" +
                "Oakland, MD 21550",
                "(301) 334-58100",  null, null, 39.328389, -79.431383));
        pallets.add(new Center("Brandywine Enterprises", "5800 Sheriff Road\n" +
                "Fairmont Heights, MD 20743-6302",
                "(301) 925-8100",  "bmcalwee@brandywineco.com", null, 38.907005, -76.904060));
        pallets.add(new Center("Butler Tree Service, LLC", "4039 Tuscarora Road\n" +
                "Point of Rocks, MD 21777",
                "(301) 607-4541",  "wbwoodrecycling@aol.com", "http://www.butlerwoodrecycling.com", 39.275562, -77.52684));
        pallets.add(new Center("Design Recycle, Inc.", "4653 Hollins Ferry Road\n" +
                "Halethorpe, MD 21227",
                "(202) 374-4863",  "jeiassociates@aol.com", null, 39.250494, -76.647148));
        pallets.add(new Center("Earth Wise Compost & Recycling Center", "2209 Cox Road\n" +
                "Gambrills, MD 21054",
                "(410) 793-0127",  null, null, 38.986693, -76.688097));
        pallets.add(new Center("Edrich Lumber Company, Inc.", "9700 Old Court Road \n" +
                "Baltimore, MD 21244",
                "(410) 922-5959",  "sweizman@edrichlum.net", "www.edrich-lumber.com", 39.345448, -76.817382));
        pallets.add(new Center("Fairway Pallet Company", "8225 Fischer Road\n" +
                "Baltimore, MD 21222",
                "(410) 477-0610",  null, null, 39.275368, -76.461565));
        pallets.add(new Center("Franks Pallet Services", "6201 Pulaski Highway\n" +
                "Baltimore, MD 21205",
                "(410) 631-7199",  null, null, 39.303005, -76.544600));
        pallets.add(new Center("King Pallet", "1114 Hengemihle Avenue\n" +
                "Essex, MD 21221 ",
                "(410) 682-2992",  null, null, 39.325138, -76.476052));
        pallets.add(new Center("Mid-Atlantic Pallet Company", "7407 Sparr Drive\n" +
                "Kingsville, MD 21087",
                "(410) 879-1700",  null, null, 39.441573, -76.416031));
        pallets.add(new Center("Nelson Company", "2116 Sparrows Point Road \n" +
                "Baltimore, MD 21219",
                "(410) 477-3000",  "dcaltrider@nelsoncompany.com", "www.nelsoncompany.com", 39.231768, -76.464278));
        pallets.add(new Center("Nova Services, Inc.", "2500 Grays Road\n" +
                "Baltimore, MD 21222",
                "(410) 388-2200",  "dkellermann@novarecycles.com", "www.novarecycles.com", 39.246002, -76.464447));
        pallets.add(new Center("P.T. O'Malley Lumber Company", "4242 North Point Boulevard\n" +
                "Baltimore, MD 21222",
                "(410) 477-0500",  null, "http://www.omalleylumber.com/", 39.260103, -76.463005));
        pallets.add(new Center("Pallet Repair, Incorporated", "250 South Kresson Street \n" +
                "Baltimore, MD 21224",
                "(410) 327-1220",  null, null, 39.289761, -76.559770));
        pallets.add(new Center("Polo Pallet Company, Inc.", "1726 E Old Philadelphia Rd \n" +
                "Elkton, MD 21921",
                "(410) 398-6573",  null, null, 39.602647,-75.877704));
        pallets.add(new Center("Roll-Off Express", "2900 Dede Road \n" +
                "Finksburg, MD 21048",
                "(410) 526-3535",  "rolloffjack@aol.com", null, 39.493486, -76.883364));
        pallets.add(new Center("The Pallet Guy", "2015 Washington Blvd\n" +
                "Baltimore, MD 21090",
                "(410) 528-9071",  "danielle@thepalletguy.com", null, 39.2720625,-76.6461475));
        pallets.add(new Center("TurboHaul", "11700 Old Baltimore Pike\n" +
                "Beltsville, MD 20705",
                "(301) 931-6993",  "kevindaly@turbohaul.com", null, 39.045637, -76.893558));
        pallets.add(new Center("Valleywood Industries, Inc. / Pallet Masters", "6517 Landay Avenue\n" +
                "Baltimore, MD 21237",
                "(410) 488-5500",  null, null, 39.303825, -76.537424));
    }

    /*
        Pre: A string which matches with a given Center Array (from the Spinner object - matches the strings in the string.xml)
        Post:Returns the array storing the requested type of recycling centers, null if an invalid request -
        handling is expected on the other side, but there should not ba any invalid requests
     */ //Was Center[]
    public ArrayList<Center> getType(String str) {
        if (str.equals("Asphalt Shingles")) {
            shinglesInit();
            return shingles;
        } else if (str.equals("Asphalt, Bricks and Concrete")) {
            bricksInit();
            return bricks;
        } else if (str.equals("Batteries")) {
            batteriesInit();
            return batteries;
        } else if (str.equals("Cardboard")) {
            cardboardInit();
            return cardboard;
        } else if (str.equals("Electronics")) {
            elecInit();
            return electronics;
        } else if (str.equals("Fluorescent Lamps") || str.equals("lamps")) {
            lampsInit();
            return fluorescents;
        } else if (str.equals("Food Waste and Organics")) {
            organicsInit();
            return organics;
        } else if (str.equals("Glass")) {
            glassInit();
            return glass;
        } else if (str.equals("Gypsum")) {
            gypsumInit();
            return gypsum;
        } else if (str.equals("Laser Toner Cartridges")) {
            tonersInit();
            return toners;
        } else if (str.equals("Metals")) {
            metalsInit();
            return metals;
        } else if (str.equals("Motor Oil and Antifreeze")) {
            oilInit();
            return oil;
        } else if (str.equals("Paper and Paper Shredding")) {
            paperInit();
            return paper;
        } else if (str.equals("Plastics")) {
            plasticsInit();
            return plastics;
        } else if (str.equals("Textiles")) {
            textInit();
            return textiles;
        } else if (str.equals("Tires")) {
            tiresInit();
            return tires;
        } else if (str.equals("Wood Pallets")) {
            palletsInit();
            return pallets;
        }

        return null;
    }
}
