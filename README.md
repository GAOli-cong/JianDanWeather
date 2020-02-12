# JianDanWeather
简单天气
开发简介，占用手机极低的存储空间仅仅不到2M,功能强大，来源于强大的数据接口，开发语言android-java开发工具android studio
主要实现流程并不难，主要用到网络请求，json数据解析Gson 把解析的数据拿到，展示到页面布局RecyclerView即可
拉刷新功能 来源于android提供的原生SwipeRefreshLayout 即下拉的时候，在执行一遍查询数据
点击切换，弹出对话框，判断输入是否为城市，然后把输入框得到的值sp存储，下次进入app 就会显示上次查询的城市

注意 注意 注意！请自己到京东万象申请天气api 然后到MainActivity 请求地址中替换为自己的秘钥
![image](https://github.com/GAOli-cong/JianDanWeather/blob/master/images/jiemian.PNG)
