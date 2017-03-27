package com.bsoft.one.model;

import android.databinding.BaseObservable;

import java.util.List;

/**
 * Created by 泅渡者
 * Created on 2017/3/27.
 */

public class OneReadInfo extends BaseObservable {

    /**
     * res : 0
     * data : {"content_id":"2111","hp_title":"软糖| \u201c雨\u201d _ 旅行","sub_title":"","hp_author":"郑南七白","auth_it":"茶凉粉乐队主唱，爱唱歌爱画画。","hp_author_introduce":"责任编辑：田克","hp_content":"\n<img alt=\"\" src=\"http://image.wufazhuce.com/FrI_C83ye11x9O-1V9ZpUu2ABRG0?imageView2/2/w/394\" style=\"height:126px; width:394px\"><br>\r\n<img alt=\"\" src=\"http://image.wufazhuce.com/FsEzGO3Mh4MsMLN64ar-qEorcY3H?imageView2/2/w/394\" style=\"height:251px; width:394px\"><br>\r\n<img alt=\"\" src=\"http://image.wufazhuce.com/FibhHDIb6kdB-qNKK2u4oEVgfBlN?imageView2/2/w/394\" style=\"height:251px; width:394px\"><br>\r\n<img alt=\"\" src=\"http://image.wufazhuce.com/FjqlFSNwRKn3OxCCCFlvOTkb43om?imageView2/2/w/394\" style=\"height:251px; width:394px\"><br>\r\n<img alt=\"\" src=\"http://image.wufazhuce.com/FvZOREYndkOovRVSiRpqOIcVvhKm?imageView2/2/w/394\" style=\"height:251px; width:394px\"><br>\r\n<img alt=\"\" src=\"http://image.wufazhuce.com/FtA5UBmzxPDvrcanCj2703cphNaO?imageView2/2/w/394\" style=\"height:251px; width:394px\"><br>\r\n<img alt=\"\" src=\"http://image.wufazhuce.com/FibqPDhv9fSPUvDysAv2pwTvRvZl?imageView2/2/w/394\" style=\"height:251px; width:394px\"><br>\r\n<img alt=\"\" src=\"http://image.wufazhuce.com/FrRKTI6U644EyBjdlYHRbUf2CKvY?imageView2/2/w/394\" style=\"height:251px; width:394px\"><img alt=\"\" src=\"http://image.wufazhuce.com/FoqGCFcVYtw8MZOYk-upGbpV5hV5?imageView2/2/w/394\" style=\"height:251px; width:394px\"><br>\r\n<br>\r\n\u201c软糖\u201d是一个App工作室的新尝试，我们每期会选择一个题目，由七位作者自由发挥，各自画几格小画。不同的人对同一个题目的联想也各有不同，有些画中包含着作者的某种情绪，有些则没有什么能诉诸语言的深意，可能只是生活中不知为什么记住了的一个小片段。<br>\r\n<br>\r\n第七期的主题是\u201c雨\u201d，接下来还会有\u201c白日梦\u201d，\u201c世界末日\u201d\u2026\u2026不知道你对这些词的感觉是什么？","hp_makettime":"2017-03-27 08:00:00","hide_flag":"0","wb_name":"","wb_img_url":"","last_update_date":"2017-03-21 12:03:23","web_url":"http://m.wufazhuce.com/article/2111","guide_word":"我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。","audio":"","anchor":"","editor_email":"tianke@wufazhuce.com","top_media_type":"0","top_media_file":"","top_media_image":"","start_video":"","copyright":"","author":[{"user_id":"7817935","user_name":"郑南七白","desc":"茶凉粉乐队主唱，爱唱歌爱画画。","wb_name":"","is_settled":"0","settled_type":"0","summary":"茶凉粉乐队主唱，爱唱歌爱画画。","fans_total":"244","web_url":"http://image.wufazhuce.com/Foa4FsH62qfHLKNdCRV0bEqOIJhW"}],"maketime":"2017-03-27 08:00:00","author_list":[{"user_id":"7817935","user_name":"郑南七白","desc":"茶凉粉乐队主唱，爱唱歌爱画画。","wb_name":"","is_settled":"0","settled_type":"0","summary":"茶凉粉乐队主唱，爱唱歌爱画画。","fans_total":"244","web_url":"http://image.wufazhuce.com/Foa4FsH62qfHLKNdCRV0bEqOIJhW"}],"next_id":0,"previous_id":"2110","tag_list":[{"id":"1","title":"软糖漫画"}],"share_list":{"wx":{"title":"软糖漫画 | 软糖| \u201c雨\u201d _ 旅行","desc":"文/郑南七白 我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。","link":"http://m.wufazhuce.com/article/2111","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png"},"weibo":{"title":"ONE·一个《软糖漫画 | 软糖| \u201c雨\u201d _ 旅行》 文/郑南七白： 我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。 阅读全文：http://m.wufazhuce.com/article/2111 下载ONE·一个APP:http://weibo.com/p/100404157874","desc":"","link":"","imgUrl":""},"qq":{"title":"软糖| \u201c雨\u201d _ 旅行","desc":"我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。","link":"http://m.wufazhuce.com/article/2111","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png"}},"praisenum":177,"sharenum":91,"commentnum":75}
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
         * content_id : 2111
         * hp_title : 软糖| “雨” _ 旅行
         * sub_title :
         * hp_author : 郑南七白
         * auth_it : 茶凉粉乐队主唱，爱唱歌爱画画。
         * hp_author_introduce : 责任编辑：田克
         * hp_content :
         <img alt="" src="http://image.wufazhuce.com/FrI_C83ye11x9O-1V9ZpUu2ABRG0?imageView2/2/w/394" style="height:126px; width:394px"><br>
         <img alt="" src="http://image.wufazhuce.com/FsEzGO3Mh4MsMLN64ar-qEorcY3H?imageView2/2/w/394" style="height:251px; width:394px"><br>
         <img alt="" src="http://image.wufazhuce.com/FibhHDIb6kdB-qNKK2u4oEVgfBlN?imageView2/2/w/394" style="height:251px; width:394px"><br>
         <img alt="" src="http://image.wufazhuce.com/FjqlFSNwRKn3OxCCCFlvOTkb43om?imageView2/2/w/394" style="height:251px; width:394px"><br>
         <img alt="" src="http://image.wufazhuce.com/FvZOREYndkOovRVSiRpqOIcVvhKm?imageView2/2/w/394" style="height:251px; width:394px"><br>
         <img alt="" src="http://image.wufazhuce.com/FtA5UBmzxPDvrcanCj2703cphNaO?imageView2/2/w/394" style="height:251px; width:394px"><br>
         <img alt="" src="http://image.wufazhuce.com/FibqPDhv9fSPUvDysAv2pwTvRvZl?imageView2/2/w/394" style="height:251px; width:394px"><br>
         <img alt="" src="http://image.wufazhuce.com/FrRKTI6U644EyBjdlYHRbUf2CKvY?imageView2/2/w/394" style="height:251px; width:394px"><img alt="" src="http://image.wufazhuce.com/FoqGCFcVYtw8MZOYk-upGbpV5hV5?imageView2/2/w/394" style="height:251px; width:394px"><br>
         <br>
         “软糖”是一个App工作室的新尝试，我们每期会选择一个题目，由七位作者自由发挥，各自画几格小画。不同的人对同一个题目的联想也各有不同，有些画中包含着作者的某种情绪，有些则没有什么能诉诸语言的深意，可能只是生活中不知为什么记住了的一个小片段。<br>
         <br>
         第七期的主题是“雨”，接下来还会有“白日梦”，“世界末日”……不知道你对这些词的感觉是什么？
         * hp_makettime : 2017-03-27 08:00:00
         * hide_flag : 0
         * wb_name :
         * wb_img_url :
         * last_update_date : 2017-03-21 12:03:23
         * web_url : http://m.wufazhuce.com/article/2111
         * guide_word : 我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。
         * audio :
         * anchor :
         * editor_email : tianke@wufazhuce.com
         * top_media_type : 0
         * top_media_file :
         * top_media_image :
         * start_video :
         * copyright :
         * author : [{"user_id":"7817935","user_name":"郑南七白","desc":"茶凉粉乐队主唱，爱唱歌爱画画。","wb_name":"","is_settled":"0","settled_type":"0","summary":"茶凉粉乐队主唱，爱唱歌爱画画。","fans_total":"244","web_url":"http://image.wufazhuce.com/Foa4FsH62qfHLKNdCRV0bEqOIJhW"}]
         * maketime : 2017-03-27 08:00:00
         * author_list : [{"user_id":"7817935","user_name":"郑南七白","desc":"茶凉粉乐队主唱，爱唱歌爱画画。","wb_name":"","is_settled":"0","settled_type":"0","summary":"茶凉粉乐队主唱，爱唱歌爱画画。","fans_total":"244","web_url":"http://image.wufazhuce.com/Foa4FsH62qfHLKNdCRV0bEqOIJhW"}]
         * next_id : 0
         * previous_id : 2110
         * tag_list : [{"id":"1","title":"软糖漫画"}]
         * share_list : {"wx":{"title":"软糖漫画 | 软糖| \u201c雨\u201d _ 旅行","desc":"文/郑南七白 我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。","link":"http://m.wufazhuce.com/article/2111","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png"},"weibo":{"title":"ONE·一个《软糖漫画 | 软糖| \u201c雨\u201d _ 旅行》 文/郑南七白： 我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。 阅读全文：http://m.wufazhuce.com/article/2111 下载ONE·一个APP:http://weibo.com/p/100404157874","desc":"","link":"","imgUrl":""},"qq":{"title":"软糖| \u201c雨\u201d _ 旅行","desc":"我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。","link":"http://m.wufazhuce.com/article/2111","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png"}}
         * praisenum : 177
         * sharenum : 91
         * commentnum : 75
         */

