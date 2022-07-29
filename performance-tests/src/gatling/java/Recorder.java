import scala.Option;

import java.nio.file.Path;

import io.gatling.recorder.GatlingRecorder;
import io.gatling.recorder.config.RecorderPropertiesBuilder;

public class Recorder {

  public static void main(String[] args) {
    RecorderPropertiesBuilder props = new RecorderPropertiesBuilder()
      .simulationsFolder(IDEPathHelper.gradleSourcesDirectory.toString())
      .resourcesFolder(IDEPathHelper.gradleResourcesDirectory.toString())
      .simulationPackage("computerdatabase")
      .simulationFormatJava();

    GatlingRecorder.fromMap(props.build(), Option.apply(IDEPathHelper.recorderConfigFile));
  }

}