package com.bsoft.one.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.databinding.ViewDataBinding;

import com.bsoft.one.R;
import com.bsoft.one.base.BaseDialog;
import com.bsoft.one.databinding.DigLoginwaitBinding;


/**
 * @desc:
 * @author: Jiangcy
 * @datetime: 2016/9/3
 */
public class DigLoginWait extends BaseDialog {
    private DigLoginwaitBinding mBinding;

    public DigLoginWait(Context context) {
        super(context, R.style.Dialog_Fullscreen);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.dig_loginwait;
    }

    @Override
    protected void initBinding(ViewDataBinding binding) {
        mBinding = (DigLoginwaitBinding) binding;
    }

    @Override
    protected void initInfo(Object... objects) {

    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {

    }
}
