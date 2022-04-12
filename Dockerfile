# Docker for java  sei-demo

# 基础镜像
FROM rddhub.changhong.com/library/server-jre:8u281-alpine

# 作者
LABEL maintainer="hua.feng@changhong.com"

## JAVA_OPTS：JAVA启动参数 APP_NAME：应用名称（各项目需要修改）
ENV JAVA_OPTS=""  APP_NAME="sei-demo"

# 添加应用
ADD $APP_NAME-service/build/libs/$APP_NAME.jar $APP_NAME.jar

# 开放8080端口
EXPOSE 8080

# 启动应用
USER sei
ENTRYPOINT ["sh","-c","java -server -XX:+UseG1GC -XX:InitialRAMPercentage=75.0  -XX:MaxRAMPercentage=75.0  -XX:-UseAdaptiveSizePolicy $JAVA_OPTS  -jar $APP_NAME.jar --server.servlet.context-path=/$APP_NAME --server.port=8080"]