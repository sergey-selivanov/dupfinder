package org.svs.dupfinder.ui;

import java.io.FileNotFoundException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainController {

    @FXML private BorderPane mainBorderPane;
    @FXML private SplitPane splitPane;


    @FXML private MenuItem menuItemImport;
    @FXML private MenuItem menuItemExit;
    @FXML private MenuItem menuItemViewLog;
    @FXML private MenuItem menuItemAbout;


    public void initialize(){
        System.out.println("init");
    }

    public void setDivider(){
        //double pos = Settings.getInstance().getWinDividerPosition();
        double pos = 0;
        System.out.println(">" + pos);
        splitPane.setDividerPositions(pos);

    }

    public void onMenuItemExit(ActionEvent e){
        //Settings.getLogger().info("application exit");

        double pos = splitPane.getDividerPositions()[0];
        System.out.println("<" + pos);

        //Settings.getInstance().setWinDividerPosition(pos);

        //System.out.println(Settings.getInstance().getWinDividerPosition());

        Stage myStage = (Stage) mainBorderPane.getScene().getWindow();

        Platform.exit();
    }

    public void onMenuItemImport(ActionEvent e){

    }
    public void onMenuItemViewLog(ActionEvent e){
    }

    public void onMenuItemAbout(ActionEvent e){
    }



}
