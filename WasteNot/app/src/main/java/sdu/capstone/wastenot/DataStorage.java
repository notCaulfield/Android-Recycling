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
                "(301) 925-8100", "(301) 925-7826", "bmcalwee@brandywineco.com", "Brenda McAlwee");
        shingles[1] = new Center("Reliable Contracting", "1 Churchview Road\n" +
                "Millersville, MD 21108",
                "(410) 987-0313", null, null, null);
        shingles[2] = new Center("Roll-Off Express", "2900 Dede Road \n" +
                "Finksburg, MD 21048",
                "((410) 526-3535", "(410) 526-6998", "rolloffjack@aol.com", "Bob Leatherman or Jack Haden");
        shingles[3] = new Center("Roofs to Roads", "1005 Rising Ridge Road\n" +
                "Mt. Airy, MD 21771",
                "(301) 831-0888", null, null, "www.fromrooftoroad.com");
        shingles[4] = new Center("TurboHaul", "11700 Old Baltimore Pike\n" +
                "Beltsville, MD 207055",
                "(301) 931-6993", "(301) 931-2294", "kevindaly@turbohaul.com", null);
    }

    private void bricksInit() {

        bricks[0] = new Center("Aggregate Industries", "8615 Dorsey Run Road\n" +
                "Jessup, MD 20794",
                "(301) 317-0300", "(301) 317-0303", null, null);
        bricks[1] = new Center("Alternative Aggregate Recycling, Inc.", "1001 Edison Highway, Baltimore, Md 21213",
                "(410) 483-1012", "(410) 483-1015", null, null);
        bricks[2] = new Center("Aggregate Industries", "1001 Edison Highway, Baltimore, Md 21213",
                "(410) 483-1012", "(410) 483-1015", null, null);
        bricks[3] = new Center("Annapolis Junction", "8615 Old Dorsey Run Road\n" +
                "Jessup, MD 20794",
                "(301) 776-5900", "(301) 776-5902", null, null);
        bricks[4] = new Center("Auston Contracting, Inc.", "1202 Pauls Lane\n" +
                "Joppa, MD 21085",
                "(410) 335-1016", "(410) 671-6130", "auston1@verizon.net", null);
        bricks[5] = new Center("Baltimore Recycling Center", "1030 Edison Highway\n" +
                "Baltimore, MD 21213",
                "(410) 534-2990", "(410) 534-2997", null, null);
        bricks[6] = new Center("Barnabas Stone", "4714 Clifton road\n" +
                "Temple Hills, MD 20784",
                "(301) 423-1200", "(301) 423-3900", null, null);
        bricks[7] = new Center("Benjer, Inc.", "P O Box 695\n" +
                "White Marsh, MD 21162",
                "(410) 335-2267", "(410) 335-4961", "benjer@benjerinc.com", null);
        bricks[8] = shingles[0]; //Repeat: Brandywine Enterprises
        bricks[9] = new Center("Clean Earth of Maryland, Inc.", "1469 Oak Ridge Place\n" +
                "Hagerstown, MD 21742",
                null, null, "cleanrock@aol.com", null);
        bricks[10] = new Center("Community Forklift", "4671 Tanglewood Drive\n" +
                "Edmonston/Hyattsville, MD 20781",
                "(301) 985-5180", "(301) 985-5182", "donations@communityforklift.com", "www.communityforklift.com");
        bricks[11] = new Center("Days Cove Road Rubble Landfill ", "6425 Days Cove Road\n" +
                "White Marsh, MD 21162",
                "(410) 335-3778", null, null, null);
        bricks[12] = new Center("DC Rock", "1721 South Capitol Street, SW\n" +
                "Washington, DC 20003",
                "(202) 554-1250", "(202) 554-1521", null, null);
        bricks[13] = new Center("Dependable Sand, Stone & Recycling, Inc. ", "13155 Ocean Gateway\n" +
                "PO Box 130\n" +
                "Queen Anne, MD 21657",
                "(410) 822-6363", "(410) 820-7789", null, null);
        bricks[14] = new Center("Diamond Waste Services", "508 Glenbrook Road\n" +
                "Glen Burnie, MD 21061",
                "(410) 350-7000", "(410) 350-7003", "anita.crehan@diamond-waste.com", null);
        bricks[15] = new Center("Environmental Alternative Recycling, LLC", "1030 Edison Highway\n" +
                "PO Box 9977\n" +
                "Baltimore, MD 21224",
                "(410) 534-2990", "(410) 534-2997", null, null);
        bricks[16] = new Center("Global Resource Recyclers, Inc.", "2600 Marble Court\n" +
                "Forestville, MD 20747",
                "(301) 568-2050", "(301) 568-0776", "hgreen@chamberlaincontractors.com", null);
        bricks[17] = new Center("Habitat ReStore", "1109 East Patrick Street\n" +
                "Frederick, MD 21701",
                "(301) 662-2988", null, null, null);
        bricks[18] = new Center("Harvest RGI, LLC", "7800 Kabik Court\n" +
                "Woodbine, MD 21797",
                "(410) 795-7666", "(410) 795-7110", "dlundberg@harvestpower.com", "www.harvestpower.com/midatlantic");
        bricks[19] = new Center("Honeygo Run Reclamation Company", "10710 Philadelphia Road \n" +
                "Perry Hall, MD 21128",
                "(410) 335-9500", null, null, null);
        bricks[20] = new Center("Key Recycling Center", "3810 fort Armistead Road\n" +
                "Baltimore, MD 21226",
                "(410) 360-5263", "(410) 360-3955", "keyrecyclingcenter@gmail.com", null);
        bricks[21] = new Center("L & J Waste Recycling LLC", "222 N. Calverton Road\n" +
                "Baltimore, MD 21223",
                "(410) 566-2323", "(410) 566-2344", "lenzie@ljwasterecycling.com", null);
        bricks[22] = new Center("Lafarge North America (Cockeysville)", "10000 Beaver Dam Road\n" +
                "Cockeysville, MD 21030",
                "(410) 683-9000", "(410) 683-9029", null, null);
        bricks[23] = new Center("Lafarge North America (Frederick)", "100 East South Street\n" +
                "Frederick, MD 21704",
                "(301) 694-4819", "(301) 698-4908", null, null);
        bricks[24] = new Center("Lafarge North America (Jessup)", "7970 Old Jessup Road\n" +
                "Jessup, MD 20794",
                "(410) 799-4897", "(410) 799-5177", null, null);
        bricks[25] = new Center("Lafarge North America (Towson)", "300 East Joppa Road, Suite 200\n" +
                "Towson, MD 21286",
                "(410) 847-3300", "(410) 847-3308", "rick.cole@lafargecorpcom", null);
        bricks[26] = new Center("", "",
                "", "", null, null);
    }


    public Center[] getType(String str) {
        if(str.equals("shingles")) {
            return shingles;
        }

        return null;
    }
}
