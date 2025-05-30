
/**
 * This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
 *
 * Do not edit this file as changes may cause incorrect behavior and will be lost
 * once the code is regenerated.
 *
 * @generated by codegen project: GenerateModuleJavaSpec.js
 *
 * @nolint
 */

package com.quack;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

public abstract class NativeQuackSpec extends ReactContextBaseJavaModule implements TurboModule {
  public static final String NAME = "Quack";

  public NativeQuackSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public @Nonnull String getName() {
    return NAME;
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double multiply(double a, double b);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double add(double a, double b);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double subtract(double a, double b);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double divide(double a, double b);
}
