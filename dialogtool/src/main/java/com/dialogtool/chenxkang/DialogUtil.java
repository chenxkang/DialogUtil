package com.dialogtool.chenxkang;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.StringRes;

import com.dialogtool.chenxkang.CustomAlertDialog.DialogBuilder;
import com.dialogtool.chenxkang.CustomAlertDialog.OnConfirm2Listener;
import com.dialogtool.chenxkang.CustomAlertDialog.OnConfirm3Listener;

/**
 * author: chenxkang
 * time  : 17/5/12
 * desc  :
 */

public class DialogUtil {

    // 模板一：不带标题，按钮一为确定，按钮二为取消
    public static void startTransparent01(Context context, @StringRes int messageId, OnConfirm2Listener listener){
        startTransparent01(context, context.getResources().getString(messageId), listener);
    }

    public static void startTransparent01(Context context, String message, OnConfirm2Listener listener){
        startTransparent03(context, null, message, listener);
    }

    // 模板二：不带标题，按钮一为取消，按钮二为确定
    public static void startTransparent02(Context context, @StringRes int messageId, OnConfirm2Listener listener){
        startTransparent02(context, context.getResources().getString(messageId), listener);
    }

    public static void startTransparent02(Context context, String message, OnConfirm2Listener listener){
        startTransparent04(context, null, message, listener);
    }

    // 模板三：自定义标题，按钮一为确定，按钮二为取消
    public static void startTransparent03(Context context, String title, @StringRes int messageId, OnConfirm2Listener listener){
        startTransparent03(context, title, context.getResources().getString(messageId), listener);
    }

    public static void startTransparent03(Context context,String title, String message, OnConfirm2Listener listener){
        startTransparent(context, title, message, "确定", "取消", true, listener);
    }

    // 模板四：自定义标题，按钮一为取消，按钮二为确定
    public static void startTransparent04(Context context, String title, @StringRes int messageId, OnConfirm2Listener listener){
        startTransparent04(context, title, context.getResources().getString(messageId), listener);
    }

    public static void startTransparent04(Context context,String title, String message, OnConfirm2Listener listener){
        startTransparent(context, title, message, "取消","确定", false, listener);
    }

    // 模板五：带默认标题，按钮一为确定，按钮二为取消
    public static void startTransparent05(Context context, @StringRes int messageId, OnConfirm2Listener listener){
        startTransparent05(context, context.getResources().getString(messageId), listener);
    }

    public static void startTransparent05(Context context,String message, OnConfirm2Listener listener){
        startTransparent03(context, "提示",  message, listener);
    }

    // 模板六：带默认标题，按钮一为取消，按钮二为确定
    public static void startTransparent06(Context context, @StringRes int messageId, OnConfirm2Listener listener){
        startTransparent06(context, context.getResources().getString(messageId), listener);
    }

    public static void startTransparent06(Context context,String message, OnConfirm2Listener listener){
        startTransparent04(context, "提示",  message, listener);
    }

    // 模板七：三按钮弹窗：不带标题，自定义按钮文字
    public static void startTransparent07(Context context, @StringRes int messageId,
                                          String buttonText01, String buttonText02, String buttonText03,
                                          OnConfirm3Listener listener){
        startTransparent07(context,context.getResources().getString(messageId),buttonText01,buttonText02,buttonText03,listener);
    }

    public static void startTransparent07(Context context, String message,
                                          String buttonText01, String buttonText02, String buttonText03,
                                          OnConfirm3Listener listener){
        startTransparent(context,message,buttonText01,buttonText02,buttonText03,listener);
    }

    // 模板八：三按钮弹窗：自定义标题和按钮文字
    public static void startTransparent08(Context context, String title, @StringRes int messageId,
                                        String buttonText01, String buttonText02, String buttonText03,
                                        OnConfirm3Listener listener){
        startTransparent08(context,title,context.getResources().getString(messageId),buttonText01,buttonText02,buttonText03,listener);
    }

    public static void startTransparent08(Context context,  @StringRes int messageId,
                                          String buttonText01, String buttonText02, String buttonText03,
                                          OnConfirm3Listener listener){
        startTransparent08(context,"提示",context.getResources().getString(messageId),buttonText01,buttonText02,buttonText03,listener);
    }

    public static void startTransparent08(Context context, String title, String message,
                                          String buttonText01, String buttonText02, String buttonText03,
                                          OnConfirm3Listener listener){
        startBaseTransparent(context,title,message,buttonText01,buttonText02,buttonText03,listener);
    }

