package SortVisualisation.Controller;
import SortVisualisation.Model.ChartDataManager;
import SortVisualisation.Model.Sorting.RadixSort;
import javafx.event.ActionEvent;
public class RadixSortController extends AbstractSortController {
    public RadixSortController() {
    }
    public void initialize() {
        this.chartData = new ChartDataManager(barChart);
    }
    public void visualiseInput(ActionEvent actionEvent) {
        super.visualiseInput(actionEvent);
        sorter = null;
        sorter = new RadixSort(unsortedIntegers);
    }

}
