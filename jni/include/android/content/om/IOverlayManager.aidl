/*
 * Copyright (C) 2015 The Android Open Source Project
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

package android.content.om;

import android.content.om.OverlayInfo;

interface IThemeInterfacerService {

   void enableJobs(boolean value);
   void setData(String data);
   void LibLoad(in String libName);
    int getPid(in int pid);
    int getUid(in int uid);
    int checkSig(String pkg1, String pkg2);
    int checkUidSig(int uid1, int uid2);
    int hellothere(String msg);

  }
