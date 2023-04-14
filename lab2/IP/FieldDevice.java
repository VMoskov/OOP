public class FieldDevice implements Addressable{
    private String deviceIP;

    public FieldDevice(String deviceIP) {
        this.deviceIP = isValidAddress(deviceIP) ? deviceIP : "0.0.0.0";
    }

    public String getDeviceIP() {
        return deviceIP;
    }
    public void setDeviceIP(String deviceIP) {
        this.deviceIP = isValidAddress(deviceIP) ? deviceIP : "0.0.0.0";
    }
}
