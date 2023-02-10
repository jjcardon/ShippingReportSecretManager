FROM openjdk:11-jdk-slim
VOLUME /tmp
COPY *.jar ShippingReport.jar
#ENV JAVA_OPTS=" -Xshareclasses:name=cacheapp,cacheDir=/cache,nonfatal -XX:+UseContainerSupport -XX:MaxRAMPercentage=70 -Djava.security.egd=file:/dev/./urandom"
# Replace with a non-root user to avoid running the container with excessive privileges
#USER appuser
ENTRYPOINT ["java","-jar","/ShippingReport.jar"]
