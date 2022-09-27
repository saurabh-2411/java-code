package phone;

public class Phone2 {
    public static void main(String args[]) {
 
        Mi p1 =new Mi();
        p1.VoiceCall();
        p1.touchDisplay();
        p1.camera();
        p1.Chipset();
        System.out.println("-------------------------");
        iphone p2= new iphone();
        p2.VoiceCall();
        p2.camera();
        p2.touchDisplay();
        p2.faceid();
 
    }
}