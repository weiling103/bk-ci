/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.ticket.tables.records;


import com.tencent.devops.model.ticket.tables.TCertEnterprise;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Record2;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCertEnterpriseRecord extends UpdatableRecordImpl<TCertEnterpriseRecord> implements Record10<String, String, String, byte[], String, String, String, LocalDateTime, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -1193429631;

    /**
     * Setter for <code>devops_ticket.T_CERT_ENTERPRISE.PROJECT_ID</code>.
     */
    public TCertEnterpriseRecord setProjectId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT_ENTERPRISE.PROJECT_ID</code>.
     */
    public String getProjectId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_ID</code>.
     */
    public TCertEnterpriseRecord setCertId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_ID</code>.
     */
    public String getCertId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_MP_FILE_NAME</code>.
     */
    public TCertEnterpriseRecord setCertMpFileName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_MP_FILE_NAME</code>.
     */
    public String getCertMpFileName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_MP_FILE_CONTENT</code>.
     */
    public TCertEnterpriseRecord setCertMpFileContent(byte... value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_MP_FILE_CONTENT</code>.
     */
    public byte[] getCertMpFileContent() {
        return (byte[]) get(3);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_DEVELOPER_NAME</code>.
     */
    public TCertEnterpriseRecord setCertDeveloperName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_DEVELOPER_NAME</code>.
     */
    public String getCertDeveloperName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_TEAM_NAME</code>.
     */
    public TCertEnterpriseRecord setCertTeamName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_TEAM_NAME</code>.
     */
    public String getCertTeamName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_UUID</code>.
     */
    public TCertEnterpriseRecord setCertUuid(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_UUID</code>.
     */
    public String getCertUuid() {
        return (String) get(6);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_UPDATE_TIME</code>.
     */
    public TCertEnterpriseRecord setCertUpdateTime(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_UPDATE_TIME</code>.
     */
    public LocalDateTime getCertUpdateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_EXPIRE_DATE</code>.
     */
    public TCertEnterpriseRecord setCertExpireDate(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_EXPIRE_DATE</code>.
     */
    public LocalDateTime getCertExpireDate() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_CREATE_TIME</code>.
     */
    public TCertEnterpriseRecord setCertCreateTime(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT_ENTERPRISE.CERT_CREATE_TIME</code>.
     */
    public LocalDateTime getCertCreateTime() {
        return (LocalDateTime) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, byte[], String, String, String, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, byte[], String, String, String, LocalDateTime, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TCertEnterprise.T_CERT_ENTERPRISE.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TCertEnterprise.T_CERT_ENTERPRISE.CERT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TCertEnterprise.T_CERT_ENTERPRISE.CERT_MP_FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field4() {
        return TCertEnterprise.T_CERT_ENTERPRISE.CERT_MP_FILE_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TCertEnterprise.T_CERT_ENTERPRISE.CERT_DEVELOPER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TCertEnterprise.T_CERT_ENTERPRISE.CERT_TEAM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TCertEnterprise.T_CERT_ENTERPRISE.CERT_UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return TCertEnterprise.T_CERT_ENTERPRISE.CERT_UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field9() {
        return TCertEnterprise.T_CERT_ENTERPRISE.CERT_EXPIRE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field10() {
        return TCertEnterprise.T_CERT_ENTERPRISE.CERT_CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCertId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCertMpFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value4() {
        return getCertMpFileContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCertDeveloperName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCertTeamName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCertUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getCertUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value9() {
        return getCertExpireDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value10() {
        return getCertCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertEnterpriseRecord value1(String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertEnterpriseRecord value2(String value) {
        setCertId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertEnterpriseRecord value3(String value) {
        setCertMpFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertEnterpriseRecord value4(byte... value) {
        setCertMpFileContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertEnterpriseRecord value5(String value) {
        setCertDeveloperName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertEnterpriseRecord value6(String value) {
        setCertTeamName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertEnterpriseRecord value7(String value) {
        setCertUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertEnterpriseRecord value8(LocalDateTime value) {
        setCertUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertEnterpriseRecord value9(LocalDateTime value) {
        setCertExpireDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertEnterpriseRecord value10(LocalDateTime value) {
        setCertCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertEnterpriseRecord values(String value1, String value2, String value3, byte[] value4, String value5, String value6, String value7, LocalDateTime value8, LocalDateTime value9, LocalDateTime value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCertEnterpriseRecord
     */
    public TCertEnterpriseRecord() {
        super(TCertEnterprise.T_CERT_ENTERPRISE);
    }

    /**
     * Create a detached, initialised TCertEnterpriseRecord
     */
    public TCertEnterpriseRecord(String projectId, String certId, String certMpFileName, byte[] certMpFileContent, String certDeveloperName, String certTeamName, String certUuid, LocalDateTime certUpdateTime, LocalDateTime certExpireDate, LocalDateTime certCreateTime) {
        super(TCertEnterprise.T_CERT_ENTERPRISE);

        set(0, projectId);
        set(1, certId);
        set(2, certMpFileName);
        set(3, certMpFileContent);
        set(4, certDeveloperName);
        set(5, certTeamName);
        set(6, certUuid);
        set(7, certUpdateTime);
        set(8, certExpireDate);
        set(9, certCreateTime);
    }
}
