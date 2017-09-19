# Appium_android
<h1 align="center">Android UI Tests</h1>

<p><h2>How to use this Repository:</h2></p>

<ul>
<li> Make sure you have Appium and Git installed, Also TestNG plugin required in Eclipse IDE</li>
<li> Clone this Repository using this command: git clone https://github.com/prat3ik/Appium_android </li>
<br>
<li> Move to project directory and Open CMD to execute below commands for build</li>
  <ol>
    <li><b>gradlew clean</b>(When you clean the project then 'pratik_sample.apk' would be deleted from bin folder. Manually copy-paste it from project. In order to successful execution, 'pratik_sample.apk' file must be present in bin folder)</li>
    <li><b>gradlew eclipse</b></li>
    <li><b>gradlew build</b></li>
  </ol>
<br>
<li> Import this project to Eclipse IDE </li>
<li> You should change Device configuration(DeviceName) in https://github.com/prat3ik/Appium_android/blob/master/src/test/java/AppTest.java</li>
<li> <b> Single Execution:</b></li>
<ul><li> Select Testcase name, Right click on them and 'Run As' > 'TestNG Test'</li></ul>
<li> <b> Multiple Execution:</b></li>
<ul><li> Right click on anywhere in AppTest.java file and 'Run As' > 'TestNG Test'</li></ul>
</ul>

Test Case Documentation: https://docs.google.com/document/d/13Agel9_rWXjKHtOD85U1U6ZeGySoUTnmbKjdAtN2r4M/edit
