/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.notify.tables;


import com.tencent.devops.model.notify.DevopsNotify;
import com.tencent.devops.model.notify.Keys;
import com.tencent.devops.model.notify.tables.records.TEmailNotifyMessageTemplateRecord;

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
 * 邮件通知模板表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TEmailNotifyMessageTemplate extends TableImpl<TEmailNotifyMessageTemplateRecord> {

    private static final long serialVersionUID = -902303308;

    /**
     * The reference instance of <code>devops_notify.T_EMAIL_NOTIFY_MESSAGE_TEMPLATE</code>
     */
    public static final TEmailNotifyMessageTemplate T_EMAIL_NOTIFY_MESSAGE_TEMPLATE = new TEmailNotifyMessageTemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TEmailNotifyMessageTemplateRecord> getRecordType() {
        return TEmailNotifyMessageTemplateRecord.class;
    }

    /**
     * The column <code>devops_notify.T_EMAIL_NOTIFY_MESSAGE_TEMPLATE.ID</code>. 主键
     */
    public final TableField<TEmailNotifyMessageTemplateRecord, String> ID = createField("ID", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "主键");

    /**
     * The column <code>devops_notify.T_EMAIL_NOTIFY_MESSAGE_TEMPLATE.BASE_TEMPLATE_ID</code>. 模板ID（对应T_BASE_NOTIFY_MESSAGE_TEMPLATE表的主键）
     */
    public final TableField<TEmailNotifyMessageTemplateRecord, String> BASE_TEMPLATE_ID = createField("BASE_TEMPLATE_ID", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "模板ID（对应T_BASE_NOTIFY_MESSAGE_TEMPLATE表的主键）");

    /**
     * The column <code>devops_notify.T_EMAIL_NOTIFY_MESSAGE_TEMPLATE.BODY_FORMAT</code>. 邮件格式（0:文本 1:html网页）
     */
    public final TableField<TEmailNotifyMessageTemplateRecord, Byte> BODY_FORMAT = createField("BODY_FORMAT", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "邮件格式（0:文本 1:html网页）");

    /**
     * The column <code>devops_notify.T_EMAIL_NOTIFY_MESSAGE_TEMPLATE.EMAIL_TYPE</code>. 邮件类型（0:外部邮件 1:内部邮件）
     */
    public final TableField<TEmailNotifyMessageTemplateRecord, Byte> EMAIL_TYPE = createField("EMAIL_TYPE", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "邮件类型（0:外部邮件 1:内部邮件）");

    /**
     * The column <code>devops_notify.T_EMAIL_NOTIFY_MESSAGE_TEMPLATE.CREATOR</code>. 创建人
     */
    public final TableField<TEmailNotifyMessageTemplateRecord, String> CREATOR = createField("CREATOR", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("system", org.jooq.impl.SQLDataType.VARCHAR)), this, "创建人");

    /**
     * The column <code>devops_notify.T_EMAIL_NOTIFY_MESSAGE_TEMPLATE.MODIFIER</code>. 最近修改人
     */
    public final TableField<TEmailNotifyMessageTemplateRecord, String> MODIFIER = createField("MODIFIER", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("system", org.jooq.impl.SQLDataType.VARCHAR)), this, "最近修改人");

    /**
     * The column <code>devops_notify.T_EMAIL_NOTIFY_MESSAGE_TEMPLATE.CREATE_TIME</code>. 创建时间
     */
    public final TableField<TEmailNotifyMessageTemplateRecord, LocalDateTime> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "创建时间");

    /**
     * The column <code>devops_notify.T_EMAIL_NOTIFY_MESSAGE_TEMPLATE.UPDATE_TIME</code>. 更新时间
     */
    public final TableField<TEmailNotifyMessageTemplateRecord, LocalDateTime> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "更新时间");

    /**
     * Create a <code>devops_notify.T_EMAIL_NOTIFY_MESSAGE_TEMPLATE</code> table reference
     */
    public TEmailNotifyMessageTemplate() {
        this("T_EMAIL_NOTIFY_MESSAGE_TEMPLATE", null);
    }

    /**
     * Create an aliased <code>devops_notify.T_EMAIL_NOTIFY_MESSAGE_TEMPLATE</code> table reference
     */
    public TEmailNotifyMessageTemplate(String alias) {
        this(alias, T_EMAIL_NOTIFY_MESSAGE_TEMPLATE);
    }

    private TEmailNotifyMessageTemplate(String alias, Table<TEmailNotifyMessageTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private TEmailNotifyMessageTemplate(String alias, Table<TEmailNotifyMessageTemplateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "邮件通知模板表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsNotify.DEVOPS_NOTIFY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TEmailNotifyMessageTemplateRecord> getPrimaryKey() {
        return Keys.KEY_T_EMAIL_NOTIFY_MESSAGE_TEMPLATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TEmailNotifyMessageTemplateRecord>> getKeys() {
        return Arrays.<UniqueKey<TEmailNotifyMessageTemplateRecord>>asList(Keys.KEY_T_EMAIL_NOTIFY_MESSAGE_TEMPLATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TEmailNotifyMessageTemplate as(String alias) {
        return new TEmailNotifyMessageTemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TEmailNotifyMessageTemplate rename(String name) {
        return new TEmailNotifyMessageTemplate(name, null);
    }
}
