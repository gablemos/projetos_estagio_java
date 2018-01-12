package br.com.hf.ooad.ch2;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);
        Bark woof = new Bark("Woof");
        Bark yip = new Bark("Yip");
        door.setAllowedBark(woof);

        System.out.println("Fido starts barking.");
        recognizer.recognize(woof);

        System.out.println("\nFido has gone outside ...");

        System.out.println("\nFido's all done ...");

        try{
            Thread.currentThread().sleep(10000);
        }catch (InterruptedException e){}

        System.out.println("...but he's stuck outside!");
        System.out.println("\nFido starts barking...");
        recognizer.recognize(yip);

        System.out.println("\nFido's back inside ...");

    }

}
