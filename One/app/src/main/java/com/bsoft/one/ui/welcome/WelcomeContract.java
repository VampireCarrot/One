package com.bsoft.one.ui.welcome;

import com.bsoft.one.base.BasePresenter;
import com.bsoft.one.base.BaseView;

/**
 * Created by 泅渡者
 * Created on 2017/3/17.
 */

public interface WelcomeContract {
    interface View extends BaseView {
        void showUpdate(int drawable,String currentDay);
        void skiActivity();
    }
    interface Presenter extends BasePresenter{
        void upDateLogo(int currentWeek,String currentDay);
        void toNextActivity();
    }
}
