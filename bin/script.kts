// Module script for production
import kotlin.modules.*
fun project() {
    module("kara.bootstrap") {
        sources += "/home/erokhins/IdeaProjects/kara-bootstrap/src/kara/bootstrap/Application.kt"
        sources += "/home/erokhins/IdeaProjects/kara-bootstrap/src/kara/bootstrap/styles/DefaultStyles.kt"
        sources += "/home/erokhins/IdeaProjects/kara-bootstrap/src/kara/bootstrap/views/DefaultLayout.kt"
        sources += "/home/erokhins/IdeaProjects/kara-bootstrap/src/kara/bootstrap/routes/Home.kt"
        sources += "/home/erokhins/IdeaProjects/kara-bootstrap/src/kara/bootstrap/views/home/IndexView.kt"
        // Classpath
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/jsse.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/rt.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/jce.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/management-agent.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/rhino.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/resources.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/charsets.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/javazic.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/compilefontconfig.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/java-atk-wrapper.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/localedata.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/sunpkcs11.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/dnsns.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/sunjce_provider.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/zipfs.jar"
        classpath += "/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/pulse-java.jar"
        // Output directory, commented out
        //         classpath += "/home/erokhins/IdeaProjects/kara-bootstrap/bin"
        classpath += "/home/erokhins/IdeaProjects/kara/out/artifacts/kara_dist/lib/kotlin-runtime.jar"
        classpath += "/home/erokhins/IdeaProjects/kara/out/artifacts/kara_dist/modules/core/kara-core.jar"
        // Java Source Roots
        classpath += "/home/erokhins/IdeaProjects/kara-bootstrap/src"
        // External annotations
        annotationsPath += "/home/erokhins/scripts/idea-IU-129.178/lib/jdkAnnotations.jar"
        annotationsPath += "/home/erokhins/.IntelliJIdea12/config/plugins/Kotlin/kotlinc/lib/kotlin-jdk-annotations.jar"
    }
}
