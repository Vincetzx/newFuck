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

import java.util.UUID;

/**
 * Created by god on 2016/1/28.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mCrimeTitle;
    private Button mCrimeDate;
    private CheckBox mSolved;
    public static String EXTRA_CRIME_ID="com.zx.crime_id";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        UUID uuid=(UUID)getArguments().getSerializable(EXTRA_CRIME_ID);
        mCrime=CrimeLab.getCrimeLab(getActivity()).getCrime(uuid);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.crime_fragment,container,false);
        mCrimeTitle=(EditText)view.findViewById(R.id.crime_title);
        mCrimeDate=(Button)view.findViewById(R.id.crime_date);
        mSolved=(CheckBox)view.findViewById(R.id.crime_solved);

        mCrimeTitle.setText(mCrime.getTitle());
        mCrimeDate.setText(mCrime.getDate()+"");
        mSolved.setChecked(mCrime.isSolved());
        return view;
    }
    public static Fragment newInstance(UUID id)
    {
        Bundle args=new Bundle();
        args.putSerializable(EXTRA_CRIME_ID, id);
        CrimeFragment fragment=new CrimeFragment();
        fragment.setArguments(args);
        return fragment;
    }


}
