public class DeskPhone implements Telephone {
    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone is always on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing"+phoneNumber+ "on Desk Phone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the Desk Phone");
            isRinging = false;
        }else{
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber){
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
