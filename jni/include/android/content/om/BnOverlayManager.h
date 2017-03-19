#ifndef AIDL_GENERATED_ANDROID_CONTENT_OM_BN_OVERLAY_MANAGER_H_
#define AIDL_GENERATED_ANDROID_CONTENT_OM_BN_OVERLAY_MANAGER_H_

#include <binder/IInterface.h>
#include <android/content/om/IOverlayManager.h>

namespace android {

namespace content {

namespace om {

class BnOverlayManager : public ::android::BnInterface<IOverlayManager> {
public:
::android::status_t onTransact(uint32_t _aidl_code, const ::android::Parcel& _aidl_data, ::android::Parcel* _aidl_reply, uint32_t _aidl_flags = 0) override;
};  // class BnOverlayManager

}  // namespace om

}  // namespace content

}  // namespace android

#endif  // AIDL_GENERATED_ANDROID_CONTENT_OM_BN_OVERLAY_MANAGER_H_