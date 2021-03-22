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

package com.webank.wedatasphere.dss.appconn.orchestrator.ref;

import com.webank.wedatasphere.dss.common.entity.DSSLabel;
import com.webank.wedatasphere.dss.common.entity.IOEnv;
import com.webank.wedatasphere.dss.orchestrator.core.ref.OrchestratorImportRequestRef;
import com.webank.wedatasphere.dss.standard.app.sso.Workspace;

import java.util.List;
import java.util.Map;

/**
 * @author allenlliu
 * @date 2020/12/15 16:15
 */
public class DefaultOrchestratorImportRequestRef implements OrchestratorImportRequestRef {
    private String resourceId;
    private String bmlVersion;
    private Long projectId;
    private String projectName;
    private IOEnv sourceEnv;
    private String orcVersion;
    private String workspaceName;
    private String userName;
    private String orchestratorName;
    private  List<DSSLabel> dssLabels;
    private Workspace workspace;

    @Override
    public void setUserName(String userName) {
       this.userName = userName;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public String getResourceId() {
        return resourceId;
    }

    @Override
    public void setBmlVersion(String bmlVersion) {
        this.bmlVersion = bmlVersion;
    }

    @Override
    public String getBmlVersion() {
        return bmlVersion;
    }

    @Override
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    @Override
    public Long getProjectId() {
        return projectId;
    }

    @Override
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String getProjectName() {
        return projectName;
    }

    @Override
    public void setSourceEnv(IOEnv sourceEnv) {
        this.sourceEnv = sourceEnv;
    }

    @Override
    public IOEnv getSourceEnv() {
        return sourceEnv;
    }

    @Override
    public void setOrcVersion(String orcVersion) {
        this.orcVersion = orcVersion;
    }

    @Override
    public String getOrcVersion() {
        return orcVersion;
    }

    @Override
    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    @Override
    public String getWorkspaceName() {
        return workspaceName;
    }


    @Override
    public String getOrchestratorName() {
        return orchestratorName;
    }

    @Override
    public void setOrchestratorName(String orchestratorName) {
        this.orchestratorName = orchestratorName;
    }

    @Override
    public List<DSSLabel> getDSSLabels() {
        return dssLabels;
    }

    @Override
    public void setDSSLabels(List<DSSLabel> dssLabels) {
        this.dssLabels = dssLabels;
    }

    @Override
    public Object getParameter(String key) {
        return null;
    }

    @Override
    public void setParameter(String key, Object value) {

    }

    @Override
    public Map<String, Object> getParameters() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public Workspace getWorkspace() {
        return workspace;
    }

    @Override
    public void setWorkspace(Workspace workspace) {
        this.workspace = workspace;
    }
}
