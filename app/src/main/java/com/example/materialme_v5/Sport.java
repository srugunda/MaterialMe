package com.example.materialme_v5;

import android.os.Parcel;
import android.os.Parcelable;

public class Sport implements Parcelable {
    // Member variables representing the title and information about the sport.
    private String title;
    private String info;
    private int bannerImage;

    /**
     * Constructor for the Sport data model.
     *
     * @param title The name if the sport.
     * @param info Information about the sport.
     */
    Sport(String title, String info, int bannerImage) {
        this.title = title;
        this.info = info;
        this.bannerImage = bannerImage;
    }

    protected Sport(Parcel in) {
        title = in.readString();
        info = in.readString();
        bannerImage = in.readInt();
    }

    public static final Creator<Sport> CREATOR = new Creator<Sport>() {
        @Override
        public Sport createFromParcel(Parcel in) {
            return new Sport(in);
        }

        @Override
        public Sport[] newArray(int size) {
            return new Sport[size];
        }
    };

    /**
     * Gets the title of the sport.
     *
     * @return The title of the sport.
     */
    String getTitle() {
        return title;
    }

    /**
     * Gets the info about the sport.
     *
     * @return The info about the sport.
     */
    String getInfo() {
        return info;
    }

    int getBannerImage(){ return bannerImage;}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(info);
        dest.writeInt(bannerImage);
    }
}
