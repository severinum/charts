package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private VBox leftPanel;

    @FXML
    private ScatterChart<Number, Number> firstChart;

    @FXML
    private NumberAxis xAxs;

    @FXML
    private NumberAxis yAxs;

    @FXML
    private Button btnLoadData;

    @FXML
    private StackPane centralPanel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        xAxs = new NumberAxis(0,10,1);
        yAxs = new NumberAxis(-100,500,100);
        firstChart = new ScatterChart<Number, Number>(xAxs, yAxs);

        XYChart.Series series = new XYChart.Series();
        series.setName("Test Chart");
        series.getData().add(new XYChart.Data(3,67));
        series.getData().add(new XYChart.Data(6,82));
        series.getData().add(new XYChart.Data(4,73));

        firstChart.getData().add(series);

        btnLoadData.setOnAction(e->{
            System.out.println("Button press test action");
        });

        firstChart.setData(firstChart.getData());
    }




}