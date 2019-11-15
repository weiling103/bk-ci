/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.dispatch.tables;


import com.tencent.devops.model.dispatch.DevopsDispatch;
import com.tencent.devops.model.dispatch.Keys;
import com.tencent.devops.model.dispatch.tables.records.TDispatchTstackVolumeRecord;

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
public class TDispatchTstackVolume extends TableImpl<TDispatchTstackVolumeRecord> {

    private static final long serialVersionUID = 338629613;

    /**
     * The reference instance of <code>devops_dispatch.T_DISPATCH_TSTACK_VOLUME</code>
     */
    public static final TDispatchTstackVolume T_DISPATCH_TSTACK_VOLUME = new TDispatchTstackVolume();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TDispatchTstackVolumeRecord> getRecordType() {
        return TDispatchTstackVolumeRecord.class;
    }

    /**
     * The column <code>devops_dispatch.T_DISPATCH_TSTACK_VOLUME.VOLUME_ID</code>.
     */
    public final TableField<TDispatchTstackVolumeRecord, String> VOLUME_ID = createField("VOLUME_ID", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_TSTACK_VOLUME.PIPELINE_ID</code>.
     */
    public final TableField<TDispatchTstackVolumeRecord, String> PIPELINE_ID = createField("PIPELINE_ID", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_TSTACK_VOLUME.VM_SEQ_ID</code>.
     */
    public final TableField<TDispatchTstackVolumeRecord, String> VM_SEQ_ID = createField("VM_SEQ_ID", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_TSTACK_VOLUME.CREATED_TIME</code>.
     */
    public final TableField<TDispatchTstackVolumeRecord, LocalDateTime> CREATED_TIME = createField("CREATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_TSTACK_VOLUME.UPDATED_TIME</code>.
     */
    public final TableField<TDispatchTstackVolumeRecord, LocalDateTime> UPDATED_TIME = createField("UPDATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * Create a <code>devops_dispatch.T_DISPATCH_TSTACK_VOLUME</code> table reference
     */
    public TDispatchTstackVolume() {
        this("T_DISPATCH_TSTACK_VOLUME", null);
    }

    /**
     * Create an aliased <code>devops_dispatch.T_DISPATCH_TSTACK_VOLUME</code> table reference
     */
    public TDispatchTstackVolume(String alias) {
        this(alias, T_DISPATCH_TSTACK_VOLUME);
    }

    private TDispatchTstackVolume(String alias, Table<TDispatchTstackVolumeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TDispatchTstackVolume(String alias, Table<TDispatchTstackVolumeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TDispatchTstackVolumeRecord> getPrimaryKey() {
        return Keys.KEY_T_DISPATCH_TSTACK_VOLUME_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TDispatchTstackVolumeRecord>> getKeys() {
        return Arrays.<UniqueKey<TDispatchTstackVolumeRecord>>asList(Keys.KEY_T_DISPATCH_TSTACK_VOLUME_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackVolume as(String alias) {
        return new TDispatchTstackVolume(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TDispatchTstackVolume rename(String name) {
        return new TDispatchTstackVolume(name, null);
    }
}
