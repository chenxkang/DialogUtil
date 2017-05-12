package com.dialogtool.chenxkang.CustomAlertDialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.dialogtool.chenxkang.R;

/**
 * author: chenxkang
 * time  : 17/5/12
 * desc  : 重写AlertDialog
 */

public class KDialog extends AlertDialog implements IDialog {

    private DialogView view;

    protected KDialog(Context context) {
        super(context);
        view = (DialogView) LayoutInflater.from(context).inflate(R.layout.dialog_view,null);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(view);
    }

    @Override
    public void setTitle(CharSequence message) {
        view.setTitle(message);
    }

    @Override
    public void setMessage(CharSequence message) {
        view.setMessage(message);
    }

    @Override
    public void setButton01(CharSequence message, final OnClickListener listener) {
        view.setButton01(message);
        view.getButton01().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(KDialog.this, 0);
                dismiss();
            }
        });
    }

    @Override
    public void setButton02(CharSequence message, final OnClickListener listener) {
        view.setButton02(message);
        view.getButton02().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(KDialog.this, 0);
                dismiss();
            }
        });
    }

    @Override
    public void setButton03(CharSequence message, final OnClickListener listener) {
        view.setButton03(message);
        view.getButton03().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(KDialog.this, 0);
                dismiss();
            }
        });
    }
}
