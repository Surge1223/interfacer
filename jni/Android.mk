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

common_includes := \
	$(LOCAL_PATH)/include \
	system/core/libutils/include \
	system/core/include \
	frameworks/native/include

include $(CLEAR_VARS)
# modify to be relative to libnativehlpers path
NATIVEHELPER_PATH := ../../../../libnativehelper

libnativehelper_static_src_files := \
    $(NATIVEHELPER_PATH)/JNIHelp.cpp \
    $(NATIVEHELPER_PATH)/JniConstants.cpp \
    $(NATIVEHELPER_PATH)/toStringArray.cpp \
    $(NATIVEHELPER_PATH)/JniInvocation.cpp \
    $(NATIVEHELPER_PATH)/AsynchronousCloseMonitor.cpp

LOCAL_SRC_FILES := $(libnativehelper_static_src_files)
LOCAL_MODULE_TAGS := optional

LOCAL_SHARED_LIBRARIES := liblog
LOCAL_MODULE_TAGS := optional
LOCAL_MODULE := libnativehelper_static
LOCAL_CLANG := true
LOCAL_CFLAGS := -Werror -fvisibility=protected
LOCAL_C_INCLUDES := libcore/include system/core/include
LOCAL_STATIC_LIBRARIES += liblog
LOCAL_LDFLAGS := -ldl
include $(BUILD_STATIC_LIBRARY)

include $(CLEAR_VARS)

LOCAL_SRC_FILES:= \
	libomsapi.cpp

LOCAL_MODULE:= liboms
LOCAL_CERTIFICATE := platform
LOCAL_C_INCLUDES := $(LOCAL_PATH)/include
LOCAL_C_INCLUDES += $(JNI_H_INCLUDE)
LOCAL_PRELINK_MODULE := false
LOCAL_STATIC_LIBRARIES := libbinder libutils libnativehelper_static
LOCAL_WHOLE_STATIC_LIBRARIES := libcutils liblog
LOCAL_CFLAGS := -DPLATFORM
LOCAL_CFLAGS += -Wall -Werror -Iinclude
include $(BUILD_SHARED_LIBRARY)
