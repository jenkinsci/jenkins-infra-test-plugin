package io.jenkins.plugins.jenkinsinfratest;

import hudson.model.TaskListener;
import hudson.tools.DownloadFromUrlInstaller;
import io.jenkins.plugins.jenkinsinfratest.jenkins76192.SonargraphBuild;
import io.jenkins.plugins.jenkinsinfratest.jenkins76192.SonargraphBuildInstaller;
import jenkins.model.Jenkins;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.junit.jupiter.WithJenkins;

@WithJenkins
public class Jenkins76192Test {
    private JenkinsRule j;

    @BeforeEach
    void before(JenkinsRule rule) {
        j = rule;
    }

    @ParameterizedTest
    @ValueSource(
            strings = {
//                "SonargraphBuild-13.0.0.796_2023-06-15.zip",
//                "SonargraphBuild-13.0.0.797_2023-06-20.zip",
//                "SonargraphBuild-13.0.0.798_2023-06-30.zip",
//                "SonargraphBuild-13.0.0.800_2023-07-06.zip",
//                "SonargraphBuild-13.0.1.801_2023-07-13.zip",
//                "SonargraphBuild-13.0.1.802_2023-07-19.zip",
//                "SonargraphBuild-13.0.1.803_2023-07-27.zip",
//                "SonargraphBuild-13.0.1.804_2023-08-08.zip",
//                "SonargraphBuild-13.0.1.805_2023-08-15.zip",
//                "SonargraphBuild-13.0.1.807_2023-08-18.zip",
//                "SonargraphBuild-13.0.1.808_2023-08-20.zip",
//                "SonargraphBuild-13.0.1.809_2023-08-22.zip",
//                "SonargraphBuild-13.0.1.810_2023-08-23.zip",
//                "SonargraphBuild-13.0.1.811_2023-08-24.zip",
//                "SonargraphBuild-13.0.1.812_2023-08-25.zip",
//                "SonargraphBuild-13.0.1.813_2023-08-30.zip",
//                "SonargraphBuild-13.0.2.815_2023-09-12.zip",
//                "SonargraphBuild-13.0.3.816_2023-09-20.zip",
//                "SonargraphBuild-13.1.0.817_2023-10-02.zip",
//                "SonargraphBuild-13.1.0.818_2023-10-04.zip",
//                "SonargraphBuild-13.2.0.819_2023-10-07.zip",
//                "SonargraphBuild-13.2.0.820_2023-10-13.zip",
//                "SonargraphBuild-13.2.0.821_2023-10-20.zip",
//                "SonargraphBuild-13.3.0.822_2023-10-24.zip",
//                "SonargraphBuild-13.3.0.823_2023-10-25.zip",
//                "SonargraphBuild-13.3.0.824_2023-10-31.zip",
//                "SonargraphBuild-13.3.0.825_2023-11-01.zip",
//                "SonargraphBuild-13.3.0.826_2023-11-03.zip",
//                "SonargraphBuild-13.3.0.827_2023-11-21.zip",
//                "SonargraphBuild-13.3.0.828_2023-11-27.zip",
//                "SonargraphBuild-13.3.0.829_2023-11-28.zip",
//                "SonargraphBuild-13.3.0.830_2023-11-29.zip",
//                "SonargraphBuild-13.3.0.831_2023-12-04.zip",
//                "SonargraphBuild-13.3.0.832_2023-12-11.zip",
//                "SonargraphBuild-13.3.0.833_2024-01-19.zip",
//                "SonargraphBuild-13.3.1.835_2024-01-25.zip",
//                "SonargraphBuild-13.4.0.836_2024-02-09.zip",
//                "SonargraphBuild-13.4.0.837_2024-02-23.zip",
//                "SonargraphBuild-13.5.0.838_2024-03-06.zip",
//                "SonargraphBuild-13.5.0.839_2024-03-07.zip",
//                "SonargraphBuild-13.5.0.840_2024-03-14.zip",
//                "SonargraphBuild-13.5.0.841_2024-03-18.zip",
//                "SonargraphBuild-13.5.1.842_2024-04-11.zip",
//                "SonargraphBuild-13.5.2.843_2024-04-19.zip",
//                "SonargraphBuild-13.5.2.844_2024-05-01.zip",
//                "SonargraphBuild-13.5.2.845_2024-05-14.zip",
//                "SonargraphBuild-13.5.2.846_2024-05-15.zip",
//                "SonargraphBuild-13.5.2.847_2024-05-24.zip",
//                "SonargraphBuild-13.5.2.848_2024-05-28.zip",
//                "SonargraphBuild-13.5.2.849_2024-06-05.zip",
//                "SonargraphBuild-14.0.0.850_2024-07-04.zip",
//                "SonargraphBuild-14.0.0.851_2024-07-08.zip",
//                "SonargraphBuild-14.0.0.852_2024-07-09.zip",
//                "SonargraphBuild-14.0.0.853_2024-07-17.zip",
//                "SonargraphBuild-14.0.0.854_2024-07-23.zip",
//                "SonargraphBuild-14.0.1.855_2024-08-02.zip",
//                "SonargraphBuild-14.0.1.856_2024-08-09.zip",
//                "SonargraphBuild-14.0.1.857_2024-08-26.zip",
//                "SonargraphBuild-14.0.1.858_2024-08-29.zip",
//                "SonargraphBuild-14.0.1.859_2024-09-13.zip",
//                "SonargraphBuild-14.0.1.860_2024-09-23.zip",
//                "SonargraphBuild-14.0.1.861_2024-09-24.zip",
//                "SonargraphBuild-14.0.1.862_2024-10-02.zip",
//                "SonargraphBuild-14.0.1.863_2024-10-18.zip",
//                "SonargraphBuild-14.0.1.864_2024-10-29.zip",
//                "SonargraphBuild-14.0.1.865_2024-11-07.zip",
//                "SonargraphBuild-14.0.1.866_2024-11-14.zip",
//                "SonargraphBuild-14.0.1.867_2024-11-25.zip",
//                "SonargraphBuild-14.0.1.868_2024-12-05.zip",
//                "SonargraphBuild-15.0.0.103_2024-12-06.zip",
//                "SonargraphBuild-15.0.0.105_2024-12-06.zip",
//                "SonargraphBuild-15.0.0.106_2024-12-06.zip",
//                "SonargraphBuild-15.0.1.107_2025-01-09.zip",
//                "SonargraphBuild-15.0.2.108_2025-01-13.zip",
//                "SonargraphBuild-15.0.3.109_2025-01-22.zip",
//                "SonargraphBuild-15.0.3.110_2025-01-30.zip",
//                "SonargraphBuild-15.0.3.111_2025-01-31.zip",
//                "SonargraphBuild-15.0.4.112_2025-02-10.zip",
//                "SonargraphBuild-15.0.5.114_2025-02-14.zip",
//                "SonargraphBuild-15.0.5.115_2025-02-19.zip",
//                "SonargraphBuild-15.0.5.116_2025-02-20.zip",
//                "SonargraphBuild-15.0.5.117_2025-03-02.zip",
//                "SonargraphBuild-15.0.6.118_2025-03-10.zip",
//                "SonargraphBuild-15.0.6.119_2025-03-11.zip",
//                "SonargraphBuild-15.0.6.120_2025-03-13.zip",
//                "SonargraphBuild-15.0.6.121_2025-03-16.zip",
//                "SonargraphBuild-15.0.6.122_2025-03-20.zip",
//                "SonargraphBuild-15.0.6.123_2025-03-24.zip",
//                "SonargraphBuild-15.0.6.125_2025-03-26.zip",
//                "SonargraphBuild-15.0.6.126_2025-03-27.zip",
//                "SonargraphBuild-15.0.6.127_2025-04-04.zip",
//                "SonargraphBuild-15.0.6.128_2025-04-11.zip",
//                "SonargraphBuild-15.0.6.130_2025-04-22.zip",
//                "SonargraphBuild-15.0.6.132_2025-04-25.zip",
//                "SonargraphBuild-15.1.0.133_2025-05-01.zip",
//                "SonargraphBuild-15.1.1.134_2025-05-13.zip",
//                "SonargraphBuild-15.1.2.135_2025-05-24.zip",
//                "SonargraphBuild-15.1.2.136_2025-05-29.zip",
//                "SonargraphBuild-15.1.2.138_2025-05-30.zip",
//                "SonargraphBuild-15.2.0.139_2025-06-09.zip",
//                "SonargraphBuild-15.2.0.140_2025-06-11.zip",
//                "SonargraphBuild-15.3.0.141_2025-07-02.zip",
//                "SonargraphBuild-15.3.0.143_2025-07-14.zip",
//                "SonargraphBuild-15.3.0.144_2025-07-16.zip",
//                "SonargraphBuild-15.3.0.144_2025-07-16.zip",
//                "SonargraphBuild-15.4.0.146_2025-07-23.zip",
                "SonargraphBuild-15.4.0.148_2025-07-28.zip",
                "SonargraphBuild-15.4.0.149_2025-09-03.zip",
                "SonargraphBuild-15.4.0.150_2025-09-04.zip",
                "SonargraphBuild-15.4.1.151_2025-09-16.zip",
                "SonargraphBuild-15.4.2.152_2025-09-19.zip",
                "SonargraphBuild-15.4.2.153_2025-09-23.zip",
                "SonargraphBuild-15.4.2.154_2025-09-29.zip",
                "SonargraphBuild-15.4.3.155_2025-10-02.zip",
                "SonargraphBuild-15.4.3.155_2025-10-02.zip",
                "SonargraphBuild-15.5.0.156_2025-10-10.zip",
                "SonargraphBuild-15.5.0.157_2025-10-13.zip",
                "SonargraphBuild-15.5.0.159_2025-10-14.zip"
            })
    public void jenkins76192Test(String filename) throws Exception {
        final DownloadFromUrlInstaller.Installable installable = new DownloadFromUrlInstaller.Installable();
        installable.id = filename;
        installable.url = "https://eclipse.hello2morrow.com/jenkins/sonargraphBuild/" + filename;
        installable.name = filename;
        final SonargraphBuildInstaller installer = new SonargraphBuildInstaller(installable);
        installer.performInstallation(new SonargraphBuild("sonargraphBuild", null), Jenkins.get(), TaskListener.NULL);
    }
}
