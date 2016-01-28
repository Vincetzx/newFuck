package com.example.god.fuckcrime;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by god on 2016/1/28.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mCrimeTitle;
    private Button mCrimeDate;
    private CheckBox mSolved;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.crime_fragment,container,false);
        mCrimeTitle=(EditText)view.findViewById(R.id.crime_title);
        mCrimeDate=(Button)view.findViewById(R.id.crime_date);
        mSolved=(CheckBox)view.findViewById(R.id.crime_solved);
        return view;
    }


}
