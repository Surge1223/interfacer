package projekt.interfacer.activities;

import android.app.Activity;
<<<<<<< HEAD
<<<<<<< HEAD
import android.app.ActivityManager;
=======
>>>>>>> 577ac06... InterfacerActivity: Add binder ipc stub Activity
=======
import android.app.ActivityManager;
>>>>>>> 0b2d981... InterfacerActivity: Add receiver and start activity for testing
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
<<<<<<< HEAD
import android.content.om.IOverlayManager;
import android.content.om.OverlayInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.os.UserHandle;
import android.util.Log;
import android.widget.Toast;
import com.android.server.om.OverlayManagerService;
import android.content.pm.PackageInfo;
import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.ActivityManager;
import android.app.ActivityManagerNative;
import android.app.IActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.om.IOverlayManager;
import android.content.om.OverlayInfo;
import android.content.pm.IPackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManagerInternal;
import android.content.pm.UserInfo;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;

import projekt.interfacer.services.JobService;
// import projekt.interfacer.services.SystemUIMonitorService;

import static android.os.Binder.getCallingPid;
import static android.os.Binder.getCallingUid;
=======
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.content.om.IOverlayManager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
<<<<<<< HEAD
>>>>>>> 577ac06... InterfacerActivity: Add binder ipc stub Activity
=======
import projekt.interfacer.services.JobService;
>>>>>>> 0b2d981... InterfacerActivity: Add receiver and start activity for testing

public class InterfacerActivity extends Activity {
    private static final String LOG_TAG = InterfacerActivity.class.getSimpleName();
    private String SERVICE_NAME = "overlay";
    IOverlayManager mOverlayManager;
<<<<<<< HEAD
=======
    
>>>>>>> 577ac06... InterfacerActivity: Add binder ipc stub Activity

    public ServiceConnection serviceConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.d(LOG_TAG, "Service connected");
            mOverlayManager = IOverlayManager.Stub.asInterface(service);
<<<<<<< HEAD
            Toast.makeText(InterfacerActivity.this, "Service connected", Toast.LENGTH_SHORT).show();
=======
>>>>>>> 577ac06... InterfacerActivity: Add binder ipc stub Activity
            try {
                mOverlayManager.getAllOverlays(android.os.Process.myUid());
            } catch (RemoteException e) {

            }
        }

        public void onServiceDisconnected(ComponentName name) {
            Log.e(LOG_TAG, "disconnected");
            mOverlayManager = null;
<<<<<<< HEAD
            Toast.makeText(InterfacerActivity.this, "Service disconnected", Toast.LENGTH_SHORT)
                    .show();
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
        getOverlayManagerService();
        System.out.println("Interfacer onCreate: getUid()=" + android.os.Process.myUid());
        bindService();
   //     startSystemUiMonitor();
        getOverlayManagerService();
   //     disableOverlays();
=======
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
    getOverlayManagerService();
        System.out.println("Interfacer onCreate: getUid()=" + android.os.Process.myUid());
        bindService();
        getOverlayManagerService();
>>>>>>> 577ac06... InterfacerActivity: Add binder ipc stub Activity
        finish();
    }


    @Override
    public void onDestroy() {
        System.out.println("Interfacer onDestroy: this=" + this);
        unbindService();
        super.onDestroy();
    }

    private void bindService() {
<<<<<<< HEAD
<<<<<<< HEAD
        Context context = getApplicationContext();
        Intent i = new Intent(this, JobService.class);
        bindService(i, serviceConnection, Context.BIND_AUTO_CREATE);
        context.startService(i);
        Log.d("InterfacerActivity", "InterfacerActivity startng JobService as  UID" + this.getUserId());
        Log.i(LOG_TAG, " caller's uid " + getCallingUid()
                + ", pid " + getCallingPid());
        Log.d(LOG_TAG, "Interfacer startng JobService!");
     //   System.loadLibrary("oms");
=======
        Intent i = new Intent("projekt.interfacer.services.JobService");
=======
        Context context = getApplicationContext();
        Intent i = new Intent(this, JobService.class);
>>>>>>> 0b2d981... InterfacerActivity: Add receiver and start activity for testing
        bindService(i, serviceConnection, Context.BIND_AUTO_CREATE);
        context.startService(i);
        Log.d(LOG_TAG, "Interfacer startng JobService!");
<<<<<<< HEAD
     //   System.loadLibrary("omsapi");
>>>>>>> 577ac06... InterfacerActivity: Add binder ipc stub Activity
=======
    //       System.loadLibrary("oms");
>>>>>>> 0b2d981... InterfacerActivity: Add receiver and start activity for testing
        Log.d(LOG_TAG, "UID " + this.getUserId());

    }

