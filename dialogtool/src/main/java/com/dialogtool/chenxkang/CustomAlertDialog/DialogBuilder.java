package com.dialogtool.chenxkang.CustomAlertDialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;

/**
 * author: chenxkang
 * time  : 17/5/12
 * desc  :
 */

public class DialogBuilder extends AlertDialog.Builder {

    private KDialog dialog;

    public DialogBuilder(Context context) {
        super(context);
        dialog = new KDialog(context);
    }

    @Override
    public KDialog create() {
        return dialog;
    }

    public DialogBuilder setTitle(CharSequence message){
        dialog.setTitle(message);
        return this;
    }

    public DialogBuilder setMessage(CharSequence message){
        dialog.setMessage(message);
        return this;
    }

    public DialogBuilder setButton01(CharSequence message, OnClickListener listener) {
        dialog.setButton01(message, listener);
        return this;
    }

    public DialogBuilder setButton02(CharSequence message, OnClickListener listener) {
        dialog.setButton02(message, listener);
        return this;
    }

    public DialogBuilder setButton03(CharSequence message, OnClickListener listener) {
        dialog.setButton03(message, listener);
        return this;
    }
}
