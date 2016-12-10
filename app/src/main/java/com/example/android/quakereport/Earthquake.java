package com.example.android.quakereport;

/**
 * Created by mckinnely on 12/5/16.
 */

public class Earthquake
{
    private double mMagnitude;

    private String mLocation;

    private String mURL;

    private  long mTime;



    public Earthquake(double magnitude, String location, long time, String url)
    {
        mMagnitude = magnitude;
        mLocation  = location;
        mTime      = time;
        mURL       = url;
      //  Date dateObject = new Date(time);


        //SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
       // String dateToDisplay = dateFormatter.format(dateObject);

       // mDateTimeFormatted =  dateToDisplay;
    }


    //Store time (in milliseconds) of each earthquake as a long data type, create a Date object,
    //and Format date and time into a readable string for the user, in EarthquakeAdapter class:

    public double getmMagnitude() {return mMagnitude;}
    public String getmLocation()  {return mLocation;}
    public long getmTime() {return  mTime;}
    public String getmURL() {return mURL;}


}
