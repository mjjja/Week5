package com.example.kmj.week5;

import android.content.DialogInterface;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Fragment extends android.support.v4.app.Fragment {

    String Current;
    View view;
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7;
    TextView tv1, tv2, tv3, tv4, tv5, tv6;
    DateFormat df = new SimpleDateFormat("yyyyMMdd HH:mm");
    Calendar now = Calendar.getInstance();
    String et, sc, pc, ms, tp;
    Data Apple = new Data("Apple", "", "", "", "", "");
    Data Grape = new Data("Grape", "", "", "", "", "");
    Data Kiwi = new Data("Kiwi", "", "", "", "", "");
    Data Grapefruit = new Data("Grapefruit", "", "", "", "", "");

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment, container, false);
        init();
        return view;
    }

    void init() {
        bt1 = (Button) view.findViewById(R.id.Apple);
        bt2 = (Button) view.findViewById(R.id.Grape);
        bt3 = (Button) view.findViewById(R.id.Kiwi);
        bt4 = (Button) view.findViewById(R.id.Grapefruit);
        bt5 = (Button) view.findViewById(R.id.Order);
        bt6 = (Button) view.findViewById(R.id.Edit);
        bt7 = (Button) view.findViewById(R.id.Init);
        tv1 = (TextView) view.findViewById(R.id.Tablename);
        tv2 = (TextView) view.findViewById(R.id.EntranceTime);
        tv3 = (TextView) view.findViewById(R.id.SpaghettiCount);
        tv4 = (TextView) view.findViewById(R.id.PizzaCount);
        tv5 = (TextView) view.findViewById(R.id.Membership);
        tv6 = (TextView) view.findViewById(R.id.TotalPrice);
        if (Apple.entrancetime == "") bt1.setText("사과 Table(비어있음)");
        if (Grape.entrancetime == "") bt2.setText("포도 Table(비어있음)");
        if (Kiwi.entrancetime == "") bt3.setText("키위 Table(비어있음)");
        if (Grapefruit.entrancetime == "") bt4.setText("자몽 Table(비어있음)");
        bt5.setEnabled(false);
        bt6.setEnabled(false);
        bt7.setEnabled(false);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Current = "Apple";
                if (Apple.entrancetime == "") {
                    bt5.setEnabled(true);
                    bt6.setEnabled(false);
                    Toast.makeText(getActivity(), "비어있는 테이블입니다", Toast.LENGTH_SHORT).show();
                } else {
                    bt5.setEnabled(false);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                }
                tv1.setText("사과 테이블");
                tv2.setText(Apple.entrancetime);
                tv3.setText(Apple.spaghetticount);
                tv4.setText(Apple.pizzacount);
                tv5.setText(Apple.membership);
                tv6.setText(Apple.totalprice);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Current = "Grape";
                if (Grape.entrancetime == "") {
                    bt5.setEnabled(true);
                    bt6.setEnabled(false);
                    Toast.makeText(getActivity(), "비어있는 테이블입니다", Toast.LENGTH_SHORT).show();
                } else {
                    bt5.setEnabled(false);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                }
                tv1.setText("포도 테이블");
                tv2.setText(Grape.entrancetime);
                tv3.setText(Grape.spaghetticount);
                tv4.setText(Grape.pizzacount);
                tv5.setText(Grape.membership);
                tv6.setText(Grape.totalprice);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Current = "Kiwi";
                if (Kiwi.entrancetime == "") {
                    bt5.setEnabled(true);
                    bt6.setEnabled(false);
                    Toast.makeText(getActivity(), "비어있는 테이블입니다", Toast.LENGTH_SHORT).show();
                } else {
                    bt5.setEnabled(false);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                }
                tv1.setText("키위 테이블");
                tv2.setText(Kiwi.entrancetime);
                tv3.setText(Kiwi.spaghetticount);
                tv4.setText(Kiwi.pizzacount);
                tv5.setText(Kiwi.membership);
                tv6.setText(Kiwi.totalprice);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Current = "Grapefruit";
                if (Grapefruit.entrancetime == "") {
                    bt5.setEnabled(true);
                    bt6.setEnabled(false);
                    Toast.makeText(getActivity(), "비어있는 테이블입니다", Toast.LENGTH_SHORT).show();
                } else {
                    bt5.setEnabled(false);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                }
                tv1.setText("자몽 테이블");
                tv2.setText(Grapefruit.entrancetime);
                tv3.setText(Grapefruit.spaghetticount);
                tv4.setText(Grapefruit.pizzacount);
                tv5.setText(Grapefruit.membership);
                tv6.setText(Grapefruit.totalprice);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final View dlgview = View.inflate(v.getContext(), R.layout.myfrag, null);
                final EditText et1 = (EditText) dlgview.findViewById(R.id.SpaghettiOrder);
                final EditText et2 = (EditText) dlgview.findViewById(R.id.PizzaOrder);
                final CheckBox cb = (CheckBox) dlgview.findViewById(R.id.IsVIP);
                AlertDialog.Builder dlg = new AlertDialog.Builder(v.getContext());
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        et=df.format(now.getTime());
                        sc = et1.getText().toString();
                        pc = et2.getText().toString();
                        ms = cb.isChecked() ? "VIP멤버쉽" : "기본멤버쉽";
                        tp = cb.isChecked() ? (Integer.parseInt(et1.getText().toString()) * 10000 +
                                Integer.parseInt(et2.getText().toString()) * 12000) * 7 / 10 + "원" : (Integer.parseInt(et1.getText().toString()) * 10000 +
                                Integer.parseInt(et2.getText().toString()) * 12000) * 9 / 10 + "원";
                        switch (Current) {
                            case "Apple":
                                bt1.setText("사과 Table");
                                Apple.entrancetime = et;
                                Apple.spaghetticount = sc;
                                Apple.pizzacount = pc;
                                Apple.membership = ms;
                                Apple.totalprice = tp;
                                break;
                            case "Grape":
                                bt2.setText("포도 Table");
                                Grape.entrancetime = et;
                                Grape.spaghetticount = sc;
                                Grape.pizzacount = pc;
                                Grape.membership = ms;
                                Grape.totalprice = tp;
                                break;
                            case "Kiwi":
                                bt3.setText("키위 Table");
                                Kiwi.entrancetime = et;
                                Kiwi.spaghetticount = sc;
                                Kiwi.pizzacount = pc;
                                Kiwi.membership = ms;
                                Kiwi.totalprice = tp;
                                break;
                            case "Grapefruit":
                                bt4.setText("자몽 Table");
                                Grapefruit.entrancetime = et;
                                Grapefruit.spaghetticount = sc;
                                Grapefruit.pizzacount = pc;
                                Grapefruit.membership = ms;
                                Grapefruit.totalprice = tp;
                                break;
                        }
                        Snackbar.make(v, "정보가 입력되었습니다", Snackbar.LENGTH_SHORT).setAction("OK", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();
                        bt5.setEnabled(false);
                        bt6.setEnabled(true);
                        tv2.setText(et);
                        tv3.setText(sc);
                        tv4.setText(pc);
                        tv5.setText(ms);
                        tv6.setText(tp);
                    }
                })

                        .setTitle("주문하기")
                        .setView(dlgview);
                dlg.show();
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dlgview = View.inflate(v.getContext(), R.layout.myfrag, null);
                final EditText et1 = (EditText) dlgview.findViewById(R.id.SpaghettiOrder);
                final EditText et2 = (EditText) dlgview.findViewById(R.id.PizzaOrder);
                final CheckBox cb = (CheckBox) dlgview.findViewById(R.id.IsVIP);
                AlertDialog.Builder dlg = new AlertDialog.Builder(v.getContext());
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        et=df.format(now.getTime());
                        sc = et1.getText().toString();
                        pc = et2.getText().toString();
                        ms = cb.isChecked() ? "VIP멤버쉽" : "기본멤버쉽";
                        tp = cb.isChecked() ? (Integer.parseInt(et1.getText().toString()) * 10000 +
                                Integer.parseInt(et2.getText().toString()) * 12000) * 7 / 10 + "원" : (Integer.parseInt(et1.getText().toString()) * 10000 +
                                Integer.parseInt(et2.getText().toString()) * 12000) * 9 / 10 + "원";
                        switch (Current) {
                            case "Apple":
                                Apple.spaghetticount = sc;
                                Apple.pizzacount = pc;
                                Apple.membership = ms;
                                Apple.totalprice = tp;
                                break;
                            case "Grape":
                                Grape.spaghetticount = sc;
                                Grape.pizzacount = pc;
                                Grape.membership = ms;
                                Grape.totalprice = tp;
                                break;
                            case "Kiwi":
                                Kiwi.spaghetticount = sc;
                                Kiwi.pizzacount = pc;
                                Kiwi.membership = ms;
                                Kiwi.totalprice = tp;
                                break;
                            case "Grapefruit":
                                Grapefruit.spaghetticount = sc;
                                Grapefruit.pizzacount = pc;
                                Grapefruit.membership = ms;
                                Grapefruit.totalprice = tp;
                                break;
                        }
                        bt7.setEnabled(true);
                        tv3.setText(sc);
                        tv4.setText(pc);
                        tv5.setText(ms);
                        tv6.setText(tp);
                    }
                })

                        .setTitle("주문하기")
                        .setView(dlgview);
                dlg.show();
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("");
                tv2.setText("");
                tv3.setText("");
                tv4.setText("");
                tv5.setText("");
                tv6.setText("");
                switch (Current) {
                    case "Apple":
                        bt1.setText("사과 Table(비어있음)");
                        Apple = new Data("Apple", "", "", "", "", "");
                        break;
                    case "Grape":
                        bt2.setText("포도 Table(비어있음)");
                        Grape = new Data("Grape", "", "", "", "", "");
                        break;
                    case "Kiwi":
                        bt3.setText("키위 Table(비어있음)");
                        Kiwi = new Data("Kiwi", "", "", "", "", "");
                        break;
                    case "Grapefruit":
                        bt4.setText("자몽 Table(비어있음)");
                        Grapefruit = new Data("Grapefruit", "", "", "", "", "");
                        break;
                }
                bt5.setEnabled(true);
                bt6.setEnabled(false);
                bt7.setEnabled(false);
            }
        });

    }

}