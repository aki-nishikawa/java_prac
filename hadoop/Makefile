IMAGE_NAME := nishikawa/hadoop:3.3.1
CONTAINER_NAME := nishikawa_hadoop

run:
	/usr/bin/docker run -itd \
		--name $(CONTAINER_NAME) \
		-p 50070:50070 \
        --mount type=bind,source=$(PWD)/mnt,target=/hadoop \
		$(IMAGE_NAME)

start:
	/usr/bin/docker start $(CONTAINER_NAME)

stop:
	/usr/bin/docker stop $(CONTAINER_NAME)

remove:
	/usr/bin/docker stop $(CONTAINER_NAME) \
	&& /usr/bin/docker rm $(CONTAINER_NAME)

rmi:
	/usr/bin/docker rmi $(IMAGE_NAME)

build:
	/usr/bin/docker build -t $(IMAGE_NAME) ./

shell:
	/usr/bin/docker exec -it $(CONTAINER_NAME) /bin/bash
