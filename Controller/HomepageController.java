package Controller;


import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.Scooter;
import Model.ScooterModel;

import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomepageController {
    private HomepageView view;
    private ScooterModel model;

    public HomepageController(HomepageView view, ScooterModel model) {
        this.view = view;
        this.model = model;
        initController();
    }

    private void initController() {
        view.addRentButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rentSelectedScooter();
            }
        });

        view.addReturnButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnSelectedScooter();
            }
        });

        view.addScooterListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                updateButtonStates();
            }
        });
    }

    private void rentSelectedScooter() {
        int selectedIndex = view.getSelectedScooterIndex();
        if (selectedIndex != -1) {
            Scooter selectedScooter = model.getScooterAt(selectedIndex);
            // ADD RENTING
            model.rentScooter(selectedScooter);
            view.displayScooters(model.getScooters());
        }
    }

    private void returnSelectedScooter() {
        int selectedIndex = view.getSelectedScooterIndex();
        if (selectedIndex != -1) {
            Scooter selectedScooter = model.getScooterAt(selectedIndex);
            // ADD RETURNING
            model.returnScooter(selectedScooter);
            view.displayScooters(model.getScooters());
        }
    }

    private void updateButtonStates() {
        int selectedIndex = view.getSelectedScooterIndex();
        view.setRentButtonEnabled(selectedIndex != -1);
        view.setReturnButtonEnabled(selectedIndex != -1);
    }
}