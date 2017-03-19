#ifndef AIDL_GENERATED_ANDROID_CONTENT_OM_I_OVERLAY_MANAGER_H_
#define AIDL_GENERATED_ANDROID_CONTENT_OM_I_OVERLAY_MANAGER_H_

#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <binder/Status.h>
#include <cstdint>
#include <utils/String16.h>
#include <utils/StrongPointer.h>

namespace android {

namespace content {

namespace om {

class IOverlayManager : public ::android::IInterface {
public:
DECLARE_META_INTERFACE(OverlayManager);
virtual ::android::binder::Status getAllOverlays(int32_t userId, ::android::String16* _aidl_return) = 0;
virtual ::android::binder::Status getOverlayInfosForTarget(const ::android::String16& targetPackageName, int32_t userId, ::android::String16* _aidl_return) = 0;
virtual ::android::binder::Status setEnabled(const ::android::String16& packageName, bool enable, int32_t userId, bool shouldWait, bool* _aidl_return) = 0;
virtual ::android::binder::Status setPriority(const ::android::String16& packageName, const ::android::String16& newParentPackageName, int32_t userId, bool* _aidl_return) = 0;
virtual ::android::binder::Status setHighestPriority(const ::android::String16& packageName, int32_t userId, bool* _aidl_return) = 0;
virtual ::android::binder::Status setLowestPriority(const ::android::String16& packageName, int32_t userId, bool* _aidl_return) = 0;
virtual ::android::binder::Status refresh(int32_t uid) = 0;
enum Call {
  GETALLOVERLAYS = ::android::IBinder::FIRST_CALL_TRANSACTION + 0,
  GETOVERLAYINFOSFORTARGET = ::android::IBinder::FIRST_CALL_TRANSACTION + 1,
  SETENABLED = ::android::IBinder::FIRST_CALL_TRANSACTION + 2,
  SETPRIORITY = ::android::IBinder::FIRST_CALL_TRANSACTION + 3,
  SETHIGHESTPRIORITY = ::android::IBinder::FIRST_CALL_TRANSACTION + 4,
  SETLOWESTPRIORITY = ::android::IBinder::FIRST_CALL_TRANSACTION + 5,
  REFRESH = ::android::IBinder::FIRST_CALL_TRANSACTION + 6,
};
};  // class IOverlayManager

}  // namespace om

}  // namespace content

}  // namespace android

#endif  // AIDL_GENERATED_ANDROID_CONTENT_OM_I_OVERLAY_MANAGER_H_