public class tv {
    public int state;
    public String channel; 
    public int volume; 
    public final String model; 
    public static int defaultVolume;
     
    public tv (String newModel, int newDefaultVolum)
    {
      state = 0;
      channel = "BBC";
      defaultVolume = newDefaultVolum;
      volume = newDefaultVolum;
      model = newModel;
    }

    public void setState(int newState)
    {
        state = newState;
    }

    public void changeChannel(String newChannel)
    {
      channel = newChannel;
    }

    public void changeVolume(int newVolume)
    {
        volume = newVolume;
    }
}
