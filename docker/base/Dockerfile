FROM debian

RUN echo "deb http://ftp.de.debian.org/debian jessie-backports main" >> /etc/apt/sources.list

RUN apt-get update
RUN apt-get -y install wget openjdk-8-jdk