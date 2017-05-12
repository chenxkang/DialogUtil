package com.dialogutil.chenxkang;

import android.content.Context;
import android.widget.Toast;

/**
 * author: chenxkang
 * time  : 17/5/12
 * desc  :
 */

public class ToastUtil {

    public static void showToast(Context context, CharSequence message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

}
