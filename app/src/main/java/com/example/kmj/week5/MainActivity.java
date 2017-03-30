package com.example.kmj.week5;

import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    public void onClick(View v){
        Toast toastview;
        switch(v.getId()){
            case R.id.Normal:
                Toast.makeText(this,"일반 메시지 창입니다.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Middle:
                Toast.makeText(this,"위치 지정 메세지 창입니다.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Customize:
                View view = View.inflate(getApplicationContext(),R.layout.myfrag, null);

                TextView msg = (TextView) view.findViewById(R.id.Msg);
                toastview = new Toast(this);
                toastview.setDuration(Toast.LENGTH_SHORT);
                toastview.setView(view);
                toastview.show();
                break;
            case R.id.Snackbar:
                Snackbar.make(v,"아 ㅎㅇ욘",Snackbar.LENGTH_SHORT).setAction("OK",new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                    }
                }).show();
                break;
            case R.id.Basic:
                AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                dlg.setTitle("제목")
                        .setMessage("내용")
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"아ㅎㅇ욘", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
                break;
            case R.id.Radio:
                AlertDialog.Builder dlg2 = new AlertDialog.Builder(this);
                String data[] = {"치킨","파전"};
                dlg2.setTitle("오늘야식")
                        .setSingleChoiceItems(data, 1, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"뭘봐", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"아ㅎㅇ욘", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
                break;
            case R.id.Checkbox:
                AlertDialog.Builder dlg3 = new AlertDialog.Builder(this);
                int selectIndex=0;
                final String data2[] = {"치킨","파전"};
                final boolean checked[] = {false,false};
                dlg3.setTitle("제목")
                        .setMultiChoiceItems(data2, checked, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                checked[which] = isChecked;
                            }
                        })
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String str="";
                                for (int i=0;i<2;i++){
                                    if (checked[i]) str=str+data2[i];
                                }
                                Toast.makeText(getApplicationContext(),str, Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
                break;
            case R.id.Customized:
                
                break;
        }
    }
    */
}
