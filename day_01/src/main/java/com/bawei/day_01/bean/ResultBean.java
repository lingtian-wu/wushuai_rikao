package com.bawei.day_01.bean;

import java.util.List;

public class ResultBean {

    public RxxpBean rxxp;
    public PzshBean pzsh;
    public MlssBean mlss;

        public static class RxxpBean {

            public int id;
            public String name;
            public List<CommodityListBean> commodityList;

        }

        public static class PzshBean {
            public int id;
            public String name;
            public List<CommodityListBean> commodityList;
        }

        public static class MlssBean {
            public int id;
            public String name;
            public List<CommodityListBean> commodityList;
        }
    }