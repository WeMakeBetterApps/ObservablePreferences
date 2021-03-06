package com.wmba.preference.test;

import com.wmba.preference.Preference;
import com.wmba.preference.IntegerMemoryPreference;

public class IntegerMemoryPreferenceTest extends AbstractPreferenceTest<Integer> {
  @Override protected Integer firstUniqueValue() {
    return 1;
  }

  @Override protected Integer secondUniqueValue() {
    return 2;
  }

  @Override protected Preference<Integer> createPreference(Integer defaultValue) {
    return new IntegerMemoryPreference(defaultValue);
  }
}
