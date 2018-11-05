package top.plusy;

import javax.swing.*;

public class GitHubClient {
    public static void main(String args[]) {
        GitHub gitHub = new GitHub();
        gitHub.pack();
        gitHub.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        gitHub.setVisible(true);
    }
}
