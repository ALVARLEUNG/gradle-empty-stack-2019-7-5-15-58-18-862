public class Andriod extends Mobile {

    public Andriod (String message) {
        super(message);
    }

    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    public void makeACall() {
        if (this.getCallMessage().length() > 50) {
            System.out.println("<Andriod>Message can not be sent.");
        }else {
            System.out.println("<Andriod>Message:"+this.getCallMessage());
        }
    }
}
