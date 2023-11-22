package Controller;

import Model.Scooter;
import View.CurrentRentalView;

public class CurrentRentalController {

    private CurrentRentalView view;
    private Scooter model; 

    public CurrentRentalController(Scooter model, CurrentRentalView view)
    {
        this.model = model;
        this.view = view;
    }
    
}
