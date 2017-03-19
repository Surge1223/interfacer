package projekt.interfacer.activities;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.content.om.IOverlayManager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class InterfacerActivity extends Activity {
    private static final String LOG_TAG = InterfacerActivity.class.getSimpleName();
    private String SERVICE_NAME = "overlay";
    IOverlayManager mOverlayManager;
    

    public ServiceConnection serviceConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.d(LOG_TAG, "Service connected");
            mOverlayManager = IOverlayManager.Stub.asInterface(service);
            try {
                mOverlayManager.getAllOverlays(android.os.Process.myUid());
            } catch (RemoteException e) {

            }
        }

        public void onServiceDisconnected(ComponentName name) {
            Log.e(LOG_TAG, "disconnected");
            mOverlayManager = null;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("Interfacer onCreate: getUid()=" + android.os.Process.myUid());
        bindService();
        getOverlayManagerService();
        finish();
    }


    @Override
    public void onDestroy() {
        System.out.println("Interfacer onDestroy: this=" + this);
        unbindService();
        super.onDestroy();
    }

    private void bindService() {
        Intent i = new Intent("projekt.interfacer.services.JobService");
        bindService(i, serviceConnection, Context.BIND_AUTO_CREATE);
        Log.d(LOG_TAG, "Interfacer startng JobService!");
     //   System.loadLibrary("omsapi");
        Log.d(LOG_TAG, "UID " + this.getUserId());

    }

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
            Log.d(LOG_TAG, "Find binder");
        }
        else
            Log.d(LOG_TAG,"Service is null.");
    }
}


