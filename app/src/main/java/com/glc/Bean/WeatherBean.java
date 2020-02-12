package com.glc.Bean;

import java.util.List;

public class WeatherBean {
    /**
     * code : 10000
     * charge : false
     * msg : 查询成功
     * result : {"HeWeather5":[{"aqi":{"city":{"aqi":"62","qlty":"良","pm25":"44","pm10":"60","no2":"12","so2":"13","co":"0.8","o3":"114"}},"basic":{"city":"新泰","cnty":"中国","id":"CN101120802","lat":"35.91038513","lon":"117.76609039","update":{"loc":"2020-02-10 18:24","utc":"2020-02-10 10:24"}},"daily_forecast":[{"astro":{"mr":"18:52","ms":"07:50","sr":"07:00","ss":"17:45"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2020-02-10","hum":"73","pcpn":"0.0","pop":"0","pres":"988","tmp":{"max":"16","min":"1"},"uv":"3","vis":"25","wind":{"deg":"216","dir":"西南风","sc":"3-4","spd":"24"}},{"astro":{"mr":"20:05","ms":"08:29","sr":"06:59","ss":"17:46"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2020-02-11","hum":"91","pcpn":"0.0","pop":"6","pres":"985","tmp":{"max":"15","min":"2"},"uv":"6","vis":"25","wind":{"deg":"181","dir":"南风","sc":"3-4","spd":"16"}},{"astro":{"mr":"21:16","ms":"09:06","sr":"06:58","ss":"17:47"},"cond":{"code_d":"100","code_n":"101","txt_d":"晴","txt_n":"多云"},"date":"2020-02-12","hum":"86","pcpn":"1.0","pop":"55","pres":"983","tmp":{"max":"16","min":"4"},"uv":"7","vis":"25","wind":{"deg":"170","dir":"南风","sc":"3-4","spd":"21"}},{"astro":{"mr":"22:26","ms":"09:40","sr":"06:57","ss":"17:48"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2020-02-13","hum":"91","pcpn":"0.0","pop":"0","pres":"983","tmp":{"max":"18","min":"4"},"uv":"4","vis":"25","wind":{"deg":"177","dir":"南风","sc":"3-4","spd":"17"}},{"astro":{"mr":"23:35","ms":"10:14","sr":"06:56","ss":"17:49"},"cond":{"code_d":"104","code_n":"404","txt_d":"阴","txt_n":"雨夹雪"},"date":"2020-02-14","hum":"88","pcpn":"0.0","pop":"25","pres":"990","tmp":{"max":"13","min":"-4"},"uv":"3","vis":"12","wind":{"deg":"44","dir":"东北风","sc":"4-5","spd":"29"}},{"astro":{"mr":"00:00","ms":"10:49","sr":"06:55","ss":"17:50"},"cond":{"code_d":"404","code_n":"101","txt_d":"雨夹雪","txt_n":"多云"},"date":"2020-02-15","hum":"88","pcpn":"2.5","pop":"40","pres":"997","tmp":{"max":"0","min":"-10"},"uv":"1","vis":"22","wind":{"deg":"0","dir":"北风","sc":"4-5","spd":"30"}},{"astro":{"mr":"00:42","ms":"11:27","sr":"06:54","ss":"17:51"},"cond":{"code_d":"101","code_n":"100","txt_d":"多云","txt_n":"晴"},"date":"2020-02-16","hum":"65","pcpn":"0.0","pop":"0","pres":"997","tmp":{"max":"0","min":"-10"},"uv":"4","vis":"25","wind":{"deg":"354","dir":"北风","sc":"3-4","spd":"23"}}],"hourly_forecast":[{"cond":{"code":"100","txt":"晴"},"date":"2020-02-10 19:00","hum":"70","pop":"0","pres":"989","tmp":"9","wind":{"deg":"188","dir":"南风","sc":"1-2","spd":"1"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-10 22:00","hum":"63","pop":"0","pres":"989","tmp":"6","wind":{"deg":"189","dir":"南风","sc":"3-4","spd":"18"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-11 01:00","hum":"67","pop":"0","pres":"990","tmp":"4","wind":{"deg":"190","dir":"南风","sc":"3-4","spd":"14"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-11 04:00","hum":"71","pop":"0","pres":"989","tmp":"2","wind":{"deg":"182","dir":"南风","sc":"1-2","spd":"4"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-11 07:00","hum":"74","pop":"0","pres":"987","tmp":"2","wind":{"deg":"173","dir":"南风","sc":"3-4","spd":"23"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-11 10:00","hum":"60","pop":"0","pres":"985","tmp":"7","wind":{"deg":"173","dir":"南风","sc":"3-4","spd":"17"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-11 13:00","hum":"48","pop":"1","pres":"985","tmp":"12","wind":{"deg":"173","dir":"南风","sc":"3-4","spd":"18"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-11 16:00","hum":"50","pop":"1","pres":"984","tmp":"12","wind":{"deg":"174","dir":"南风","sc":"3-4","spd":"20"}}],"now":{"cond":{"code":"100","txt":"晴"},"fl":"9","hum":"35","pcpn":"0.0","pres":"995","tmp":"12","vis":"13","wind":{"deg":"179","dir":"南风","sc":"2","spd":"9"}},"status":"ok","suggestion":{"air":{"brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"},"comf":{"brf":"较不舒适","txt":"白天天气晴好，但仍会使您感觉偏冷，不很舒适，请注意适时添加衣物，以防感冒。"},"cw":{"brf":"适宜","txt":"适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。"},"drsg":{"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},"flu":{"brf":"易发","txt":"昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"},"sport":{"brf":"较适宜","txt":"天气较好，但考虑风力较强且气温较低，推荐您进行室内运动，若在户外运动请注意防风并适当增减衣物。"},"trav":{"brf":"适宜","txt":"天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。"},"uv":{"brf":"弱","txt":"紫外线强度较弱，建议涂擦SPF在12-15之间、PA+的防晒护肤品。"}}}]}
     */

