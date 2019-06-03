package edu.zju;

import edu.cwru.jpdg.JPDG;
import edu.cwru.jpdg.pDG_Builder;

public class JPDGDriver {

    public static void main(String[] args) throws pDG_Builder.Error {
        String[] jdk = new String[] {
                "/usr/lib/jvm/java-8-openjdk-amd64/lib/jconsole.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/lib/tools.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/lib/dt.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/lib/sa-jdi.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/zipfs.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/icedtea-sound.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/localedata.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunjce_provider.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/java-atk-wrapper.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunpkcs11.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/dnsns.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/management-agent.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rhino.jar",
                "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/javazic.jar"
        };

        String outputPath = "/home/chenzhi/Code/jpdg_out/jlex.out";
        String baseDir = "/home/chenzhi/Code/JLex.jar";
        String classpath = String.join(":", jdk);
        String labelType = "op";

        JPDG.main(new String[]{"-c", classpath, "-d", baseDir, "-l", labelType, "-o", outputPath});

    }
}
