package com.example.databindingpractice1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.databindingpractice1.databinding.ActivityMainBinding;
import com.example.databindingpractice1.models.Customer;
import com.example.databindingpractice1.viewmodels.MainViewModel;

public class MainActivity extends AppCompatActivity {

MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main );

        Customer c = new Customer("Rabin");

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainBinding.setCustomer(mainViewModel.getCustomer());
    }
}