package com.example.myapplication12;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication12.R;


public class MainActivity extends AppCompatActivity {
    private EditText mssv, name, cccd, sdt, email, que, address;
    private RadioButton khmt;
    private RadioButton ktmt;
    private CheckBox c_stuff, java, python, other, dk;
    private Button submit;
    private boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mssv = (EditText) findViewById(R.id.mssv);
        name = (EditText) findViewById(R.id.name);
        cccd = (EditText) findViewById(R.id.cccd);
        sdt = (EditText) findViewById(R.id.sdt);
        email = (EditText) findViewById(R.id.email);
        que = (EditText) findViewById(R.id.quequan);
        address = (EditText) findViewById(R.id.noi_o_hien_tai);
        khmt = (RadioButton) findViewById(R.id.khmt);
        ktmt = (RadioButton) findViewById(R.id.ktmt);
        c_stuff = (CheckBox) findViewById(R.id.c_check);
        java = (CheckBox) findViewById(R.id.java);
        python = (CheckBox) findViewById(R.id.python);
        other = (CheckBox) findViewById(R.id.other);
        submit = (Button) findViewById(R.id.submit);
        dk = (CheckBox) findViewById(R.id.dieukhoan);
        mssv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().length() != 0){
                    mssv.setBackgroundResource(R.drawable.border_true);
                } else {
                    mssv.setBackgroundResource(R.drawable.border_wrong);
                    mssv.setHint("Empty");
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().length() != 0){
                    name.setBackgroundResource(R.drawable.border_true);
                } else {
                    name.setBackgroundResource(R.drawable.border_wrong);
                    name.setHint("Empty");
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        cccd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().length() != 0){
                    cccd.setBackgroundResource(R.drawable.border_true);
                } else {
                    cccd.setBackgroundResource(R.drawable.border_wrong);
                    cccd.setHint("Empty");
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        sdt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().length() != 0){
                    sdt.setBackgroundResource(R.drawable.border_true);
                } else {
                    sdt.setBackgroundResource(R.drawable.border_wrong);
                    sdt.setHint("Empty");
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().length() != 0){
                    email.setBackgroundResource(R.drawable.border_true);
                } else {
                    email.setBackgroundResource(R.drawable.border_wrong);
                    email.setHint("Empty");
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        que.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().length() != 0){
                    que.setBackgroundResource(R.drawable.border_true);
                } else {
                    que.setBackgroundResource(R.drawable.border_wrong);
                    que.setHint("Empty");
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        address.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().length() != 0){
                    address.setBackgroundResource(R.drawable.border_true);
                } else {
                    address.setBackgroundResource(R.drawable.border_wrong);
                    address.setHint("Empty");
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        submit.setEnabled(false);
    }

    public void setKhmt(View view){
        if (ktmt.isChecked()) {
            ktmt.setChecked(false);
        }
    }
    public void setKtmt(View view){
        if (khmt.isChecked()) {
            khmt.setChecked(false);
        }
    }
    public void setDK(View view){
        if (dk.isChecked()){
            submit.setEnabled(true);
        } else{
            submit.setEnabled(false);
        }
    }

    public void setCheck(View view){
        if (mssv.getText().length()==0) {
            mssv.setBackgroundResource(R.drawable.border_wrong);
            mssv.setHint("Empty!!");
        }
        else mssv.setBackgroundResource(R.drawable.border_true);
        if (name.getText().length()==0) {
            name.setBackgroundResource(R.drawable.border_wrong);
            name.setHint("Empty!!");
        }
        else name.setBackgroundResource(R.drawable.border_true);
        if (cccd.getText().length()==0) {
            cccd.setBackgroundResource(R.drawable.border_wrong);
            cccd.setHint("Empty!!");
        }
        else cccd.setBackgroundResource(R.drawable.border_true);
        if (sdt.getText().length()==0) {
            sdt.setHint("Empty!!");
            sdt.setBackgroundResource(R.drawable.border_wrong);
        }
        else sdt.setBackgroundResource(R.drawable.border_true);
        if (email.getText().length()==0) {
            email.setHint("Empty!!");
            email.setBackgroundResource(R.drawable.border_wrong);
        }
        else email.setBackgroundResource(R.drawable.border_true);
        if (que.getText().length()==0) {
            que.setHint("Empty!!");
            que.setBackgroundResource(R.drawable.border_wrong);
        }
        else que.setBackgroundResource(R.drawable.border_true);
        if (address.getText().length()==0) {
            address.setHint("Empty!!");
            address.setBackgroundResource(R.drawable.border_wrong);
        }
        else address.setBackgroundResource(R.drawable.border_true);

        if ((mssv.getText().length() > 0 && name.getText().length() > 0 &&
                cccd.getText().length() > 0 && sdt.getText().length() > 0 &&
                email.getText().length() > 0 && que.getText().length() > 0 &&
                address.getText().length() > 0) &&
                (khmt.isChecked() || ktmt.isChecked()) &&
                (c_stuff.isChecked() || java.isChecked() || python.isChecked() || other.isChecked())) {
            Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
            toast.show();
        }
    }




}