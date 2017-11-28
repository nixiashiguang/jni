//
// Created by link on 2017/5/26.
//
#include<stdio.h>
#include<stdlib.h>
#include<jni.h>
extern "C"
jstring Java_lesson_gradlecompile_MainActivity_jniTellMeWhy(JNIEnv *env,jobject obj,jstring str){
        const char *question = env->GetStringUTFChars(str,JNI_FALSE);
        char *answer = "fuck no why!!";
        char *data = (char *)malloc(strlen(question)+strlen(answer)+1);
        strcpy(data,question);
        strcat(data,"jni说：\“");
        strcat(data,answer);
        return env->NewStringUTF(data);
}