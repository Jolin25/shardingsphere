/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.data.pipeline.core.spi.check.consistency.checker;

import org.apache.shardingsphere.infra.database.type.DatabaseTypeRegistry;

import java.util.Collection;

/**
 * Data match implementation of data consistency check algorithm.
 */
public final class DataMatchDataConsistencyCheckAlgorithm extends AbstractDataConsistencyCheckAlgorithm {
    
    public static final String TYPE = "DATA_MATCH";
    
    private static final Collection<String> SUPPORTED_DATABASE_TYPES = DatabaseTypeRegistry.getDatabaseTypeNames();
    
    @Override
    public Collection<String> getSupportedDatabaseTypes() {
        return SUPPORTED_DATABASE_TYPES;
    }
    
    @Override
    public String getDescription() {
        return "Match raw data of records.";
    }
    
    @Override
    public String getType() {
        return TYPE;
    }
}
