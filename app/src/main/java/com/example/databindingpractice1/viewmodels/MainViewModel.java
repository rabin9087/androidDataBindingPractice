package com.example.databindingpractice1.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.databindingpractice1.models.Customer;

public class MainViewModel extends AndroidViewModel {



    Customer customer;
    public MainViewModel(@NonNull Application application) {
        super(application);

        customer = new Customer("Rabin Shah");
    }

    public Customer getCustomer() {
        return this.customer;
    }
}
