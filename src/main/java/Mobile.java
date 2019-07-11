abstract class Mobile {

    private String callMessage;
    private String name;
    private String color;
    private String brand;

    public Mobile(String callMessage) {
        this.callMessage = callMessage;
    }

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }


    abstract void makeACall ();

    public void showTheInfo () {
        System.out.println("name: "+this.name+", color: "+this.color+", brand: "+this.brand);
    }

    public void changeThePhone (String name) {
        this.name = name;
        System.out.println("The phone name is "+name);;
    }

    public String getCallMessage() {
        return callMessage;
    }

    public String getName() {
        return name;
    }
}
