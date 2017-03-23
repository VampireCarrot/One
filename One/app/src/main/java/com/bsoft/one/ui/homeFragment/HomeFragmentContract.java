package com.bsoft.one.ui.homeFragment;

import com.bsoft.one.base.BasePresenter;
import com.bsoft.one.base.BaseView;
import com.bsoft.one.model.OneListBean.DataBean.ContentListBean;

import java.util.List;

/**
 * Created by 泅渡者
 * Created on 2017/3/20.
 */

public interface HomeFragmentContract {
    interface View extends BaseView{
        void showMessage(List<ContentListBean> listBeen);
    }
    interface Presenter extends BasePresenter{
        void loadOneList();
    }
}
