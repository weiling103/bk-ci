/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.environment.tables;


import com.tencent.devops.model.environment.DevopsEnvironment;
import com.tencent.devops.model.environment.Keys;
import com.tencent.devops.model.environment.tables.records.TBcsClusterRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBcsCluster extends TableImpl<TBcsClusterRecord> {

    private static final long serialVersionUID = 1704005264;

    /**
     * The reference instance of <code>devops_environment.T_BCS_CLUSTER</code>
     */
    public static final TBcsCluster T_BCS_CLUSTER = new TBcsCluster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TBcsClusterRecord> getRecordType() {
        return TBcsClusterRecord.class;
    }

    /**
     * The column <code>devops_environment.T_BCS_CLUSTER.CLUSTER_ID</code>. 集群ID
     */
    public final TableField<TBcsClusterRecord, String> CLUSTER_ID = createField("CLUSTER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "集群ID");

    /**
     * The column <code>devops_environment.T_BCS_CLUSTER.CLUSTER_NAME</code>. 集群名称
     */
    public final TableField<TBcsClusterRecord, String> CLUSTER_NAME = createField("CLUSTER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "集群名称");

    /**
     * Create a <code>devops_environment.T_BCS_CLUSTER</code> table reference
     */
    public TBcsCluster() {
        this("T_BCS_CLUSTER", null);
    }

    /**
     * Create an aliased <code>devops_environment.T_BCS_CLUSTER</code> table reference
     */
    public TBcsCluster(String alias) {
        this(alias, T_BCS_CLUSTER);
    }

    private TBcsCluster(String alias, Table<TBcsClusterRecord> aliased) {
        this(alias, aliased, null);
    }

    private TBcsCluster(String alias, Table<TBcsClusterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsEnvironment.DEVOPS_ENVIRONMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TBcsClusterRecord> getPrimaryKey() {
        return Keys.KEY_T_BCS_CLUSTER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TBcsClusterRecord>> getKeys() {
        return Arrays.<UniqueKey<TBcsClusterRecord>>asList(Keys.KEY_T_BCS_CLUSTER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBcsCluster as(String alias) {
        return new TBcsCluster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TBcsCluster rename(String name) {
        return new TBcsCluster(name, null);
    }
}
