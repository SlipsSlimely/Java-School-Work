/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murach.business;

/*
 * @author pbahdo02
 */
public class Album extends Product {
    private String artist;
    
    public Album() {
        super();
        artist = "";
        
        // adds one to the count
        count++;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
     
    @Override
    public String toString() {
        return super.toString() + " (" + artist + ")";
    }
}