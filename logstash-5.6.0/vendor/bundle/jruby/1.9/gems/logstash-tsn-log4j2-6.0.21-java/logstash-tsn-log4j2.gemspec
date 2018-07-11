Gem::Specification.new do |s|
  s.name            = 'logstash-tsn-log4j2'
  s.version         = '6.0.21'
  s.licenses        = ['Apache-2.0']
  s.summary         = "Read events over a TCP socket from a Log4j2 SocketAppender"
  s.description     = "This gem is a logstash plugin required to be installed on top of the Logstash core pipeline using $LS_HOME/bin/plugin install gemname. This gem is not a stand-alone program"
  s.authors         = ["Jurriaan Mous / Modified by TSN"]
  s.email           = 'wardeon+2@gmail.com'
  s.homepage        = "https://github.com/tnoeding/logstash-log4j2"
  s.require_paths = ["lib"]

  # Files
  #s.files = `git ls-files`.split($\)+::Dir.glob('vendor/*')


  s.files = Dir['lib/**/*','spec/**/*','vendor/**/*','*.gemspec','*.md','CONTRIBUTORS','Gemfile','LICENSE','NOTICE.TXT']

  # Tests
  s.test_files = s.files.grep(%r{^(test|spec|features)/})

  # Special flag to let us know this is actually a logstash plugin
  s.metadata = { "logstash_plugin" => "true", "logstash_group" => "input" }

  s.platform = 'java'

  s.add_runtime_dependency "logstash-core", ">= 2.0.0.beta2", "< 6.0.0"

  s.add_development_dependency 'logstash-devutils'
end
