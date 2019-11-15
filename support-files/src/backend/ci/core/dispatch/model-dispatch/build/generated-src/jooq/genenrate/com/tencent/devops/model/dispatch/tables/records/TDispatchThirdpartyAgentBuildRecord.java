/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.dispatch.tables.records;


import com.tencent.devops.model.dispatch.tables.TDispatchThirdpartyAgentBuild;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDispatchThirdpartyAgentBuildRecord extends UpdatableRecordImpl<TDispatchThirdpartyAgentBuildRecord> implements Record13<Integer, String, String, String, String, String, Integer, LocalDateTime, LocalDateTime, String, Integer, String, String> {

    private static final long serialVersionUID = 288798676;

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.ID</code>.
     */
    public TDispatchThirdpartyAgentBuildRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.PROJECT_ID</code>.
     */
    public TDispatchThirdpartyAgentBuildRecord setProjectId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.PROJECT_ID</code>.
     */
    public String getProjectId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.AGENT_ID</code>.
     */
    public TDispatchThirdpartyAgentBuildRecord setAgentId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.AGENT_ID</code>.
     */
    public String getAgentId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.PIPELINE_ID</code>.
     */
    public TDispatchThirdpartyAgentBuildRecord setPipelineId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.PIPELINE_ID</code>.
     */
    public String getPipelineId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.BUILD_ID</code>.
     */
    public TDispatchThirdpartyAgentBuildRecord setBuildId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.BUILD_ID</code>.
     */
    public String getBuildId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.VM_SEQ_ID</code>.
     */
    public TDispatchThirdpartyAgentBuildRecord setVmSeqId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.VM_SEQ_ID</code>.
     */
    public String getVmSeqId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.STATUS</code>.
     */
    public TDispatchThirdpartyAgentBuildRecord setStatus(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.STATUS</code>.
     */
    public Integer getStatus() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.CREATED_TIME</code>.
     */
    public TDispatchThirdpartyAgentBuildRecord setCreatedTime(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.CREATED_TIME</code>.
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.UPDATED_TIME</code>.
     */
    public TDispatchThirdpartyAgentBuildRecord setUpdatedTime(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.UPDATED_TIME</code>.
     */
    public LocalDateTime getUpdatedTime() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.WORKSPACE</code>.
     */
    public TDispatchThirdpartyAgentBuildRecord setWorkspace(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.WORKSPACE</code>.
     */
    public String getWorkspace() {
        return (String) get(9);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.BUILD_NUM</code>.
     */
    public TDispatchThirdpartyAgentBuildRecord setBuildNum(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.BUILD_NUM</code>.
     */
    public Integer getBuildNum() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.PIPELINE_NAME</code>.
     */
    public TDispatchThirdpartyAgentBuildRecord setPipelineName(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.PIPELINE_NAME</code>.
     */
    public String getPipelineName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.TASK_NAME</code>.
     */
    public TDispatchThirdpartyAgentBuildRecord setTaskName(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_THIRDPARTY_AGENT_BUILD.TASK_NAME</code>.
     */
    public String getTaskName() {
        return (String) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, String, String, Integer, LocalDateTime, LocalDateTime, String, Integer, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, String, String, Integer, LocalDateTime, LocalDateTime, String, Integer, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD.AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD.PIPELINE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD.BUILD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD.VM_SEQ_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field9() {
        return TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD.UPDATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD.WORKSPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD.BUILD_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD.PIPELINE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD.TASK_NAME;
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
        return getAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPipelineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBuildId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getVmSeqId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value9() {
        return getUpdatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getWorkspace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getBuildNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPipelineName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getTaskName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord value2(String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord value3(String value) {
        setAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord value4(String value) {
        setPipelineId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord value5(String value) {
        setBuildId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord value6(String value) {
        setVmSeqId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord value7(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord value8(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord value9(LocalDateTime value) {
        setUpdatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord value10(String value) {
        setWorkspace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord value11(Integer value) {
        setBuildNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord value12(String value) {
        setPipelineName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord value13(String value) {
        setTaskName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchThirdpartyAgentBuildRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Integer value7, LocalDateTime value8, LocalDateTime value9, String value10, Integer value11, String value12, String value13) {
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
     * Create a detached TDispatchThirdpartyAgentBuildRecord
     */
    public TDispatchThirdpartyAgentBuildRecord() {
        super(TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD);
    }

    /**
     * Create a detached, initialised TDispatchThirdpartyAgentBuildRecord
     */
    public TDispatchThirdpartyAgentBuildRecord(Integer id, String projectId, String agentId, String pipelineId, String buildId, String vmSeqId, Integer status, LocalDateTime createdTime, LocalDateTime updatedTime, String workspace, Integer buildNum, String pipelineName, String taskName) {
        super(TDispatchThirdpartyAgentBuild.T_DISPATCH_THIRDPARTY_AGENT_BUILD);

        set(0, id);
        set(1, projectId);
        set(2, agentId);
        set(3, pipelineId);
        set(4, buildId);
        set(5, vmSeqId);
        set(6, status);
        set(7, createdTime);
        set(8, updatedTime);
        set(9, workspace);
        set(10, buildNum);
        set(11, pipelineName);
        set(12, taskName);
    }
}
