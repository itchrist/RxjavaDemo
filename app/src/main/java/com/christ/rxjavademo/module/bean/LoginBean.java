package com.christ.rxjavademo.module.bean;

/**
 * Created by admin on 2017/12/5.
 */

public class LoginBean {
    /**
     * cmd_id : -140
     * status : 200
     * msg : Success
     * data : {"shop_id":106,"user_id":17117,"user_name":"lucastest0032","shop_name":"TestShop0032","shop_grade_id":2,"shop_class_id":3,"shop_all_class":0,"shop_self_support":"false","shop_create_time":"2017-10-22 15:28:06","shop_end_time":"2017-12-31 23:59:59","shop_latitude":"","shop_longitude":"","shop_settlement_cycle":30,"shop_settlement_last_time":"2017-10-23 23:59:59","shop_points":0,"shop_logo":"","shop_banner":"","shop_status":3,"shop_close_reason":"","shop_reject_reason":"","shop_praise_rate":0,"shop_desccredit":0,"shop_servicecredit":0,"shop_deliverycredit":0,"shop_collect":0,"shop_template":"default","shop_workingtime":"","shop_slide":"","shop_slideurl":"","shop_domain":"","shop_region":"Costa Rica","shop_address":"","shop_qq":"","shop_ww":"","shop_tel_domain":"","shop_tel":"","shop_free_shipping":0,"shop_free_gam":0,"shop_account":"","shop_payment":1,"joinin_year":1,"is_renovation":0,"is_only_renovation":0,"is_index_left":0,"shop_print_desc":null,"shop_stamp":null,"shop_parent_id":0,"shop_type":1,"district_id":90,"shop_verify_reason":"","shop_business":2,"id":106,"user_avater":"https://uc.shop2h.com//image.php/ucenter/data/upload/media/plantform/image/20170726/1501060345865383.png!120x120.png","ks":"AX4LdAEyAyBeVlxpXzlbMgFlUGxTMwVnUmM="}
     */

    private int cmd_id;
    private int status;
    private String msg;
    private DataBean data;

    public int getCmd_id() {
        return cmd_id;
    }

