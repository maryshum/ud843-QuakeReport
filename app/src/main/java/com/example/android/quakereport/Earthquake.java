package com.example.android.quakereport;

// object represents a single Earthquake event
public class Earthquake {
    //each Earthquake object has three properties Magnitude, Location, Date
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    //constructor for a new Earthquake object
    public Earthquake(String Magnitude, String Location, String Date) {
        mMagnitude = Magnitude;
        mLocation = Location;
        mDate = Date;
    }

    //get Magnitude
    public String getMagnitude() {
        return mMagnitude;
    }

    //get Location
    public String getLocation() {
        return mLocation;
    }

    //get Date
    public String getDate() {
        return mDate;
    }
}
