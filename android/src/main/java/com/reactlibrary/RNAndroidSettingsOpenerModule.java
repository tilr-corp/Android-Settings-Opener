
package com.reactlibrary;

import android.app.Activity;
import android.content.Intent;
import android.provider.Settings;
import android.net.Uri;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.HashMap;
import java.util.Map;

public class RNAndroidSettingsOpenerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNAndroidSettingsOpenerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNAndroidSettingsOpener";
  }

  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    /**
     * Constants are from the source code of Settings:
     * https://developer.android.com/reference/android/provider/Settings.html
     */
    constants.put("ACTION_APPLICATION_DETAILS_SETTINGS", Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
    return constants;
  }

  @ReactMethod
  public void goSettings(String intent_name, Callback cb) {
    Activity currentActivity = getCurrentActivity();

    if (currentActivity == null) {
      cb.invoke(false);
      return;
    }

    try {
      Intent intent = new Intent(intent_name);
      Uri uri = Uri.fromParts("package", currentActivity.getPackageName(), null);
      intent.setData(uri);
      currentActivity.startActivity(intent);
      
      cb.invoke(true);
    } catch (Exception e) {
      cb.invoke(e.getMessage());
    }
  }
}