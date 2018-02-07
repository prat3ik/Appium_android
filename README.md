# Appium_android
<h1 align="center">Android UI Tests</h1>

<p><h2>Prerequisites:</h2></p>

<ul>
<li> Make sure you have Appium and Git installed, Also TestNG plugin required for IntelliJ and Eclipse IDE</li>
<li> Make sure env. variable ANDROID_HOME is set for Android SDK repository  <small>Ref:https://stackoverflow.com/questions/37433718/could-not-find-aapt-with-appium-server/48658825#48658825 </small></li>
<li> Clone this Repository using this command: <strong>git clone https://github.com/prat3ik/Appium_android </strong> </li>
<li> Appium server must be up and running</li>
<li> Android device must be connected properly (verify using <b>adb devices</b> command on cmd)</li>
</ul>

<h2> Execution with Gradle </h2>
<ul>
<br>
<li> Move to project directory and Open CMD to execute below commands for build</li>
  <ol>
    <li><b>gradlew clean</b>(When you clean the project then 'pratik_sample.apk' would be deleted from bin folder. Manually copy-paste it from project. In order to successful execution, 'pratik_sample.apk' file must be present in bin folder)</li>
    <li><b>gradlew eclipse</b></li>
    <li><b>gradlew build</b></li>
  </ol>
<br>
</ul>

<h2> Execution with IntelliJ IDEA </h2>
<ul>
<li>File > New > Project from existing sources.. and select the cloned repository</li>
<li>Import project from external model and select Gradle and finish the remaining process </li>
<li>Open AppTest.java file</li>
<li>Change variable value APP_PATH to location: <_path_to_the_repo_>/bin/pratik_sample.apk</li>
<li>Change variable value DEVICE_NAME to connected Android device id(find it using: <b>adb devices</b>)</li>
<li> <b> Single Execution:</b></li>
<ul><li> Select Testcase name, Right click on them and 'Run As' > 'TestNG Test'</li></ul>
<li> <b> Multiple Execution:</b></li>
<ul><li> Right click on anywhere in AppTest.java file and 'Run As' > 'TestNG Test'</li></ul></ul>

<h2> Execution with Eclipse IDE </h2>
<ul>
<li> Import this project to Eclipse IDE </li>
<li>Change variable value APP_PATH to location: <_path_to_the_repo_>/bin/pratik_sample.apk</li>
<li>Change variable value DEVICE_NAME to connected Android device id(find it using: <b>adb devices</b>)</li>
<li> <b> Single Execution:</b></li>
<ul><li> Select Testcase name, Right click on them and 'Run As' > 'TestNG Test'</li></ul>
<li> <b> Multiple Execution:</b></li>
<ul><li> Right click on anywhere in AppTest.java file and 'Run As' > 'TestNG Test'</li></ul></ul>
