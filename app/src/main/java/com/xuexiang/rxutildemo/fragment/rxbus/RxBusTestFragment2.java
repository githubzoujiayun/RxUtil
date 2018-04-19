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

package com.xuexiang.rxutildemo.fragment.rxbus;

import com.xuexiang.rxutil.rxbus.RxBusUtils;
import com.xuexiang.rxutil.rxbus.SubscribeInfo;
import com.xuexiang.rxutildemo.entity.EventKey;
import com.xuexiang.rxutildemo.fragment.rxbus.base.BaseRxBusTestFragment;

import rx.functions.Action1;

/**
 * @author xuexiang
 * @date 2018/3/3 下午6:09
 */
public class RxBusTestFragment2 extends BaseRxBusTestFragment {

    private SubscribeInfo mOneByMore;
    @Override
    protected void initViews() {
        setBackgroundColor(android.R.color.holo_red_light);
    }

    @Override
    protected void initListener() {
        super.initListener();
        RxBusUtils.get().onMainThread(EventKey.EVENT_NO_DATA, new Action1<String>() {
            @Override
            public void call(String eventName) {
                showContent(EventKey.EVENT_NO_DATA,"   EventName:" + eventName);
            }
        });
        mOneByMore = RxBusUtils.get().onMainThread(EventKey.EVENT_ONE_BY_MORE, new Action1<String>() {
            @Override
            public void call(String eventName) {
                showContent(EventKey.EVENT_ONE_BY_MORE, "   EventName:" + eventName);
            }
        });
    }

    @Override
    protected void onCancelEvent() {
        RxBusUtils.get().unregisterAll(EventKey.EVENT_NO_DATA);
        RxBusUtils.get().unregister(EventKey.EVENT_ONE_BY_MORE, mOneByMore);
        RxBusUtils.get().unregister(EventKey.EVENT_CLEAR, mSubscribeInfo);
    }
}
