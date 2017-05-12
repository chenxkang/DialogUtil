package com.dialogutil.chenxkang;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dialogtool.chenxkang.CustomAlertDialog.OnConfirm2Listener;
import com.dialogtool.chenxkang.CustomAlertDialog.OnConfirm3Listener;
import com.dialogtool.chenxkang.DialogUtil;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @OnClick({R.id.content_tv01,R.id.content_tv02,R.id.content_tv03,R.id.content_tv04,
            R.id.content_tv05,R.id.content_tv06,R.id.content_tv07,R.id.content_tv08})
    void onClick(View view){
        switch (view.getId()){
            case R.id.content_tv01:
                DialogUtil.startTransparent01(MainActivity.this, ((TextView) view).getText().toString(), new OnConfirm2Listener() {
                    @Override
                    public void onConfirm(boolean isConfirm) {
                        if (isConfirm){
                            ToastUtil.showToast(MainActivity.this,"确定");
                            return;
                        }

                        ToastUtil.showToast(MainActivity.this,"取消");
                    }
                });
                break;
            case R.id.content_tv02:
                DialogUtil.startTransparent02(MainActivity.this, ((TextView) view).getText().toString(),
                        new OnConfirm2Listener() {
                    @Override
                    public void onConfirm(boolean isConfirm) {
                        if (isConfirm){
                            ToastUtil.showToast(MainActivity.this,"确定");
                            return;
                        }

                        ToastUtil.showToast(MainActivity.this,"取消");
                    }
                });
                break;
            case R.id.content_tv03:
                DialogUtil.startTransparent03(MainActivity.this, "温馨提示", ((TextView) view).getText().toString(),
                        new OnConfirm2Listener() {
                    @Override
                    public void onConfirm(boolean isConfirm) {
                        if (isConfirm){
                            ToastUtil.showToast(MainActivity.this,"确定");
                            return;
                        }

                        ToastUtil.showToast(MainActivity.this,"取消");
                    }
                });
                break;
            case R.id.content_tv04:
                DialogUtil.startTransparent04(MainActivity.this, "温馨提示", ((TextView) view).getText().toString(),
                        new OnConfirm2Listener() {
                            @Override
                            public void onConfirm(boolean isConfirm) {
                                if (isConfirm){
                                    ToastUtil.showToast(MainActivity.this,"确定");
                                    return;
                                }

                                ToastUtil.showToast(MainActivity.this,"取消");
                            }
                        });
                break;
            case R.id.content_tv05:
                DialogUtil.startTransparent05(MainActivity.this, ((TextView) view).getText().toString(), new OnConfirm2Listener() {
                    @Override
                    public void onConfirm(boolean isConfirm) {
                        if (isConfirm){
                            ToastUtil.showToast(MainActivity.this,"确定");
                            return;
                        }

                        ToastUtil.showToast(MainActivity.this,"取消");
                    }
                });
                break;
            case R.id.content_tv06:
                DialogUtil.startTransparent06(MainActivity.this, ((TextView) view).getText().toString(), new OnConfirm2Listener() {
                    @Override
                    public void onConfirm(boolean isConfirm) {
                        if (isConfirm){
                            ToastUtil.showToast(MainActivity.this,"确定");
                            return;
                        }

                        ToastUtil.showToast(MainActivity.this,"取消");
                    }
                });
                break;
            case R.id.content_tv07:
                DialogUtil.startTransparent07(MainActivity.this, ((TextView) view).getText().toString(),
                        "取消", "忽略", "确定", new OnConfirm3Listener() {
                    @Override
                    public void onLeftButtonClick() {
                        ToastUtil.showToast(MainActivity.this,"取消");
                    }

                    @Override
                    public void onMiddleButtonClick() {
                        ToastUtil.showToast(MainActivity.this,"忽略");
                    }

                    @Override
                    public void onRightButtonClick() {
                        ToastUtil.showToast(MainActivity.this,"确定");
                    }
                });
                break;
            case R.id.content_tv08:
                DialogUtil.startTransparent08(MainActivity.this, "温馨提示", ((TextView) view).getText().toString(),
                        "取消", "忽略", "确定", new OnConfirm3Listener() {
                            @Override
                            public void onLeftButtonClick() {
                                ToastUtil.showToast(MainActivity.this,"取消");
                            }

                            @Override
                            public void onMiddleButtonClick() {
                                ToastUtil.showToast(MainActivity.this,"忽略");
                            }

                            @Override
                            public void onRightButtonClick() {
                                ToastUtil.showToast(MainActivity.this,"确定");
                            }
                        });
                break;
        }
    }


}
