/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.repository;


import com.tencent.devops.model.repository.tables.TRepository;
import com.tencent.devops.model.repository.tables.TRepositoryCodeGit;
import com.tencent.devops.model.repository.tables.TRepositoryCodeGitlab;
import com.tencent.devops.model.repository.tables.TRepositoryCodeP4;
import com.tencent.devops.model.repository.tables.TRepositoryCodeSvn;
import com.tencent.devops.model.repository.tables.TRepositoryCommit;
import com.tencent.devops.model.repository.tables.TRepositoryGithub;
import com.tencent.devops.model.repository.tables.TRepositoryGithubToken;
import com.tencent.devops.model.repository.tables.TRepositoryGithubWhitelist;
import com.tencent.devops.model.repository.tables.TRepositoryGtiToken;


/**
 * Convenience access to all tables in devops_repository
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>devops_repository.T_REPOSITORY</code>.
     */
    public static final TRepository T_REPOSITORY = com.tencent.devops.model.repository.tables.TRepository.T_REPOSITORY;

    /**
     * The table <code>devops_repository.T_REPOSITORY_CODE_GIT</code>.
     */
    public static final TRepositoryCodeGit T_REPOSITORY_CODE_GIT = com.tencent.devops.model.repository.tables.TRepositoryCodeGit.T_REPOSITORY_CODE_GIT;

    /**
     * The table <code>devops_repository.T_REPOSITORY_CODE_GITLAB</code>.
     */
    public static final TRepositoryCodeGitlab T_REPOSITORY_CODE_GITLAB = com.tencent.devops.model.repository.tables.TRepositoryCodeGitlab.T_REPOSITORY_CODE_GITLAB;

    /**
     * The table <code>devops_repository.T_REPOSITORY_CODE_P4</code>.
     */
    public static final TRepositoryCodeP4 T_REPOSITORY_CODE_P4 = com.tencent.devops.model.repository.tables.TRepositoryCodeP4.T_REPOSITORY_CODE_P4;

    /**
     * The table <code>devops_repository.T_REPOSITORY_CODE_SVN</code>.
     */
    public static final TRepositoryCodeSvn T_REPOSITORY_CODE_SVN = com.tencent.devops.model.repository.tables.TRepositoryCodeSvn.T_REPOSITORY_CODE_SVN;

    /**
     * The table <code>devops_repository.T_REPOSITORY_COMMIT</code>.
     */
    public static final TRepositoryCommit T_REPOSITORY_COMMIT = com.tencent.devops.model.repository.tables.TRepositoryCommit.T_REPOSITORY_COMMIT;

    /**
     * The table <code>devops_repository.T_REPOSITORY_GITHUB</code>.
     */
    public static final TRepositoryGithub T_REPOSITORY_GITHUB = com.tencent.devops.model.repository.tables.TRepositoryGithub.T_REPOSITORY_GITHUB;

    /**
     * The table <code>devops_repository.T_REPOSITORY_GITHUB_TOKEN</code>.
     */
    public static final TRepositoryGithubToken T_REPOSITORY_GITHUB_TOKEN = com.tencent.devops.model.repository.tables.TRepositoryGithubToken.T_REPOSITORY_GITHUB_TOKEN;

    /**
     * The table <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST</code>.
     */
    public static final TRepositoryGithubWhitelist T_REPOSITORY_GITHUB_WHITELIST = com.tencent.devops.model.repository.tables.TRepositoryGithubWhitelist.T_REPOSITORY_GITHUB_WHITELIST;

    /**
     * The table <code>devops_repository.T_REPOSITORY_GTI_TOKEN</code>.
     */
    public static final TRepositoryGtiToken T_REPOSITORY_GTI_TOKEN = com.tencent.devops.model.repository.tables.TRepositoryGtiToken.T_REPOSITORY_GTI_TOKEN;
}