<<<<<<< HEAD
    /* Not implemented yet

    private void startSystemUiMonitor() {
        Context context = getApplicationContext();
        Intent intent = new Intent(this, SystemUIMonitorService.class);
        Log.d(LOG_TAG, "Starting service: " + intent);
        context.startService(intent);
        Log.d("SystemUIMonitorService", "InterfacerActivity startng SystemUIMonitorService as  UID" + this.getUserId());
        Log.i(LOG_TAG, " caller's uid " + getCallingUid());
    }
    */

=======
>>>>>>> 577ac06... InterfacerActivity: Add binder ipc stub Activity
    private void unbindService() {
        unbindService(serviceConnection);
    }

    @Override
    public void finalize() {
        System.out.println("Interfacer finalize: this=" + this);
    }

    /*
     * Get binder service
     */
    private void getOverlayManagerService()
    {

        IBinder binder=null;
        Log.d(LOG_TAG,"getOverlayManagerService");
        try{
            Object object = new Object();
            Method getService = Class.forName("android.os.ServiceManager").getMethod("getService", String.class);
            Object obj = getService.invoke(object, new Object[]{new String(SERVICE_NAME)});
            binder = (IBinder)obj;
        }catch(Exception e){
            Log.d(LOG_TAG, e.toString());
        }
        if(binder != null){
            mOverlayManager = android.content.om.IOverlayManager.Stub.asInterface(binder);
<<<<<<< HEAD
            Log.d(LOG_TAG, "InterfacerActivity found binder");
        }
        else
            Log.d(LOG_TAG, "Service is null.");
    }

    /* Enabling this here causes Subs to freeze on installing overlays
    private void disableOverlays() {
        try {
            IOverlayManager iom = IOverlayManager.Stub.asInterface(
                    ServiceManager.getService("overlay"));
            if (iom == null) {
                return;
            }
            Log.d(LOG_TAG,
                    "Now contacting the Overlay Manager Service for the list of enabled overlays...");
            Map<String, List<OverlayInfo>> allOverlays = iom.getAllOverlays(UserHandle.USER_SYSTEM);
            if (allOverlays != null) {
                Log.d(LOG_TAG,
                        "The Overlay Manager Service reported back with the list of enabled overlays.");
                Set<String> set = allOverlays.keySet();
                for (String targetPackageName : set) {
                    for (OverlayInfo oi : allOverlays.get(targetPackageName)) {
                        if (oi.isEnabled()) {
                            iom.setEnabled(oi.packageName, false, UserHandle.USER_SYSTEM, false);
                            Log.d(LOG_TAG, "Now disabling \'" + oi.packageName + "\'");
                        }
                    }
                }
            }
        } catch (RemoteException re) {
            re.printStackTrace();
            Log.d(LOG_TAG, "RemoteException while trying to contact the Overlay Manager Service!");
        }
    }
    */
}
=======
            Log.d(LOG_TAG, "Find binder");
        }
        else
            Log.d(LOG_TAG,"Service is null.");
    }
}


>>>>>>> 577ac06... InterfacerActivity: Add binder ipc stub Activity
