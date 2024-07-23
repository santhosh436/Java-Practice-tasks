class SinoTibetan extends Language{
    SinoTibetan(String name,int speakers){
        super(name,speakers,"Asia", "Subject-object-verb");
        if (name.contains("chinese")){
            wordOrder = "Subject-verb-object";
        }
    }
}
