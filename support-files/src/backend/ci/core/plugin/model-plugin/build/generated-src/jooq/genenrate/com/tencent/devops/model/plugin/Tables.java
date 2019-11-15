/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.plugin;


import com.tencent.devops.model.plugin.tables.TJingangMeta;
import com.tencent.devops.model.plugin.tables.TPluginCodecc;
import com.tencent.devops.model.plugin.tables.TPluginCodeccElement;
import com.tencent.devops.model.plugin.tables.TPluginGcloudConf;
import com.tencent.devops.model.plugin.tables.TPluginGitCheck;
import com.tencent.devops.model.plugin.tables.TPluginGithubCheck;
import com.tencent.devops.model.plugin.tables.TPluginJingang;
import com.tencent.devops.model.plugin.tables.TPluginJingangResult;
import com.tencent.devops.model.plugin.tables.TPluginTaskData;
import com.tencent.devops.model.plugin.tables.TPluginTgitGroupStat;
import com.tencent.devops.model.plugin.tables.TPluginThirdpartyAgent;
import com.tencent.devops.model.plugin.tables.TPluginWetestEamilGroup;
import com.tencent.devops.model.plugin.tables.TPluginWetestInstResult;
import com.tencent.devops.model.plugin.tables.TPluginWetestTask;
import com.tencent.devops.model.plugin.tables.TPluginWetestTaskInst;
import com.tencent.devops.model.plugin.tables.TPluginZhiyunProduct;
import com.tencent.devops.model.plugin.tables.TestCodeccData;


/**
 * Convenience access to all tables in devops_plugin
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * VIEW
     */
    public static final TestCodeccData TEST_CODECC_DATA = com.tencent.devops.model.plugin.tables.TestCodeccData.TEST_CODECC_DATA;

    /**
     * The table <code>devops_plugin.T_JINGANG_META</code>.
     */
    public static final TJingangMeta T_JINGANG_META = com.tencent.devops.model.plugin.tables.TJingangMeta.T_JINGANG_META;

    /**
     * The table <code>devops_plugin.T_PLUGIN_CODECC</code>.
     */
    public static final TPluginCodecc T_PLUGIN_CODECC = com.tencent.devops.model.plugin.tables.TPluginCodecc.T_PLUGIN_CODECC;

    /**
     * The table <code>devops_plugin.T_PLUGIN_CODECC_ELEMENT</code>.
     */
    public static final TPluginCodeccElement T_PLUGIN_CODECC_ELEMENT = com.tencent.devops.model.plugin.tables.TPluginCodeccElement.T_PLUGIN_CODECC_ELEMENT;

    /**
     * The table <code>devops_plugin.T_PLUGIN_GCLOUD_CONF</code>.
     */
    public static final TPluginGcloudConf T_PLUGIN_GCLOUD_CONF = com.tencent.devops.model.plugin.tables.TPluginGcloudConf.T_PLUGIN_GCLOUD_CONF;

    /**
     * The table <code>devops_plugin.T_PLUGIN_GITHUB_CHECK</code>.
     */
    public static final TPluginGithubCheck T_PLUGIN_GITHUB_CHECK = com.tencent.devops.model.plugin.tables.TPluginGithubCheck.T_PLUGIN_GITHUB_CHECK;

    /**
     * The table <code>devops_plugin.T_PLUGIN_GIT_CHECK</code>.
     */
    public static final TPluginGitCheck T_PLUGIN_GIT_CHECK = com.tencent.devops.model.plugin.tables.TPluginGitCheck.T_PLUGIN_GIT_CHECK;

    /**
     * The table <code>devops_plugin.T_PLUGIN_JINGANG</code>.
     */
    public static final TPluginJingang T_PLUGIN_JINGANG = com.tencent.devops.model.plugin.tables.TPluginJingang.T_PLUGIN_JINGANG;

    /**
     * The table <code>devops_plugin.T_PLUGIN_JINGANG_RESULT</code>.
     */
    public static final TPluginJingangResult T_PLUGIN_JINGANG_RESULT = com.tencent.devops.model.plugin.tables.TPluginJingangResult.T_PLUGIN_JINGANG_RESULT;

    /**
     * The table <code>devops_plugin.T_PLUGIN_TASK_DATA</code>.
     */
    public static final TPluginTaskData T_PLUGIN_TASK_DATA = com.tencent.devops.model.plugin.tables.TPluginTaskData.T_PLUGIN_TASK_DATA;

    /**
     * 插件代码库统计信息表
     */
    public static final TPluginTgitGroupStat T_PLUGIN_TGIT_GROUP_STAT = com.tencent.devops.model.plugin.tables.TPluginTgitGroupStat.T_PLUGIN_TGIT_GROUP_STAT;

    /**
     * The table <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT</code>.
     */
    public static final TPluginThirdpartyAgent T_PLUGIN_THIRDPARTY_AGENT = com.tencent.devops.model.plugin.tables.TPluginThirdpartyAgent.T_PLUGIN_THIRDPARTY_AGENT;

    /**
     * The table <code>devops_plugin.T_PLUGIN_WETEST_EAMIL_GROUP</code>.
     */
    public static final TPluginWetestEamilGroup T_PLUGIN_WETEST_EAMIL_GROUP = com.tencent.devops.model.plugin.tables.TPluginWetestEamilGroup.T_PLUGIN_WETEST_EAMIL_GROUP;

    /**
     * The table <code>devops_plugin.T_PLUGIN_WETEST_INST_RESULT</code>.
     */
    public static final TPluginWetestInstResult T_PLUGIN_WETEST_INST_RESULT = com.tencent.devops.model.plugin.tables.TPluginWetestInstResult.T_PLUGIN_WETEST_INST_RESULT;

    /**
     * The table <code>devops_plugin.T_PLUGIN_WETEST_TASK</code>.
     */
    public static final TPluginWetestTask T_PLUGIN_WETEST_TASK = com.tencent.devops.model.plugin.tables.TPluginWetestTask.T_PLUGIN_WETEST_TASK;

    /**
     * The table <code>devops_plugin.T_PLUGIN_WETEST_TASK_INST</code>.
     */
    public static final TPluginWetestTaskInst T_PLUGIN_WETEST_TASK_INST = com.tencent.devops.model.plugin.tables.TPluginWetestTaskInst.T_PLUGIN_WETEST_TASK_INST;

    /**
     * The table <code>devops_plugin.T_PLUGIN_ZHIYUN_PRODUCT</code>.
     */
    public static final TPluginZhiyunProduct T_PLUGIN_ZHIYUN_PRODUCT = com.tencent.devops.model.plugin.tables.TPluginZhiyunProduct.T_PLUGIN_ZHIYUN_PRODUCT;
}
