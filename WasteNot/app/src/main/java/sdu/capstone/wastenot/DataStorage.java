package sdu.capstone.wastenot;

/**
 * Created by Holden on 3/27/2015.
 */
public class DataStorage {

    private Center[] shingles = new Center[5];
    private Center[] bricks = new Center[47]; //Damn son
    private Center[] batteries = new Center[37];
    private Center[] cardboard = new Center[68];
    //private Center[] garden = new Center[5];
    private Center[] dental = new Center[16];
    private Center[] electronics = new Center[90];
    private Center[] flourescents = new Center[5];
    private Center[] organics = new Center[5];
    private Center[] glass = new Center[5];
    private Center[] gypsum = new Center[5];
    private Center[] toners = new Center[5];
    private Center[] metals = new Center[5];
    private Center[] oil = new Center[5];
    private Center[] mercury = new Center[5];
    private Center[] paper = new Center[5];
    private Center[] plastics = new Center[5];
    private Center[] salvage = new Center[5];
    private Center[] unusual = new Center[5];
    private Center[] textiles = new Center[5];
    private Center[] tiles = new Center[5];
    private Center[] pallets = new Center[5];
    private Center[] wood = new Center[5];
    private Center[] other = new Center[5];


    public DataStorage() {
        init();
    }

    private void init() {
        shinglesInit();
        bricksInit();

    }


    private void shinglesInit() {
        shingles[0] = new Center("Brandywine Enterprises", "5800 Sheriff Road\n" +
                "Fairmont Heights, MD 20743-6302",
                "(301) 925-8100", "bmcalwee@brandywineco.com", "Brenda McAlwee");
        shingles[1] = new Center("Reliable Contracting", "1 Churchview Road\n" +
                "Millersville, MD 21108",
                "(410) 987-0313", null, null);
        shingles[2] = new Center("Roll-Off Express", "2900 Dede Road \n" +
                "Finksburg, MD 21048",
                "((410) 526-3535", "rolloffjack@aol.com", null);
        shingles[3] = new Center("Roofs to Roads", "1005 Rising Ridge Road\n" +
                "Mt. Airy, MD 21771",
                "(301) 831-0888", null, "www.fromrooftoroad.com");
        shingles[4] = new Center("TurboHaul", "11700 Old Baltimore Pike\n" +
                "Beltsville, MD 207055",
                "(301) 931-6993", "kevindaly@turbohaul.com", null);
    }

