echo "Groovy version: ${GroovySystem.version}"
echo "Java version: ${System.getProperty('java.version')}"
buildPlugin(
  useContainerAgent: false,
  configurations: [
    [platform: 'linux', jdk: 25],
    [platform: 'windows', jdk: 17],
])
