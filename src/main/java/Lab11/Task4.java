package Lab11;

interface OldDevice {
    void operateOldFunction();
}
interface NewDevice{
    void operateNewFunction();
}

class OldDeviceImpl implements OldDevice{
    @Override
    public void operateOldFunction(){
        System.out.println("OldDevice is operating old function.");
    }

}
class NewDeviceImpl implements NewDevice{
    @Override
    public void operateNewFunction(){
        System.out.println("NewDevice is operating new function.");
    }
}

class DeviceAdapter implements NewDevice {
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void operateNewFunction(){
        System.out.print("Adapter is translating the operation: ");
        oldDevice.operateOldFunction();
    }
}

class ClientCode {
    public static void main(String[] args) {
        OldDevice oldDevice = new OldDeviceImpl();
        NewDevice newDevice = new NewDeviceImpl();
        NewDevice adaptedDevice = new DeviceAdapter(oldDevice);

        System.out.println("Using NewDeviceImpl directly:");
        clientCode(newDevice);

        System.out.println();

        System.out.println("Using OldDeviceImpl through the Adapter:");
        clientCode(adaptedDevice);
    }

    private static void clientCode(NewDevice device) {
        device.operateNewFunction();
    }
}