    private void bricksInit() {
        bricks[0] = new Center("Aggregate Industries", "8615 Dorsey Run Road\n" +
                "Jessup, MD 20794",
                "(301) 317-0300",  null, null);
        bricks[1] = new Center("Alternative Aggregate Recycling, Inc.", "1001 Edison Highway\n" +
                "Baltimore, Md 21213",
                "(410) 483-1012", null, null);
        bricks[2] = new Center("Aggregate Industries", "8615 Old Dorsey Run Road\n" +
                "Jessup, MD 20794",
                "(410) 483-1012",  null, null);
        bricks[3] = new Center("Annapolis Junction", "8615 Old Dorsey Run Road\n" +
                "Jessup, MD 20794",
                "(301) 776-5900", null, null);
        bricks[4] = new Center("Auston Contracting, Inc.", "1202 Pauls Lane\n" +
                "Joppa, MD 21085",
                "(410) 335-1016", "auston1@verizon.net", null);
        bricks[5] = new Center("Baltimore Recycling Center", "1030 Edison Highway\n" +
                "Baltimore, MD 21213",
                "(410) 534-2990",  null, null);
        bricks[6] = new Center("Barnabas Stone", "4714 Clifton road\n" +
                "Temple Hills, MD 20784",
                "(301) 423-1200",  null, null);
        bricks[7] = new Center("Benjer, Inc.", "P O Box 695\n" +
                "White Marsh, MD 21162",
                "(410) 335-2267", "benjer@benjerinc.com", null);
        bricks[8] = shingles[0]; //Repeat: Brandywine Enterprises
        bricks[9] = new Center("Clean Earth of Maryland, Inc.", "1469 Oak Ridge Place\n" +
                "Hagerstown, MD 21742",
                null, "cleanrock@aol.com", null);
        bricks[10] = new Center("Community Forklift", "4671 Tanglewood Drive\n" +
                "Edmonston/Hyattsville, MD 20781",
                "(301) 985-5180",  "donations@communityforklift.com", "www.communityforklift.com");
        bricks[11] = new Center("Days Cove Road Rubble Landfill ", "6425 Days Cove Road\n" +
                "White Marsh, MD 21162",
                "(410) 335-3778", null, null);
        bricks[12] = new Center("DC Rock", "1721 South Capitol Street, SW\n" +
                "Washington, DC 20003",
                "(202) 554-1250", null, null);
        bricks[13] = new Center("Dependable Sand, Stone & Recycling, Inc.", "13155 Ocean Gateway\n" +
                "PO Box 130\n" +
                "Queen Anne, MD 21657",
                "(410) 822-6363", null, null);
        bricks[14] = new Center("Diamond Waste Services", "508 Glenbrook Road\n" +
                "Glen Burnie, MD 21061",
                "(410) 350-7000", "anita.crehan@diamond-waste.com", null);
        bricks[15] = new Center("Environmental Alternative Recycling, LLC", "1030 Edison Highway\n" +
                "PO Box 9977\n" +
                "Baltimore, MD 21224",
                "(410) 534-2990", null, null);
        bricks[16] = new Center("Global Resource Recyclers, Inc.", "2600 Marble Court\n" +
                "Forestville, MD 20747",
                "(301) 568-2050", "hgreen@chamberlaincontractors.com", null);
        bricks[17] = new Center("Habitat ReStore", "1109 East Patrick Street\n" +
                "Frederick, MD 21701",
                "(301) 662-2988", null, null);
        bricks[18] = new Center("Harvest RGI, LLC", "7800 Kabik Court\n" +
                "Woodbine, MD 21797",
                "(410) 795-7666", "dlundberg@harvestpower.com", "www.harvestpower.com/midatlantic");
        bricks[19] = new Center("Honeygo Run Reclamation Company", "10710 Philadelphia Road \n" +
                "Perry Hall, MD 21128",
                "(410) 335-9500", null, null);
        bricks[20] = new Center("Key Recycling Center", "3810 fort Armistead Road\n" +
                "Baltimore, MD 21226",
                "(410) 360-5263", "keyrecyclingcenter@gmail.com", null);
        bricks[21] = new Center("L & J Waste Recycling LLC", "222 N. Calverton Road\n" +
                "Baltimore, MD 21223",
                "(410) 566-2323", "lenzie@ljwasterecycling.com", null);
        bricks[22] = new Center("Lafarge North America (Cockeysville)", "10000 Beaver Dam Road\n" +
                "Cockeysville, MD 21030",
                "(410) 683-9000", null, null);
        bricks[23] = new Center("Lafarge North America (Frederick)", "100 East South Street\n" +
                "Frederick, MD 21704",
                "(301) 694-4819", null, null);
        bricks[24] = new Center("Lafarge North America (Jessup)", "7970 Old Jessup Road\n" +
                "Jessup, MD 20794",
                "(410) 799-4897",  null, null);
        bricks[25] = new Center("Lafarge North America (Towson)", "300 East Joppa Road, Suite 200\n" +
                "Towson, MD 21286",
                "(410) 847-3300",  "rick.cole@lafargecorpcom", null);
        //bricks[26] = new Center("", "",
        //        "", null, null);
    }

