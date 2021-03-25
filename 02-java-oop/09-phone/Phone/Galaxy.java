public class Galaxy extends Phone implements Ringable {
    

    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
     return getRingTone();
    }
    @Override
    public String unlockPhone() {
        return "phone unlocks with the finger print";
        // your code here
    }
    @Override
    public void displayInfo() {
        System.out.println("**********" + getClass().getSimpleName() + " **********\n" +  versionNumber);
    	System.out.println("Carrier: " + carrier);
    	System.out.println("Battery: " +  batteryPercentage );
    	System.out.println("Ringtone: " ); 
    }
}
