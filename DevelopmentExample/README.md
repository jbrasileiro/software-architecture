# DevelopmentExample
JAVA Project to use as reference

This repository contains guide to develop JAVA project using standstard.

Development example would be composed by the fellowing:
 
- **1 : Example SUPER-POM (MAVEN)** - [link](./JAVA/example-super-POM/README.md)

 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sit amet facilisis magna etiam tempor orci eu lobortis elementum. Hendrerit dolor magna eget est. Eget nunc lobortis mattis aliquam faucibus purus. Ut eu sem integer vitae justo eget magna fermentum iaculis.
 
- **2 : Example BOM (MAVEN)** - [link](./JAVA/example-BOM/README.md)

 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut sem nulla pharetra diam sit. Tempor commodo ullamcorper a lacus. Cum sociis natoque penatibus et magnis dis parturient montes. Volutpat maecenas volutpat blandit aliquam etiam.

- **3 : Example Library** - [link](./JAVA/example-library/README.md)

 Vivamus non congue orci, et tempor neque. Vivamus finibus neque non mauris pretium pulvinar. Vestibulum eget pretium mauris, a vehicula justo. Vivamus augue lorem, volutpat at odio ac, ullamcorper imperdiet augue. Cras ultricies mauris ac aliquam pharetra. Cras eget mi elit. Mauris et faucibus elit, vel consectetur ex.

 
- **4 : Example Microservice (Spring-boot)** - [link](./JAVA/example-MS-SB/README.md)

 In egestas non justo ac cursus. Aenean odio elit, egestas nec urna sed, vehicula bibendum libero. Cras blandit cursus scelerisque. In porta pulvinar bibendum. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Quisque vestibulum, tellus a egestas fermentum, felis nibh laoreet nulla, nec tristique orci neque mollis eros. Pellentesque mollis purus eu enim ornare laoreet. Integer non scelerisque sem. Morbi quis faucibus mi. Donec pharetra porta nulla eget dapibus. Maecenas vel nulla feugiat, finibus mi sed, lacinia neque. Nam ultrices venenatis faucibus. Nunc ullamcorper velit lorem, et commodo massa sodales sed. Morbi quis convallis enim, sit amet iaculis leo. 

- **5 : Example Microservice (Spring-application)** - [link](./JAVA/example-MS-SA/README.md)

 Ante sapien imperdiet mauris semper quisque dapibus elementum non, potenti ultricies facilisis libero nunc sagittis feugiat nibh, ante curabitur donec elementum interdum semper hac. pretium placerat eros nec conubia eget elit dictumst non malesuada mi, conubia suscipit etiam curabitur nulla aliquam etiam tristique rutrum. blandit est donec dui cubilia aptent fringilla porttitor ut, varius fusce felis vehicula sem commodo. nec tortor cubilia aliquet magna morbi sem litora auctor integer lectus amet ornare, netus ante mattis massa leo accumsan tempus praesent commodo netus libero donec, potenti fames sodales ante dictumst porta massa risus sollicitudin praesent dictum
 
- **6 : Example Microservice (JAVA EE)** - [link](./JAVA/example-MS-JEE/README.md)

 Posuere curae lorem nec malesuada ut per malesuada diam donec euismod quam, aliquam facilisis orci cras arcu ut nunc leo vehicula aliquet velit primis, ut felis leo pellentesque dapibus ante enim accumsan tortor suspendisse. phasellus consectetur vitae cubilia ac volutpat eros lacus eros, dictum sed magna elit torquent justo nunc eu, dictumst volutpat consequat est donec lorem ornare. aenean a mi aenean tempor cras quisque eros massa lorem himenaeos tristique, nisl augue massa quisque curabitur mauris hac placerat luctus dictumst. nulla nam sed erat lacus sagittis ornare taciti, quisque odio semper senectus lacinia maecenas, felis tempus fermentum praesent vehicula malesuada. 

- **7 : Example PARENT-POM (MAVEN)** - [link](./JAVA/example-super-POM/README.md)

 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Augue neque gravida in fermentum. Facilisis mauris sit amet massa. Pellentesque diam volutpat commodo sed egestas egestas. Amet nisl suscipit adipiscing bibendum est ultricies integer quis auctor.    
   

## 1 - Create repository:

Add empty README.md file.

## 2 - How to clone the repository (GIT):

```
git clone --progress -v -b "%pBRANCH%" "%pURL%" "%pFOLDER%"
```

```
SET vDIR_CURRENT=C:\.rep\git\P\git\DevelopmentExample\JAVA
SET vDIR_EX=%vDIR_CURRENT%\ex

MKDIR %vDIR_EX%
ECHO "" > %vDIR_EX%\README.md

XCOPY %vDIR_EX% %vDIR_CURRENT%\example-library /IKF
XCOPY %vDIR_EX% %vDIR_CURRENT%\example-super-POM /IKF
XCOPY %vDIR_EX% %vDIR_CURRENT%\example-BOM /IKF
XCOPY %vDIR_EX% %vDIR_CURRENT%\example-MS-SB /IKF
XCOPY %vDIR_EX% %vDIR_CURRENT%\example-MS-SA /IKF
XCOPY %vDIR_EX% %vDIR_CURRENT%\example-MS-JEE /IKF
XCOPY %vDIR_EX% %vDIR_CURRENT%\example-parent /IKF

RMDIR %vDIR_EX% /S /Q
```


## 3 - Add .gitignore

Use this [.gitignore file](https://github.com/jbrasileiro/software-architecture/blob/master/config/git/template-gitignore) as reference.

```
SET vFILE_GITIGNORE=....
SET vDIR_CURRENT=C:\.rep\git\P\git\DevelopmentExample\JAVA

COPY %vFILE_GITIGNORE% %vDIR_CURRENT%\example-library\.gitignore
COPY %vFILE_GITIGNORE% %vDIR_CURRENT%\example-super-POM\.gitignore
COPY %vFILE_GITIGNORE% %vDIR_CURRENT%\example-BOM\.gitignore
COPY %vFILE_GITIGNORE% %vDIR_CURRENT%\example-MS-SB\.gitignore
COPY %vFILE_GITIGNORE% %vDIR_CURRENT%\example-MS-SA\.gitignore
COPY %vFILE_GITIGNORE% %vDIR_CURRENT%\example-MS-JEE\.gitignore
COPY %vFILE_GITIGNORE% %vDIR_CURRENT%\example-parent\.gitignore
```

## 4 - pom.xml

For any JAVA library always define the fellowings:

### 4.1 Property

 - project.build.sourceEncoding
 - project.reporting.outputEncoding
 - java.version
 
 Ex:
 ```
 	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>1.8</java.version>
	</properties>
 ```
_________

#REFERENCE:
- **Lorem Ipsum Generator** : https://loremipsum.io/generator/?n=5&t=s