
package pl.other.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExternalUrls__ {

    @SerializedName("spotify")
    @Expose
    private String spotify;

    public String getSpotify() {
        return spotify;
    }

    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }

    @Override
    public String toString() {
        return "ExternalUrls__{" +
                "spotify='" + spotify + '\'' +
                '}';
    }
}
