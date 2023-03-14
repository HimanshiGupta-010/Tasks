class Phone{

    public void call()
    {
        System.out.println("Inside call() method");
    }

    public void sms()
    {
        System.out.println("Inside sms() method");
    }
}

interface camera {
    void click();
    void record();
}

interface MusicPlayer {
    void play();
    void stop();
}