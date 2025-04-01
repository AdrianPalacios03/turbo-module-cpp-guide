package com.quack

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = QuackModule.NAME)
class QuackModule(reactContext: ReactApplicationContext) :
  NativeQuackSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  override fun multiply(a: Double, b: Double): Double {
    return nativeMultiply(a, b)
  }

  override fun add(a: Double, b: Double): Double {
    return nativeAdd(a, b)
  }

  override fun subtract(a: Double, b: Double): Double {
    return nativeSubtract(a, b)
  }

  override fun divide(a: Double, b: Double): Double {
    return nativeDivide(a, b)
  }

  private external fun nativeMultiply(a: Double, b: Double): Double
  private external fun nativeAdd(a: Double, b: Double): Double
  private external fun nativeSubtract(a: Double, b: Double): Double
  private external fun nativeDivide(a: Double, b: Double): Double
  companion object {
    const val NAME = "Quack"

    // This loads the native library when the class is loaded
    init {
      System.loadLibrary("react-native-quack")
    }
  }
}
