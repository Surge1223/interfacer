#include <android/content/om/IOverlayManager.h>
#include <android/content/om/BpOverlayManager.h>

namespace android {
    
    namespace content {
        
        namespace om {
            
            IMPLEMENT_META_INTERFACE(OverlayManager, "android.content.om.IOverlayManager");
            
        }  // namespace om
        
    }  // namespace content
    
}  // namespace android
#include <android/content/om/BpOverlayManager.h>
#include <binder/Parcel.h>

namespace android {
    
    namespace content {
        
        namespace om {
            
            BpOverlayManager::BpOverlayManager(const ::android::sp<::android::IBinder>& _aidl_impl)
            : BpInterface<IOverlayManager>(_aidl_impl){
            }
            
            ::android::binder::Status BpOverlayManager::getAllOverlays(int32_t userId, ::android::String16* _aidl_return) {
                ::android::Parcel _aidl_data;
                ::android::Parcel _aidl_reply;
                ::android::status_t _aidl_ret_status = ::android::OK;
                ::android::binder::Status _aidl_status;
                _aidl_ret_status = _aidl_data.writeInterfaceToken(getInterfaceDescriptor());
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeInt32(userId);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = remote()->transact(IOverlayManager::GETALLOVERLAYS, _aidl_data, &_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_status.readFromParcel(_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                if (!_aidl_status.isOk()) {
                    return _aidl_status;
                }
                _aidl_ret_status = _aidl_reply.readString16(_aidl_return);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
            _aidl_error:
                _aidl_status.setFromStatusT(_aidl_ret_status);
                return _aidl_status;
            }
            
            ::android::binder::Status BpOverlayManager::getOverlayInfosForTarget(const ::android::String16& targetPackageName, int32_t userId, ::android::String16* _aidl_return) {
                ::android::Parcel _aidl_data;
                ::android::Parcel _aidl_reply;
                ::android::status_t _aidl_ret_status = ::android::OK;
                ::android::binder::Status _aidl_status;
                _aidl_ret_status = _aidl_data.writeInterfaceToken(getInterfaceDescriptor());
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeString16(targetPackageName);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeInt32(userId);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = remote()->transact(IOverlayManager::GETOVERLAYINFOSFORTARGET, _aidl_data, &_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_status.readFromParcel(_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                if (!_aidl_status.isOk()) {
                    return _aidl_status;
                }
                _aidl_ret_status = _aidl_reply.readString16(_aidl_return);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
            _aidl_error:
                _aidl_status.setFromStatusT(_aidl_ret_status);
                return _aidl_status;
            }
            
            ::android::binder::Status BpOverlayManager::setEnabled(const ::android::String16& packageName, bool enable, int32_t userId, bool shouldWait, bool* _aidl_return) {
                ::android::Parcel _aidl_data;
                ::android::Parcel _aidl_reply;
                ::android::status_t _aidl_ret_status = ::android::OK;
                ::android::binder::Status _aidl_status;
                _aidl_ret_status = _aidl_data.writeInterfaceToken(getInterfaceDescriptor());
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeString16(packageName);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeBool(enable);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeInt32(userId);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeBool(shouldWait);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = remote()->transact(IOverlayManager::SETENABLED, _aidl_data, &_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_status.readFromParcel(_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                if (!_aidl_status.isOk()) {
                    return _aidl_status;
                }
                _aidl_ret_status = _aidl_reply.readBool(_aidl_return);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
            _aidl_error:
                _aidl_status.setFromStatusT(_aidl_ret_status);
                return _aidl_status;
            }
            
            ::android::binder::Status BpOverlayManager::setPriority(const ::android::String16& packageName, const ::android::String16& newParentPackageName, int32_t userId, bool* _aidl_return) {
                ::android::Parcel _aidl_data;
                ::android::Parcel _aidl_reply;
                ::android::status_t _aidl_ret_status = ::android::OK;
                ::android::binder::Status _aidl_status;
                _aidl_ret_status = _aidl_data.writeInterfaceToken(getInterfaceDescriptor());
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeString16(packageName);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeString16(newParentPackageName);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeInt32(userId);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = remote()->transact(IOverlayManager::SETPRIORITY, _aidl_data, &_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_status.readFromParcel(_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                if (!_aidl_status.isOk()) {
                    return _aidl_status;
                }
                _aidl_ret_status = _aidl_reply.readBool(_aidl_return);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
            _aidl_error:
                _aidl_status.setFromStatusT(_aidl_ret_status);
                return _aidl_status;
            }
            
            ::android::binder::Status BpOverlayManager::setHighestPriority(const ::android::String16& packageName, int32_t userId, bool* _aidl_return) {
                ::android::Parcel _aidl_data;
                ::android::Parcel _aidl_reply;
                ::android::status_t _aidl_ret_status = ::android::OK;
                ::android::binder::Status _aidl_status;
                _aidl_ret_status = _aidl_data.writeInterfaceToken(getInterfaceDescriptor());
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeString16(packageName);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeInt32(userId);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = remote()->transact(IOverlayManager::SETHIGHESTPRIORITY, _aidl_data, &_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_status.readFromParcel(_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                if (!_aidl_status.isOk()) {
                    return _aidl_status;
                }
                _aidl_ret_status = _aidl_reply.readBool(_aidl_return);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
            _aidl_error:
                _aidl_status.setFromStatusT(_aidl_ret_status);
                return _aidl_status;
            }
            
            ::android::binder::Status BpOverlayManager::setLowestPriority(const ::android::String16& packageName, int32_t userId, bool* _aidl_return) {
                ::android::Parcel _aidl_data;
                ::android::Parcel _aidl_reply;
                ::android::status_t _aidl_ret_status = ::android::OK;
                ::android::binder::Status _aidl_status;
                _aidl_ret_status = _aidl_data.writeInterfaceToken(getInterfaceDescriptor());
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeString16(packageName);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeInt32(userId);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = remote()->transact(IOverlayManager::SETLOWESTPRIORITY, _aidl_data, &_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_status.readFromParcel(_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                if (!_aidl_status.isOk()) {
                    return _aidl_status;
                }
                _aidl_ret_status = _aidl_reply.readBool(_aidl_return);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
            _aidl_error:
                _aidl_status.setFromStatusT(_aidl_ret_status);
                return _aidl_status;
            }
            
            ::android::binder::Status BpOverlayManager::refresh(int32_t uid) {
                ::android::Parcel _aidl_data;
                ::android::Parcel _aidl_reply;
                ::android::status_t _aidl_ret_status = ::android::OK;
                ::android::binder::Status _aidl_status;
                _aidl_ret_status = _aidl_data.writeInterfaceToken(getInterfaceDescriptor());
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_data.writeInt32(uid);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = remote()->transact(IOverlayManager::REFRESH, _aidl_data, &_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                _aidl_ret_status = _aidl_status.readFromParcel(_aidl_reply);
                if (((_aidl_ret_status) != (::android::OK))) {
                    goto _aidl_error;
                }
                if (!_aidl_status.isOk()) {
                    return _aidl_status;
                }
            _aidl_error:
                _aidl_status.setFromStatusT(_aidl_ret_status);
                return _aidl_status;
            }
            
        }  // namespace om
        
    }  // namespace content
    
}  // namespace android
#include <android/content/om/BnOverlayManager.h>
#include <binder/Parcel.h>

namespace android {
    
    namespace content {
        
        namespace om {
            
            ::android::status_t BnOverlayManager::onTransact(uint32_t _aidl_code, const ::android::Parcel& _aidl_data, ::android::Parcel* _aidl_reply, uint32_t _aidl_flags) {
                ::android::status_t _aidl_ret_status = ::android::OK;
                switch (_aidl_code) {
                    case Call::GETALLOVERLAYS:
                    {
                    int32_t in_userId;
                    ::android::String16 _aidl_return;
                    if (!(_aidl_data.checkInterface(this))) {
                        _aidl_ret_status = ::android::BAD_TYPE;
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readInt32(&in_userId);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    ::android::binder::Status _aidl_status(getAllOverlays(in_userId, &_aidl_return));
                    _aidl_ret_status = _aidl_status.writeToParcel(_aidl_reply);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    if (!_aidl_status.isOk()) {
                        break;
                    }
                    _aidl_ret_status = _aidl_reply->writeString16(_aidl_return);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    }
                    break;
                    case Call::GETOVERLAYINFOSFORTARGET:
                    {
                    ::android::String16 in_targetPackageName;
                    int32_t in_userId;
                    ::android::String16 _aidl_return;
                    if (!(_aidl_data.checkInterface(this))) {
                        _aidl_ret_status = ::android::BAD_TYPE;
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readString16(&in_targetPackageName);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readInt32(&in_userId);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    ::android::binder::Status _aidl_status(getOverlayInfosForTarget(in_targetPackageName, in_userId, &_aidl_return));
                    _aidl_ret_status = _aidl_status.writeToParcel(_aidl_reply);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    if (!_aidl_status.isOk()) {
                        break;
                    }
                    _aidl_ret_status = _aidl_reply->writeString16(_aidl_return);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    }
                    break;
                    case Call::SETENABLED:
                    {
                    ::android::String16 in_packageName;
                    bool in_enable;
                    int32_t in_userId;
                    bool in_shouldWait;
                    bool _aidl_return;
                    if (!(_aidl_data.checkInterface(this))) {
                        _aidl_ret_status = ::android::BAD_TYPE;
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readString16(&in_packageName);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readBool(&in_enable);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readInt32(&in_userId);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readBool(&in_shouldWait);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    ::android::binder::Status _aidl_status(setEnabled(in_packageName, in_enable, in_userId, in_shouldWait, &_aidl_return));
                    _aidl_ret_status = _aidl_status.writeToParcel(_aidl_reply);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    if (!_aidl_status.isOk()) {
                        break;
                    }
                    _aidl_ret_status = _aidl_reply->writeBool(_aidl_return);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    }
                    break;
                    case Call::SETPRIORITY:
                    {
                    ::android::String16 in_packageName;
                    ::android::String16 in_newParentPackageName;
                    int32_t in_userId;
                    bool _aidl_return;
                    if (!(_aidl_data.checkInterface(this))) {
                        _aidl_ret_status = ::android::BAD_TYPE;
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readString16(&in_packageName);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readString16(&in_newParentPackageName);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readInt32(&in_userId);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    ::android::binder::Status _aidl_status(setPriority(in_packageName, in_newParentPackageName, in_userId, &_aidl_return));
                    _aidl_ret_status = _aidl_status.writeToParcel(_aidl_reply);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    if (!_aidl_status.isOk()) {
                        break;
                    }
                    _aidl_ret_status = _aidl_reply->writeBool(_aidl_return);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    }
                    break;
                    case Call::SETHIGHESTPRIORITY:
                    {
                    ::android::String16 in_packageName;
                    int32_t in_userId;
                    bool _aidl_return;
                    if (!(_aidl_data.checkInterface(this))) {
                        _aidl_ret_status = ::android::BAD_TYPE;
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readString16(&in_packageName);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readInt32(&in_userId);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    ::android::binder::Status _aidl_status(setHighestPriority(in_packageName, in_userId, &_aidl_return));
                    _aidl_ret_status = _aidl_status.writeToParcel(_aidl_reply);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    if (!_aidl_status.isOk()) {
                        break;
                    }
                    _aidl_ret_status = _aidl_reply->writeBool(_aidl_return);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    }
                    break;
                    case Call::SETLOWESTPRIORITY:
                    {
                    ::android::String16 in_packageName;
                    int32_t in_userId;
                    bool _aidl_return;
                    if (!(_aidl_data.checkInterface(this))) {
                        _aidl_ret_status = ::android::BAD_TYPE;
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readString16(&in_packageName);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readInt32(&in_userId);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    ::android::binder::Status _aidl_status(setLowestPriority(in_packageName, in_userId, &_aidl_return));
                    _aidl_ret_status = _aidl_status.writeToParcel(_aidl_reply);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    if (!_aidl_status.isOk()) {
                        break;
                    }
                    _aidl_ret_status = _aidl_reply->writeBool(_aidl_return);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    }
                    break;
                    case Call::REFRESH:
                    {
                    int32_t in_uid;
                    if (!(_aidl_data.checkInterface(this))) {
                        _aidl_ret_status = ::android::BAD_TYPE;
                        break;
                    }
                    _aidl_ret_status = _aidl_data.readInt32(&in_uid);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    ::android::binder::Status _aidl_status(refresh(in_uid));
                    _aidl_ret_status = _aidl_status.writeToParcel(_aidl_reply);
                    if (((_aidl_ret_status) != (::android::OK))) {
                        break;
                    }
                    if (!_aidl_status.isOk()) {
                        break;
                    }
                    }
                    break;
                    default:
                    {
                    _aidl_ret_status = ::android::BBinder::onTransact(_aidl_code, _aidl_data, _aidl_reply, _aidl_flags);
                    }
                    break;
                }
                if (_aidl_ret_status == ::android::UNEXPECTED_NULL) {
                    _aidl_ret_status = ::android::binder::Status::fromExceptionCode(::android::binder::Status::EX_NULL_POINTER).writeToParcel(_aidl_reply);
                }
                return _aidl_ret_status;
            }
            
        }  // namespace om
        
    }  // namespace content
    
}  // namespace android
