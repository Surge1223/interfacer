# Copyright (C) 2017 The Android Open Source Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.


LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_SRC_FILES:= \
	libomsapi.cpp 

LOCAL_MODULE:= liboms
LOCAL_CERTIFICATE := platform
LOCAL_C_INCLUDES := $(LOCAL_PATH)/include
LOCAL_C_INCLUDES += $(JNI_H_INCLUDE)
LOCAL_PRELINK_MODULE := false
<<<<<<< HEAD
<<<<<<< HEAD
LOCAL_STATIC_LIBRARIES := libbinder libutils 
LOCAL_WHOLE_STATIC_LIBRARIES := libcutils liblog libnativehelper
=======
LOCAL_STATIC_LIBRARIES := libbinder libutils libnativehelper 
LOCAL_WHOLE_STATIC_LIBRARIES := libcutils liblog
>>>>>>> eec584e... JNI: add a basic lib for native oms
=======
LOCAL_STATIC_LIBRARIES := libbinder libutils 
LOCAL_WHOLE_STATIC_LIBRARIES := libcutils liblog libnativehelper
>>>>>>> d4a92d6... jni/Android.mk: libnativehelper isnt static by default
LOCAL_CFLAGS := -DPLATFORM
LOCAL_CFLAGS += -Wall -Werror -Iinclude
include $(BUILD_SHARED_LIBRARY)

