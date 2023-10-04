public class tv {
    public int state;
    public String channel; 
    public int channelNumber; 
    public int volume; 
    public final String model; 
    public static int defaultVolume;
    public String serial; 
    public int maxAmmountChannels;
    public int maxVolume; 
     
    public tv()
    {
        state = 0;
        channel = "none";
        defaultVolume = 0;
        volume = 0;
        model = "none";
        serial = "0"; 
    }
    public tv (String newModel, int newDefaultVolum, String newSerial)
    {
      state = 0;
      channel = "BBC";
      defaultVolume = newDefaultVolum;
      volume = newDefaultVolum;
      model = newModel;
      serial = newSerial;
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

    public void volumeUp()
    {
        if(volume < maxVolume)
        {
         volume = volume + 1; 
        }
    }

    public void volumeDown()
    {
        if(volume > 0)
        {
         volume = volume - 1; 
        }
    }

    public void channelUp()
    {
        if(channelNumber < maxAmmountChannels)
        {
         channelNumber = channelNumber + 1; 
        }
    }

    public void channelDown()
    {
        if(channelNumber > 0)
        {
         channelNumber = channelNumber -1; 
        }
    }
}
