# MavenGsonDemo

### If your project is not current set up for Maven:

1. COMMIT YOUR CHANGES AND CHECKOUT TO A NEW BRANCH
1. In your project tab, right click the project root
1. Click "Add Framework Support
1. A new window will open - scroll to the bottom of the left-hand panel and choose the 'Maven' checkbox
1. Click 'Ok'
1. Back in the project tab, you will see a folder structure change. That is ok!
1. A new file off the project root will be generated called 'pom.xml'
1. Open that file and add this snippet on the line after the ```<version>``` tag:

```
<dependencies>
    <!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.7</version>
    </dependency>
</dependencies> 
  ```
  
1. Right-click the ```pom.xml``` file under your 'Projects' tab, scroll to the bottom to 'Maven'
1. Under 'Maven,' select 'Reload Project'
1. If Intellij hangs up, just close and reopen the project
1. Now that your project is on Maven and Gson is downloaded, you are ready to play around with your first Maven Dependency!

## GSON Documentation: [Google Gson](https://github.com/google/gson/blob/master/UserGuide.md)

### Google's documentation is fantastic for this library, 
so pay close attention and just about any question on use can be quickly found in a Google search!

#### Main uses: Quickly converting Objects to and from JSON Strings. 
This is especially helpful when you have a file from which you are pulling data into your application!
