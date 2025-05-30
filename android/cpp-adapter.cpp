#include <jni.h>
#include "react-native-quack.h"

extern "C"
JNIEXPORT jdouble JNICALL
Java_com_quack_QuackModule_nativeMultiply(JNIEnv *env, jclass type, jdouble a, jdouble b) {
    return quack::multiply(a, b);
}

extern "C"
JNIEXPORT jdouble JNICALL
Java_com_quack_QuackModule_nativeAdd(JNIEnv *env, jclass type, jdouble a, jdouble b) {
    return quack::add(a, b);
}

extern "C"
JNIEXPORT jdouble JNICALL
Java_com_quack_QuackModule_nativeSubtract(JNIEnv *env, jclass type, jdouble a, jdouble b) {
    return quack::subtract(a, b);
}

extern "C"
JNIEXPORT jdouble JNICALL
Java_com_quack_QuackModule_nativeDivide(JNIEnv *env, jclass type, jdouble a, jdouble b) {
    return quack::divide(a, b);
}