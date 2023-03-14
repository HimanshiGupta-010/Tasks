class Phone {

    public void call()
    {
        System.out.println("Inside call() method of class Phone");
    }

    public void sms()
    {
        System.out.println("Inside sms() method of class Phone");
    }
}

interface camera {
    public void click();
    public void record();
}

interface MusicPlayer {
    public void play();
    public void stop();
}

class SmartPhone extends Phone implements camera, MusicPlayer 
{
    
    public void click()
    {
        System.out.println("Inside click() method of interface camera");   
    }

    public void record()
    {
        System.out.println("Inside record() method of interface camera");
    }
    
    public void play()
    {
        System.out.println("Inside play() method of interface MusicPlayer");
    }

    public void stop()
    {
        System.out.println("Inside stop() method of interface MusicPlayer");
    }
}

public class Test 
{
        public static void main(String args[])
        {
            SmartPhone sp = new SmartPhone();
            
            sp.call();
            sp.sms();
            
            sp.click();
            sp.record();
            sp.play();
            sp.stop();
        }
}
 
