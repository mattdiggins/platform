FROM mattdiggins/base

ENV BROKER_NAME test
ENV BROKER_PEER localhost

EXPOSE 61616
EXPOSE 62002
EXPOSE 8161

RUN groupadd -r activemq && useradd -r -g activemq activemq

WORKDIR /opt
RUN wget -O activemq.tar.gz "http://www.apache.org/dyn/closer.cgi?filename=/activemq/5.14.1/apache-activemq-5.14.1-bin.tar.gz&action=download"

RUN ls -la 
RUN tar -zxvf activemq.tar.gz
RUN ln -s apache-activemq-5.14.1 activemq

RUN ls -la
RUN ls -la activemq/*

#RUN chown -R activemq:activemq activemq

WORKDIR activemq
#USER activemq

COPY activemq.xml conf/
  
CMD ["bin/activemq", "console"]