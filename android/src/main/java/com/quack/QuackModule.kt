package com.quack

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = QuackModule.NAME)
class QuackModule(reactContext: ReactApplicationContext) :
  NativeQuackSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  override fun multiply(a: Double, b: Double): Double {
    return a * b
  }

  override fun add(a: Double, b: Double): Double {
    return a + b
  }

  override fun subtract(a: Double, b: Double): Double {
    return a - b
  }

  // private external fun nativeMultiply(a: Double, b: Double): Double
  // private external fun nativeAdd(a: Double, b: Double): Double
  // private external fun nativeSubtract(a: Double, b: Double): Double

  companion object {
    const val NAME = "Quack"
  }
}
