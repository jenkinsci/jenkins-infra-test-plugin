package io.jenkins.plugins.jenkinsinfratest.jenkins76192;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.EnvVars;
import hudson.Extension;
import hudson.model.EnvironmentSpecific;
import hudson.model.Node;
import hudson.model.TaskListener;
import hudson.slaves.NodeSpecific;
import hudson.tools.ToolDescriptor;
import hudson.tools.ToolInstallation;
import hudson.tools.ToolInstaller;
import hudson.tools.ToolProperty;
import hudson.util.FormValidation;
import java.io.File;
import java.io.IOException;
import java.io.Serial;
import java.util.Collections;
import java.util.List;
import org.kohsuke.stapler.DataBoundConstructor;

public class SonargraphBuild extends ToolInstallation
        implements NodeSpecific<SonargraphBuild>, EnvironmentSpecific<SonargraphBuild> {
    @Serial
    private static final long serialVersionUID = 1L;

    public SonargraphBuild(final String name, final String home) {
        super(name, home, Collections.emptyList());
    }

    @DataBoundConstructor
    public SonargraphBuild(final String name, final String home, final List<? extends ToolProperty<?>> properties) {
        super(name, home, properties);
    }

    @Override
    public @NonNull SonargraphBuild forNode(final @NonNull Node node, final TaskListener log)
            throws IOException, InterruptedException {
        return new SonargraphBuild(getName(), translateFor(node, log));
    }

    @Override
    public SonargraphBuild forEnvironment(final EnvVars environment) {
        return new SonargraphBuild(getName(), environment.expand(getHome()));
    }

    @Extension
    public static class DescriptorImpl extends ToolDescriptor<SonargraphBuild> {
        public DescriptorImpl() {
            super();
            load();
        }

        @Override
        public List<? extends ToolInstaller> getDefaultInstallers() {
            return Collections.emptyList();
        }

        @Override
        public void setInstallations(final SonargraphBuild... installations) {
            super.setInstallations(installations);
            save();
        }

        @Override
        protected FormValidation checkHomeDirectory(final File home) {
            return super.checkHomeDirectory(home);
        }

        @Override
        public @NonNull String getDisplayName() {
            return "Sonargraph Build";
        }
    }
}
