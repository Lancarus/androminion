package com.mehtank.androminion.fragments.settings;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.mehtank.androminion.R;

public class GeneralFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle bundle, String rootKey) {
        setPreferencesFromResource(R.xml.pref_general, rootKey);
    }
}