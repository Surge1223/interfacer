package projekt.interfacer.services;

import android.os.RemoteException;
import java.util.List;
import projekt.substratum.IInterfacerInterface;

public class JobServiceImpl extends IInterfacerInterface.Stub {


    @Override
    public void installPackage(List<String> paths) throws RemoteException {

    }

    @Override
    public void uninstallPackage(List<String> packages, boolean restartUi) throws RemoteException {

    }

    @Override
    public void restartSystemUI() throws RemoteException {

    }

    @Override
    public void configurationShim() throws RemoteException {

    }

    @Override
    public void applyBootanimation(String name) throws RemoteException {

    }

    @Override
    public void applyFonts(String pid, String fileName) throws RemoteException {

    }

    @Override
    public void applyAudio(String pid, String fileName) throws RemoteException {

    }

    @Override
    public void enableOverlay(List<String> packages, boolean restartUi) throws RemoteException {

    }

    @Override
    public void disableOverlay(List<String> packages, boolean restartUi) throws RemoteException {

    }

    @Override
    public void changePriority(List<String> packages, boolean restartUi) throws RemoteException {

    }

    @Override
    public void copy(String source, String destination) throws RemoteException {

    }

    @Override
    public void move(String source, String destination) throws RemoteException {

    }

    @Override
    public void mkdir(String destination) throws RemoteException {

    }

    @Override
    public void deleteDirectory(String directory, boolean withParent) throws RemoteException {

    }

    @Override
    public void applyProfile(List<String> enable, List<String> disable, String name, boolean restartUi) throws RemoteException {

    }

}