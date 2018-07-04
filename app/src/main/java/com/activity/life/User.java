package com.activity.life;

import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2018/3/16 0016.
 */

public class User implements Parcelable {


    public int userId;
    public String name;
    public boolean isMale;

    public User(int userId, String name, boolean isMale) {
        this.userId = userId;
        this.name = name;
        this.isMale = isMale;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(userId);
        dest.writeString(name);
        dest.writeInt(isMale ? 1 : 0);
    }

    public static final Parcelable.Creator<User> CREATOR=new Parcelable.Creator<User>(){


        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    private User(Parcel parcel) {
        userId = parcel.readInt();
        name = parcel.readString();
        isMale = parcel.readInt() == 1 ;
    }

}
