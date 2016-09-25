# platform
Microservice test project

## Docker setup:

Add to /etc/default/docker

	DOCKER_OPTS="--dns 172.17.0.1 --dns 8.8.8.8 --dns-search service.consul"

## Virtual Hosts:

|Host|Description|	
|consul.platform|Service discovery registry|