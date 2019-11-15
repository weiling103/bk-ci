/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.quality.tables.records;


import com.tencent.devops.model.quality.tables.TQualityHisOriginMetadata;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 执行结果基础数据表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TQualityHisOriginMetadataRecord extends UpdatableRecordImpl<TQualityHisOriginMetadataRecord> implements Record6<Long, String, String, String, String, String> {

    private static final long serialVersionUID = -880472991;

    /**
     * Setter for <code>devops_quality.T_QUALITY_HIS_ORIGIN_METADATA.ID</code>.
     */
    public TQualityHisOriginMetadataRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_HIS_ORIGIN_METADATA.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_HIS_ORIGIN_METADATA.PROJECT_ID</code>. 项目ID
     */
    public TQualityHisOriginMetadataRecord setProjectId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_HIS_ORIGIN_METADATA.PROJECT_ID</code>. 项目ID
     */
    public String getProjectId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_HIS_ORIGIN_METADATA.PIPELINE_ID</code>. 流水线ID
     */
    public TQualityHisOriginMetadataRecord setPipelineId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_HIS_ORIGIN_METADATA.PIPELINE_ID</code>. 流水线ID
     */
    public String getPipelineId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_HIS_ORIGIN_METADATA.BUILD_ID</code>. 构建ID
     */
    public TQualityHisOriginMetadataRecord setBuildId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_HIS_ORIGIN_METADATA.BUILD_ID</code>. 构建ID
     */
    public String getBuildId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_HIS_ORIGIN_METADATA.BUILD_NO</code>. 构建号
     */
    public TQualityHisOriginMetadataRecord setBuildNo(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_HIS_ORIGIN_METADATA.BUILD_NO</code>. 构建号
     */
    public String getBuildNo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_HIS_ORIGIN_METADATA.RESULT_DATA</code>. 执行结果数据
     */
    public TQualityHisOriginMetadataRecord setResultData(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_HIS_ORIGIN_METADATA.RESULT_DATA</code>. 执行结果数据
     */
    public String getResultData() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TQualityHisOriginMetadata.T_QUALITY_HIS_ORIGIN_METADATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TQualityHisOriginMetadata.T_QUALITY_HIS_ORIGIN_METADATA.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TQualityHisOriginMetadata.T_QUALITY_HIS_ORIGIN_METADATA.PIPELINE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TQualityHisOriginMetadata.T_QUALITY_HIS_ORIGIN_METADATA.BUILD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TQualityHisOriginMetadata.T_QUALITY_HIS_ORIGIN_METADATA.BUILD_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TQualityHisOriginMetadata.T_QUALITY_HIS_ORIGIN_METADATA.RESULT_DATA;
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
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPipelineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBuildId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBuildNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getResultData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityHisOriginMetadataRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityHisOriginMetadataRecord value2(String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityHisOriginMetadataRecord value3(String value) {
        setPipelineId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityHisOriginMetadataRecord value4(String value) {
        setBuildId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityHisOriginMetadataRecord value5(String value) {
        setBuildNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityHisOriginMetadataRecord value6(String value) {
        setResultData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityHisOriginMetadataRecord values(Long value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TQualityHisOriginMetadataRecord
     */
    public TQualityHisOriginMetadataRecord() {
        super(TQualityHisOriginMetadata.T_QUALITY_HIS_ORIGIN_METADATA);
    }

    /**
     * Create a detached, initialised TQualityHisOriginMetadataRecord
     */
    public TQualityHisOriginMetadataRecord(Long id, String projectId, String pipelineId, String buildId, String buildNo, String resultData) {
        super(TQualityHisOriginMetadata.T_QUALITY_HIS_ORIGIN_METADATA);

        set(0, id);
        set(1, projectId);
        set(2, pipelineId);
        set(3, buildId);
        set(4, buildNo);
        set(5, resultData);
    }
}
