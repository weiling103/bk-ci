/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.quality.tables.records;


import com.tencent.devops.model.quality.tables.TQualityRuleTemplate;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 质量红线模板表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TQualityRuleTemplateRecord extends UpdatableRecordImpl<TQualityRuleTemplateRecord> implements Record12<Long, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Boolean> {

    private static final long serialVersionUID = 1876806184;

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.ID</code>.
     */
    public TQualityRuleTemplateRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.NAME</code>. 模板名称
     */
    public TQualityRuleTemplateRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.NAME</code>. 模板名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.TYPE</code>. 模板类型(指标集, 模板)
     */
    public TQualityRuleTemplateRecord setType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.TYPE</code>. 模板类型(指标集, 模板)
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.DESC</code>. 描述
     */
    public TQualityRuleTemplateRecord setDesc(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.DESC</code>. 描述
     */
    public String getDesc() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.STAGE</code>. 研发环节
     */
    public TQualityRuleTemplateRecord setStage(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.STAGE</code>. 研发环节
     */
    public String getStage() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.CONTROL_POINT</code>. 控制点原子类型
     */
    public TQualityRuleTemplateRecord setControlPoint(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.CONTROL_POINT</code>. 控制点原子类型
     */
    public String getControlPoint() {
        return (String) get(5);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.CONTROL_POINT_POSITION</code>. 控制点红线位置
     */
    public TQualityRuleTemplateRecord setControlPointPosition(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.CONTROL_POINT_POSITION</code>. 控制点红线位置
     */
    public String getControlPointPosition() {
        return (String) get(6);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.CREATE_USER</code>. 创建用户
     */
    public TQualityRuleTemplateRecord setCreateUser(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.CREATE_USER</code>. 创建用户
     */
    public String getCreateUser() {
        return (String) get(7);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.UPDATE_USER</code>. 更新用户
     */
    public TQualityRuleTemplateRecord setUpdateUser(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.UPDATE_USER</code>. 更新用户
     */
    public String getUpdateUser() {
        return (String) get(8);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.CREATE_TIME</code>. 创建时间
     */
    public TQualityRuleTemplateRecord setCreateTime(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.CREATE_TIME</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.UPDATE_TIME</code>. 更新时间
     */
    public TQualityRuleTemplateRecord setUpdateTime(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.UPDATE_TIME</code>. 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.ENABLE</code>. 是否可用
     */
    public TQualityRuleTemplateRecord setEnable(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_TEMPLATE.ENABLE</code>. 是否可用
     */
    public Boolean getEnable() {
        return (Boolean) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Boolean> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Boolean> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.STAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.CONTROL_POINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.CONTROL_POINT_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field10() {
        return TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field11() {
        return TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.ENABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getStage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getControlPoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getControlPointPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value10() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getEnable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleTemplateRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleTemplateRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleTemplateRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleTemplateRecord value4(String value) {
        setDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleTemplateRecord value5(String value) {
        setStage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleTemplateRecord value6(String value) {
        setControlPoint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleTemplateRecord value7(String value) {
        setControlPointPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleTemplateRecord value8(String value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleTemplateRecord value9(String value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleTemplateRecord value10(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleTemplateRecord value11(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleTemplateRecord value12(Boolean value) {
        setEnable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleTemplateRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, LocalDateTime value10, LocalDateTime value11, Boolean value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TQualityRuleTemplateRecord
     */
    public TQualityRuleTemplateRecord() {
        super(TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE);
    }

    /**
     * Create a detached, initialised TQualityRuleTemplateRecord
     */
    public TQualityRuleTemplateRecord(Long id, String name, String type, String desc, String stage, String controlPoint, String controlPointPosition, String createUser, String updateUser, LocalDateTime createTime, LocalDateTime updateTime, Boolean enable) {
        super(TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE);

        set(0, id);
        set(1, name);
        set(2, type);
        set(3, desc);
        set(4, stage);
        set(5, controlPoint);
        set(6, controlPointPosition);
        set(7, createUser);
        set(8, updateUser);
        set(9, createTime);
        set(10, updateTime);
        set(11, enable);
    }
}
