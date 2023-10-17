# Accelerator Log

## Options
```json
{
  "buildTool" : "maven",
  "includeBuildToolWrapper" : true,
  "javaVersion" : "17",
  "nativeBuild" : true,
  "projectName" : "playlist-springboot-service",
  "springBootVersion" : "3.1"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(GeneratorValidationTransform, UniquePath)
┃ ┏ ┏ engine.transformations[0].validated (Combo)
┃ ┃ ┃  Info Combo running as Let
┃ ┃ ┃ engine.transformations[0].validated.delegate (Let)
┃ ┃ ┃ Debug Adding symbol updateBoot3 with value 'true'
┃ ┃ ┃ Debug Adding symbol javaVersion with value '17'
┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Combo, Combo, Combo, Combo, Combo, Combo, Combo, Combo, Combo, Provenance)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo, Combo, Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[0].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[0].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/*]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-native.md matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_intellij matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_vscode matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug grype.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/springboot/HelloControllerTest.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[0].delegate.transformations[1] (Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-native.md matched [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_intellij matched [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_vscode matched [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts didn't match [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml matched [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug grype.yaml matched [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [config/*.yaml, Tiltfile*, README*.md, grype.yaml, catalog/*.yaml, .github/workflows/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, RewritePath, RewritePath, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [Tiltfile*]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-native.md didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [Tiltfile*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_intellij matched [Tiltfile*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_vscode matched [Tiltfile*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug grype.yaml didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [Tiltfile*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [tanzu-java-web-app->playlist-springboot-...(truncated)]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1].delegate.transformations[2] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Condition (#buildTool == 'gradle' && #ide == 'intellij') evaluated to false
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1].delegate.transformations[3] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Condition (#buildTool == 'gradle' && #ide == 'vscode') evaluated to false
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1].delegate.transformations[4] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Exclude
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1].delegate.transformations[4].delegate (Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [Tiltfile_*]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [Tiltfile_*] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_intellij matched [Tiltfile_*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug Tiltfile_gradle_vscode matched [Tiltfile_*] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [config/workload.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-native.md didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_intellij didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_vscode didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug grype.yaml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [: tanzu-java-web-app->: playlist-springboo...(truncated)]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate.transformations[2] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate.transformations[2].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate.transformations[2].delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(InvokeFragment, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate.transformations[2].delegate.transformations[0].sources[0] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate.transformations[2].delegate.transformations[0].sources[0].validated (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#bsGitRepository != null) evaluated to false
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ null ()
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate.transformations[2].delegate.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Include
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate.transformations[2].delegate.transformations[0].sources[1].delegate (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug config/workload.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ ╺ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[2].delegate.transformations[2].delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#nativeBuild) evaluated to true
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [config/workload-native.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-native.md didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_intellij didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_vscode didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml matched [config/workload-native.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug grype.yaml didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [config/workload-native.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [: tanzu-java-web-app->: playlist-springboo...(truncated)]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate.transformations[2] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate.transformations[2].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate.transformations[2].delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(InvokeFragment, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate.transformations[2].delegate.transformations[0].sources[0] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate.transformations[2].delegate.transformations[0].sources[0].validated (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#bsGitRepository != null) evaluated to false
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ null ()
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate.transformations[2].delegate.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Include
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate.transformations[2].delegate.transformations[0].sources[1].delegate (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug config/workload-native.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ ╺ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[3].delegate.transformations[2].delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[4] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[4].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[4].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [catalog/*.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-native.md didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_intellij didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_vscode didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug grype.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[4].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗  Info Will replace [tanzu-java-web-app->playlist-springboot-...(truncated)]
┃ ┃ ┃ ┃ ┃ ┃ ┏ README (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ README.delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ README.delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ README.delegate.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ README.delegate.transformations[0].sources[0].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ README.delegate.transformations[0].sources[0].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [README.md]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-native.md didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [README.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_intellij didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_vscode didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug grype.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ README.delegate.transformations[0].sources[0].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗  Info Will replace [tanzu-java-web-app->playlist-springboot-...(truncated)]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ README.delegate.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#nativeBuild) evaluated to true
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ README.delegate.transformations[0].sources[1].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ README.delegate.transformations[0].sources[1].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [README-native.md]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-native.md matched [README-native.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_intellij didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile_gradle_vscode didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug grype.yaml didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [README-native.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ README.delegate.transformations[0].sources[1].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [tanzu-java-web-app->playlist-springboot-...(truncated)]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ README.delegate.transformations[0].sources[1].delegate.transformations[2] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ Debug Path 'README-native.md' matched '^(?<folder>.*/)?(?<filename>([^/]+?|)(?=(?<ext>\.[^/.]*)?)$)' with groups {ext=.md, folder=null, filename=README-native.md, g0=README-native.md, g1=null, g2=README-native.md, g3=README-native.md, g4=.md} and was rewritten to 'README.md'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ README.delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ Debug Multiple representations for path 'README.md', will concatenate them together
┃ ┃ ┃ ┃ ┗ ╺ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[1].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Include
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[0].delegate (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/main/resources/application.yml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Let
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate (Let)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol workloadJavaVersion with value '17'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo, Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[0].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[0].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [pom.xml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug README.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[0].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗  Info Will replace regex '<java.version>.*<' with '<java.version>17<'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[1].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[1].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [build.gradle]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug README.md didn't match [build.gradle] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[1].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗  Info Will replace regex 'sourceCompatibility = .*' with 'sourceCompatibility ...(truncated)'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[2].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[2].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [build.gradle.kts]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts matched [build.gradle.kts] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug README.md didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[2].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗  Info Will replace regex '(?<unmodified>JavaVersion\.VERSION_)(\d+)' with '${unmodified}17'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[3] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[3].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, OpenRewriteRecipe)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[3].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [config/workload.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug README.md didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ╺ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[3].delegate.transformations[1] (OpenRewriteRecipe)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[4] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[4].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Exclude, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[4].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [config/*.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml matched [config/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug README.md didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[4].delegate.transformations[1] (Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [config/workload.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug config/workload-native.yaml didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[0].sources[4].delegate.transformations[2] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Will replace regex '(?<unmodified>image: bellsoft/liberica-openjdk-\w*:)(\d+)' with '${unmodified}17'
┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ ┗ ╺ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].validated.delegate.in.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'pom.xml', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'build.gradle.kts', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'config/workload.yaml', will use the one appearing last 
┃ ┃ ┃ ┃ ┗ ┗ Debug Multiple representations for path 'config/workload-native.yaml', will use the one appearing last 
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[2] (Combo)
┃ ┃ ┃ ┃ ┗  Info Condition (#buildTool != 'maven') evaluated to false
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[3] (Combo)
┃ ┃ ┃ ┃ ┃  Info Condition (#buildTool == 'maven') evaluated to true
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[3].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[3].delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[3].delegate.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Include
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[3].delegate.transformations[0].sources[0].delegate (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug config/workload-native.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[3].delegate.transformations[0].sources[1] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[3].delegate.transformations[0].sources[1].validated (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[3].delegate.transformations[0].sources[1].validated.delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[3].delegate.transformations[0].sources[1].validated.delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[3].delegate.transformations[0].sources[1].validated.delegate.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#includeBuildToolWrapper) evaluated to true
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Include
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[3].delegate.transformations[0].sources[1].validated.delegate.transformations[0].sources[0].delegate (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [mvnw, mvnw.cmd, .mvn/**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [mvnw, mvnw.cmd, .mvn/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw matched [mvnw, mvnw.cmd, .mvn/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug mvnw.cmd matched [mvnw, mvnw.cmd, .mvn/**] -> included
┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ ╺ engine.transformations[0].validated.delegate.in.transformations[3].delegate.transformations[0].sources[1].validated.delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┗ ╺ engine.transformations[0].validated.delegate.in.transformations[3].delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[4] (Combo)
┃ ┃ ┃ ┃ ┃  Info Condition (#buildTool != 'gradle') evaluated to true
┃ ┃ ┃ ┃ ┃  Info Combo running as Exclude
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[4].delegate (Exclude)
┃ ┃ ┃ ┃ ┃  Info Will exclude [*gradle*]
┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug settings.gradle matched [*gradle*] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug build.gradle.kts matched [*gradle*] -> excluded
┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┗ Debug src/main/resources/application.yml didn't match [*gradle*] -> included
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[5] (Combo)
┃ ┃ ┃ ┃ ┗  Info Condition (#buildTool == 'gradle') evaluated to false
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[6] (Combo)
┃ ┃ ┃ ┃ ┗  Info Condition (#springBootVersion == '3.0') evaluated to false
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[7] (Combo)
┃ ┃ ┃ ┃ ┃  Info Condition (#springBootVersion == '3.1') evaluated to true
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[7].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Include
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0].sources[0].delegate (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/main/resources/application.yml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0].sources[1].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, OpenRewriteRecipe, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0].sources[1].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [pom.xml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/main/resources/application.yml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ╺ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0].sources[1].delegate.transformations[1] (OpenRewriteRecipe)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0].sources[1].delegate.transformations[2] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗  Info Will replace regex '\s+<snakeyaml.version>1.33</snakeyaml.version>' with ''
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0].sources[2].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, ReplaceText, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0].sources[2].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [build.gradle.kts]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/main/resources/application.yml didn't match [build.gradle.kts] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0].sources[2].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace regex 'id\("org\.springframework\.boot"\) version .*' with 'id("org.springframew...(truncated)'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0].sources[2].delegate.transformations[2] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace regex 'id\("io.spring.dependency-management"\) version .*' with 'id("io.spring.depend...(truncated)'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[0].sources[2].delegate.transformations[3] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Will replace regex '\s*extra\["snakeyaml.version"\] = "1.33"' with ''
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[7].delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┗ ┗ Debug Multiple representations for path 'pom.xml', will use the one appearing last 
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[8] (Combo)
┃ ┃ ┃ ┃ ┃  Info Condition (#updateBoot3) evaluated to true
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[8].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[8].delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[8].delegate.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Include
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[8].delegate.transformations[0].sources[0].delegate (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug pom.xml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[8].delegate.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[8].delegate.transformations[0].sources[1].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[8].delegate.transformations[0].sources[1].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/*.java]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/springboot/HelloControllerTest.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/HelloController.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/springboot/Application.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload-native.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug pom.xml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[8].delegate.transformations[0].sources[1].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace regex 'import org\.springframework\.boot\.actuate\.trace\.http' with 'import org.springfra...(truncated)'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[8].delegate.transformations[0].sources[1].delegate.transformations[2] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Will replace regex 'HttpTraceRepository' with 'HttpExchangeReposito...(truncated)'
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[8].delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/test/java/com/example/springboot/HelloControllerTest.java', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/example/springboot/HelloController.java', will use the one appearing last 
┃ ┃ ┃ ┃ ┗ ┗ Debug Multiple representations for path 'src/main/java/com/example/springboot/Application.java', will use the one appearing last 
┃ ┗ ┗ ┗ ╺ engine.transformations[0].validated.delegate.in.transformations[9] (Provenance)
┗ ╺ engine.transformations[1] (UniquePath)
```
