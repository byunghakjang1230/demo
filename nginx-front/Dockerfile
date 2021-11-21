FROM nginx
RUN apt-get update && \
    apt-get install -y iputils-ping && \
    apt-get install -y tcpdump && \
    apt-get install -y telnet && \
    apt-get install -y vim
COPY nginx.conf /etc/nginx/nginx.conf
#COPY default.conf /etc/nginx/conf.d/default.conf