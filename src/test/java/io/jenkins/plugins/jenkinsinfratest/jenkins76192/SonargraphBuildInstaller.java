package io.jenkins.plugins.jenkinsinfratest.jenkins76192;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import hudson.tools.DownloadFromUrlInstaller;
import hudson.tools.ToolInstallation;
import hudson.tools.ToolInstallerDescriptor;

public final class SonargraphBuildInstaller extends DownloadFromUrlInstaller {
    private final Installable installable;

    public SonargraphBuildInstaller(@NonNull final Installable installable) {
        super(installable.id);
        this.installable = installable;
    }

    @Override
    public Installable getInstallable() {
        return this.installable;
    }

    @Extension
    public static final class DescriptorImpl extends ToolInstallerDescriptor<SonargraphBuildInstaller> {
        public DescriptorImpl() {}

        @Override
        public boolean isApplicable(final Class<? extends ToolInstallation> toolType) {
            return toolType == SonargraphBuild.class;
        }

        @Override
        public @NonNull String getDisplayName() {
            return "Install from hello2morrow";
        }
    }
}
