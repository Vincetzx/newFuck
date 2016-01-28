package com.example.god.fuckcrime;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by god on 2016/1/28.
 */
public class CrimeLab {
    private ArrayList<Crime> mCrimes;
    private static CrimeLab mCrimeLab;
    private Context mContext;

    private CrimeLab(Context context) {
        this.mContext = context;
        mCrimes=new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            Crime crime=new Crime();
            crime.setTitle("#" + i);
            crime.setSolved(i % 2 == 0);
            mCrimes.add(crime);
        }

    }

    public static CrimeLab getCrimeLab(Context context) {
        if (mCrimeLab == null) {
            mCrimeLab = new CrimeLab(context);
        }
        return mCrimeLab;
    }

    public ArrayList<Crime> getCrimes()
    {
        return mCrimes;
    }

}