        private String content_id;
        private String hp_title;
        private String sub_title;
        private String hp_author;
        private String auth_it;
        private String hp_author_introduce;
        private String hp_content;
        private String hp_makettime;
        private String hide_flag;
        private String wb_name;
        private String wb_img_url;
        private String last_update_date;
        private String web_url;
        private String guide_word;
        private String audio;
        private String anchor;
        private String editor_email;
        private String top_media_type;
        private String top_media_file;
        private String top_media_image;
        private String start_video;
        private String copyright;
        private String maketime;
        private int next_id;
        private String previous_id;
        private ShareListBean share_list;
        private int praisenum;
        private int sharenum;
        private int commentnum;
        private List<AuthorBean> author;
        private List<AuthorListBean> author_list;
        private List<TagListBean> tag_list;

        public String getContent_id() {
            return content_id;
        }

        public void setContent_id(String content_id) {
            this.content_id = content_id;
        }

        public String getHp_title() {
            return hp_title;
        }

        public void setHp_title(String hp_title) {
            this.hp_title = hp_title;
        }

        public String getSub_title() {
            return sub_title;
        }

        public void setSub_title(String sub_title) {
            this.sub_title = sub_title;
        }

        public String getHp_author() {
            return hp_author;
        }

        public void setHp_author(String hp_author) {
            this.hp_author = hp_author;
        }

