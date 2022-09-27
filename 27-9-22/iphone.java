package phone;

class iphone extends  Phone
{
 
    @Override
    void camera() {
        System.out.println("12 Mega Pixel Camera");
    }
 
    @Override
    void touchDisplay() {
        System.out.println("6 inch Display");
    }
 
    void faceid() {
        System.out.println("Fast FaceID Sensor..");
    }
}