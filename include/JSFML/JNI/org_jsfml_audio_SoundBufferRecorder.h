/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_jsfml_audio_SoundBufferRecorder */

#ifndef _Included_org_jsfml_audio_SoundBufferRecorder
#define _Included_org_jsfml_audio_SoundBufferRecorder
#ifdef __cplusplus
extern "C" {
#endif
/* Inaccessible static: debug */
/* Inaccessible static: numManaged */
/* Inaccessible static: numWrapped */
/*
 * Class:     org_jsfml_audio_SoundBufferRecorder
 * Method:    nativeCreate
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_jsfml_audio_SoundBufferRecorder_nativeCreate
  (JNIEnv *, jobject);

/*
 * Class:     org_jsfml_audio_SoundBufferRecorder
 * Method:    nativeGetBuffer
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_jsfml_audio_SoundBufferRecorder_nativeGetBuffer
  (JNIEnv *, jobject);

/*
 * Class:     org_jsfml_audio_SoundBufferRecorder
 * Method:    start
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_org_jsfml_audio_SoundBufferRecorder_start
  (JNIEnv *, jobject, jint);

/*
 * Class:     org_jsfml_audio_SoundBufferRecorder
 * Method:    stop
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_org_jsfml_audio_SoundBufferRecorder_stop
  (JNIEnv *, jobject);

/*
 * Class:     org_jsfml_audio_SoundBufferRecorder
 * Method:    getSampleRate
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_jsfml_audio_SoundBufferRecorder_getSampleRate
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
