import java.security.Key;
import java.util.HashMap;
import java.util.Set;

public class Hashmatique
{
    public static void main (String[]args)
    {
        HashMap<String, String> trackList = new HashMap<String,String>();

        trackList.put("A sky full of stars", "Cause you get lighter the more it gets dark,I'm gonna give you my heart");
        trackList.put("Save your Tears", "You could've asked me why I broke your heart told me that you fell apart But you walked");
        trackList.put("Play & win", "Cause i'm only dreaming Is just a feeling,in my world,in my world Because i'm most lying I feel like i'm dieing In my world,ïn my world");
        trackList.put("Prayer in C", "And see the children are starving and their houses were destroyed don't think they could forgive you");

        String FirstSong= trackList.get("Save your Tears");
        System.out.println("First song is " +FirstSong);

        Set <String> songs= trackList.keySet();
        for(String key:songs){
        
            System.out.println(key);
        System.out.println(trackList.get(key));
        }
       


        
    {

    }}
    }
