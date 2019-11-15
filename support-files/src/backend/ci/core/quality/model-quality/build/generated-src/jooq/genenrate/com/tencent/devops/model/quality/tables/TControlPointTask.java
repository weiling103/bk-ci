/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.quality.tables;


import com.tencent.devops.model.quality.DevopsQuality;
import com.tencent.devops.model.quality.Keys;
import com.tencent.devops.model.quality.tables.records.TControlPointTaskRecord;

import java.time.LocalDateTime;
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
public class TControlPointTask extends TableImpl<TControlPointTaskRecord> {

    private static final long serialVersionUID = 727693044;

    /**
     * The reference instance of <code>devops_quality.T_CONTROL_POINT_TASK</code>
     */
    public static final TControlPointTask T_CONTROL_POINT_TASK = new TControlPointTask();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TControlPointTaskRecord> getRecordType() {
        return TControlPointTaskRecord.class;
    }

    /**
     * The column <code>devops_quality.T_CONTROL_POINT_TASK.ID</code>.
     */
    public final TableField<TControlPointTaskRecord, String> ID = createField("ID", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_quality.T_CONTROL_POINT_TASK.CONTROL_STAGE</code>.
     */
    public final TableField<TControlPointTaskRecord, String> CONTROL_STAGE = createField("CONTROL_STAGE", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>devops_quality.T_CONTROL_POINT_TASK.CREATE_TIME</code>.
     */
    public final TableField<TControlPointTaskRecord, LocalDateTime> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>devops_quality.T_CONTROL_POINT_TASK.UPDATE_TIME</code>.
     */
    public final TableField<TControlPointTaskRecord, LocalDateTime> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * Create a <code>devops_quality.T_CONTROL_POINT_TASK</code> table reference
     */
    public TControlPointTask() {
        this("T_CONTROL_POINT_TASK", null);
    }

    /**
     * Create an aliased <code>devops_quality.T_CONTROL_POINT_TASK</code> table reference
     */
    public TControlPointTask(String alias) {
        this(alias, T_CONTROL_POINT_TASK);
    }

    private TControlPointTask(String alias, Table<TControlPointTaskRecord> aliased) {
        this(alias, aliased, null);
    }

    private TControlPointTask(String alias, Table<TControlPointTaskRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsQuality.DEVOPS_QUALITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TControlPointTaskRecord> getPrimaryKey() {
        return Keys.KEY_T_CONTROL_POINT_TASK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TControlPointTaskRecord>> getKeys() {
        return Arrays.<UniqueKey<TControlPointTaskRecord>>asList(Keys.KEY_T_CONTROL_POINT_TASK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TControlPointTask as(String alias) {
        return new TControlPointTask(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TControlPointTask rename(String name) {
        return new TControlPointTask(name, null);
    }
}