        public String getAuth_it() {
            return auth_it;
        }

        public void setAuth_it(String auth_it) {
            this.auth_it = auth_it;
        }

        public String getHp_author_introduce() {
            return hp_author_introduce;
        }

        public void setHp_author_introduce(String hp_author_introduce) {
            this.hp_author_introduce = hp_author_introduce;
        }

        public String getHp_content() {
            return hp_content;
        }

        public void setHp_content(String hp_content) {
            this.hp_content = hp_content;
        }

        public String getHp_makettime() {
            return hp_makettime;
        }

        public void setHp_makettime(String hp_makettime) {
            this.hp_makettime = hp_makettime;
        }

        public String getHide_flag() {
            return hide_flag;
        }

        public void setHide_flag(String hide_flag) {
            this.hide_flag = hide_flag;
        }

        public String getWb_name() {
            return wb_name;
        }

        public void setWb_name(String wb_name) {
            this.wb_name = wb_name;
        }

        public String getWb_img_url() {
            return wb_img_url;
        }

        public void setWb_img_url(String wb_img_url) {
            this.wb_img_url = wb_img_url;
        }

        public String getLast_update_date() {
            return last_update_date;
        }

        public void setLast_update_date(String last_update_date) {
            this.last_update_date = last_update_date;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }

        public String getGuide_word() {
            return guide_word;
        }

        public void setGuide_word(String guide_word) {
            this.guide_word = guide_word;
        }

        public String getAudio() {
            return audio;
        }

        public void setAudio(String audio) {
            this.audio = audio;
        }

        public String getAnchor() {
            return anchor;
        }

        public void setAnchor(String anchor) {
            this.anchor = anchor;
        }

        public String getEditor_email() {
            return editor_email;
        }

        public void setEditor_email(String editor_email) {
            this.editor_email = editor_email;
        }

        public String getTop_media_type() {
            return top_media_type;
        }

        public void setTop_media_type(String top_media_type) {
            this.top_media_type = top_media_type;
        }

        public String getTop_media_file() {
            return top_media_file;
        }

        public void setTop_media_file(String top_media_file) {
            this.top_media_file = top_media_file;
        }

        public String getTop_media_image() {
            return top_media_image;
        }

        public void setTop_media_image(String top_media_image) {
            this.top_media_image = top_media_image;
        }

        public String getStart_video() {
            return start_video;
        }