    public void batteriesInit() {
        batteries[0] = new Center("Arundel Recycling Center, Inc.", "7517 Connelly Drive\n" +
                "Hanover, MD 21076",
                "(410) 761-6595", null, "www.arundelrecycling.com");
        batteries[1] = new Center("B & B Lighting Supply, Inc.", "2901 Druid Park Drive, Suite A110\n" +
                "Baltimore, MD 21215",
                "(410) 523-7300",  "sbradford@bnblightingsupply.com", null);
        batteries[2] = new Center("Batteries & Bulbs", "29 East Padonia Road\n" +
                "Timonium, MD 21093",
                "(410) 628-7999", "BP889@batteriesplus.net", "www.batteriesplusbulbs.com");
        batteries[3] = new Center("Broadview Waste Services (BWS Inc.)", "7610 Energy Parkway\n" +
                "Baltimore, MD 21226",
                "(410) 437-6590", "info@bwaste.com", "www.bwaste.com");
        batteries[4] = new Center("Cambridge Iron & Metal Company", "901 South Kresson Street\n" +
                "Baltimore, MD 21224",
                "(410) 327-7867", null, null);
        batteries[5] = new Center("Clean Venture, Inc.", "2931 Whittington Avenue\n" +
                "Baltimore, MD 21230",
                "(410) 368-9170", "dave.roesler@cyclechem.com", "www.chclechem.com");
        batteries[6] = new Center("Commercial Retrofitters & Recyclers", "P O Box 1045\n" +
                "Dunkirk, MD 20754",
                "(301) 358-6324", "pgoff@commretrorecycle.com", "www.commretrorecycle.com");
        batteries[7] = new Center("Eco-Battery, Inc.", "510 McCormick Drive, Suite P-Q\n" +
                "Glen Burnie, MD 21061",
                "888-768-0844", null, "www.eco-batteryinc.com");
        batteries[8] = new Center("Geller Lighting Supply, Inc.", "3720 Commerce Drive \n" +
                "Baltimore, MD 21227",
                "(410) 247-3636", null, null);
        batteries[9] = new Center("H.D. Metal Company", "909 Boundary Street\n" +
                "Salisbury, MD 21802",
                "(410) 546-1111",  null, null);
        batteries[10] = new Center("M.O.U. Enterprises, Inc.", "200 Penrod Court, Suite F\n" +
                "Glen Burnie, MD 21061",
                "(410) 648-4072",  "mouenterprisesinc.com", "www.mouenterprisesinc.com");
        batteries[11] = new Center("Maryland Recycle Company (Elkridge)", "5618 Furnace Avenue\n" +
                "Elkridge, MD 21075",
                "(410) 796-0760",  null, null);
        batteries[12] = new Center("Maryland Recycle Company (Glen Burnie)", "200 8th Avenue, NW\n" +
                "Glen Burnie, MD 21061",
                "(410) 760-9088",  "mdrecycle@aol.com", null);
        batteries[13] = new Center("Maryland Recycle Company (Owings Mills)", "24 Gwynns Mill Court\n" +
                "Owings Mills, MD 21117",
                "(410) 363-3347", "metalprorecycling.com", null);
        batteries[14] = new Center("Maryland Recycle Company (Rosedale)", "8920 Yellow Brick Road\n" +
                "Rosedale, MD 21237",
                "(410) 780-3060",  null, null);
        batteries[15] = new Center("Metal Recyclers, LLC", "8312 Lokus Road\n" +
                "Odenton, MD 21113",
                "(410) 674-2000",  null, "www.metalrecyclersusa.com");
        batteries[16] = new Center("Ocean City Recycling Center", "210 65th Street\n" +
                "Ocean City, MD 21842",
                "(410) 524-5356",  null, null);
        batteries[17] = new Center("Schultz & Sons Salvage", "24769 Meeting House Road\n" +
                "Denton, MD 21629",
                "(410) 479-2110", "recycle@shore.intercom.net", null);
        batteries[18] = new Center("TurboHaul", "11700 Old Baltimore Pike\n" +
                "Beltsville, MD 20705",
                "(301) 931-6993",  "kevindaly@turbohaul.com", null);
        batteries[19] = new Center("Waldorf Metal Company", "P.O. Box 1\n" +
                "Bryantown, MD 20617",
                "(301) 932-1220",  null, null);
        //batteries[20] = new Center("", "",
        //        "",  null, null);
    }


    /*
        Pre: A string which matches with a given Center Array
        Post:Returns the array storing the requested type of recycling centers, null if an invalid request -
        handling is expected on the other side, but there should not ba any invalid requests
        //TODO Alphonse, I (or you) can change the String request matches to the official strings.xml versions (i.e. shingles to "Asphalt Shingles") if you would prefer.
     */
    public Center[] getType(String str) {
        if(str.equals("shingles")) {
            return shingles;
        } else if(str.equals("bricks")) {
            return bricks;
        } else if(str.equals("batteries")) {
            return batteries;
        }

        return null;
    }
}
