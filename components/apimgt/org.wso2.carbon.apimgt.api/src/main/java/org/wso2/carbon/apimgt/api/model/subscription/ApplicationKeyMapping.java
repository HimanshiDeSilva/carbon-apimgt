/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.apimgt.api.model.subscription;

/**
 * Entity for keeping mapping between Application and Consumer key.
 */
public class ApplicationKeyMapping implements CacheableEntity<String> {

    private String applicationUUID;
    private String consumerKey;
    private String keyType;
    private String wfState;
    private int applicationId;
    private String keyManager;

    public String getConsumerKey() {

        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {

        this.consumerKey = consumerKey;
    }

    public String getKeyType() {

        return keyType;
    }

    public void setKeyType(String keyType) {

        this.keyType = keyType;
    }

    public String getWfState() {

        return wfState;
    }

    public void setWfState(String wfState) {

        this.wfState = wfState;
    }

    public int getApplicationId() {

        return applicationId;
    }

    public void setApplicationId(int applicationId) {

        this.applicationId = applicationId;
    }

    @Override
    public String getCacheKey() {

        return getConsumerKey();
    }

    public void setKeyManager(String keyManager) {

        this.keyManager = keyManager;
    }

    public String getKeyManager() {

        return keyManager;
    }

    public String getApplicationUUID() {

        return applicationUUID;
    }

    public void setApplicationUUID(String applicationUUID) {

        this.applicationUUID = applicationUUID;
    }
}
