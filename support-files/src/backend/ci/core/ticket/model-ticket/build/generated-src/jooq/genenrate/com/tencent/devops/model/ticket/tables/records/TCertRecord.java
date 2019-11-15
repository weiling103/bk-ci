/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.ticket.tables.records;


import com.tencent.devops.model.ticket.tables.TCert;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCertRecord extends UpdatableRecordImpl<TCertRecord> implements Record20<String, String, String, String, String, String, byte[], String, byte[], String, byte[], String, String, String, String, String, LocalDateTime, LocalDateTime, LocalDateTime, String> {

    private static final long serialVersionUID = 2100839369;

    /**
     * Setter for <code>devops_ticket.T_CERT.PROJECT_ID</code>.
     */
    public TCertRecord setProjectId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.PROJECT_ID</code>.
     */
    public String getProjectId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_ID</code>.
     */
    public TCertRecord setCertId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_ID</code>.
     */
    public String getCertId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_USER_ID</code>.
     */
    public TCertRecord setCertUserId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_USER_ID</code>.
     */
    public String getCertUserId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_TYPE</code>.
     */
    public TCertRecord setCertType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_TYPE</code>.
     */
    public String getCertType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_REMARK</code>.
     */
    public TCertRecord setCertRemark(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_REMARK</code>.
     */
    public String getCertRemark() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_P12_FILE_NAME</code>.
     */
    public TCertRecord setCertP12FileName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_P12_FILE_NAME</code>.
     */
    public String getCertP12FileName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_P12_FILE_CONTENT</code>.
     */
    public TCertRecord setCertP12FileContent(byte... value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_P12_FILE_CONTENT</code>.
     */
    public byte[] getCertP12FileContent() {
        return (byte[]) get(6);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_MP_FILE_NAME</code>.
     */
    public TCertRecord setCertMpFileName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_MP_FILE_NAME</code>.
     */
    public String getCertMpFileName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_MP_FILE_CONTENT</code>.
     */
    public TCertRecord setCertMpFileContent(byte... value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_MP_FILE_CONTENT</code>.
     */
    public byte[] getCertMpFileContent() {
        return (byte[]) get(8);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_JKS_FILE_NAME</code>.
     */
    public TCertRecord setCertJksFileName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_JKS_FILE_NAME</code>.
     */
    public String getCertJksFileName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_JKS_FILE_CONTENT</code>.
     */
    public TCertRecord setCertJksFileContent(byte... value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_JKS_FILE_CONTENT</code>.
     */
    public byte[] getCertJksFileContent() {
        return (byte[]) get(10);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_JKS_ALIAS</code>.
     */
    public TCertRecord setCertJksAlias(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_JKS_ALIAS</code>.
     */
    public String getCertJksAlias() {
        return (String) get(11);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_JKS_ALIAS_CREDENTIAL_ID</code>.
     */
    public TCertRecord setCertJksAliasCredentialId(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_JKS_ALIAS_CREDENTIAL_ID</code>.
     */
    public String getCertJksAliasCredentialId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_DEVELOPER_NAME</code>.
     */
    public TCertRecord setCertDeveloperName(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_DEVELOPER_NAME</code>.
     */
    public String getCertDeveloperName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_TEAM_NAME</code>.
     */
    public TCertRecord setCertTeamName(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_TEAM_NAME</code>.
     */
    public String getCertTeamName() {
        return (String) get(14);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_UUID</code>.
     */
    public TCertRecord setCertUuid(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_UUID</code>.
     */
    public String getCertUuid() {
        return (String) get(15);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_EXPIRE_DATE</code>.
     */
    public TCertRecord setCertExpireDate(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_EXPIRE_DATE</code>.
     */
    public LocalDateTime getCertExpireDate() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_CREATE_TIME</code>.
     */
    public TCertRecord setCertCreateTime(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_CREATE_TIME</code>.
     */
    public LocalDateTime getCertCreateTime() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CERT_UPDATE_TIME</code>.
     */
    public TCertRecord setCertUpdateTime(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CERT_UPDATE_TIME</code>.
     */
    public LocalDateTime getCertUpdateTime() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>devops_ticket.T_CERT.CREDENTIAL_ID</code>.
     */
    public TCertRecord setCredentialId(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>devops_ticket.T_CERT.CREDENTIAL_ID</code>.
     */
    public String getCredentialId() {
        return (String) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<String, String, String, String, String, String, byte[], String, byte[], String, byte[], String, String, String, String, String, LocalDateTime, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<String, String, String, String, String, String, byte[], String, byte[], String, byte[], String, String, String, String, String, LocalDateTime, LocalDateTime, LocalDateTime, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TCert.T_CERT.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TCert.T_CERT.CERT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TCert.T_CERT.CERT_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TCert.T_CERT.CERT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TCert.T_CERT.CERT_REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TCert.T_CERT.CERT_P12_FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field7() {
        return TCert.T_CERT.CERT_P12_FILE_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TCert.T_CERT.CERT_MP_FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field9() {
        return TCert.T_CERT.CERT_MP_FILE_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TCert.T_CERT.CERT_JKS_FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field11() {
        return TCert.T_CERT.CERT_JKS_FILE_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TCert.T_CERT.CERT_JKS_ALIAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TCert.T_CERT.CERT_JKS_ALIAS_CREDENTIAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return TCert.T_CERT.CERT_DEVELOPER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return TCert.T_CERT.CERT_TEAM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return TCert.T_CERT.CERT_UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field17() {
        return TCert.T_CERT.CERT_EXPIRE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field18() {
        return TCert.T_CERT.CERT_CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field19() {
        return TCert.T_CERT.CERT_UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return TCert.T_CERT.CREDENTIAL_ID;
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
        return getCertUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCertType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCertRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCertP12FileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value7() {
        return getCertP12FileContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCertMpFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value9() {
        return getCertMpFileContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCertJksFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value11() {
        return getCertJksFileContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCertJksAlias();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getCertJksAliasCredentialId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getCertDeveloperName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCertTeamName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getCertUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value17() {
        return getCertExpireDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value18() {
        return getCertCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value19() {
        return getCertUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getCredentialId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value1(String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value2(String value) {
        setCertId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value3(String value) {
        setCertUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value4(String value) {
        setCertType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value5(String value) {
        setCertRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value6(String value) {
        setCertP12FileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value7(byte... value) {
        setCertP12FileContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value8(String value) {
        setCertMpFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value9(byte... value) {
        setCertMpFileContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value10(String value) {
        setCertJksFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value11(byte... value) {
        setCertJksFileContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value12(String value) {
        setCertJksAlias(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value13(String value) {
        setCertJksAliasCredentialId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value14(String value) {
        setCertDeveloperName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value15(String value) {
        setCertTeamName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value16(String value) {
        setCertUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value17(LocalDateTime value) {
        setCertExpireDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value18(LocalDateTime value) {
        setCertCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value19(LocalDateTime value) {
        setCertUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord value20(String value) {
        setCredentialId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCertRecord values(String value1, String value2, String value3, String value4, String value5, String value6, byte[] value7, String value8, byte[] value9, String value10, byte[] value11, String value12, String value13, String value14, String value15, String value16, LocalDateTime value17, LocalDateTime value18, LocalDateTime value19, String value20) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCertRecord
     */
    public TCertRecord() {
        super(TCert.T_CERT);
    }

    /**
     * Create a detached, initialised TCertRecord
     */
    public TCertRecord(String projectId, String certId, String certUserId, String certType, String certRemark, String certP12FileName, byte[] certP12FileContent, String certMpFileName, byte[] certMpFileContent, String certJksFileName, byte[] certJksFileContent, String certJksAlias, String certJksAliasCredentialId, String certDeveloperName, String certTeamName, String certUuid, LocalDateTime certExpireDate, LocalDateTime certCreateTime, LocalDateTime certUpdateTime, String credentialId) {
        super(TCert.T_CERT);

        set(0, projectId);
        set(1, certId);
        set(2, certUserId);
        set(3, certType);
        set(4, certRemark);
        set(5, certP12FileName);
        set(6, certP12FileContent);
        set(7, certMpFileName);
        set(8, certMpFileContent);
        set(9, certJksFileName);
        set(10, certJksFileContent);
        set(11, certJksAlias);
        set(12, certJksAliasCredentialId);
        set(13, certDeveloperName);
        set(14, certTeamName);
        set(15, certUuid);
        set(16, certExpireDate);
        set(17, certCreateTime);
        set(18, certUpdateTime);
        set(19, credentialId);
    }
}