    // 两个按钮弹窗 不带标题，自定义按钮文字和按钮的肯否
    public static void startTransparent(Context context, @StringRes int messageId,
                                        String buttonText01, String buttonText02, boolean isConfirm,
                                        OnConfirm2Listener listener){
        startTransparent(context,context.getResources().getString(messageId),buttonText01, buttonText02,
                isConfirm,listener);
    }

    // 两个按钮弹窗 不带标题，自定义按钮文字和按钮的肯否
    public static void startTransparent(Context context, String message,
                                        String buttonText01, String buttonText02, boolean isConfirm,
                                        OnConfirm2Listener listener){
        startTransparent(context,null,message,buttonText01, buttonText02,isConfirm,listener);
    }

    // 两个按钮弹窗 自定义标题、按钮文字和按钮的肯否
    public static void startTransparent(Context context, String title, @StringRes int messageId,
                                        String buttonText01, String buttonText02, boolean isConfirm,
                                        OnConfirm2Listener listener){
        startTransparent(context,title,context.getResources().getString(messageId),buttonText01,
                buttonText02,isConfirm,listener);
    }

    // 两个按钮弹窗 自定义标题、按钮文字和按钮的肯否
    public static void startTransparent(Context context, String title, String message,
                                        String buttonText01, String buttonText02, boolean isConfirm,
                                        OnConfirm2Listener listener){
        startBaseTransparent(context,title,message,buttonText01, buttonText02,isConfirm,listener);
    }

    // 三个按钮弹窗 不带标题，自定义按钮文字
    public static void startTransparent(Context context, @StringRes int messageId,
                                        String buttonText01, String buttonText02, String buttonText03,
                                        OnConfirm3Listener listener){
        startTransparent(context,context.getResources().getString(messageId),
                buttonText01, buttonText02,buttonText03,listener);
    }

    // 三个按钮弹窗 不带标题，自定义按钮文字
    public static void startTransparent(Context context, String message,
                                        String buttonText01, String buttonText02, String buttonText03,
                                        OnConfirm3Listener listener){
        startBaseTransparent(context,null, message,buttonText01,buttonText02,buttonText03,listener);
    }

    /**
     * 两个按钮弹窗的基础方法
     * 自定义标题、按钮文字和按钮的肯否
     *
     * @param context       上下文
     * @param title         标题
     * @param message       内容
     * @param buttonText01  按钮一文字
     * @param buttonText02  按钮二文字
     * @param isConfirm     true：按钮一为肯定，按钮二为否定；false：按钮一为否定，按钮二为肯定
     * @param listener      点击监听
     */
    public static void startBaseTransparent(final Context context, final String title, final String message,
                                            final String buttonText01, final String buttonText02,
                                            final boolean isConfirm, final OnConfirm2Listener listener){
        if (((Activity)context).isFinishing())
            return;

        ((Activity)context).runOnUiThread(new Runnable() {
            @Override
            public void run() {
                DialogBuilder builder = new DialogBuilder(context);
                builder.setTitle(title);
                builder.setMessage(message);

                builder.setButton01(buttonText01, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        listener.onConfirm(isConfirm);
                        dialog.dismiss();
                    }
                }).setButton02(buttonText02, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        listener.onConfirm(!isConfirm);
                        dialog.dismiss();
                    }
                }).show();
            }
        });
    }

    /**
     * 三个按钮弹窗的基础方法
     *
     * @param context      上下文
     * @param title         标题
     * @param message       内容
     * @param buttonText01  按钮一文字
     * @param buttonText02  按钮二文字
     * @param buttonText03  按钮三文字
     * @param listener      点击监听
     */
    public static void startBaseTransparent(final Context context, final String title, final String message,
                                            final String buttonText01, final String buttonText02, final String buttonText03,
                                            final OnConfirm3Listener listener){
        if (((Activity)context).isFinishing())
            return;

        ((Activity)context).runOnUiThread(new Runnable() {
            @Override
            public void run() {
                DialogBuilder builder = new DialogBuilder(context);
                builder.setTitle(title);
                builder.setMessage(message);
                builder.setButton01(buttonText01, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        listener.onLeftButtonClick();
                        dialog.dismiss();
                    }
                }).setButton02(buttonText02, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        listener.onMiddleButtonClick();
                        dialog.dismiss();
                    }
                }).setButton03(buttonText03, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        listener.onRightButtonClick();
                        dialog.dismiss();
                    }
                }).show();
            }
        });
    }
}
