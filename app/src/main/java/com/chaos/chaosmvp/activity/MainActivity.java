package com.chaos.chaosmvp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.chaosmvp.R;
import com.chaos.chaosmvp.contract.AppContracts;

public class MainActivity extends AppCompatActivity implements AppContracts.IMainView{
    private MainPresenterImpl mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenterImpl(this);
        mainPresenter.getData();//V层要数据了，快给我去找
    }
    @Override
    public void loadSuccess(String s) {
        Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loadFail(String error) {
    }
}