    private String code;
    private boolean charge;
    private String msg;
    private ResultBean result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isCharge() {
        return charge;
    }

    public void setCharge(boolean charge) {
        this.charge = charge;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<HeWeather5Bean> HeWeather5;

        public List<HeWeather5Bean> getHeWeather5() {
            return HeWeather5;
        }

        public void setHeWeather5(List<HeWeather5Bean> HeWeather5) {
            this.HeWeather5 = HeWeather5;
        }

        public static class HeWeather5Bean {
            /**
             * aqi : {"city":{"aqi":"62","qlty":"良","pm25":"44","pm10":"60","no2":"12","so2":"13","co":"0.8","o3":"114"}}
             * basic : {"city":"新泰","cnty":"中国","id":"CN101120802","lat":"35.91038513","lon":"117.76609039","update":{"loc":"2020-02-10 18:24","utc":"2020-02-10 10:24"}}
             * daily_forecast : [{"astro":{"mr":"18:52","ms":"07:50","sr":"07:00","ss":"17:45"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2020-02-10","hum":"73","pcpn":"0.0","pop":"0","pres":"988","tmp":{"max":"16","min":"1"},"uv":"3","vis":"25","wind":{"deg":"216","dir":"西南风","sc":"3-4","spd":"24"}},{"astro":{"mr":"20:05","ms":"08:29","sr":"06:59","ss":"17:46"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2020-02-11","hum":"91","pcpn":"0.0","pop":"6","pres":"985","tmp":{"max":"15","min":"2"},"uv":"6","vis":"25","wind":{"deg":"181","dir":"南风","sc":"3-4","spd":"16"}},{"astro":{"mr":"21:16","ms":"09:06","sr":"06:58","ss":"17:47"},"cond":{"code_d":"100","code_n":"101","txt_d":"晴","txt_n":"多云"},"date":"2020-02-12","hum":"86","pcpn":"1.0","pop":"55","pres":"983","tmp":{"max":"16","min":"4"},"uv":"7","vis":"25","wind":{"deg":"170","dir":"南风","sc":"3-4","spd":"21"}},{"astro":{"mr":"22:26","ms":"09:40","sr":"06:57","ss":"17:48"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2020-02-13","hum":"91","pcpn":"0.0","pop":"0","pres":"983","tmp":{"max":"18","min":"4"},"uv":"4","vis":"25","wind":{"deg":"177","dir":"南风","sc":"3-4","spd":"17"}},{"astro":{"mr":"23:35","ms":"10:14","sr":"06:56","ss":"17:49"},"cond":{"code_d":"104","code_n":"404","txt_d":"阴","txt_n":"雨夹雪"},"date":"2020-02-14","hum":"88","pcpn":"0.0","pop":"25","pres":"990","tmp":{"max":"13","min":"-4"},"uv":"3","vis":"12","wind":{"deg":"44","dir":"东北风","sc":"4-5","spd":"29"}},{"astro":{"mr":"00:00","ms":"10:49","sr":"06:55","ss":"17:50"},"cond":{"code_d":"404","code_n":"101","txt_d":"雨夹雪","txt_n":"多云"},"date":"2020-02-15","hum":"88","pcpn":"2.5","pop":"40","pres":"997","tmp":{"max":"0","min":"-10"},"uv":"1","vis":"22","wind":{"deg":"0","dir":"北风","sc":"4-5","spd":"30"}},{"astro":{"mr":"00:42","ms":"11:27","sr":"06:54","ss":"17:51"},"cond":{"code_d":"101","code_n":"100","txt_d":"多云","txt_n":"晴"},"date":"2020-02-16","hum":"65","pcpn":"0.0","pop":"0","pres":"997","tmp":{"max":"0","min":"-10"},"uv":"4","vis":"25","wind":{"deg":"354","dir":"北风","sc":"3-4","spd":"23"}}]
             * hourly_forecast : [{"cond":{"code":"100","txt":"晴"},"date":"2020-02-10 19:00","hum":"70","pop":"0","pres":"989","tmp":"9","wind":{"deg":"188","dir":"南风","sc":"1-2","spd":"1"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-10 22:00","hum":"63","pop":"0","pres":"989","tmp":"6","wind":{"deg":"189","dir":"南风","sc":"3-4","spd":"18"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-11 01:00","hum":"67","pop":"0","pres":"990","tmp":"4","wind":{"deg":"190","dir":"南风","sc":"3-4","spd":"14"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-11 04:00","hum":"71","pop":"0","pres":"989","tmp":"2","wind":{"deg":"182","dir":"南风","sc":"1-2","spd":"4"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-11 07:00","hum":"74","pop":"0","pres":"987","tmp":"2","wind":{"deg":"173","dir":"南风","sc":"3-4","spd":"23"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-11 10:00","hum":"60","pop":"0","pres":"985","tmp":"7","wind":{"deg":"173","dir":"南风","sc":"3-4","spd":"17"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-11 13:00","hum":"48","pop":"1","pres":"985","tmp":"12","wind":{"deg":"173","dir":"南风","sc":"3-4","spd":"18"}},{"cond":{"code":"101","txt":"多云"},"date":"2020-02-11 16:00","hum":"50","pop":"1","pres":"984","tmp":"12","wind":{"deg":"174","dir":"南风","sc":"3-4","spd":"20"}}]
             * now : {"cond":{"code":"100","txt":"晴"},"fl":"9","hum":"35","pcpn":"0.0","pres":"995","tmp":"12","vis":"13","wind":{"deg":"179","dir":"南风","sc":"2","spd":"9"}}
             * status : ok
             * suggestion : {"air":{"brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"},"comf":{"brf":"较不舒适","txt":"白天天气晴好，但仍会使您感觉偏冷，不很舒适，请注意适时添加衣物，以防感冒。"},"cw":{"brf":"适宜","txt":"适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。"},"drsg":{"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},"flu":{"brf":"易发","txt":"昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"},"sport":{"brf":"较适宜","txt":"天气较好，但考虑风力较强且气温较低，推荐您进行室内运动，若在户外运动请注意防风并适当增减衣物。"},"trav":{"brf":"适宜","txt":"天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。"},"uv":{"brf":"弱","txt":"紫外线强度较弱，建议涂擦SPF在12-15之间、PA+的防晒护肤品。"}}
             */

            private AqiBean aqi;
            private BasicBean basic;
            private NowBean now;
            private String status;
            private SuggestionBean suggestion;
            private List<DailyForecastBean> daily_forecast;
            private List<HourlyForecastBean> hourly_forecast;

            public AqiBean getAqi() {
                return aqi;
            }

            public void setAqi(AqiBean aqi) {
                this.aqi = aqi;
            }

            public BasicBean getBasic() {
                return basic;
            }

            public void setBasic(BasicBean basic) {
                this.basic = basic;
            }

            public NowBean getNow() {
                return now;
            }

            public void setNow(NowBean now) {
                this.now = now;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public SuggestionBean getSuggestion() {
                return suggestion;
            }

            public void setSuggestion(SuggestionBean suggestion) {
                this.suggestion = suggestion;
            }

            public List<DailyForecastBean> getDaily_forecast() {
                return daily_forecast;
            }

            public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
                this.daily_forecast = daily_forecast;
            }

            public List<HourlyForecastBean> getHourly_forecast() {
                return hourly_forecast;
            }

            public void setHourly_forecast(List<HourlyForecastBean> hourly_forecast) {
                this.hourly_forecast = hourly_forecast;
            }

            public static class AqiBean {
                /**
                 * city : {"aqi":"62","qlty":"良","pm25":"44","pm10":"60","no2":"12","so2":"13","co":"0.8","o3":"114"}
                 */

                private CityBean city;

                public CityBean getCity() {
                    return city;
                }

                public void setCity(CityBean city) {
                    this.city = city;
                }

                public static class CityBean {
                    /**
                     * aqi : 62
                     * qlty : 良
                     * pm25 : 44
                     * pm10 : 60
                     * no2 : 12
                     * so2 : 13
                     * co : 0.8
                     * o3 : 114
                     */

                    private String aqi;
                    private String qlty;
                    private String pm25;
                    private String pm10;
                    private String no2;
                    private String so2;
                    private String co;
                    private String o3;

                    public String getAqi() {
                        return aqi;
                    }

                    public void setAqi(String aqi) {
                        this.aqi = aqi;
                    }

                    public String getQlty() {
                        return qlty;
                    }

                    public void setQlty(String qlty) {
                        this.qlty = qlty;
                    }

                    public String getPm25() {
                        return pm25;
                    }

                    public void setPm25(String pm25) {
                        this.pm25 = pm25;
                    }

                    public String getPm10() {
                        return pm10;
                    }

                    public void setPm10(String pm10) {
                        this.pm10 = pm10;
                    }

                    public String getNo2() {
                        return no2;
                    }

                    public void setNo2(String no2) {
                        this.no2 = no2;
                    }

                    public String getSo2() {
                        return so2;
                    }

                    public void setSo2(String so2) {
                        this.so2 = so2;
                    }

                    public String getCo() {
                        return co;
                    }

                    public void setCo(String co) {
                        this.co = co;
                    }

                    public String getO3() {
                        return o3;
                    }

                    public void setO3(String o3) {
                        this.o3 = o3;
                    }
                }
            }

            public static class BasicBean {
                /**
                 * city : 新泰
                 * cnty : 中国
                 * id : CN101120802
                 * lat : 35.91038513
                 * lon : 117.76609039
                 * update : {"loc":"2020-02-10 18:24","utc":"2020-02-10 10:24"}
                 */

                private String city;
                private String cnty;
                private String id;
                private String lat;
                private String lon;
                private UpdateBean update;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCnty() {
                    return cnty;
                }

                public void setCnty(String cnty) {
                    this.cnty = cnty;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLon() {
                    return lon;
                }

                public void setLon(String lon) {
                    this.lon = lon;
                }

                public UpdateBean getUpdate() {
                    return update;
                }

                public void setUpdate(UpdateBean update) {
                    this.update = update;
                }

                public static class UpdateBean {
                    /**
                     * loc : 2020-02-10 18:24
                     * utc : 2020-02-10 10:24
                     */

                    private String loc;
                    private String utc;

                    public String getLoc() {
                        return loc;
                    }

                    public void setLoc(String loc) {
                        this.loc = loc;
                    }

                    public String getUtc() {
                        return utc;
                    }

                    public void setUtc(String utc) {
                        this.utc = utc;
                    }
                }
            }

            public static class NowBean {
                /**
                 * cond : {"code":"100","txt":"晴"}
                 * fl : 9
                 * hum : 35
                 * pcpn : 0.0
                 * pres : 995
                 * tmp : 12
                 * vis : 13
                 * wind : {"deg":"179","dir":"南风","sc":"2","spd":"9"}
                 */

                private CondBean cond;
                private String fl;
                private String hum;
                private String pcpn;
                private String pres;
                private String tmp;
                private String vis;
                private WindBean wind;

                public CondBean getCond() {
                    return cond;
                }

                public void setCond(CondBean cond) {
                    this.cond = cond;
                }

                public String getFl() {
                    return fl;
                }

                public void setFl(String fl) {
                    this.fl = fl;
                }

                public String getHum() {
                    return hum;
                }

                public void setHum(String hum) {
                    this.hum = hum;
                }

                public String getPcpn() {
                    return pcpn;
                }

                public void setPcpn(String pcpn) {
                    this.pcpn = pcpn;
                }

                public String getPres() {
                    return pres;
                }

                public void setPres(String pres) {
                    this.pres = pres;
                }

                public String getTmp() {
                    return tmp;
                }

                public void setTmp(String tmp) {
                    this.tmp = tmp;
                }

                public String getVis() {
                    return vis;
                }

                public void setVis(String vis) {
                    this.vis = vis;
                }

                public WindBean getWind() {
                    return wind;
                }

                public void setWind(WindBean wind) {
                    this.wind = wind;
                }

                public static class CondBean {
                    /**
                     * code : 100
                     * txt : 晴
                     */

                    private String code;
                    private String txt;

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }
                }

                public static class WindBean {
                    /**
                     * deg : 179
                     * dir : 南风
                     * sc : 2
                     * spd : 9
                     */

                    private String deg;
                    private String dir;
                    private String sc;
                    private String spd;

                    public String getDeg() {
                        return deg;
                    }

                    public void setDeg(String deg) {
                        this.deg = deg;
                    }

                    public String getDir() {
                        return dir;
                    }

                    public void setDir(String dir) {
                        this.dir = dir;
                    }

                    public String getSc() {
                        return sc;
                    }

                    public void setSc(String sc) {
                        this.sc = sc;
                    }

                    public String getSpd() {
                        return spd;
                    }

                    public void setSpd(String spd) {
                        this.spd = spd;
                    }
                }
            }

            public static class SuggestionBean {
                /**
                 * air : {"brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"}
                 * comf : {"brf":"较不舒适","txt":"白天天气晴好，但仍会使您感觉偏冷，不很舒适，请注意适时添加衣物，以防感冒。"}
                 * cw : {"brf":"适宜","txt":"适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。"}
                 * drsg : {"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"}
                 * flu : {"brf":"易发","txt":"昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"}
                 * sport : {"brf":"较适宜","txt":"天气较好，但考虑风力较强且气温较低，推荐您进行室内运动，若在户外运动请注意防风并适当增减衣物。"}
                 * trav : {"brf":"适宜","txt":"天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。"}
                 * uv : {"brf":"弱","txt":"紫外线强度较弱，建议涂擦SPF在12-15之间、PA+的防晒护肤品。"}
                 */

                private AirBean air;
                private ComfBean comf;
                private CwBean cw;
                private DrsgBean drsg;
                private FluBean flu;
                private SportBean sport;
                private TravBean trav;
                private UvBean uv;

                public AirBean getAir() {
                    return air;
                }

                public void setAir(AirBean air) {
                    this.air = air;
                }

                public ComfBean getComf() {
                    return comf;
                }

                public void setComf(ComfBean comf) {
                    this.comf = comf;
                }

                public CwBean getCw() {
                    return cw;
                }

                public void setCw(CwBean cw) {
                    this.cw = cw;
                }

                public DrsgBean getDrsg() {
                    return drsg;
                }

                public void setDrsg(DrsgBean drsg) {
                    this.drsg = drsg;
                }

                public FluBean getFlu() {
                    return flu;
                }

                public void setFlu(FluBean flu) {
                    this.flu = flu;
                }

                public SportBean getSport() {
                    return sport;
                }

                public void setSport(SportBean sport) {
                    this.sport = sport;
                }

                public TravBean getTrav() {
                    return trav;
                }

                public void setTrav(TravBean trav) {
                    this.trav = trav;
                }

                public UvBean getUv() {
                    return uv;
                }

                public void setUv(UvBean uv) {
                    this.uv = uv;
                }

                public static class AirBean {
                    /**
                     * brf : 良
                     * txt : 气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。
                     */

                    private String brf;
                    private String txt;

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }
                }

                public static class ComfBean {
                    /**
                     * brf : 较不舒适
                     * txt : 白天天气晴好，但仍会使您感觉偏冷，不很舒适，请注意适时添加衣物，以防感冒。
                     */

                    private String brf;
                    private String txt;

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }
                }

                public static class CwBean {
                    /**
                     * brf : 适宜
                     * txt : 适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。
                     */

                    private String brf;
                    private String txt;

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }
                }

