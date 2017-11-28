//
// Created by link on 2017/5/26.
//

#include<stdio.h>
#include<jni.h>
#include<stdlib.h>
jstring  Java_lesson_ndkjni_HiJni_getFromJni(JNIEnv *env, jobject thiz){
    printf("getfromjni is load");
    return (*env)->NewStringUTF(env,"i am from jni");
  };
void Java_lesson_ndkjni_HiJni_setIntoJni(JNIEnv *env,jobject thiz,jstring str){
    printf("setIntoJni is load");
    (*env)->ReleaseStringUTFChars(env,str,"xxxx");
};
