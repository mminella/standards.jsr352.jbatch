/*
 * Copyright 2012 International Business Machines Corp.
 * 
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Licensed under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.jbatch.tck.artifacts.common;

import java.util.Properties;

import javax.batch.api.partition.PartitionPlan;

public abstract class AbstractPartitionPlan implements PartitionPlan {

    private int partitionCount;
    private int threadCount;
    private Properties[] partitionProperties;

    private boolean partitionOverrides = false;

    public int getPartitions() {
        return partitionCount;
    }

    public void setPartitions(int partitionCount) {
        this.partitionCount = partitionCount;
    }

    public int getThreads() {
        return threadCount;
    }

    public void setThreads(int threadCount) {
        this.threadCount = threadCount;
    }

    public Properties[] getPartitionProperties() {
        return partitionProperties;
    }

    public void setPartitionProperties(Properties[] partitionProperties) {
        this.partitionProperties = partitionProperties;
    }

    public boolean getPartitionOverrides() {
        return partitionOverrides;
    }


    public void setPartitionsOverride(boolean override) {
        this.partitionOverrides = override;
    }
    

}