/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.repository.tables;


import com.tencent.devops.model.repository.DevopsRepository;
import com.tencent.devops.model.repository.Keys;
import com.tencent.devops.model.repository.tables.records.TRepositoryGithubWhitelistRecord;

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
public class TRepositoryGithubWhitelist extends TableImpl<TRepositoryGithubWhitelistRecord> {

    private static final long serialVersionUID = -773910857;

    /**
     * The reference instance of <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST</code>
     */
    public static final TRepositoryGithubWhitelist T_REPOSITORY_GITHUB_WHITELIST = new TRepositoryGithubWhitelist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TRepositoryGithubWhitelistRecord> getRecordType() {
        return TRepositoryGithubWhitelistRecord.class;
    }

    /**
     * The column <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.ID</code>.
     */
    public final TableField<TRepositoryGithubWhitelistRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.PROJECT_ID</code>. 项目ID
     */
    public final TableField<TRepositoryGithubWhitelistRecord, String> PROJECT_ID = createField("PROJECT_ID", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "项目ID");

    /**
     * The column <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.URL</code>. github代码库链接
     */
    public final TableField<TRepositoryGithubWhitelistRecord, String> URL = createField("URL", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "github代码库链接");

    /**
     * The column <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.CREATOR</code>. 创建人
     */
    public final TableField<TRepositoryGithubWhitelistRecord, String> CREATOR = createField("CREATOR", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "创建人");

    /**
     * The column <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.CREATED_TIME</code>. 创建时间
     */
    public final TableField<TRepositoryGithubWhitelistRecord, LocalDateTime> CREATED_TIME = createField("CREATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "创建时间");

    /**
     * Create a <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST</code> table reference
     */
    public TRepositoryGithubWhitelist() {
        this("T_REPOSITORY_GITHUB_WHITELIST", null);
    }

    /**
     * Create an aliased <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST</code> table reference
     */
    public TRepositoryGithubWhitelist(String alias) {
        this(alias, T_REPOSITORY_GITHUB_WHITELIST);
    }

    private TRepositoryGithubWhitelist(String alias, Table<TRepositoryGithubWhitelistRecord> aliased) {
        this(alias, aliased, null);
    }

    private TRepositoryGithubWhitelist(String alias, Table<TRepositoryGithubWhitelistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsRepository.DEVOPS_REPOSITORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TRepositoryGithubWhitelistRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_REPOSITORY_GITHUB_WHITELIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TRepositoryGithubWhitelistRecord> getPrimaryKey() {
        return Keys.KEY_T_REPOSITORY_GITHUB_WHITELIST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TRepositoryGithubWhitelistRecord>> getKeys() {
        return Arrays.<UniqueKey<TRepositoryGithubWhitelistRecord>>asList(Keys.KEY_T_REPOSITORY_GITHUB_WHITELIST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryGithubWhitelist as(String alias) {
        return new TRepositoryGithubWhitelist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TRepositoryGithubWhitelist rename(String name) {
        return new TRepositoryGithubWhitelist(name, null);
    }
}
