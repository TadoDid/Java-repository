public class mobilePhone implements Telephone {
    private String myNumber ;
    private boolean isRinging;
    private boolean isPowerOn;

    public mobilePhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println(" Phone is powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing"+phoneNumber+ "on Desk Phone");
    }

    @Override
    public void answer() {
        if(isRinging && isPowerOn){
            System.out.println("Answering the Desk Phone");
            isRinging = false;
        }else{
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber && isPowerOn){
            isRinging = true;
            System.out.println("Phone is ringing");
        }else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
