# docs
#install offline pack plugin 
You can install the offline plugin with this command 'bin/logstash-plugin install file://D:/ELK/logstash-5.6.0/bin/offline-logstash-tsn-log4j2.zip'
#create offline pack plugin
#example
bin/logstash-plugin prepare-offline-pack --overwrite --output offline-logstash-tsn-log4j2.zip(to create zip name) logstash-tsn-log4j2(pluginname)
