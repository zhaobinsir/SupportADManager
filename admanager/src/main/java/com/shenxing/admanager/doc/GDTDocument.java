package com.shenxing.admanager.doc;

/**
 * Created by zhaobinsir
 * on 2020/7/24.
 * 广点通文档，包含错误码
 */
public class GDTDocument {
   /*
2001	初始化错误	开发者自查参数问题
2002	内部错误	反馈给广点通商务，请把提供错误码和错误信息
3001	网络异常	检查网络状态并重试
3003	网络类型错误，当前设备的网络类型不符合开屏广告的加载条件	检查网络状态并重试
4001	初始化错误, 包括广告位为空、App ID为空、Context/Activity为空	根据 ILogcat 中的错误信息提示修改嵌入代码
4002	请检查 Manifest 文件中的 Activity/Service/Permission 的声明是否正确以及声明的权限是否都已授予	根据 ILogcat 中的错误信息提示修改嵌入代码
4003	广告位错误	根据 ILogcat 中的错误信息提示修改嵌入代码
4004	开屏广告容器不可见	根据 ILogcat 中的错误信息提示修改嵌入代码
4005	开屏广告容器的高度低于400dp	根据 ILogcat 中的错误信息提示修改嵌入代码
4006	原生广告接口调用顺序错误，调用点击接口前未调用曝光接口	根据 ILogcat 中的错误信息提示修改嵌入代码
4007	当前设备或版本不支持	请参照本文档中相应广告类型对设备或版本的限制
4008	设备方向不适合展示广告	根据 ILogcat 中的错误信息提示修改嵌入代码
4009	开屏广告的自定义跳过按钮尺寸低于3x3dp	根据 ILogcat 中的错误信息提示修改嵌入代码
4011	开屏广告拉取超时，请自查开屏广告的拉取超时时间是否在3-5秒内	根据 ILogcat 中的错误信息提示修改嵌入代码
4012	内容广告接口调用顺序错误，调用点击接口前未调用曝光接口	注意内容接口调用
4013	在旧版的 SDK 上使用了模板视频的广告位，需要升级 SDK	请升级到最新版SDK
4014	广告数据返回前尝试展示广告	开发者调整代码，在广告返回后进行展示广告的操作
4015	同一条广告不允许多次展示	重新拉取广告后再进行展示
4016	应用横竖方向参数与广告位支持方向不匹配	开发自查应用横竖屏状态与广告位支持方向是否匹配
5001	服务端数据错误	建议稍后重试，如果重试仍然有错误，请反馈给广点通商务
5002	视频素材下载错误	建议稍后重试，如果重试仍然有错误，请反馈给广点通商务
5003	视频素材播放错误	建议稍后重试，如果重试仍然有错误，请反馈给广点通商务
5004	未匹配到合适的广告	此情况下禁止多次重试请求广告，否则可能影响系统对您流量的评价从而影响变现效果
5005	广告请求量或者消耗等超过日限额，请明天再请求广告	请明天再发起请求(由于数据延迟问题，建议第二天的00:30之后再发起请求)
5006	包名校验错误，当前 App 的包名和广点通官网注册媒体时填写的包名不一致，因此无广告返回	请检查接入广点通 SDK 的 App 包名是否和注册时填写的一致，否则将影响您的收益
5007	资源加载错误	建议稍后重试，如果重试仍然有错误，请反馈给广点通商务
5008	图片加载错误	建议稍后重试，如果重试仍然有错误，请反馈给广点通商务
5009	广告请求量或者消耗等超过小时限额，请一小时后再请求广告	请一小时后再请求广告
5010	广告样式校验失败，请检查广告位与接口使用是否一致	目前后台开放权限的是原生模板广告，请根据原生模板广告的接入文档进行接入，如果是按照自渲染原生广告接入文档进行接入的话，也会报错107034
5011	原生模版渲染失败	这种情况一般是原生模版在服务端渲染失败，导致返回的数据和模版数不一致导致的，请将该问题反馈给广点通商务排查
5012	广告数据过期	部分广告（如激励视频）可以预拉取，拉取广告后广告数据会有存在一个过期时间，当开发者调用展示广告的接口但此时当前时间已经超过过期时间时会返回此错误码
5013	广告请求过于频繁	请求过于频繁，服务器繁忙时会返回该错误码，请检测与控制请求频率
5018	广告位PosId被封	由于后台设置或者反作弊导致PosId对应的广告位被封锁，请联系广点通商务排查
5019	广告AppId被封	由于后台设置或者反作弊导致AppId对应的广告位被封锁，请联系广点通商务排查
5021	该类型广告已下线	该广告类型已废弃，不再返回广告，请使用其他类型广告
其他	未知错误	请把问题反馈给广点通商务排查，提供错误码和错误信息
更多异常：

100001	请求解析失败，常见原因是没有对参数进行url编码。
100007	广告位id参数解析失败，该参数必填并且参数类型是非负整数
100012	广告位宽度参数解析失败，该参数类型是非负整数
100014	广告位高度参数解析失败，该参数类型是非负整数
100016	广告位参数page_number字段数据类型错误，该参数类型为非负整数
100017	广告位参数last_ad_ids字段数据类型错误，该参数类型为字符串
100019	广告位参数is_information_pos字段数据类型错误，该参数类型为布尔类型
100023	广告位参数level字段数据类型错误，该参数类型为非负整数
100028	广告位参数query字段数据类型错误，该参数类型为字符串
100031	广告位参数max_duration字段数据类型错误，应为非负整数
100032	广告位参数traffic_type字段数据类型错误，应为非负整数
100034	广告位参数support_c2s字段数据类型错误，应为非负整数
100125	广告位宽度和高度参数无效，请参考广告位宽度和高度参数说明
100133	请求中包含无效的广告位
100135	广告位状态冻结
100159	激励视频请求orientation参数不合法
100303	ad_count参数必填且应为非负整数
100351	need_rendered_ad参数无效
102006	没有匹配到合适的广告。禁止重试，否则可能触发系统策略导致流量收益下降
104014	原始idfa无效
104015	imei无效
104017	android id无效
104018	android_advertising_id无效
106001	广告位不存在
107000	广告位信息为空
107002	api请求中操作系统类型不合法
107005	api请求中app_id不匹配
107006	api请求中安卓的package name或是ios的bundle id不合法
107007	缺少有效的设备标识字段
107008	广告位所属媒体在联盟平台关联的域名为空
107009	广告位所在页面的域名与广告位所属媒体在联盟平台关联的域名不一致
107011	请求中的操作系统类型与广告位在联盟平台的设置不匹配
107012	解析api请求中device字段失败
107014	解析api请求中network字段失败
107015	解析api请求中geo字段失败
107016	解析api请求中设备品牌和型号model字段失败
107017	解析api请求中设备横竖屏orientation字段失败
107018	解析api请求中网络连接类型connect_type字段失败
107019	解析api请求中运营商信息carrier字段失败
107020	解析api请求中纬度信息lat字段失败
107021	解析api请求中经度信息lng字段失败
107022	解析api请求中经纬度精度location_accuracy字段失败
107023	解析api请求中是否支持大规格插屏广告support_full_screen_interstitial字段失败
107024	解析api请求中操作系统os_version字段失败
107025	解析api请求中屏幕宽度screen_width字段失败
107026	解析api请求中屏幕高度screen_height字段失败
107027	解析api请求中pos字段失败
107028	解析api请求中media字段失败
107029	api请求中缺少合法的广告位宽度或高度
107030	请求中app包名与广告位在联盟平台的设置不匹配
107031	解析api请求中设备制造商manufacturer字段失败
107032	解析api请求中设备类型device_type字段失败
107033	api请求中缺少合法的设备id
107034	错误的sdk接口调用，常见原因比如使用原生广告位id但调用开屏广告位接口
107035	不支持模板视频广告的sdk版本，请升级sdk版本或广告位配置为不展示视频广告
107036	禁止广告展示页面嵌在iframe中
107040	错误的sdk接口调用，常见原因比如使用自渲染2.0广告位id但调用自渲染1.0接口
107041	sdk版本已经废弃，需更新
107042	api请求中adx_id不合法
107044	API请求中oaid无效
107045	API请求中aid_ticket无效
107046	API请求中taid_ticket无效
107047	sdk的banner插屏1.0已废弃，请通过2.0接入
107048	sdk的原生自渲染1.0已废弃，请通过2.0接入
107049	Js旧准入规则已废弃，请升级准入规则
107050	sdk接口与广告位不匹配。广告位是模板2.0广告位，请调用sdk模板2.0接口请求广告
109506	该广告位样式处于测试期且今日的请求量已经达到了上限，请明日00:30后再发送请求
109507	该广告位样式处于测试期且每小时请求量已经达到了上限，请一小时后再发送请求
109511	该广告位数据异常已被暂时封禁，请明日00:30后再发送请求
112001	请求合法，但当前暂无资讯内容返回,禁止重试，请稍后重试
112003	channel无效
112004	广告位类型错误，非资质通荐广告位请求了资质通荐广告接口，请修改广告位ID后进行重试。
*/

}
