package com.wemakebetterapps.preference.test;

import com.wemakebetterapps.preference.Preference;

public abstract class AbstractPersistentPreferenceTest<T> extends AbstractPreferenceTest<T> {
  protected abstract Preference<T> createPreference(String key, T defaultValue);

  @Override protected final Preference<T> createPreference(T defaultValue) {
    return createPreference("defaultKey", defaultValue);
  }
}
