package io.jenkins.plugins.jenkinsinfratest;

import io.jenkins.plugins.casc.misc.ConfiguredWithCode;
import io.jenkins.plugins.casc.misc.JenkinsConfiguredWithCodeRule;
import org.junit.Rule;
import org.junit.Test;

public class UpdateCenterTest {
    @Rule
    public JenkinsConfiguredWithCodeRule j = new JenkinsConfiguredWithCodeRule();

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test() throws Exception {
        j.jenkins.getUpdateCenter().updateAllSites();
    }
}
