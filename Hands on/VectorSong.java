package Collection;
/*
 Create a program that represents a basic playlist using a Vector to store song names. 
 Implement methods to:
 a. Add songs to the playlist.
 b. Display the current playlist.
 c. Remove a song from the playlist.
*/


import java.util.Vector;
public class VectorSong 
{
	
	public static void main(String[] args) 
	{
		// Create a Vector to store integers
        Vector<String> vector = new Vector<>();
        
        // Adding elements to the Vector
        vector.add("Maharashtra Desha");
        vector.add("1000 Pieces");
        vector.add("Kadhi Tu");
        vector.add("Perfect");
        
        System.out.println(" Current Playlist: " + vector);
        
        vector.remove(3);
        System.out.println(" Updated playlist " + vector);

	}

}