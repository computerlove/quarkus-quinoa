package io.quarkiverse.quinoa.test;

import io.quarkiverse.quinoa.deployment.testing.QuinoaQuarkusUnitTest;
import io.quarkus.test.QuarkusUnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

public class QuinoaPackageManagerNPMOverrideBuildEnvTest {
    private static final String npm_run_build2 = "npm run build2";
    @RegisterExtension
    static final QuarkusUnitTest config = QuinoaQuarkusUnitTest.create().toQuarkusUnitTest()
            .overrideConfigKey("quarkus.quinoa.force-install", "true")
            .overrideConfigKey("quarkus.quinoa.package-manager-commands.build", npm_run_build2)
            .overrideConfigKey("quarkus.quinoa.package-manager-commands.build-env.BUILD", "devolup")
            .assertLogRecords(l -> {
                assertThat(l).anySatisfy(s -> {
                    assertThat(s.getMessage()).isEqualTo("Running Quinoa package manager build command: %s");
                    assertThat(s.getParameters()[0]).isEqualTo(npm_run_build2);
                });
            });

    @Test
    public void testQuinoa() {
        assertThat(Path.of("target/quinoa-build/index.html")).isRegularFile()
                .hasContent("devolup");
        assertThat(Path.of("src/test/webui/node_modules/installed")).isRegularFile()
                .hasContent("hello");
    }

}
