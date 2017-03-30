package com.example.kmj.week5;

import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Fragment extends android.support.v4.app.Fragment {
    View view;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7;
    TextView tv1,tv2,tv3,tv4,tv5,tv6;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment, container, false);
        init();
        return view;
    }
    void init(){
        bt1=(Button)view.findViewById(R.id.Apple);
        bt2=(Button)view.findViewById(R.id.Grape);
        bt3=(Button)view.findViewById(R.id.Kiwi);
        bt4=(Button)view.findViewById(R.id.Grapefruit);
        bt5=(Button)view.findViewById(R.id.Order);
        bt6=(Button)view.findViewById(R.id.Edit);
        bt7=(Button)view.findViewById(R.id.Init);
        tv1=(TextView)view.findViewById(R.id.Tablename);
        tv2=(TextView)view.findViewById(R.id.EntranceTime);
        tv3=(TextView)view.findViewById(R.id.SpaghettiCount);
        tv4=(TextView)view.findViewById(R.id.PizzaCount);
        tv5=(TextView)view.findViewById(R.id.Membership);
        tv6=(TextView)view.findViewById(R.id.TotalPrice);

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dlgview = View.inflate(v.getContext(),R.layout.myfrag,null);
                final EditText et1 = (EditText)dlgview.findViewById(R.id.SpaghettiOrder);
                final EditText et2 = (EditText)dlgview.findViewById(R.id.PizzaOrder);
                final CheckBox checked = (CheckBox)dlgview.findViewById(R.id.IsVIP);
                final String nowtime = "";

                AlertDialog.Builder dlg = new AlertDialog.Builder(v.getContext());
                dlg.setPositiveButton("확인",null)
                        .setTitle("주문하기")
                        .setView(dlgview);
                dlg.show();
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
