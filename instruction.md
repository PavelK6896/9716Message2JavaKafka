- Установить zookeeper
- Установить kafka 

####zookeeper

1. create and editing:

zoo_sample.cfg -> zoo.cfg
dataDir=C:\\ZooKeeper\\apache-zookeeper-3.6.1-bin

2. create system path:

ZOOKEEPER_HOME=C:\ZooKeeper\apache-zookeeper-3.6.1-bin
%ZOOKEEPER_HOME%\bin

3. start:

zkserver

####kafka

- editing:

kafka/config/server.properties
log.dirs=c:/kafka/kafka-logs
kafka/config/zookeeper.properties
dataDir=c:/kafka/zookeeper-data

- start:

start zookeeper-server-start.bat c:\kafka\config\zookeeper.properties 
start kafka-server-start.bat c:\kafka\config\server.properties

- or create kafka/start.bat:

start C:\kafka\bin\windows\zookeeper-server-start.bat C:\kafka\config\zookeeper.properties
timeout 2
rmdir /s /q C:\kafka\kafka-logs\
timeout 5
start C:\kafka\bin\windows\kafka-server-start.bat C:\kafka\config\server.properties


