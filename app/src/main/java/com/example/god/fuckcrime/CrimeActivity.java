package com.example.god.fuckcrime;

import android.support.v4.app.Fragment;

import java.util.UUID;

/**
 * Created by god on 2016/1/29.
 */
public class CrimeActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        UUID uuid=(UUID)getIntent().getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);
        return new CrimeFragment().newInstance(uuid);
    }
}
