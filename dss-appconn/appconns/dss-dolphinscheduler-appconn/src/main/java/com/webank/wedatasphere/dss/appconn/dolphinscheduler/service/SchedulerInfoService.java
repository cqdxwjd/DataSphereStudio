/*
 *
 *  * Copyright 2019 WeBank
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.webank.wedatasphere.dss.appconn.dolphinscheduler.service;

import com.webank.wedatasphere.dss.appconn.dolphinscheduler.operation.SchedulisScheduleInfoGetOperation;
import com.webank.wedatasphere.dss.standard.common.desc.AppDesc;

/**
 * created by cooperyang on 2021/1/26
 * Description:
 */
public class SchedulerInfoService {

    private static SchedulerInfoService instance;

    private AppDesc appDesc;

    private SchedulerInfoService(AppDesc appDesc) {
        this.appDesc = appDesc;
    }

    public static SchedulerInfoService getInstance(AppDesc appDesc) {
        if (instance == null) {
            synchronized (SchedulerInfoService.class) {
                if (instance == null) {
                    instance = new SchedulerInfoService(appDesc);
                }
            }
        }
        return instance;
    }

    public SchedulisScheduleInfoGetOperation getSchedulisScheduleInfoGetOperation() {
        return new SchedulisScheduleInfoGetOperation(this.appDesc);
    }

}
