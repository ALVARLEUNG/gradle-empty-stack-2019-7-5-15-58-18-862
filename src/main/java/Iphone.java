public class Iphone extends Mobile {

    public Iphone (String message) {
        super(message);
    }

    public Iphone(String name, String color, String brand) {
        super(name, color, brand);
    }


    public void makeACall() {
        if (this.getCallMessage().length() > 30) {
            System.out.println("<iphone>Message can not be sent.");
        }else {
            System.out.println("<iphone>Message:"+this.getCallMessage());
        }
    }
}
