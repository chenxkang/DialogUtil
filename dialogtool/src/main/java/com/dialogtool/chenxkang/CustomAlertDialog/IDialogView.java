package com.dialogtool.chenxkang.CustomAlertDialog;

import android.widget.Button;

/**
 * author: chenxkang
 * time  : 17/5/12
 * desc  :
 */

public interface IDialogView {

    void setTitle(CharSequence message);

    void setMessage(CharSequence message);

    Button getButton01();

    void setButton01(CharSequence message);

    Button getButton02();

    void setButton02(CharSequence message);

    Button getButton03();

    void setButton03(CharSequence message);

}
