package uz.bakhromjon.javafxtreeview;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TreeView<String> treeView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Path path = Path.of("src/main/resources/images/folder.png");
        InputStream folderInputStream;
        try {
            folderInputStream = Files.newInputStream(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ImageView imageView = new ImageView(new Image(folderInputStream));
        imageView.setFitHeight(15);
        imageView.setFitWidth(15);
        TreeItem<String> root = new TreeItem<>("Files", imageView);

        TreeItem<String> branch1 = new TreeItem<>("Files");

        TreeItem<String> leaf1 = new TreeItem<>("file1");
        TreeItem<String> leaf2 = new TreeItem<>("file2");

        branch1.getChildren().addAll(leaf1, leaf2);

        TreeItem<String> branch2 = new TreeItem<>("Videos");

        TreeItem<String> leaf3 = new TreeItem<>("video1");
        TreeItem<String> leaf4 = new TreeItem<>("video2");

        branch2.getChildren().addAll(leaf3, leaf4);

        TreeItem<String> branch3 = new TreeItem<>("Musics");

        TreeItem<String> leaf5 = new TreeItem<>("music1");
        TreeItem<String> leaf6 = new TreeItem<>("music2");

        branch3.getChildren().addAll(leaf5, leaf6);

        root.getChildren().addAll(branch1, branch2, branch3);

        treeView.setRoot(root);
    }
}