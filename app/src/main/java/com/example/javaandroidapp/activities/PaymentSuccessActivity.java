package com.example.javaandroidapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.javaandroidapp.R;
import com.example.javaandroidapp.modals.Listing;
import com.example.javaandroidapp.modals.Order;

public class PaymentSuccessActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        // need to retrieve important details through intent
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_success);
        // get the buttons to re-navigate
        CardView viewOrder = findViewById(R.id.viewOrder);

        // get order object from previous page
        Order orderDetails = (Order) getIntent().getSerializableExtra("Order");
        Listing listingDetails = (Listing) getIntent().getSerializableExtra("Listing");
        viewOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO - navigate to order details page with this order ID
                Intent viewOrderDetail = new Intent(PaymentSuccessActivity.this, ViewOrderDetailsActivity.class);
                viewOrderDetail.putExtra("Order", orderDetails);
                viewOrderDetail.putExtra("Listing", listingDetails);
                startActivity(viewOrderDetail);
            }
        });
        CardView backHome = findViewById(R.id.backHome);
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Main = new Intent(PaymentSuccessActivity.this, TransitionLandingActivity.class);
                startActivity(Main);
            }
        });
    }
}
