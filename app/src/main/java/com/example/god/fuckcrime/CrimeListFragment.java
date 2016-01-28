package com.example.god.fuckcrime;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by god on 2016/1/28.
 */
public class CrimeListFragment extends ListFragment {
    private ArrayList<Crime> mCrimes;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrimes=CrimeLab.getCrimeLab(getActivity()).getCrimes();
        CrimeAdapter adapter=new CrimeAdapter(mCrimes);
        setListAdapter(adapter);
    }



    private class CrimeAdapter extends ArrayAdapter<Crime>
    {
        public CrimeAdapter(ArrayList<Crime> crimes) {
            super(getActivity(), 0, crimes);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView==null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.fragment_item, null);
            }
            Crime crime=getItem(position);
                CheckBox itemCheckBox=(CheckBox)convertView.findViewById(R.id.list_item_solved);
                TextView itemTitle=(TextView)convertView.findViewById(R.id.list_item_title);
                TextView itemDate=(TextView)convertView.findViewById(R.id.list_item_date);
                itemCheckBox.setChecked(crime.isSolved());
            itemTitle.setText(crime.getTitle());
            itemDate.setText(crime.getDate()+"");

            return convertView;
        }
    }
}
