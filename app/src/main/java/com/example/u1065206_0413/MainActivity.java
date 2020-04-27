package com.example.u1065206_0413;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        //設定各屬性的值
        CheckBox chk;
        TextView txvShow;
        String msg = "";

        //確認選項是否勾選，如果有就把內容加入msg字串中
        int[] id = {R.id.chkMina,R.id.chkMomo,R.id.chkSana,R.id.chkTzuyu};
        for(int i:id){
            chk=findViewById(i);
            if(chk.isChecked())
                msg +="\n" +chk.getText();
        }
        txvShow=findViewById(R.id.txvShow);

        //在txvShow顯示msg字串
        txvShow.setText(msg);
    }
}
