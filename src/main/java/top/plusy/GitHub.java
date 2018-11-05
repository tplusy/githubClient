package top.plusy;

import top.plusy.mvp.presenter.NetworkPresenter;
import top.plusy.mvp.presenter.Presenter;
import top.plusy.mvp.view.ListView;

import javax.swing.*;

public class GitHub extends JFrame {
    private JPanel rootPanel;
    private JEditorPane editorPane1;
    private JButton button;
    private ListView listView;

    private Presenter presenter;

    GitHub() {
        setContentPane(rootPanel);
        setTitle("GitHub");
        listView.setModel(new DefaultListModel<String>());
        initButtonAction();
        presenter = new NetworkPresenter();
        presenter.setView(listView);
    }

    private void initButtonAction() {
        button.addActionListener(actionEvent -> {
            String key = editorPane1.getText();
            presenter.getNetworkRsp(key);
        });
    }
}
