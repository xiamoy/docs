# logstash-log4j2

Log4j2 plugin for logstash.

## Supported Log4J2 versions:
Version: 2.1+

## Get the plugin

### Logstash 5+

Use the install method

```$LS_HOME/bin/plugin-install logstash-tsn-log4j2```

## Setup log4j2
Set log4j2.xml in your project
```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration>
    <Appenders>
        <Socket name="A1" host="localHost" port="7000">
            <SerializedLayout />
        </Socket>
    </Appenders>
    <Loggers>
        <Root level="debug">
            <AppenderRef ref="A1"/>
        </Root>
    </Loggers>
</Configuration>
```

## Setup Logstash

```
input {
  log4j2 {
    port => 7000
    mode => "server"
  }
}

output {
  stdout { codec => rubydebug }
}
```
