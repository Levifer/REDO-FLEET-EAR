package com.realdolmen.util;

/**
 * Created by BPTAT47 on 30/10/2014.
 */
public class RedirectEnum {

    public enum REDIRECT{
        INDEX("index");


        private final String url;

        REDIRECT(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }
    }
}
