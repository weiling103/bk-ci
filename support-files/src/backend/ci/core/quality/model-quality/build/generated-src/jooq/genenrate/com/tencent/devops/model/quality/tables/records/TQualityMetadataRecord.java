/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.quality.tables.records;


import com.tencent.devops.model.quality.tables.TQualityMetadata;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 质量红线基础数据表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TQualityMetadataRecord extends UpdatableRecordImpl<TQualityMetadataRecord> implements Record13<Long, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -37770866;

    /**
     * Setter for <code>devops_quality.T_QUALITY_METADATA.ID</code>.
     */
    public TQualityMetadataRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_METADATA.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_METADATA.DATA_ID</code>. 数据ID
     */
    public TQualityMetadataRecord setDataId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_METADATA.DATA_ID</code>. 数据ID
     */
    public String getDataId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_METADATA.DATA_NAME</code>. 基础数据名称
     */
    public TQualityMetadataRecord setDataName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_METADATA.DATA_NAME</code>. 基础数据名称
     */
    public String getDataName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_METADATA.ELEMENT_TYPE</code>. 原子的classType
     */
    public TQualityMetadataRecord setElementType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_METADATA.ELEMENT_TYPE</code>. 原子的classType
     */
    public String getElementType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_METADATA.ELEMENT_NAME</code>. 产出原子
     */
    public TQualityMetadataRecord setElementName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_METADATA.ELEMENT_NAME</code>. 产出原子
     */
    public String getElementName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_METADATA.ELEMENT_DETAIL</code>. 工具/原子子类
     */
    public TQualityMetadataRecord setElementDetail(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_METADATA.ELEMENT_DETAIL</code>. 工具/原子子类
     */
    public String getElementDetail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_METADATA.VALUE_TYPE</code>. 数值类型
     */
    public TQualityMetadataRecord setValueType(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_METADATA.VALUE_TYPE</code>. 数值类型
     */
    public String getValueType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_METADATA.DESC</code>. 说明
     */
    public TQualityMetadataRecord setDesc(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_METADATA.DESC</code>. 说明
     */
    public String getDesc() {
        return (String) get(7);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_METADATA.EXTRA</code>. 额外的一些字段
     */
    public TQualityMetadataRecord setExtra(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_METADATA.EXTRA</code>. 额外的一些字段
     */
    public String getExtra() {
        return (String) get(8);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_METADATA.CREATE_USER</code>. 创建用户
     */
    public TQualityMetadataRecord setCreateUser(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_METADATA.CREATE_USER</code>. 创建用户
     */
    public String getCreateUser() {
        return (String) get(9);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_METADATA.UPDATE_USER</code>. 更新用户
     */
    public TQualityMetadataRecord setUpdateUser(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_METADATA.UPDATE_USER</code>. 更新用户
     */
    public String getUpdateUser() {
        return (String) get(10);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_METADATA.CREATE_TIME</code>. 创建时间
     */
    public TQualityMetadataRecord setCreateTime(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_METADATA.CREATE_TIME</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_METADATA.UPDATE_TIME</code>. 更新时间
     */
    public TQualityMetadataRecord setUpdateTime(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_METADATA.UPDATE_TIME</code>. 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TQualityMetadata.T_QUALITY_METADATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TQualityMetadata.T_QUALITY_METADATA.DATA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TQualityMetadata.T_QUALITY_METADATA.DATA_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TQualityMetadata.T_QUALITY_METADATA.ELEMENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TQualityMetadata.T_QUALITY_METADATA.ELEMENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TQualityMetadata.T_QUALITY_METADATA.ELEMENT_DETAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TQualityMetadata.T_QUALITY_METADATA.VALUE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TQualityMetadata.T_QUALITY_METADATA.DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TQualityMetadata.T_QUALITY_METADATA.EXTRA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TQualityMetadata.T_QUALITY_METADATA.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TQualityMetadata.T_QUALITY_METADATA.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field12() {
        return TQualityMetadata.T_QUALITY_METADATA.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field13() {
        return TQualityMetadata.T_QUALITY_METADATA.UPDATE_TIME;
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
        return getDataId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDataName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getElementType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getElementName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getElementDetail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getValueType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getExtra();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value12() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value13() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord value2(String value) {
        setDataId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord value3(String value) {
        setDataName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord value4(String value) {
        setElementType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord value5(String value) {
        setElementName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord value6(String value) {
        setElementDetail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord value7(String value) {
        setValueType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord value8(String value) {
        setDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord value9(String value) {
        setExtra(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord value10(String value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord value11(String value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord value12(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord value13(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityMetadataRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, LocalDateTime value12, LocalDateTime value13) {
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
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TQualityMetadataRecord
     */
    public TQualityMetadataRecord() {
        super(TQualityMetadata.T_QUALITY_METADATA);
    }

    /**
     * Create a detached, initialised TQualityMetadataRecord
     */
    public TQualityMetadataRecord(Long id, String dataId, String dataName, String elementType, String elementName, String elementDetail, String valueType, String desc, String extra, String createUser, String updateUser, LocalDateTime createTime, LocalDateTime updateTime) {
        super(TQualityMetadata.T_QUALITY_METADATA);

        set(0, id);
        set(1, dataId);
        set(2, dataName);
        set(3, elementType);
        set(4, elementName);
        set(5, elementDetail);
        set(6, valueType);
        set(7, desc);
        set(8, extra);
        set(9, createUser);
        set(10, updateUser);
        set(11, createTime);
        set(12, updateTime);
    }
}
