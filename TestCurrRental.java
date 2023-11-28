import View.CurrentRentalView;
import Controller.CurrentRentalController;
import Model.Scooter;

public class TestCurrRental {

    public static void main(String[] args) {
        Scooter model = new Scooter();
        CurrentRentalView view = new CurrentRentalView();

        CurrentRentalController controller = new CurrentRentalController(model, view);
     }

    
}
