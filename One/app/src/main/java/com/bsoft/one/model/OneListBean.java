package com.bsoft.one.model;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by 泅渡者
 * Created on 2017/3/22.
 */

public class OneListBean {

    /**
     * res : 0
     * data : {"id":"3853","weather":{"city_name":"地球","date":"2017-03-23","temperature":"-275","humidity":"120","climate":"对流层","wind_direction":"一阵妖风","hurricane":"36级","icons":{"day":"weather_icon_unknown","night":"weather_icon_unknown_night"}},"date":"2017-03-22 06:00:00","content_list":[{"id":"10653","category":"0","display_category":6,"item_id":"1655","title":"插画","forward":"人会孤独，是因为我们只有一颗心脏，却渴望和另一颗心脏同时跳动。","img_url":"http://image.wufazhuce.com/Fp9rWuDoB48eLRwbRnKIgn5o2CwU","like_count":13576,"post_date":"2017-03-22 06:00:00","last_update_date":"2017-03-20 11:47:22","author":{},"video_url":"","audio_url":"","audio_platform":2,"start_video":"","volume":"VOL.1628","pic_info":"我是白","words_info":"苏更生","subtitle":"","number":0,"serial_id":0,"serial_list":[],"movie_story_id":0,"ad_id":0,"ad_type":0,"ad_pvurl":"","ad_linkurl":"","ad_makettime":"","ad_closetime":"","ad_share_cnt":"","ad_pvurl_vendor":"","content_id":"1655","content_type":"0","content_bgcolor":"#FFFFFF","share_url":"http://m.wufazhuce.com/one/1655","share_info":{"url":"http://m.wufazhuce.com/one/1655","image":"http://image.wufazhuce.com/Fp9rWuDoB48eLRwbRnKIgn5o2CwU","title":"VOL.1628","content":"人会孤独，是因为我们只有一颗心脏，却渴望和另一颗心脏同时跳动。"},"share_list":{"wx":{"title":"","desc":"","link":"","imgUrl":""},"weibo":{"title":"ONE·一个 人会孤独，是因为我们只有一颗心脏，却渴望和另一颗心脏同时跳动。\u2014\u2014苏更生 下载ONE·一个APP:http://weibo.com/p/100404157874","desc":"","link":"","imgUrl":""},"qq":{"title":"","desc":"","link":"","imgUrl":""}},"tag_list":[],"orientation":"0"}]}
     */

    private int res;
    private DataBean data;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 3853
         * weather : {"city_name":"地球","date":"2017-03-23","temperature":"-275","humidity":"120","climate":"对流层","wind_direction":"一阵妖风","hurricane":"36级","icons":{"day":"weather_icon_unknown","night":"weather_icon_unknown_night"}}
         * date : 2017-03-22 06:00:00
         * content_list : [{"id":"10653","category":"0","display_category":6,"item_id":"1655","title":"插画","forward":"人会孤独，是因为我们只有一颗心脏，却渴望和另一颗心脏同时跳动。","img_url":"http://image.wufazhuce.com/Fp9rWuDoB48eLRwbRnKIgn5o2CwU","like_count":13576,"post_date":"2017-03-22 06:00:00","last_update_date":"2017-03-20 11:47:22","author":{},"video_url":"","audio_url":"","audio_platform":2,"start_video":"","volume":"VOL.1628","pic_info":"我是白","words_info":"苏更生","subtitle":"","number":0,"serial_id":0,"serial_list":[],"movie_story_id":0,"ad_id":0,"ad_type":0,"ad_pvurl":"","ad_linkurl":"","ad_makettime":"","ad_closetime":"","ad_share_cnt":"","ad_pvurl_vendor":"","content_id":"1655","content_type":"0","content_bgcolor":"#FFFFFF","share_url":"http://m.wufazhuce.com/one/1655","share_info":{"url":"http://m.wufazhuce.com/one/1655","image":"http://image.wufazhuce.com/Fp9rWuDoB48eLRwbRnKIgn5o2CwU","title":"VOL.1628","content":"人会孤独，是因为我们只有一颗心脏，却渴望和另一颗心脏同时跳动。"},"share_list":{"wx":{"title":"","desc":"","link":"","imgUrl":""},"weibo":{"title":"ONE·一个 人会孤独，是因为我们只有一颗心脏，却渴望和另一颗心脏同时跳动。\u2014\u2014苏更生 下载ONE·一个APP:http://weibo.com/p/100404157874","desc":"","link":"","imgUrl":""},"qq":{"title":"","desc":"","link":"","imgUrl":""}},"tag_list":[],"orientation":"0"}]
         */

