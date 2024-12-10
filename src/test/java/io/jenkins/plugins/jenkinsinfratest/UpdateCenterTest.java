package io.jenkins.plugins.jenkinsinfratest;

import io.jenkins.plugins.casc.misc.ConfiguredWithCode;
import io.jenkins.plugins.casc.misc.JenkinsConfiguredWithCodeRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class UpdateCenterTest {
    @Rule
    public JenkinsConfiguredWithCodeRule j = new JenkinsConfiguredWithCodeRule();

    @Before
    public void prepare() throws Exception {
        j.jenkins.getUpdateCenter().updateAllSites();
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test2() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test3() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test4() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test5() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test6() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test7() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test8() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test9() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test10() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test11() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test12() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test13() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test14() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test15() throws Exception {
    }

    @ConfiguredWithCode("configuration-as-code.yml")
    @Test
    public void test16() throws Exception {
    }
}