        public void setStart_video(String start_video) {
            this.start_video = start_video;
        }

        public String getCopyright() {
            return copyright;
        }

        public void setCopyright(String copyright) {
            this.copyright = copyright;
        }

        public String getMaketime() {
            return maketime;
        }

        public void setMaketime(String maketime) {
            this.maketime = maketime;
        }

        public int getNext_id() {
            return next_id;
        }

        public void setNext_id(int next_id) {
            this.next_id = next_id;
        }

        public String getPrevious_id() {
            return previous_id;
        }

        public void setPrevious_id(String previous_id) {
            this.previous_id = previous_id;
        }

        public ShareListBean getShare_list() {
            return share_list;
        }

        public void setShare_list(ShareListBean share_list) {
            this.share_list = share_list;
        }

        public int getPraisenum() {
            return praisenum;
        }

        public void setPraisenum(int praisenum) {
            this.praisenum = praisenum;
        }

        public int getSharenum() {
            return sharenum;
        }

        public void setSharenum(int sharenum) {
            this.sharenum = sharenum;
        }

        public int getCommentnum() {
            return commentnum;
        }

        public void setCommentnum(int commentnum) {
            this.commentnum = commentnum;
        }

        public List<AuthorBean> getAuthor() {
            return author;
        }

        public void setAuthor(List<AuthorBean> author) {
            this.author = author;
        }

        public List<AuthorListBean> getAuthor_list() {
            return author_list;
        }

        public void setAuthor_list(List<AuthorListBean> author_list) {
            this.author_list = author_list;
        }

        public List<TagListBean> getTag_list() {
            return tag_list;
        }

        public void setTag_list(List<TagListBean> tag_list) {
            this.tag_list = tag_list;
        }

        public static class ShareListBean {
            /**
             * wx : {"title":"软糖漫画 | 软糖| \u201c雨\u201d _ 旅行","desc":"文/郑南七白 我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。","link":"http://m.wufazhuce.com/article/2111","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png"}
             * weibo : {"title":"ONE·一个《软糖漫画 | 软糖| \u201c雨\u201d _ 旅行》 文/郑南七白： 我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。 阅读全文：http://m.wufazhuce.com/article/2111 下载ONE·一个APP:http://weibo.com/p/100404157874","desc":"","link":"","imgUrl":""}
             * qq : {"title":"软糖| \u201c雨\u201d _ 旅行","desc":"我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。","link":"http://m.wufazhuce.com/article/2111","imgUrl":"http://image.wufazhuce.com/ONE_logo_120_square.png"}
             */

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
                 * title : 软糖漫画 | 软糖| “雨” _ 旅行
                 * desc : 文/郑南七白 我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。
                 * link : http://m.wufazhuce.com/article/2111
                 * imgUrl : http://image.wufazhuce.com/ONE_logo_120_square.png
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
            }

            public static class WeiboBean {
                /**
                 * title : ONE·一个《软糖漫画 | 软糖| “雨” _ 旅行》 文/郑南七白： 我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。 阅读全文：http://m.wufazhuce.com/article/2111 下载ONE·一个APP:http://weibo.com/p/100404157874
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
            }

            public static class QqBean {
                /**
                 * title : 软糖| “雨” _ 旅行
                 * desc : 我们每周会选择一个主题，由七个作者绘制不同风格的短篇漫画，每天一幅。
                 * link : http://m.wufazhuce.com/article/2111
                 * imgUrl : http://image.wufazhuce.com/ONE_logo_120_square.png
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
            }
        }

        public static class AuthorBean {
            /**
             * user_id : 7817935
             * user_name : 郑南七白
             * desc : 茶凉粉乐队主唱，爱唱歌爱画画。
             * wb_name :
             * is_settled : 0
             * settled_type : 0
             * summary : 茶凉粉乐队主唱，爱唱歌爱画画。
             * fans_total : 244
             * web_url : http://image.wufazhuce.com/Foa4FsH62qfHLKNdCRV0bEqOIJhW
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
        }

        public static class AuthorListBean {
            /**
             * user_id : 7817935
             * user_name : 郑南七白
             * desc : 茶凉粉乐队主唱，爱唱歌爱画画。
             * wb_name :
             * is_settled : 0
             * settled_type : 0
             * summary : 茶凉粉乐队主唱，爱唱歌爱画画。
             * fans_total : 244
             * web_url : http://image.wufazhuce.com/Foa4FsH62qfHLKNdCRV0bEqOIJhW
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
        }

        public static class TagListBean {
            /**
             * id : 1
             * title : 软糖漫画
             */

            private String id;
            private String title;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
