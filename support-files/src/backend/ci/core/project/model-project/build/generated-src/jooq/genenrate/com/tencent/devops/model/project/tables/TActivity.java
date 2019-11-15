/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.project.tables;


import com.tencent.devops.model.project.DevopsProject;
import com.tencent.devops.model.project.Keys;
import com.tencent.devops.model.project.tables.records.TActivityRecord;

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
public class TActivity extends TableImpl<TActivityRecord> {

    private static final long serialVersionUID = 908853869;

    /**
     * The reference instance of <code>devops_project.T_ACTIVITY</code>
     */
    public static final TActivity T_ACTIVITY = new TActivity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TActivityRecord> getRecordType() {
        return TActivityRecord.class;
    }

    /**
     * The column <code>devops_project.T_ACTIVITY.ID</code>.
     */
    public final TableField<TActivityRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>devops_project.T_ACTIVITY.TYPE</code>.
     */
    public final TableField<TActivityRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>devops_project.T_ACTIVITY.NAME</code>.
     */
    public final TableField<TActivityRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>devops_project.T_ACTIVITY.LINK</code>.
     */
    public final TableField<TActivityRecord, String> LINK = createField("LINK", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

    /**
     * The column <code>devops_project.T_ACTIVITY.CREATE_TIME</code>.
     */
    public final TableField<TActivityRecord, LocalDateTime> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>devops_project.T_ACTIVITY.STATUS</code>.
     */
    public final TableField<TActivityRecord, String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>devops_project.T_ACTIVITY.CREATOR</code>.
     */
    public final TableField<TActivityRecord, String> CREATOR = createField("CREATOR", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * Create a <code>devops_project.T_ACTIVITY</code> table reference
     */
    public TActivity() {
        this("T_ACTIVITY", null);
    }

    /**
     * Create an aliased <code>devops_project.T_ACTIVITY</code> table reference
     */
    public TActivity(String alias) {
        this(alias, T_ACTIVITY);
    }

    private TActivity(String alias, Table<TActivityRecord> aliased) {
        this(alias, aliased, null);
    }

    private TActivity(String alias, Table<TActivityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsProject.DEVOPS_PROJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TActivityRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_ACTIVITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TActivityRecord> getPrimaryKey() {
        return Keys.KEY_T_ACTIVITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TActivityRecord>> getKeys() {
        return Arrays.<UniqueKey<TActivityRecord>>asList(Keys.KEY_T_ACTIVITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TActivity as(String alias) {
        return new TActivity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TActivity rename(String name) {
        return new TActivity(name, null);
    }
}
