class Apps{
    String app1;
    String app2;
    String app3;

    public Apps(String app1, String app2, String app3) {
        this.app1 = app1;
        this.app2 = app2;
        this.app3 = app3;
    }
}
class Mobile{
    int buttons;
    String screen;
    int internalStorage;
    String snapDragon;
    Apps apps;

    public Mobile(int buttons, String screen, int internalStorage, String snapDragon, Apps apps) {
        this.buttons = buttons;
        this.screen = screen;
        this.internalStorage = internalStorage;
        this.snapDragon = snapDragon;
        this.apps = apps;
    }

    public void display() {
        System.out.println("My mobile contains "+buttons+" buttons "+screen+ " typed screen "+" contains internal storage "+internalStorage+" and snapdragon "+snapDragon+" contains apps are "+apps.app3+","+apps
                .app2+","+ apps.app1+".");
    }
    public static void main(String[] args) {
        Apps app = new Apps("google","gallery","camera");
        Mobile device1 = new Mobile(4,"amod curved display",128,"5th gen",app);
        device1.display();
        }
}
