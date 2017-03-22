package com.bsoft.one.ui.homeFragment;

import com.bsoft.one.base.BasePresenter;
import com.bsoft.one.base.BaseView;
import com.bsoft.one.model.OneListBean;

/**
 * Created by 泅渡者
 * Created on 2017/3/20.
 */

public interface HomeFragmentContract {
    interface View extends BaseView{
        void showMessage(OneListBean oneListBean);
    }
    interface Presenter extends BasePresenter{
        void loadOneList();
    }
}
