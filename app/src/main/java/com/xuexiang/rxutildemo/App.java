/*
 * Copyright (C) 2018 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xuexiang.rxutildemo;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;
import com.xuexiang.rxutil.logs.RxLog;
import com.xuexiang.xutil.XUtil;

/**
 * @author xuexiang
 * @date 2018/3/11 下午11:11
 */
public class App extends Application {

    private static RefWatcher gRefWatcher;
    @Override
    public void onCreate() {
        super.onCreate();

        XUtil.init(this);
        initCanary();

        RxLog.debug(true);
    }

    private void initCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        gRefWatcher = LeakCanary.install(this);
    }

    public static RefWatcher getRefWatcher() {
        return gRefWatcher;
    }
}
