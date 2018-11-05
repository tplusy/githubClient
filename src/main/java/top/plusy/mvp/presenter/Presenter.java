package top.plusy.mvp.presenter;

import top.plusy.mvp.model.INetworkModel;
import top.plusy.mvp.view.IView;

import java.lang.ref.WeakReference;

public abstract class Presenter {
    protected  INetworkModel iNetworkModel;
    protected  WeakReference<IView> iViewWeakReference;

    abstract public void getNetworkRsp(String rsp);
    abstract public void setView(IView view);
}
