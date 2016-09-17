FROM debian

EXPOSE 80

RUN apt-get update
RUN apt-get -y install apache2

RUN mkdir -p /var/run/apache2
RUN mkdir -p /var/lock/apache2
RUN rm /etc/apache2/sites-enabled/*

ENV APACHE_RUN_USER www-data
ENV APACHE_RUN_GROUP www-data
ENV APACHE_PID_FILE /var/run/apache2/apache2.pid
ENV APACHE_RUN_DIR /var/run/apache2
ENV APACHE_LOCK_DIR /var/lock/apache2
ENV APACHE_LOG_DIR /var/log/apache2

VOLUME /var/log/apache2/

COPY apache2.conf /etc/apache2/
COPY sites /etc/apache2/sites-enabled/

RUN a2enmod proxy_http

CMD ["/usr/sbin/apache2", "-D", "FOREGROUND"]