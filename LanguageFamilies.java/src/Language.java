public class Language {
    //fields
    protected String name;
    protected int numSpeaker;
    protected String regionSpoken;
    protected String wordOrder;

    //constructor
    Language(String n,int i,String rs,String wo){
        this.name = n;
        this.numSpeaker =  i;
        this.regionSpoken = rs;
        this.wordOrder = wo;

    }
    public  void getInfo(){
        System.out.println(name+" is spoken by "+numSpeaker+" people not only in "+regionSpoken+".\n"+"The language follows the wrod order: "+wordOrder);
    }



    public static void main(String[] args ){
        Language obj = new Language("spanish",5555000,"Latin America and Equatorial Guinea.","subject-verb-object.");
        Mayan obj1 = new Mayan("A mayan lang",100);
        SinoTibetan mandiChinese = new SinoTibetan("mandarin chinese",50000);
        SinoTibetan burnese = new SinoTibetan(" burnese",60000);
        System.out.println();
        obj.getInfo();
        System.out.println();
        obj1.getInfo();
        System.out.println();
        mandiChinese.getInfo();
        System.out.println();
        burnese.getInfo();
    }

}


