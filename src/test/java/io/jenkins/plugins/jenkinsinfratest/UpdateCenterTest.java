package io.jenkins.plugins.jenkinsinfratest;

import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

public class UpdateCenterTest {
    @Rule
    public JenkinsRule j = new JenkinsRule();

    @Test
    public void test() throws Exception {
        j.jenkins.getUpdateCenter().updateAllSites();
    }
}
