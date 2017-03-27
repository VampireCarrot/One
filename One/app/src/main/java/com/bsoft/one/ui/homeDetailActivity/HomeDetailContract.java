package com.bsoft.one.ui.homeDetailActivity;

import com.bsoft.one.base.BasePresenter;
import com.bsoft.one.base.BaseView;
import com.bsoft.one.model.OneReadInfo;

/**
 * Created by 泅渡者
 * Created on 2017/3/27.
 */

public interface HomeDetailContract {
    interface View extends BaseView {
        void showWebView(OneReadInfo oneReadInfo);
    }
    interface Presenter extends BasePresenter {
        void loadContent(String item_id);
    }
}
