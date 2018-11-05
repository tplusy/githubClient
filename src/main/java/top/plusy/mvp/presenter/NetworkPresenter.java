package top.plusy.mvp.presenter;

import top.plusy.mvp.model.INetworkModel;
import top.plusy.mvp.model.NetworkModel;
import top.plusy.mvp.view.IView;
import top.plusy.mvp.view.ListView;

import java.lang.ref.WeakReference;

public class NetworkPresenter extends Presenter {

    public NetworkPresenter() {
        iNetworkModel = new NetworkModel();
    }

    @Override
    public void getNetworkRsp(String req) {
        iNetworkModel.networkReq(req, jsonString -> {
            ListView listView = (ListView) iViewWeakReference.get();
        });
    }

    @Override
    public void setView(IView view) {
        iViewWeakReference = new WeakReference<>(view);
    }
}
