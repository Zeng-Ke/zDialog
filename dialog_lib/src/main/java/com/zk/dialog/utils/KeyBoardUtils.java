package com.zk.dialog.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by wulf on 2016/9/13.
 */

public class KeyBoardUtils {
    /**
     * 隐藏软键盘
     *
     * @param context
     */
    public static void hideKeyBoard(Activity context) {
        if(context != null){
            View focusView = context.getCurrentFocus();
            hideKeyBoard(focusView, context);
        }
    }

    public static void hideKeyBoard(DialogFragment context) {
        Dialog dialog = context.getDialog();
        if(dialog != null) {
            View focusView = dialog.getCurrentFocus();
            hideKeyBoard(focusView, context.getActivity());
        }else {
            hideKeyBoard(context.getActivity());
        }
    }

    private static void hideKeyBoard(View focusView, Activity context){
        if(focusView != null && context != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) context
                    .getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(
                    focusView.getWindowToken(), 0);
        }
    }

    /**
     * 显示软键盘
     * @param context
     * @param editText 获取焦点
     */
    public static void showKeyBord(Activity context, EditText editText){
        editText.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) context
                .getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMethodManager.showSoftInput(editText, InputMethodManager.SHOW_FORCED);

    }



}
