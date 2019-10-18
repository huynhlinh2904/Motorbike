package com.example.motorbike;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.motorbike.scheme.ListUserResponse;
import com.example.motorbike.scheme.User;
import com.example.motorbike.webservice.ListUserService;
import com.example.motorbike.webservice.WedService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> motobike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListUserService listUserService = WedService.getInstance().getListUserService();
        listUserService.getUsers(2).enqueue(new Callback<ListUserResponse>() {
            @Override
            public void onResponse(Call<ListUserResponse> call, Response<ListUserResponse> response) {
                for (User user :response.body().getData()){
                    Log.d("First_name",user.getFirst_name());
                }
            }

            @Override
            public void onFailure(Call<ListUserResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }
}

