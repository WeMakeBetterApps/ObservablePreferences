package com.wmba.preference;

import android.content.SharedPreferences;

public class IntegerPersistentPreference extends AbstractPersistentPreference<Integer>
    implements IntegerPreference {

  public IntegerPersistentPreference(SharedPreferences preferences, String key) {
    super(preferences, key, null);
  }

  public IntegerPersistentPreference(SharedPreferences preferences, String key, Integer defaultValue) {
    super(preferences, key, defaultValue);
  }

  @Override protected Integer getFromPreferences(SharedPreferences preferences, String key) {
    if (preferences.contains(key)) {
      return preferences.getInt(key, 0);
    } else {
      return null;
    }
  }

  @Override
  protected void saveInPreferences(SharedPreferences preferences, String key, Integer value) {
    preferences.edit().putInt(key, value).apply();
  }
}
