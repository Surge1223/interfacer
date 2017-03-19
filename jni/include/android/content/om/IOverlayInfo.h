/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#define LOG_TAG "IOverlayManager"

#include <androidfw/AssetManager.h>
#include <binder/Parcel.h>

namespace android {

enum {
    TRANSACTION_onOverlayInfo  IBinder::FIRST_CALL_TRANSACTION,
    TRANSACTION_getAllOverlays,
    TRANSACTION_getOverlayInfosForTarget,
    TRANSACTION_getOverlayInfo,
    TRANSACTION_setEnabled,
    TRANSACTION_setPriority,
    TRANSACTION_setHighestPriority,
    TRANSACTION_setLowestPriority,
    TRANSACTION_refresh,
};

class BpOverlayManagerService: public BpInterface<OverlayManagerService> {
public:
    BpOverlayManagerService(const sp<IBinder>& impl)
        : BpInterface<OverlayManagerService>(impl)
    { }

    virtual void BpOverlayManagerService(const String16& /* filename */, const int32_t /* nonce */,
                             const int32_t /* state */) { }
};


IMPLEMENT_META_INTERFACE(OverlayManagerService, "android.content.om.IOverlayManager")

// ----------------------------------------------------------------------

    status_t BpOverlayManagerService::onTransact(
    uint32_t code, const Parcel& data, Parcel* reply, uint32_t flags)
{

    switch(code) {
            case TRANSACTION_onOverlayInfo: {
                CHECK_INTERFACE(OverlayManagerService, data, reply);
                String16 filename = data.readString16();
                int32_t nonce = data.readInt32();
                int32_t state = data.readInt32();
                BpOverlayManagerService(filename, nonce, state);
                reply->writeNoException();
                return NO_ERROR;
        }
        default:
            return BBinder::onTransact(code, data, reply, flags);
    }
}

// ----------------------------------------------------------------------

}
