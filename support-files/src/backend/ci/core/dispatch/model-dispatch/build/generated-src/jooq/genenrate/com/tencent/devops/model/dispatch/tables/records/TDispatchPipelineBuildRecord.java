/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.dispatch.tables.records;


import com.tencent.devops.model.dispatch.tables.TDispatchPipelineBuild;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDispatchPipelineBuildRecord extends UpdatableRecordImpl<TDispatchPipelineBuildRecord> implements Record9<Integer, String, String, String, String, Integer, LocalDateTime, LocalDateTime, Integer> {

    private static final long serialVersionUID = -1287417891;

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.ID</code>.
     */
    public TDispatchPipelineBuildRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.PROJECT_ID</code>.
     */
    public TDispatchPipelineBuildRecord setProjectId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.PROJECT_ID</code>.
     */
    public String getProjectId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.PIPELINE_ID</code>.
     */
    public TDispatchPipelineBuildRecord setPipelineId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.PIPELINE_ID</code>.
     */
    public String getPipelineId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.BUILD_ID</code>.
     */
    public TDispatchPipelineBuildRecord setBuildId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.BUILD_ID</code>.
     */
    public String getBuildId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.VM_SEQ_ID</code>.
     */
    public TDispatchPipelineBuildRecord setVmSeqId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.VM_SEQ_ID</code>.
     */
    public String getVmSeqId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.VM_ID</code>.
     */
    public TDispatchPipelineBuildRecord setVmId(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.VM_ID</code>.
     */
    public Integer getVmId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.CREATED_TIME</code>.
     */
    public TDispatchPipelineBuildRecord setCreatedTime(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.CREATED_TIME</code>.
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.UPDATED_TIME</code>.
     */
    public TDispatchPipelineBuildRecord setUpdatedTime(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.UPDATED_TIME</code>.
     */
    public LocalDateTime getUpdatedTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.STATUS</code>.
     */
    public TDispatchPipelineBuildRecord setStatus(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_PIPELINE_BUILD.STATUS</code>.
     */
    public Integer getStatus() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, Integer, LocalDateTime, LocalDateTime, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, Integer, LocalDateTime, LocalDateTime, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TDispatchPipelineBuild.T_DISPATCH_PIPELINE_BUILD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TDispatchPipelineBuild.T_DISPATCH_PIPELINE_BUILD.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TDispatchPipelineBuild.T_DISPATCH_PIPELINE_BUILD.PIPELINE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TDispatchPipelineBuild.T_DISPATCH_PIPELINE_BUILD.BUILD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TDispatchPipelineBuild.T_DISPATCH_PIPELINE_BUILD.VM_SEQ_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TDispatchPipelineBuild.T_DISPATCH_PIPELINE_BUILD.VM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field7() {
        return TDispatchPipelineBuild.T_DISPATCH_PIPELINE_BUILD.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return TDispatchPipelineBuild.T_DISPATCH_PIPELINE_BUILD.UPDATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return TDispatchPipelineBuild.T_DISPATCH_PIPELINE_BUILD.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
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
        return getVmSeqId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getVmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value7() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getUpdatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineBuildRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineBuildRecord value2(String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineBuildRecord value3(String value) {
        setPipelineId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineBuildRecord value4(String value) {
        setBuildId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineBuildRecord value5(String value) {
        setVmSeqId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineBuildRecord value6(Integer value) {
        setVmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineBuildRecord value7(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineBuildRecord value8(LocalDateTime value) {
        setUpdatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineBuildRecord value9(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineBuildRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, LocalDateTime value7, LocalDateTime value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TDispatchPipelineBuildRecord
     */
    public TDispatchPipelineBuildRecord() {
        super(TDispatchPipelineBuild.T_DISPATCH_PIPELINE_BUILD);
    }

    /**
     * Create a detached, initialised TDispatchPipelineBuildRecord
     */
    public TDispatchPipelineBuildRecord(Integer id, String projectId, String pipelineId, String buildId, String vmSeqId, Integer vmId, LocalDateTime createdTime, LocalDateTime updatedTime, Integer status) {
        super(TDispatchPipelineBuild.T_DISPATCH_PIPELINE_BUILD);

        set(0, id);
        set(1, projectId);
        set(2, pipelineId);
        set(3, buildId);
        set(4, vmSeqId);
        set(5, vmId);
        set(6, createdTime);
        set(7, updatedTime);
        set(8, status);
    }
}
