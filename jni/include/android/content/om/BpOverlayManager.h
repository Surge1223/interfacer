#ifndef AIDL_GENERATED_ANDROID_CONTENT_OM_BP_OVERLAY_MANAGER_H_
#define AIDL_GENERATED_ANDROID_CONTENT_OM_BP_OVERLAY_MANAGER_H_

#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <utils/Errors.h>
#include <android/content/om/IOverlayManager.h>

namespace android {

namespace content {

namespace om {

class BpOverlayManager : public ::android::BpInterface<IOverlayManager> {
public:
explicit BpOverlayManager(const ::android::sp<::android::IBinder>& _aidl_impl);
virtual ~BpOverlayManager() = default;
::android::binder::Status getAllOverlays(int32_t userId, ::android::String16* _aidl_return) override;
::android::binder::Status getOverlayInfosForTarget(const ::android::String16& targetPackageName, int32_t userId, ::android::String16* _aidl_return) override;
::android::binder::Status setEnabled(const ::android::String16& packageName, bool enable, int32_t userId, bool shouldWait, bool* _aidl_return) override;
::android::binder::Status setPriority(const ::android::String16& packageName, const ::android::String16& newParentPackageName, int32_t userId, bool* _aidl_return) override;
::android::binder::Status setHighestPriority(const ::android::String16& packageName, int32_t userId, bool* _aidl_return) override;
::android::binder::Status setLowestPriority(const ::android::String16& packageName, int32_t userId, bool* _aidl_return) override;
::android::binder::Status refresh(int32_t uid) override;
};  // class BpOverlayManager

}  // namespace om

}  // namespace content

}  // namespace android

#endif  // AIDL_GENERATED_ANDROID_CONTENT_OM_BP_OVERLAY_MANAGER_H_