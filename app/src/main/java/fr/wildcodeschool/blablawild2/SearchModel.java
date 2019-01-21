package fr.wildcodeschool.blablawild2;

import android.os.Parcel;
import android.os.Parcelable;

public class SearchModel implements Parcelable {

    private String departure;
    private String destination;
    private String date;

    //Constructors

    public SearchModel(String departure, String destination, String date) {
        this.departure = departure;
        this.destination = destination;
        this.date = date;
    }

    public SearchModel (Parcel parcel){
        this.departure=parcel.readString();
        this.destination=parcel.readString();
        this.date=parcel.readString();
    }

    //Getters

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    //Setters

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //Override methodes

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(departure);
        parcel.writeString(destination);
        parcel.writeString(date);
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator<SearchModel>() {
        @Override
        public SearchModel createFromParcel(Parcel parcel) {
            return new SearchModel(parcel);
        }

        @Override
        public SearchModel[] newArray(int i) {
            return new SearchModel[i];
        }
    };
}