                public static class DrsgBean {
                    /**
                     * brf : 较冷
                     * txt : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
                     */

                    private String brf;
                    private String txt;

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }
                }

                public static class FluBean {
                    /**
                     * brf : 易发
                     * txt : 昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。
                     */

                    private String brf;
                    private String txt;

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }
                }

                public static class SportBean {
                    /**
                     * brf : 较适宜
                     * txt : 天气较好，但考虑风力较强且气温较低，推荐您进行室内运动，若在户外运动请注意防风并适当增减衣物。
                     */

                    private String brf;
                    private String txt;

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }
                }

                public static class TravBean {
                    /**
                     * brf : 适宜
                     * txt : 天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。
                     */

                    private String brf;
                    private String txt;

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }
                }

                public static class UvBean {
                    /**
                     * brf : 弱
                     * txt : 紫外线强度较弱，建议涂擦SPF在12-15之间、PA+的防晒护肤品。
                     */

                    private String brf;
                    private String txt;

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }
                }
            }

            public static class DailyForecastBean {
                /**
                 * astro : {"mr":"18:52","ms":"07:50","sr":"07:00","ss":"17:45"}
                 * cond : {"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"}
                 * date : 2020-02-10
                 * hum : 73
                 * pcpn : 0.0
                 * pop : 0
                 * pres : 988
                 * tmp : {"max":"16","min":"1"}
                 * uv : 3
                 * vis : 25
                 * wind : {"deg":"216","dir":"西南风","sc":"3-4","spd":"24"}
                 */

                private AstroBean astro;
                private CondBeanX cond;
                private String date;
                private String hum;
                private String pcpn;
                private String pop;
                private String pres;
                private TmpBean tmp;
                private String uv;
                private String vis;
                private WindBeanX wind;

                public AstroBean getAstro() {
                    return astro;
                }

                public void setAstro(AstroBean astro) {
                    this.astro = astro;
                }

                public CondBeanX getCond() {
                    return cond;
                }

                public void setCond(CondBeanX cond) {
                    this.cond = cond;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getHum() {
                    return hum;
                }

                public void setHum(String hum) {
                    this.hum = hum;
                }

                public String getPcpn() {
                    return pcpn;
                }

                public void setPcpn(String pcpn) {
                    this.pcpn = pcpn;
                }

                public String getPop() {
                    return pop;
                }

                public void setPop(String pop) {
                    this.pop = pop;
                }

                public String getPres() {
                    return pres;
                }

                public void setPres(String pres) {
                    this.pres = pres;
                }

                public TmpBean getTmp() {
                    return tmp;
                }

                public void setTmp(TmpBean tmp) {
                    this.tmp = tmp;
                }

                public String getUv() {
                    return uv;
                }

                public void setUv(String uv) {
                    this.uv = uv;
                }

                public String getVis() {
                    return vis;
                }

                public void setVis(String vis) {
                    this.vis = vis;
                }

                public WindBeanX getWind() {
                    return wind;
                }

                public void setWind(WindBeanX wind) {
                    this.wind = wind;
                }

                public static class AstroBean {
                    /**
                     * mr : 18:52
                     * ms : 07:50
                     * sr : 07:00
                     * ss : 17:45
                     */

                    private String mr;
                    private String ms;
                    private String sr;
                    private String ss;

                    public String getMr() {
                        return mr;
                    }

                    public void setMr(String mr) {
                        this.mr = mr;
                    }

                    public String getMs() {
                        return ms;
                    }

                    public void setMs(String ms) {
                        this.ms = ms;
                    }

                    public String getSr() {
                        return sr;
                    }

                    public void setSr(String sr) {
                        this.sr = sr;
                    }

                    public String getSs() {
                        return ss;
                    }

                    public void setSs(String ss) {
                        this.ss = ss;
                    }
                }

                public static class CondBeanX {
                    /**
                     * code_d : 101
                     * code_n : 101
                     * txt_d : 多云
                     * txt_n : 多云
                     */

                    private String code_d;
                    private String code_n;
                    private String txt_d;
                    private String txt_n;

                    public String getCode_d() {
                        return code_d;
                    }

                    public void setCode_d(String code_d) {
                        this.code_d = code_d;
                    }

                    public String getCode_n() {
                        return code_n;
                    }

                    public void setCode_n(String code_n) {
                        this.code_n = code_n;
                    }

                    public String getTxt_d() {
                        return txt_d;
                    }

                    public void setTxt_d(String txt_d) {
                        this.txt_d = txt_d;
                    }

                    public String getTxt_n() {
                        return txt_n;
                    }

                    public void setTxt_n(String txt_n) {
                        this.txt_n = txt_n;
                    }
                }

                public static class TmpBean {
                    /**
                     * max : 16
                     * min : 1
                     */

                    private String max;
                    private String min;

                    public String getMax() {
                        return max;
                    }

                    public void setMax(String max) {
                        this.max = max;
                    }

                    public String getMin() {
                        return min;
                    }

                    public void setMin(String min) {
                        this.min = min;
                    }
                }

                public static class WindBeanX {
                    /**
                     * deg : 216
                     * dir : 西南风
                     * sc : 3-4
                     * spd : 24
                     */

                    private String deg;
                    private String dir;
                    private String sc;
                    private String spd;

                    public String getDeg() {
                        return deg;
                    }

                    public void setDeg(String deg) {
                        this.deg = deg;
                    }

                    public String getDir() {
                        return dir;
                    }

                    public void setDir(String dir) {
                        this.dir = dir;
                    }

                    public String getSc() {
                        return sc;
                    }

                    public void setSc(String sc) {
                        this.sc = sc;
                    }

                    public String getSpd() {
                        return spd;
                    }

                    public void setSpd(String spd) {
                        this.spd = spd;
                    }
                }
            }

            public static class HourlyForecastBean {
                /**
                 * cond : {"code":"100","txt":"晴"}
                 * date : 2020-02-10 19:00
                 * hum : 70
                 * pop : 0
                 * pres : 989
                 * tmp : 9
                 * wind : {"deg":"188","dir":"南风","sc":"1-2","spd":"1"}
                 */

                private CondBeanXX cond;
                private String date;
                private String hum;
                private String pop;
                private String pres;
                private String tmp;
                private WindBeanXX wind;

                public CondBeanXX getCond() {
                    return cond;
                }

                public void setCond(CondBeanXX cond) {
                    this.cond = cond;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getHum() {
                    return hum;
                }

                public void setHum(String hum) {
                    this.hum = hum;
                }

                public String getPop() {
                    return pop;
                }

                public void setPop(String pop) {
                    this.pop = pop;
                }

                public String getPres() {
                    return pres;
                }

                public void setPres(String pres) {
                    this.pres = pres;
                }

                public String getTmp() {
                    return tmp;
                }

                public void setTmp(String tmp) {
                    this.tmp = tmp;
                }

                public WindBeanXX getWind() {
                    return wind;
                }

                public void setWind(WindBeanXX wind) {
                    this.wind = wind;
                }

                public static class CondBeanXX {
                    /**
                     * code : 100
                     * txt : 晴
                     */

                    private String code;
                    private String txt;

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }
                }

                public static class WindBeanXX {
                    /**
                     * deg : 188
                     * dir : 南风
                     * sc : 1-2
                     * spd : 1
                     */

                    private String deg;
                    private String dir;
                    private String sc;
                    private String spd;

                    public String getDeg() {
                        return deg;
                    }

                    public void setDeg(String deg) {
                        this.deg = deg;
                    }

                    public String getDir() {
                        return dir;
                    }

                    public void setDir(String dir) {
                        this.dir = dir;
                    }

                    public String getSc() {
                        return sc;
                    }

                    public void setSc(String sc) {
                        this.sc = sc;
                    }

                    public String getSpd() {
                        return spd;
                    }

                    public void setSpd(String spd) {
                        this.spd = spd;
                    }
                }
            }
        }
    }
}
