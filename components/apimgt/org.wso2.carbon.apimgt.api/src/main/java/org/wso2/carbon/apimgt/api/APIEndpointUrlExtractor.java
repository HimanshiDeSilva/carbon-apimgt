/*
 * Copyright (c) 2022, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.wso2.carbon.apimgt.api;

import org.wso2.carbon.apimgt.api.model.ApiTypeWrapper;
import org.wso2.carbon.apimgt.api.model.endpointurlextractor.EndpointUrl;
import org.wso2.carbon.apimgt.api.model.endpointurlextractor.HostInfo;

import java.util.List;

/**
 * This Interface defines the interface methods related to operations and functionalities which incorporate with
 * the endpoint url extraction layer.
 */
public interface APIEndpointUrlExtractor {

    /**
     * Get the API endpoint URLs specific to the given tenantDomain/organization and environment.
     *
     * @param apiTypeWrapper The API or APIProduct wrapper
     * @param organization The name of the organization
     * @param environmentName The name of the environment
     * @return List of endpoint URLs specific to the given tenantDomain/organization and environment
     * @throws APIManagementException
     */
    List<EndpointUrl> getApiEndpointUrlsForEnv(ApiTypeWrapper apiTypeWrapper, String organization,
                                               String environmentName) throws APIManagementException;
}