    public void setCmd_id(int cmd_id) {
        this.cmd_id = cmd_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * shop_id : 106
         * user_id : 17117
         * user_name : lucastest0032
         * shop_name : TestShop0032
         * shop_grade_id : 2
         * shop_class_id : 3
         * shop_all_class : 0
         * shop_self_support : false
         * shop_create_time : 2017-10-22 15:28:06
         * shop_end_time : 2017-12-31 23:59:59
         * shop_latitude :
         * shop_longitude :
         * shop_settlement_cycle : 30
         * shop_settlement_last_time : 2017-10-23 23:59:59
         * shop_points : 0
         * shop_logo :
         * shop_banner :
         * shop_status : 3
         * shop_close_reason :
         * shop_reject_reason :
         * shop_praise_rate : 0
         * shop_desccredit : 0
         * shop_servicecredit : 0
         * shop_deliverycredit : 0
         * shop_collect : 0
         * shop_template : default
         * shop_workingtime :
         * shop_slide :
         * shop_slideurl :
         * shop_domain :
         * shop_region : Costa Rica
         * shop_address :
         * shop_qq :
         * shop_ww :
         * shop_tel_domain :
         * shop_tel :
         * shop_free_shipping : 0
         * shop_free_gam : 0
         * shop_account :
         * shop_payment : 1
         * joinin_year : 1
         * is_renovation : 0
         * is_only_renovation : 0
         * is_index_left : 0
         * shop_print_desc : null
         * shop_stamp : null
         * shop_parent_id : 0
         * shop_type : 1
         * district_id : 90
         * shop_verify_reason :
         * shop_business : 2
         * id : 106
         * user_avater : https://uc.shop2h.com//image.php/ucenter/data/upload/media/plantform/image/20170726/1501060345865383.png!120x120.png
         * ks : AX4LdAEyAyBeVlxpXzlbMgFlUGxTMwVnUmM=
         */

        private int shop_id;
        private int user_id;
        private String user_name;
        private String shop_name;
        private int shop_grade_id;
        private int shop_class_id;
        private int shop_all_class;
        private String shop_self_support;
        private String shop_create_time;
        private String shop_end_time;
        private String shop_latitude;
        private String shop_longitude;
        private int shop_settlement_cycle;
        private String shop_settlement_last_time;
        private int shop_points;
        private String shop_logo;
        private String shop_banner;
        private int shop_status;
        private String shop_close_reason;
        private String shop_reject_reason;
        private int shop_praise_rate;
        private int shop_desccredit;
        private int shop_servicecredit;
        private int shop_deliverycredit;
        private int shop_collect;
        private String shop_template;
        private String shop_workingtime;
        private String shop_slide;
        private String shop_slideurl;
        private String shop_domain;
        private String shop_region;
        private String shop_address;
        private String shop_qq;
        private String shop_ww;
        private String shop_tel_domain;
        private String shop_tel;
        private int shop_free_shipping;
        private int shop_free_gam;
        private String shop_account;
        private int shop_payment;
        private int joinin_year;
        private int is_renovation;
        private int is_only_renovation;
        private int is_index_left;
        private Object shop_print_desc;
        private Object shop_stamp;
        private int shop_parent_id;
        private int shop_type;
        private int district_id;
        private String shop_verify_reason;
        private int shop_business;
        private int id;
        private String user_avater;
        private String ks;

        public int getShop_id() {
            return shop_id;
        }

        public void setShop_id(int shop_id) {
            this.shop_id = shop_id;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getShop_name() {
            return shop_name;
        }

        public void setShop_name(String shop_name) {
            this.shop_name = shop_name;
        }

        public int getShop_grade_id() {
            return shop_grade_id;
        }

        public void setShop_grade_id(int shop_grade_id) {
            this.shop_grade_id = shop_grade_id;
        }

        public int getShop_class_id() {
            return shop_class_id;
        }

        public void setShop_class_id(int shop_class_id) {
            this.shop_class_id = shop_class_id;
        }

        public int getShop_all_class() {
            return shop_all_class;
        }

        public void setShop_all_class(int shop_all_class) {
            this.shop_all_class = shop_all_class;
        }

        public String getShop_self_support() {
            return shop_self_support;
        }

        public void setShop_self_support(String shop_self_support) {
            this.shop_self_support = shop_self_support;
        }

        public String getShop_create_time() {
            return shop_create_time;
        }

        public void setShop_create_time(String shop_create_time) {
            this.shop_create_time = shop_create_time;
        }

        public String getShop_end_time() {
            return shop_end_time;
        }

        public void setShop_end_time(String shop_end_time) {
            this.shop_end_time = shop_end_time;
        }

        public String getShop_latitude() {
            return shop_latitude;
        }

        public void setShop_latitude(String shop_latitude) {
            this.shop_latitude = shop_latitude;
        }

        public String getShop_longitude() {
            return shop_longitude;
        }

        public void setShop_longitude(String shop_longitude) {
            this.shop_longitude = shop_longitude;
        }

        public int getShop_settlement_cycle() {
            return shop_settlement_cycle;
        }

        public void setShop_settlement_cycle(int shop_settlement_cycle) {
            this.shop_settlement_cycle = shop_settlement_cycle;
        }

        public String getShop_settlement_last_time() {
            return shop_settlement_last_time;
        }

        public void setShop_settlement_last_time(String shop_settlement_last_time) {
            this.shop_settlement_last_time = shop_settlement_last_time;
        }

        public int getShop_points() {
            return shop_points;
        }

        public void setShop_points(int shop_points) {
            this.shop_points = shop_points;
        }

        public String getShop_logo() {
            return shop_logo;
        }

        public void setShop_logo(String shop_logo) {
            this.shop_logo = shop_logo;
        }

        public String getShop_banner() {
            return shop_banner;
        }

        public void setShop_banner(String shop_banner) {
            this.shop_banner = shop_banner;
        }

        public int getShop_status() {
            return shop_status;
        }

        public void setShop_status(int shop_status) {
            this.shop_status = shop_status;
        }

        public String getShop_close_reason() {
            return shop_close_reason;
        }

        public void setShop_close_reason(String shop_close_reason) {
            this.shop_close_reason = shop_close_reason;
        }

        public String getShop_reject_reason() {
            return shop_reject_reason;
        }

        public void setShop_reject_reason(String shop_reject_reason) {
            this.shop_reject_reason = shop_reject_reason;
        }

        public int getShop_praise_rate() {
            return shop_praise_rate;
        }

        public void setShop_praise_rate(int shop_praise_rate) {
            this.shop_praise_rate = shop_praise_rate;
        }

        public int getShop_desccredit() {
            return shop_desccredit;
        }

        public void setShop_desccredit(int shop_desccredit) {
            this.shop_desccredit = shop_desccredit;
        }

        public int getShop_servicecredit() {
            return shop_servicecredit;
        }

        public void setShop_servicecredit(int shop_servicecredit) {
            this.shop_servicecredit = shop_servicecredit;
        }

        public int getShop_deliverycredit() {
            return shop_deliverycredit;
        }

        public void setShop_deliverycredit(int shop_deliverycredit) {
            this.shop_deliverycredit = shop_deliverycredit;
        }

        public int getShop_collect() {
            return shop_collect;
        }

        public void setShop_collect(int shop_collect) {
            this.shop_collect = shop_collect;
        }

        public String getShop_template() {
            return shop_template;
        }

        public void setShop_template(String shop_template) {
            this.shop_template = shop_template;
        }

        public String getShop_workingtime() {
            return shop_workingtime;
        }

        public void setShop_workingtime(String shop_workingtime) {
            this.shop_workingtime = shop_workingtime;
        }

        public String getShop_slide() {
            return shop_slide;
        }

        public void setShop_slide(String shop_slide) {
            this.shop_slide = shop_slide;
        }

        public String getShop_slideurl() {
            return shop_slideurl;
        }

        public void setShop_slideurl(String shop_slideurl) {
            this.shop_slideurl = shop_slideurl;
        }

        public String getShop_domain() {
            return shop_domain;
        }

        public void setShop_domain(String shop_domain) {
            this.shop_domain = shop_domain;
        }

        public String getShop_region() {
            return shop_region;
        }

        public void setShop_region(String shop_region) {
            this.shop_region = shop_region;
        }

        public String getShop_address() {
            return shop_address;
        }

        public void setShop_address(String shop_address) {
            this.shop_address = shop_address;
        }

        public String getShop_qq() {
            return shop_qq;
        }

        public void setShop_qq(String shop_qq) {
            this.shop_qq = shop_qq;
        }

        public String getShop_ww() {
            return shop_ww;
        }

        public void setShop_ww(String shop_ww) {
            this.shop_ww = shop_ww;
        }

        public String getShop_tel_domain() {
            return shop_tel_domain;
        }

        public void setShop_tel_domain(String shop_tel_domain) {
            this.shop_tel_domain = shop_tel_domain;
        }

        public String getShop_tel() {
            return shop_tel;
        }

        public void setShop_tel(String shop_tel) {
            this.shop_tel = shop_tel;
        }

        public int getShop_free_shipping() {
            return shop_free_shipping;
        }

        public void setShop_free_shipping(int shop_free_shipping) {
            this.shop_free_shipping = shop_free_shipping;
        }

        public int getShop_free_gam() {
            return shop_free_gam;
        }

        public void setShop_free_gam(int shop_free_gam) {
            this.shop_free_gam = shop_free_gam;
        }

        public String getShop_account() {
            return shop_account;
        }

        public void setShop_account(String shop_account) {
            this.shop_account = shop_account;
        }

        public int getShop_payment() {
            return shop_payment;
        }

        public void setShop_payment(int shop_payment) {
            this.shop_payment = shop_payment;
        }

        public int getJoinin_year() {
            return joinin_year;
        }

        public void setJoinin_year(int joinin_year) {
            this.joinin_year = joinin_year;
        }

        public int getIs_renovation() {
            return is_renovation;
        }

        public void setIs_renovation(int is_renovation) {
            this.is_renovation = is_renovation;
        }

        public int getIs_only_renovation() {
            return is_only_renovation;
        }

        public void setIs_only_renovation(int is_only_renovation) {
            this.is_only_renovation = is_only_renovation;
        }

        public int getIs_index_left() {
            return is_index_left;
        }

        public void setIs_index_left(int is_index_left) {
            this.is_index_left = is_index_left;
        }

        public Object getShop_print_desc() {
            return shop_print_desc;
        }

        public void setShop_print_desc(Object shop_print_desc) {
            this.shop_print_desc = shop_print_desc;
        }

        public Object getShop_stamp() {
            return shop_stamp;
        }

        public void setShop_stamp(Object shop_stamp) {
            this.shop_stamp = shop_stamp;
        }

        public int getShop_parent_id() {
            return shop_parent_id;
        }

        public void setShop_parent_id(int shop_parent_id) {
            this.shop_parent_id = shop_parent_id;
        }

        public int getShop_type() {
            return shop_type;
        }

        public void setShop_type(int shop_type) {
            this.shop_type = shop_type;
        }

        public int getDistrict_id() {
            return district_id;
        }

        public void setDistrict_id(int district_id) {
            this.district_id = district_id;
        }

        public String getShop_verify_reason() {
            return shop_verify_reason;
        }

        public void setShop_verify_reason(String shop_verify_reason) {
            this.shop_verify_reason = shop_verify_reason;
        }

        public int getShop_business() {
            return shop_business;
        }

        public void setShop_business(int shop_business) {
            this.shop_business = shop_business;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUser_avater() {
            return user_avater;
        }

        public void setUser_avater(String user_avater) {
            this.user_avater = user_avater;
        }

        public String getKs() {
            return ks;
        }

        public void setKs(String ks) {
            this.ks = ks;
        }
    }
}
