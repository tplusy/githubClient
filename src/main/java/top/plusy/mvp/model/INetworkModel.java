package top.plusy.mvp.model;

public interface INetworkModel {
    void networkReq(String req, onNetworkRspListener listener);

    interface onNetworkRspListener {
        void onNetworkRsp(String jsonString);
    }
}
