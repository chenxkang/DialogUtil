package com.dialogtool.chenxkang.CustomAlertDialog;

import android.content.DialogInterface.OnClickListener;

/**
 * author: chenxkang
 * time  : 17/5/12
 * desc  :
 */

public interface IDialog {

    /**
     * 设置 标题
     *
     * @param message 标题内容
     */
    void setTitle(CharSequence message);

    /**
     * 设置 提示内容
     *
     * @param message 内容
     */
    void setMessage(CharSequence message);

    /**
     * 设置 按钮一
     *
     * @param message   按钮文字
     * @param listener  监听事件
     */
    void setButton01(CharSequence message, final OnClickListener listener);

    /**
     * 设置 按钮二
     *
     * @param message   按钮文字
     * @param listener  监听事件
     */
    void setButton02(CharSequence message, final OnClickListener listener);

    /**
     * 设置 按钮三
     *
     * @param message   按钮文字
     * @param listener  监听事件
     */
    void setButton03(CharSequence message, final OnClickListener listener);

}
