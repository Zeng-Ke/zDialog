package com.zk.dialog.zdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.zk.dialog.dialog_lib.BaseListDialogFragment;
import com.zk.dialog.utils.DialogUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] array = new String[]{"text1", "text2", "text3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void click_one_btn_hard(View view) {
        DialogUtil.softOneBtnDialog(this, "这是对话框内容", new Runnable() {
            @Override
            public void run() {
                toast("btn_one_btn_soft");
            }
        });
    }


    public void click_two_btn_hard(View view) {
        DialogUtil.hardTwoBtnDialog(this, "这是对话框内容", new Runnable() {
            @Override
            public void run() {
                toast("click_two_btn_hard");
            }
        });
    }


    public void click_list_hard(View view) {

            DialogUtil.softNotitleListDialog(this,Arrays.asList(array), new BaseListDialogFragment.DialogItemClickListener() {
                @Override
                public void itemClickCallBack(BaseListDialogFragment dialogFragment, String itemText, int position) {
                    toast(itemText);
                    dialogFragment.dismiss();
                }
            });

    }


    public void toast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}
