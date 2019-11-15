/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.dispatch.tables;


import com.tencent.devops.model.dispatch.DevopsDispatch;
import com.tencent.devops.model.dispatch.Keys;
import com.tencent.devops.model.dispatch.tables.records.TDispatchPipelineDockerTaskRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDispatchPipelineDockerTask extends TableImpl<TDispatchPipelineDockerTaskRecord> {

    private static final long serialVersionUID = -411293470;

    /**
     * The reference instance of <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK</code>
     */
    public static final TDispatchPipelineDockerTask T_DISPATCH_PIPELINE_DOCKER_TASK = new TDispatchPipelineDockerTask();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TDispatchPipelineDockerTaskRecord> getRecordType() {
        return TDispatchPipelineDockerTaskRecord.class;
    }

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.ID</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.PROJECT_ID</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, String> PROJECT_ID = createField("PROJECT_ID", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.AGENT_ID</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, String> AGENT_ID = createField("AGENT_ID", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.PIPELINE_ID</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, String> PIPELINE_ID = createField("PIPELINE_ID", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.BUILD_ID</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, String> BUILD_ID = createField("BUILD_ID", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.VM_SEQ_ID</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, Integer> VM_SEQ_ID = createField("VM_SEQ_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.STATUS</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, Integer> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.SECRET_KEY</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, String> SECRET_KEY = createField("SECRET_KEY", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.IMAGE_NAME</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, String> IMAGE_NAME = createField("IMAGE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.CHANNEL_CODE</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, String> CHANNEL_CODE = createField("CHANNEL_CODE", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.HOST_TAG</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, String> HOST_TAG = createField("HOST_TAG", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.CONTAINER_ID</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, String> CONTAINER_ID = createField("CONTAINER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.CREATED_TIME</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, LocalDateTime> CREATED_TIME = createField("CREATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.UPDATED_TIME</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, LocalDateTime> UPDATED_TIME = createField("UPDATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.ZONE</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, String> ZONE = createField("ZONE", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.REGISTRY_USER</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, String> REGISTRY_USER = createField("REGISTRY_USER", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.REGISTRY_PWD</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, String> REGISTRY_PWD = createField("REGISTRY_PWD", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK.IMAGE_TYPE</code>.
     */
    public final TableField<TDispatchPipelineDockerTaskRecord, String> IMAGE_TYPE = createField("IMAGE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * Create a <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK</code> table reference
     */
    public TDispatchPipelineDockerTask() {
        this("T_DISPATCH_PIPELINE_DOCKER_TASK", null);
    }

    /**
     * Create an aliased <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_TASK</code> table reference
     */
    public TDispatchPipelineDockerTask(String alias) {
        this(alias, T_DISPATCH_PIPELINE_DOCKER_TASK);
    }

    private TDispatchPipelineDockerTask(String alias, Table<TDispatchPipelineDockerTaskRecord> aliased) {
        this(alias, aliased, null);
    }

    private TDispatchPipelineDockerTask(String alias, Table<TDispatchPipelineDockerTaskRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsDispatch.DEVOPS_DISPATCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TDispatchPipelineDockerTaskRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_DISPATCH_PIPELINE_DOCKER_TASK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TDispatchPipelineDockerTaskRecord> getPrimaryKey() {
        return Keys.KEY_T_DISPATCH_PIPELINE_DOCKER_TASK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TDispatchPipelineDockerTaskRecord>> getKeys() {
        return Arrays.<UniqueKey<TDispatchPipelineDockerTaskRecord>>asList(Keys.KEY_T_DISPATCH_PIPELINE_DOCKER_TASK_PRIMARY, Keys.KEY_T_DISPATCH_PIPELINE_DOCKER_TASK_BUILD_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineDockerTask as(String alias) {
        return new TDispatchPipelineDockerTask(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TDispatchPipelineDockerTask rename(String name) {
        return new TDispatchPipelineDockerTask(name, null);
    }
}
