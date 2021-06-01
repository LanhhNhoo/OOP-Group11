package SortVisualisation.Controller;
import SortVisualisation.Model.ChartDataManager;
import SortVisualisation.Model.Sorting.QuickSort;
import javafx.event.ActionEvent;
public class QuickSortController extends AbstractSortController {
    public QuickSortController() {
    }
    public void initialize() {
        this.chartData = new ChartDataManager(barChart);
    }
    @Override
    public void visualiseInput(ActionEvent actionEvent) {
        super.visualiseInput(actionEvent);
        sorter = null;
        sorter = new QuickSort(unsortedIntegers);
    }

}
