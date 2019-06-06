# software-architecture

JAVA_HOME
MAVEN_HOME

- eclipse:
 - intall Darkest Dark theme.
 - eclipse.ini
 - configure eclipse settings.
 -- import 
 - Maven
 -- add Maven installation.
 -- configure settings.
 -- set MAVEN_OPTS=-Xmx1024m -XX:MaxPermSize=1024m
 - JAVA>Editor>Save Actions
 -- add Additional actions:
	- Convert control statement bodies to block
	- Convert 'for' loops to enhanced 'for' loops
	- Add final modifier to private fields
	- Add final modifier to method parameters
	- Add final modifier to local variables
	- Use lambda where possible
	- Remove unnecessary parentheses
	- Remove unused imports
	- Add missing '@Override' annotations
	- Add missing '@Override' annotations to implementations of interface methods
	- Add missing '@Deprecated' annotations
	- Remove unnecessary casts
	- Remove redundant modifiers
	- Remove redundant semicolons
	- Remove trailing white spaces on all lines
	- Remove redundant type arguments
 
- GIT
 -- configure user settings (e-mail)
 
 
 
 

mvn versions:set -DnewVersion=0.0.2 -DprocessAllModules
mvn clean install -U -q

SET VERSION=J7.0.0.2
SET NEXT_VERSION=J7.0.0.3-SNAPSHOT
mvn release:clean release:prepare -Dresume=false -DreleaseVersion=%VERSION% -DdevelopmentVersion=%NEXT_VERSION%
mvn versions:set -DnewVersion=%VERSION% -DprocessAllModules
mvn clean install
mvn versions:commit -DprocessAllModules
git commit
mvn release:perform
mvn release:rollback