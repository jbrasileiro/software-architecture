# software-architecture

JAVA_HOME
MAVEN_HOME

HOST:
 - VM
  -- https://vorkbaard.nl/getting-shared-folders-working-properly-in-debian-9-in-virtualbox/
  -- https://averagelinuxuser.com/virtualbox-shared-folder/

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

Linux (VM)
 - sudo usermod -aG vboxsf <someuserID>
 
Linux
 -- Docker
  -- https://linuxize.com/post/how-to-install-apache-maven-on-debian-9/

 -- Docker compose
sudo curl -L "https://github.com/docker/compose/releases/download/1.25.4/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
	-- add docker grouphttps
	-- https://stackoverflow.com/questions/29101043/cant-connect-to-docker-from-docker-compose
# 1. Create the docker group.
$ sudo groupadd docker

# 2. Add your user to the docker group.
$ 	

# 3. Log out and log back in so that your group membership is re-evaluated.

# 4. Verify that you can run docker commands without sudo.
$ docker run hello-world

 --JDK
 
 --Maven
 wget https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz -P /tmp
 tar xf /tmp/apache-maven-3.6.3-bin.tar.gz -C /tmp
 mv apache-maven-3.6.3 /opt/maven/3.6.3
 ln -s /opt/apache-maven-3.6.0 /opt/maven/default
 
 sudo cat > /etc/profile.d/maven.sh
 sudo nano /etc/profile.d/maven.sh
 
/etc/profile.d/maven.sh:
	export M2_HOME=/opt/maven
	export MAVEN_HOME=/opt/maven
	export PATH=${M2_HOME}/bin:${PATH}

 sudo chmod +x /etc/profile.d/maven.sh
 source /etc/profile.d/maven.sh	
 
 --SSH
  -- chmod 400 ~/.ssh/id_rsa