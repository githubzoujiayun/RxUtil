# RxUtil
[![RxUtil][rxSvg]][rx]  [![api][apiSvg]][api]

一个实用的RxJava1工具类库

> 如果你使用的是RxJava2，请移步[RxUtil2](https://github.com/xuexiangjys/RxUtil2)

## 内容

* RxBus 支持多事件定义，支持数据携带，支持全局和局部的事件订阅和注销。
* 订阅池管理。
* 支持非侵入式的订阅生命周期绑定。
* 线程调度辅助工具。
* RxBinding 使用工具类。
* RxJava常用方法工具类。

### 如何使用

先在项目根目录的 build.gradle 的 repositories 添加:
```
allprojects {
     repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

然后在dependencies添加:

```
dependencies {
   ...
   implementation 'io.reactivex:rxjava:1.3.6'
   implementation 'io.reactivex:rxandroid:1.2.1'
   //rxbinding的sdk
   implementation 'com.jakewharton.rxbinding:rxbinding:1.0.1'

   implementation 'com.github.xuexiangjys:RxUtil:1.1.3'
}
```

## 联系方式

[![](https://img.shields.io/badge/点击一键加入QQ群-602082750-blue.svg)](http://shang.qq.com/wpa/qunwpa?idkey=9922861ef85c19f1575aecea0e8680f60d9386080a97ed310c971ae074998887)

[rxSvg]: https://img.shields.io/badge/RxUtil-1.1.3-brightgreen.svg
[rx]: https://github.com/xuexiangjys/RxUtil
[apiSvg]: https://img.shields.io/badge/API-14+-brightgreen.svg
[api]: https://android-arsenal.com/api?level=14