package com.example.god.fuckcrime;

import java.util.Date;
import java.util.UUID;

/**
 * Created by god on 2016/1/28.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public UUID getId() {
        return mId;
    }


    public Date getDate() {
        return mDate;
    }



    public Crime()
    {
        mId=UUID.randomUUID();

        mDate=new Date();
    }
}
