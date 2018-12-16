# docs

#install offline pack plugin 

	You can install the offline plugin with this command 'bin/logstash-plugin install file://D:/ELK/logstash-5.6.0/bin/offline-logstash-tsn-log4j2.zip'
#create offline pack plugin

#example

	bin/logstash-plugin prepare-offline-pack --overwrite --output offline-logstash-tsn-log4j2.zip(to create zip name) logstash-tsn-log4j2(pluginname)

#nfs offline pkg

	https://pkgs.org/download/nfs-utils
	
	http://nfs.sourceforge.net/nfs-howto/ar01s03.html
	
#Linux install nfs guide

	 https://blog.csdn.net/scott_bing/article/details/78142553
	 http://blog.51cto.com/13958260/2176210
	 https://blog.csdn.net/qq_18600061/article/details/79025898
	 https://www.elastic.co/guide/cn/elasticsearch/guide/current/backing-up-your-cluster.html
	 https://www.cnblogs.com/powpoia/p/6553205.html

ES readonlyrest plugin
	
	Download the zip file
	
	cd to the Elasticsearch home
	
	bin/elasticsearch-plugin install file:///download-folder/readonlyrest-1.16.31_es6.3.0.zip
	
	Edit readonlyrest.yml and add your configuration snippets. Also, refer to the official documentation (https://github.com/beshu-tech/readonlyrest-docs/blob/master/elasticsearch.md#rules)
