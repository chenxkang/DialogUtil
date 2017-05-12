package com.dialogtool.chenxkang.CustomAlertDialog;

/**
 * author: chenxkang
 * time  : 17/5/12
 * desc  :
 */

public interface OnConfirm2Listener {

    /**
     * 包含两个按钮的弹窗的监听
     *
     * @param isConfirm true：肯定；false：否定
     */
    void onConfirm(boolean isConfirm);

}
