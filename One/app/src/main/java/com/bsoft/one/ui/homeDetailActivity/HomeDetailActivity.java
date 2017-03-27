package com.bsoft.one.ui.homeDetailActivity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;

import com.bsoft.one.R;
import com.bsoft.one.base.BaseActivity;
import com.bsoft.one.databinding.HomeDetailActivityBinding;
import com.bsoft.one.model.OneReadInfo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 * Created by 泅渡者
 * Created  on 2017/3/27.
 */

public class HomeDetailActivity  extends BaseActivity<HomeDetailContract.Presenter> implements HomeDetailContract.View{

    private HomeDetailActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.home_detail_activity);
        this.createPresenter(new HomeDetailPresenter(this));
        presenter.loadContent(getIntent().getStringExtra("item_id"));
        binding.setTitle(getIntent().getStringExtra("title"));
    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showLoading() {

    }

    public void menuLeft(View view) {
        this.finish();
    }

    @Override
    public void showWebView(OneReadInfo oneReadInfo) {
        binding.setOneInfo(oneReadInfo);
        WebSettings settings =  binding.wbContent.getSettings();
        //设置编码格式
        settings.setDefaultTextEncodingName("UTF-8");
        //支持JS
        settings.setJavaScriptEnabled(true);
        //设置适应屏幕
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        //支持缩放
        settings.setSupportZoom(false);
        //隐藏原生的缩放控件
        settings.setDisplayZoomControls(false);
        //支持内容重新布局
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.supportMultipleWindows();
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        //设置缓存模式、
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAppCacheEnabled(true);
        binding.wbContent.loadDataWithBaseURL(null,getNewContent(oneReadInfo.getData().getHp_content()), "text/html", "UTF-8", null);

    }
    private String getNewContent(String htmltext){

        Document doc=Jsoup.parse(htmltext);
        Elements elements=doc.getElementsByTag("img");
        for (Element element : elements) {
            element.attr("width","auto").attr("height","auto");
        }

        Log.d("VACK", doc.toString());
        return doc.toString();
    }
}