        private String id;
        private WeatherBean weather;
        private String date;
        private List<ContentListBean> content_list;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public WeatherBean getWeather() {
            return weather;
        }

        public void setWeather(WeatherBean weather) {
            this.weather = weather;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public List<ContentListBean> getContent_list() {
            return content_list;
        }

        public void setContent_list(List<ContentListBean> content_list) {
            this.content_list = content_list;
        }

        public static class WeatherBean {
            /**
             * city_name : 地球
             * date : 2017-03-23
             * temperature : -275
             * humidity : 120
             * climate : 对流层
             * wind_direction : 一阵妖风
             * hurricane : 36级
             * icons : {"day":"weather_icon_unknown","night":"weather_icon_unknown_night"}
             */

            private String city_name;
            private String date;
            private String temperature;
            private String humidity;
            private String climate;
            private String wind_direction;
            private String hurricane;
            private IconsBean icons;

            public String getCity_name() {
                return city_name;
            }

            public void setCity_name(String city_name) {
                this.city_name = city_name;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getClimate() {
                return climate;
            }

            public void setClimate(String climate) {
                this.climate = climate;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getHurricane() {
                return hurricane;
            }

            public void setHurricane(String hurricane) {
                this.hurricane = hurricane;
            }

            public IconsBean getIcons() {
                return icons;
            }

            public void setIcons(IconsBean icons) {
                this.icons = icons;
            }

            public static class IconsBean {
                /**
                 * day : weather_icon_unknown
                 * night : weather_icon_unknown_night
                 */

                private String day;
                private String night;

                public String getDay() {
                    return day;
                }

                public void setDay(String day) {
                    this.day = day;
                }

                public String getNight() {
                    return night;
                }

                public void setNight(String night) {
                    this.night = night;
                }
            }
        }

        public static class ContentListBean {
            private String id;
            private String category;
            private int display_category;
            private String item_id;
            private String title;
            private String forward;
            private String img_url;
            private int like_count;
            private String post_date;
            private String last_update_date;
            private AuthorBean author;
            private String video_url;
            private String audio_url;
            private int audio_platform;
            private String start_video;
            private String volume;
            private String pic_info;
            private String words_info;
            private String subtitle;
            private int number;
            private int serial_id;
            private int movie_story_id;
            private int ad_id;
            private int ad_type;
            private String ad_pvurl;
            private String ad_linkurl;
            private String ad_makettime;
            private String ad_closetime;
            private String ad_share_cnt;
            private String ad_pvurl_vendor;
            private String content_id;
            private String content_type;
            private String content_bgcolor;
            private String share_url;
            private ShareInfoBean share_info;
            private ShareListBean share_list;
            private String orientation;
            private List<?> serial_list;
            private List<?> tag_list;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public int getDisplay_category() {
                return display_category;
            }

            public void setDisplay_category(int display_category) {
                this.display_category = display_category;
            }

            public String getItem_id() {
                return item_id;
            }

            public void setItem_id(String item_id) {
                this.item_id = item_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getForward() {
                return forward;
            }

            public void setForward(String forward) {
                this.forward = forward;
            }

            public String getImg_url() {
                return img_url;
            }

            public void setImg_url(String img_url) {
                this.img_url = img_url;
            }

            public int getLike_count() {
                return like_count;
            }

            public void setLike_count(int like_count) {
                this.like_count = like_count;
            }

            public String getPost_date() {
                return post_date;
            }

            public void setPost_date(String post_date) {
                this.post_date = post_date;
            }

            public String getLast_update_date() {
                return last_update_date;
            }

            public void setLast_update_date(String last_update_date) {
                this.last_update_date = last_update_date;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public String getVideo_url() {
                return video_url;
            }

            public void setVideo_url(String video_url) {
                this.video_url = video_url;
            }

            public String getAudio_url() {
                return audio_url;
            }

            public void setAudio_url(String audio_url) {
                this.audio_url = audio_url;
            }

            public int getAudio_platform() {
                return audio_platform;
            }

            public void setAudio_platform(int audio_platform) {
                this.audio_platform = audio_platform;
            }

            public String getStart_video() {
                return start_video;
            }

            public void setStart_video(String start_video) {
                this.start_video = start_video;
            }

            public String getVolume() {
                return volume;
            }

            public void setVolume(String volume) {
                this.volume = volume;
            }

            public String getPic_info() {
                return pic_info;
            }

            public void setPic_info(String pic_info) {
                this.pic_info = pic_info;
            }

            public String getWords_info() {
                return words_info;
            }

            public void setWords_info(String words_info) {
                this.words_info = words_info;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public int getSerial_id() {
                return serial_id;
            }

            public void setSerial_id(int serial_id) {
                this.serial_id = serial_id;
            }

            public int getMovie_story_id() {
                return movie_story_id;
            }

            public void setMovie_story_id(int movie_story_id) {
                this.movie_story_id = movie_story_id;
            }

            public int getAd_id() {
                return ad_id;
            }

            public void setAd_id(int ad_id) {
                this.ad_id = ad_id;
            }

            public int getAd_type() {
                return ad_type;
            }

            public void setAd_type(int ad_type) {
                this.ad_type = ad_type;
            }

            public String getAd_pvurl() {
                return ad_pvurl;
            }

            public void setAd_pvurl(String ad_pvurl) {
                this.ad_pvurl = ad_pvurl;
            }

            public String getAd_linkurl() {
                return ad_linkurl;
            }

            public void setAd_linkurl(String ad_linkurl) {
                this.ad_linkurl = ad_linkurl;
            }

            public String getAd_makettime() {
                return ad_makettime;
            }

            public void setAd_makettime(String ad_makettime) {
                this.ad_makettime = ad_makettime;
            }

            public String getAd_closetime() {
                return ad_closetime;
            }

            public void setAd_closetime(String ad_closetime) {
                this.ad_closetime = ad_closetime;
            }

            public String getAd_share_cnt() {
                return ad_share_cnt;
            }

            public void setAd_share_cnt(String ad_share_cnt) {
                this.ad_share_cnt = ad_share_cnt;
            }

            public String getAd_pvurl_vendor() {
                return ad_pvurl_vendor;
            }

            public void setAd_pvurl_vendor(String ad_pvurl_vendor) {
                this.ad_pvurl_vendor = ad_pvurl_vendor;
            }

            public String getContent_id() {
                return content_id;
            }

            public void setContent_id(String content_id) {
                this.content_id = content_id;
            }

            public String getContent_type() {
                return content_type;
            }

            public void setContent_type(String content_type) {
                this.content_type = content_type;
            }

            public String getContent_bgcolor() {
                return content_bgcolor;
            }

            public void setContent_bgcolor(String content_bgcolor) {
                this.content_bgcolor = content_bgcolor;
            }

            public String getShare_url() {
                return share_url;
            }

            public void setShare_url(String share_url) {
                this.share_url = share_url;
            }

            public ShareInfoBean getShare_info() {
                return share_info;
            }

            public void setShare_info(ShareInfoBean share_info) {
                this.share_info = share_info;
            }

            public ShareListBean getShare_list() {
                return share_list;
            }

            public void setShare_list(ShareListBean share_list) {
                this.share_list = share_list;
            }

            public String getOrientation() {
                return orientation;
            }

            public void setOrientation(String orientation) {
                this.orientation = orientation;
            }

            public List<?> getSerial_list() {
                return serial_list;
            }

            public void setSerial_list(List<?> serial_list) {
                this.serial_list = serial_list;
            }

            public List<?> getTag_list() {
                return tag_list;
            }

            public void setTag_list(List<?> tag_list) {
                this.tag_list = tag_list;
            }

            public static class AuthorBean {

                /**
                 * user_id : 4813479
                 * user_name : 荞麦
                 * desc : 「一个」常驻作家。最新随笔集《当一切在我们周围暗下来》。
                 * wb_name : @荞麦chen
                 * is_settled : 0
                 * settled_type : 0
                 * summary : 「一个」常驻作家。最新随笔集《当一切在我们周围暗下来》。
                 * fans_total : 660
                 * web_url : http://image.wufazhuce.com/FsRokzycWWx_CucHTFUN4OFBh5s6
                 */

                private String user_id;
                private String user_name;
                private String desc;
                private String wb_name;
                private String is_settled;
                private String settled_type;
                private String summary;
                private String fans_total;
                private String web_url;

                public String getUser_id() {
                    return user_id;
                }

                public void setUser_id(String user_id) {
                    this.user_id = user_id;
                }

                public String getUser_name() {
                    return user_name;
                }

                public void setUser_name(String user_name) {
                    this.user_name = user_name;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getWb_name() {
                    return wb_name;
                }

                public void setWb_name(String wb_name) {
                    this.wb_name = wb_name;
                }

                public String getIs_settled() {
                    return is_settled;
                }

                public void setIs_settled(String is_settled) {
                    this.is_settled = is_settled;
                }

                public String getSettled_type() {
                    return settled_type;
                }

                public void setSettled_type(String settled_type) {
                    this.settled_type = settled_type;
                }

                public String getSummary() {
                    return summary;
                }

                public void setSummary(String summary) {
                    this.summary = summary;
                }

                public String getFans_total() {
                    return fans_total;
                }

                public void setFans_total(String fans_total) {
                    this.fans_total = fans_total;
                }

                public String getWeb_url() {
                    return web_url;
                }

                public void setWeb_url(String web_url) {
                    this.web_url = web_url;
                }

                @Override
                public String toString() {
                    return "AuthorBean{" +
                            "user_id='" + user_id + '\'' +
                            ", user_name='" + user_name + '\'' +
                            ", desc='" + desc + '\'' +
                            ", wb_name='" + wb_name + '\'' +
                            ", is_settled='" + is_settled + '\'' +
                            ", settled_type='" + settled_type + '\'' +
                            ", summary='" + summary + '\'' +
                            ", fans_total='" + fans_total + '\'' +
                            ", web_url='" + web_url + '\'' +
                            '}';
                }
            }

            public static class ShareInfoBean {
                /**
                 * url : http://m.wufazhuce.com/one/1655
                 * image : http://image.wufazhuce.com/Fp9rWuDoB48eLRwbRnKIgn5o2CwU
                 * title : VOL.1628
                 * content : 人会孤独，是因为我们只有一颗心脏，却渴望和另一颗心脏同时跳动。
                 */

                private String url;
                private String image;
                private String title;
                private String content;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                @Override
                public String toString() {
                    return "ShareInfoBean{" +
                            "url='" + url + '\'' +
                            ", image='" + image + '\'' +
                            ", title='" + title + '\'' +
                            ", content='" + content + '\'' +
                            '}';
                }
            }

            public static class ShareListBean {
                private WxBean wx;
                private WeiboBean weibo;
                private QqBean qq;

                public WxBean getWx() {
                    return wx;
                }

                public void setWx(WxBean wx) {
                    this.wx = wx;
                }

                public WeiboBean getWeibo() {
                    return weibo;
                }

                public void setWeibo(WeiboBean weibo) {
                    this.weibo = weibo;
                }

                public QqBean getQq() {
                    return qq;
                }

                public void setQq(QqBean qq) {
                    this.qq = qq;
                }

                public static class WxBean {
                    /**
                     * title :
                     * desc :
                     * link :
                     * imgUrl :
                     */

                    private String title;
                    private String desc;
                    private String link;
                    private String imgUrl;

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public String getLink() {
                        return link;
                    }

                    public void setLink(String link) {
                        this.link = link;
                    }

                    public String getImgUrl() {
                        return imgUrl;
                    }

                    public void setImgUrl(String imgUrl) {
                        this.imgUrl = imgUrl;
                    }

                    @Override
                    public String toString() {
                        return "WxBean{" +
                                "title='" + title + '\'' +
                                ", desc='" + desc + '\'' +
                                ", link='" + link + '\'' +
                                ", imgUrl='" + imgUrl + '\'' +
                                '}';
                    }
                }

                public static class WeiboBean {
                    /**
                     * title : ONE·一个 人会孤独，是因为我们只有一颗心脏，却渴望和另一颗心脏同时跳动。——苏更生 下载ONE·一个APP:http://weibo.com/p/100404157874
                     * desc :
                     * link :
                     * imgUrl :
                     */

                    private String title;
                    private String desc;
                    private String link;
                    private String imgUrl;

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public String getLink() {
                        return link;
                    }

                    public void setLink(String link) {
                        this.link = link;
                    }

                    public String getImgUrl() {
                        return imgUrl;
                    }

                    public void setImgUrl(String imgUrl) {
                        this.imgUrl = imgUrl;
                    }

                    @Override
                    public String toString() {
                        return "WeiboBean{" +
                                "title='" + title + '\'' +
                                ", desc='" + desc + '\'' +
                                ", link='" + link + '\'' +
                                ", imgUrl='" + imgUrl + '\'' +
                                '}';
                    }
                }

                public static class QqBean {
                    /**
                     * title :
                     * desc :
                     * link :
                     * imgUrl :
                     */

                    private String title;
                    private String desc;
                    private String link;
                    private String imgUrl;

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public String getLink() {
                        return link;
                    }

                    public void setLink(String link) {
                        this.link = link;
                    }

                    public String getImgUrl() {
                        return imgUrl;
                    }

                    public void setImgUrl(String imgUrl) {
                        this.imgUrl = imgUrl;
                    }

                    @Override
                    public String toString() {
                        return "QqBean{" +
                                "title='" + title + '\'' +
                                ", desc='" + desc + '\'' +
                                ", link='" + link + '\'' +
                                ", imgUrl='" + imgUrl + '\'' +
                                '}';
                    }
                }

                @Override
                public String toString() {
                    return "ShareListBean{" +
                            "wx=" + wx +
                            ", weibo=" + weibo +
                            ", qq=" + qq +
                            '}';
                }
            }
            public String chackType(){
                String tName = "";
                switch (content_type){
                    case "0":
                        tName = "";
                        break;
                    case "1":
                        tName = "- 阅读 -";
                        break;
                    case "2":
                        tName = "- 连载 -";
                        break;
                    case "3":
                        tName = "- 问答 -";
                        break;
                    case "4":
                        tName = "- 音乐 -";
                        break;
                    case "5":
                        tName = "- 电影 -";
                        break;
                    default:
                        break;
                }
                return tName;
            }
            @Override
            public String toString() {
                return "ContentListBean{" +
                        "id='" + id + '\'' +
                        ", category='" + category + '\'' +
                        ", display_category=" + display_category +
                        ", item_id='" + item_id + '\'' +
                        ", title='" + title + '\'' +
                        ", forward='" + forward + '\'' +
                        ", img_url='" + img_url + '\'' +
                        ", like_count=" + like_count +
                        ", post_date='" + post_date + '\'' +
                        ", last_update_date='" + last_update_date + '\'' +
                        ", author=" + author +
                        ", video_url='" + video_url + '\'' +
                        ", audio_url='" + audio_url + '\'' +
                        ", audio_platform=" + audio_platform +
                        ", start_video='" + start_video + '\'' +
                        ", volume='" + volume + '\'' +
                        ", pic_info='" + pic_info + '\'' +
                        ", words_info='" + words_info + '\'' +
                        ", subtitle='" + subtitle + '\'' +
                        ", number=" + number +
                        ", serial_id=" + serial_id +
                        ", movie_story_id=" + movie_story_id +
                        ", ad_id=" + ad_id +
                        ", ad_type=" + ad_type +
                        ", ad_pvurl='" + ad_pvurl + '\'' +
                        ", ad_linkurl='" + ad_linkurl + '\'' +
                        ", ad_makettime='" + ad_makettime + '\'' +
                        ", ad_closetime='" + ad_closetime + '\'' +
                        ", ad_share_cnt='" + ad_share_cnt + '\'' +
                        ", ad_pvurl_vendor='" + ad_pvurl_vendor + '\'' +
                        ", content_id='" + content_id + '\'' +
                        ", content_type='" + content_type + '\'' +
                        ", content_bgcolor='" + content_bgcolor + '\'' +
                        ", share_url='" + share_url + '\'' +
                        ", share_info=" + share_info +
                        ", share_list=" + share_list +
                        ", orientation='" + orientation + '\'' +
                        ", serial_list=" + serial_list +
                        ", tag_list=" + tag_list +
                        '}';
            }
        }
    }
    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }
}
