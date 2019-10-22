package com.reactnative.peripheral;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;

public class RnBlePeripheralPackage implements ReactPackage {
  @Override
  public List<NativeModule>
  createNativeModules(ReactApplicationContext reactContext) {
    return Arrays.<NativeModule>asList(new RnBlePeripheralModule(reactContext));
  }

  @Override
  public List<ViewManager>
  createViewManagers(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
