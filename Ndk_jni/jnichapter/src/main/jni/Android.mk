LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := hi_jni
LOCAL_SRC_FILES := hi_jni.cpp
LOCAL_C_INCLUDES += $(LOCAL_PATH)
include $(BUILD_SHARED_LIBRARY)