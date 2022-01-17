FROM ubuntu:20.04

ENV DEBIAN_FRONTEND noninteractive

### install neccesities & jdk & ssh
RUN apt-get update && apt-get upgrade -y \
    && apt-get install -y \
        ca-certificates vim ssh pdsh wget \
        openjdk-8-jdk make \
    && ln -s /usr/bin/python3 /usr/bin/python \
    && apt-get clean && rm -rf /var/cache/apt/archives/* /var/lib/apt/lists/*

## download hadoop
RUN cd /opt \
    && wget -q https://dlcdn.apache.org/hadoop/common/hadoop-3.3.1/hadoop-3.3.1.tar.gz \
    && tar zxvf hadoop-3.3.1.tar.gz \
    && rm hadoop-3.3.1.tar.gz \
    && mv hadoop-3.3.1 hadoop \
    && chmod -R +x hadoop/bin

### setup sshd
RUN echo "root:root" | chpasswd \
    && sed -i "s/#PermitRootLogin prohibit-password/PermitRootLogin yes/" /etc/ssh/sshd_config \
    && cd /root \
    && ssh-keygen -t rsa -P '' -f ~/.ssh/id_rsa \
    && cat ~/.ssh/id_rsa.pub >> ~/.ssh/authorized_keys \
    && chmod 0600 ~/.ssh/authorized_keys

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
ENV PATH $PATH:/opt/hadoop/bin
ADD config/core-site.xml /otp/hadoop/etc/hadoop
ADD config/hdfs-site.xml /otp/hadoop/etc/hadoop

ENV DEBIAN_FRONTEND dialog

### run sshd
CMD service ssh start && /bin/bash
