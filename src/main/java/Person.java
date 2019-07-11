public class Person {
    private Mobile mobile;

    public Person() {}

    public Person(Mobile mobile) {
        this.mobile = mobile;
    }

    public void makeACall () {
        mobile.makeACall();
    }

    public void changeMyPhone (Mobile mobile) {
        this.mobile = mobile;
        System.out.println("My phone is:"+mobile.getName());
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }
}
