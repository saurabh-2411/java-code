package corejavabasics;

public class populationPercentage {
    public static void main(String args[])
    {
        float first= 175000;
        float now = 262500;
        float time = 10;
        float date = now-first;
        float population = date/first*100;
        float percentage = population/time;
        System.out.println("Average population Increased per year : "+percentage);
    }
}