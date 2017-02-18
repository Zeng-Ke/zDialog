package com.zk.dialog.dialog_lib;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.KeyEvent;

import com.zk.dialog.utils.KeyBoardUtils;

/**
 * author: ZK.
 * date:   On 2016/12/26
 */

public class BaseDialogFragment extends DialogFragment {
    @Override
    @CallSuper
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                if(keyCode == KeyEvent.KEYCODE_BACK
                        && event.getRepeatCount() == 0){
                    return onBeforeBackPressed();
                }
                return false;
            }
        });
    }

    protected boolean onBeforeBackPressed() {
        return false;
    }

    public void hideKeyBoard() {
        KeyBoardUtils.hideKeyBoard(this);
    }


}
