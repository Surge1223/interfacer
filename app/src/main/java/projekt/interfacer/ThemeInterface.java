/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: app/src/main/aidl/projekt/interfacer/ThemeInterface.aidl
 */
package projekt.interfacer;
public interface ThemeInterface extends android.os.IInterface
{
    /** Local-side IPC implementation stub class. */
    public static abstract class Stub extends android.os.Binder implements projekt.interfacer.ThemeInterface
    {
        private static final java.lang.String DESCRIPTOR = "projekt.interfacer.ThemeInterface";
        /** Construct the stub at attach it to the interface. */
        public Stub()
        {
            this.attachInterface(this, DESCRIPTOR);
        }
        /**
         * Cast an IBinder object into an projekt.interfacer.ThemeInterface interface,
         * generating a proxy if needed.
         */
        public static projekt.interfacer.ThemeInterface asInterface(android.os.IBinder obj)
        {
            if ((obj==null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin!=null)&&(iin instanceof projekt.interfacer.ThemeInterface))) {
                return ((projekt.interfacer.ThemeInterface)iin);
            }
            return new projekt.interfacer.ThemeInterface.Stub.Proxy(obj);
        }
        @Override public android.os.IBinder asBinder()
        {
            return this;
        }
        @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
        {
            switch (code)
            {
                case INTERFACE_TRANSACTION:
                {
                    reply.writeString(DESCRIPTOR);
                    return true;
                }
                case TRANSACTION_enableJobs:
                {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _arg0;
                    _arg0 = (0!=data.readInt());
                    this.enableJobs(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_setData:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    this.setData(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getUid:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    int _result = this.getUid(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_SexyAf:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    int _result = this.SexyAf(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_checkIn:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    int _result = this.checkIn(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_LibLoad:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    this.LibLoad(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_checkSig:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    java.lang.String _arg1;
                    _arg1 = data.readString();
                    int _result = this.checkSig(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_checkUidSig:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    int _arg1;
                    _arg1 = data.readInt();
                    int _result = this.checkUidSig(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_getAllOverlayPackages:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.util.List<java.lang.String> _result = this.getAllOverlayPackages();
                    reply.writeNoException();
                    reply.writeStringList(_result);
                    return true;
                }
                case TRANSACTION_add:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _result = this.add();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_getAllOverlays:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    java.util.Map _result = this.getAllOverlays(_arg0);
                    reply.writeNoException();
                    reply.writeMap(_result);
                    return true;
                }
                case TRANSACTION_getOverlayInfosForTarget:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    int _arg1;
                    _arg1 = data.readInt();
                    java.util.List _result = this.getOverlayInfosForTarget(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeList(_result);
                    return true;
                }
                case TRANSACTION_getOverlayInfo:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    int _arg1;
                    _arg1 = data.readInt();
                    projekt.interfacer.OverlayInfo _result = this.getOverlayInfo(_arg0, _arg1);
                    reply.writeNoException();
                    if ((_result!=null)) {
                        reply.writeInt(1);
                        _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                    }
                    else {
                        reply.writeInt(0);
                    }
                    return true;
                }
                case TRANSACTION_setEnabled:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    boolean _arg1;
                    _arg1 = (0!=data.readInt());
                    int _arg2;
                    _arg2 = data.readInt();
                    boolean _result = this.setEnabled(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_setPriority:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    java.lang.String _arg1;
                    _arg1 = data.readString();
                    int _arg2;
                    _arg2 = data.readInt();
                    boolean _result = this.setPriority(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_setHighestPriority:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    int _arg1;
                    _arg1 = data.readInt();
                    boolean _result = this.setHighestPriority(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_setLowestPriority:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    int _arg1;
                    _arg1 = data.readInt();
                    boolean _result = this.setLowestPriority(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_refresh:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    this.refresh(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getPid:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getPid();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }
        private static class Proxy implements projekt.interfacer.ThemeInterface
        {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder remote)
            {
                mRemote = remote;
            }
            @Override public android.os.IBinder asBinder()
            {
                return mRemote;
            }
            public java.lang.String getInterfaceDescriptor()
            {
                return DESCRIPTOR;
            }
            @Override public void enableJobs(boolean value) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(((value)?(1):(0)));
                    mRemote.transact(Stub.TRANSACTION_enableJobs, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public void setData(java.lang.String data) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(data);
                    mRemote.transact(Stub.TRANSACTION_setData, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public int getUid(int uid) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(uid);
                    mRemote.transact(Stub.TRANSACTION_getUid, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public int SexyAf(java.lang.String sup) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(sup);
                    mRemote.transact(Stub.TRANSACTION_SexyAf, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public int checkIn(java.lang.String msg) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(msg);
                    mRemote.transact(Stub.TRANSACTION_checkIn, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void LibLoad(java.lang.String libName) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(libName);
                    mRemote.transact(Stub.TRANSACTION_LibLoad, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public int checkSig(java.lang.String pkg1, java.lang.String pkg2) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(pkg1);
                    _data.writeString(pkg2);
                    mRemote.transact(Stub.TRANSACTION_checkSig, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public int checkUidSig(int uid1, int uid2) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(uid1);
                    _data.writeInt(uid2);
                    mRemote.transact(Stub.TRANSACTION_checkUidSig, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public java.util.List<java.lang.String> getAllOverlayPackages() throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.util.List<java.lang.String> _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getAllOverlayPackages, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createStringArrayList();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public java.lang.String add() throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.lang.String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_add, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /**
             * Returns information about all installed overlay packages for the
             * specified user. If there are no installed overlay packages for this user,
             * an empty map is returned (i.e. null is never returned). The returned map is a
             * mapping of target package names to lists of overlays. Each list for a
             * given target package is sorted in priority order, with the overlay with
             * the highest priority at the end of the list.
             *
             * @param userId The user to get the OverlayInfos for.
             * @return A Map<String, List<OverlayInfo>> with target package names
             *         mapped to lists of overlays; if no overlays exist for the
             *         requested user, an empty map is returned.
             */
            @Override public java.util.Map getAllOverlays(int userId) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.util.Map _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(userId);
                    mRemote.transact(Stub.TRANSACTION_getAllOverlays, _data, _reply, 0);
                    _reply.readException();
                    java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
                    _result = _reply.readHashMap(cl);
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /**
             * Returns information about all overlays for the given target package for
             * the specified user. The returned list is ordered according to the
             * overlay priority with the highest priority at the end of the list.
             *
             * @param targetPackageName The name of the target package.
             * @param userId The user to get the OverlayInfos for.
             * @return A list of OverlayInfo objects; if no overlays exist for the
             *         requested package, an empty list is returned.
             */
            @Override public java.util.List getOverlayInfosForTarget(java.lang.String targetPackageName, int userId) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.util.List _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(targetPackageName);
                    _data.writeInt(userId);
                    mRemote.transact(Stub.TRANSACTION_getOverlayInfosForTarget, _data, _reply, 0);
                    _reply.readException();
                    java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
                    _result = _reply.readArrayList(cl);
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /**
             * Returns information about the overlay with the given package name for the
             * specified user.
             *
             * @param packageName The name of the overlay package.
             * @param userId The user to get the OverlayInfo for.
             * @return The OverlayInfo for the overlay package; or null if no such
             *         overlay package exists.
             */
            @Override public projekt.interfacer.OverlayInfo getOverlayInfo(java.lang.String packageName, int userId) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                projekt.interfacer.OverlayInfo _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(packageName);
                    _data.writeInt(userId);
                    mRemote.transact(Stub.TRANSACTION_getOverlayInfo, _data, _reply, 0);
                    _reply.readException();
                    if ((0!=_reply.readInt())) {
                        _result = projekt.interfacer.OverlayInfo.CREATOR.createFromParcel(_reply);
                    }
                    else {
                        _result = null;
                    }
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /**
             * Request that an overlay package be enabled or disabled when possible to
             * do so.
             *
             * It is always possible to disable an overlay, but due to technical and
             * security reasons it may not always be possible to enable an overlay. An
             * example of the latter is when the related target package is not
             * installed. If the technical obstacle is later overcome, the overlay is
             * automatically enabled at that point in time.
             *
             * An enabled overlay is a part of target package's resources, i.e. it will
             * be part of any lookups performed via {@link android.content.res.Resources}
             * and {@link android.content.res.AssetManager}. A disabled overlay will no
             * longer affect the resources of the target package. If the target is
             * currently running, its outdated resources will be replaced by new ones.
             * This happens the same way as when an application enters or exits split
             * window mode.
             *
             * @param packageName The name of the overlay package.
             * @param enable true to enable the overlay, false to disable it.
             * @param userId The user for which to change the overlay.
             * @return true if the system successfully registered the request, false
             *         otherwise.
             */
            @Override public boolean setEnabled(java.lang.String packageName, boolean enable, int userId) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(packageName);
                    _data.writeInt(((enable)?(1):(0)));
                    _data.writeInt(userId);
                    mRemote.transact(Stub.TRANSACTION_setEnabled, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /**
             * Change the priority of the given overlay to be just higher than the
             * overlay with package name newParentPackageName. Both overlay packages
             * must have the same target and user.
             *
             * @see
             *
             * @param packageName The name of the overlay package whose priority should
             *        be adjusted.
             * @param newParentPackageName The name of the overlay package the newly
             *        adjusted overlay package should just outrank.
             * @param userId The user for which to change the overlay.
             */
            @Override public boolean setPriority(java.lang.String packageName, java.lang.String newParentPackageName, int userId) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(packageName);
                    _data.writeString(newParentPackageName);
                    _data.writeInt(userId);
                    mRemote.transact(Stub.TRANSACTION_setPriority, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /**
             * Change the priority of the given overlay to the highest priority relative to
             * the other overlays with the same target and user.
             *
             * @see
             *
             * @param packageName The name of the overlay package whose priority should
             *        be adjusted.
             * @param userId The user for which to change the overlay.
             */
            @Override public boolean setHighestPriority(java.lang.String packageName, int userId) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(packageName);
                    _data.writeInt(userId);
                    mRemote.transact(Stub.TRANSACTION_setHighestPriority, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /**
             * Change the priority of the overlay to the lowest priority relative to
             * the other overlays for the same target and user.
             *
             * @see
             *
             * @param packageName The name of the overlay package whose priority should
             *        be adjusted.
             * @param userId The user for which to change the overlay.
             */
            @Override public boolean setLowestPriority(java.lang.String packageName, int userId) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(packageName);
                    _data.writeInt(userId);
                    mRemote.transact(Stub.TRANSACTION_setLowestPriority, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /**
             * Refresh assets
             * @param uid the user to refresh assets for
             */
            @Override public void refresh(int uid) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(uid);
                    mRemote.transact(Stub.TRANSACTION_refresh, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public int getPid() throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getPid, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }
        static final int TRANSACTION_enableJobs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_setData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_getUid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_SexyAf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_checkIn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_LibLoad = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_checkSig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_checkUidSig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
        static final int TRANSACTION_getAllOverlayPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
        static final int TRANSACTION_add = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
        static final int TRANSACTION_getAllOverlays = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
        static final int TRANSACTION_getOverlayInfosForTarget = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
        static final int TRANSACTION_getOverlayInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
        static final int TRANSACTION_setEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
        static final int TRANSACTION_setPriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
        static final int TRANSACTION_setHighestPriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
        static final int TRANSACTION_setLowestPriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
        static final int TRANSACTION_refresh = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
        static final int TRANSACTION_getPid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    }
    public void enableJobs(boolean value) throws android.os.RemoteException;
    public void setData(java.lang.String data) throws android.os.RemoteException;
    public int getUid(int uid) throws android.os.RemoteException;
    public int SexyAf(java.lang.String sup) throws android.os.RemoteException;
    public int checkIn(java.lang.String msg) throws android.os.RemoteException;
    public void LibLoad(java.lang.String libName) throws android.os.RemoteException;
    public int checkSig(java.lang.String pkg1, java.lang.String pkg2) throws android.os.RemoteException;
    public int checkUidSig(int uid1, int uid2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllOverlayPackages() throws android.os.RemoteException;
    public java.lang.String add() throws android.os.RemoteException;
    /**
     * Returns information about all installed overlay packages for the
     * specified user. If there are no installed overlay packages for this user,
     * an empty map is returned (i.e. null is never returned). The returned map is a
     * mapping of target package names to lists of overlays. Each list for a
     * given target package is sorted in priority order, with the overlay with
     * the highest priority at the end of the list.
     *
     * @param userId The user to get the OverlayInfos for.
     * @return A Map<String, List<OverlayInfo>> with target package names
     *         mapped to lists of overlays; if no overlays exist for the
     *         requested user, an empty map is returned.
     */
    public java.util.Map getAllOverlays(int userId) throws android.os.RemoteException;
    /**
     * Returns information about all overlays for the given target package for
     * the specified user. The returned list is ordered according to the
     * overlay priority with the highest priority at the end of the list.
     *
     * @param targetPackageName The name of the target package.
     * @param userId The user to get the OverlayInfos for.
     * @return A list of OverlayInfo objects; if no overlays exist for the
     *         requested package, an empty list is returned.
     */
    public java.util.List getOverlayInfosForTarget(java.lang.String targetPackageName, int userId) throws android.os.RemoteException;
    /**
     * Returns information about the overlay with the given package name for the
     * specified user.
     *
     * @param packageName The name of the overlay package.
     * @param userId The user to get the OverlayInfo for.
     * @return The OverlayInfo for the overlay package; or null if no such
     *         overlay package exists.
     */
    public projekt.interfacer.OverlayInfo getOverlayInfo(java.lang.String packageName, int userId) throws android.os.RemoteException;
    /**
     * Request that an overlay package be enabled or disabled when possible to
     * do so.
     *
     * It is always possible to disable an overlay, but due to technical and
     * security reasons it may not always be possible to enable an overlay. An
     * example of the latter is when the related target package is not
     * installed. If the technical obstacle is later overcome, the overlay is
     * automatically enabled at that point in time.
     *
     * An enabled overlay is a part of target package's resources, i.e. it will
     * be part of any lookups performed via {@link android.content.res.Resources}
     * and {@link android.content.res.AssetManager}. A disabled overlay will no
     * longer affect the resources of the target package. If the target is
     * currently running, its outdated resources will be replaced by new ones.
     * This happens the same way as when an application enters or exits split
     * window mode.
     *
     * @param packageName The name of the overlay package.
     * @param enable true to enable the overlay, false to disable it.
     * @param userId The user for which to change the overlay.
     * @return true if the system successfully registered the request, false
     *         otherwise.
     */
    public boolean setEnabled(java.lang.String packageName, boolean enable, int userId) throws android.os.RemoteException;
    /**
     * Change the priority of the given overlay to be just higher than the
     * overlay with package name newParentPackageName. Both overlay packages
     * must have the same target and user.
     *
     * @see
     *
     * @param packageName The name of the overlay package whose priority should
     *        be adjusted.
     * @param newParentPackageName The name of the overlay package the newly
     *        adjusted overlay package should just outrank.
     * @param userId The user for which to change the overlay.
     */
    public boolean setPriority(java.lang.String packageName, java.lang.String newParentPackageName, int userId) throws android.os.RemoteException;
    /**
     * Change the priority of the given overlay to the highest priority relative to
     * the other overlays with the same target and user.
     *
     * @see
     *
     * @param packageName The name of the overlay package whose priority should
     *        be adjusted.
     * @param userId The user for which to change the overlay.
     */
    public boolean setHighestPriority(java.lang.String packageName, int userId) throws android.os.RemoteException;
    /**
     * Change the priority of the overlay to the lowest priority relative to
     * the other overlays for the same target and user.
     *
     * @see
     *
     * @param packageName The name of the overlay package whose priority should
     *        be adjusted.
     * @param userId The user for which to change the overlay.
     */
    public boolean setLowestPriority(java.lang.String packageName, int userId) throws android.os.RemoteException;
    /**
     * Refresh assets
     * @param uid the user to refresh assets for
     */
    public void refresh(int uid) throws android.os.RemoteException;
    public int getPid() throws android.os.RemoteException;
}
