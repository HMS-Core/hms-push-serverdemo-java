# 华为推送服务服务端Java示例代码
[English](README.md) | 中文

## 目录

 * [简介](#简介)
 * [环境要求](#环境要求)
 * [安装](#安装)
 * [配置](#配置)
 * [示例代码](#示例代码)
 * [技术支持](#技术支持)
 * [授权许可](#授权许可)


## 简介

Java示例代码对华为推送服务（HUAWEI Push Kit）服务端接口进行封装，供您参考使用。

示例代码目录结构如下：
| 包名 | 说明 |
| ---- | ---- |
| examples | 示例代码包 |
| messaging | 服务端接口封装包 |

## 环境要求

推荐使用JDK 8.0及以上版本。

## 配置

参数说明：

| 参数 | 说明 |
| ---- | ---- |
| appid | 应用ID，从应用信息中获取 |
| appsecret | 应用访问密钥，从应用信息中获取 |
| token_server | 华为OAuth 2.0获取token的地址。详情请参见[基于OAuth 2.0开放鉴权-客户端模式](https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/oauth2-0000001212610981)。|
| push_open_url | 推送服务的访问地址。详情请参见[推送服务-下行消息](https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/android-server-dev-0000001050040110?ha_source=hms1)。|

## 示例代码

#### 1. 发送Android透传消息
代码位置：[examples/SendDataMessage.java](src/main/java/com/huawei/push/examples/SendDataMessage.java)

#### 2.	发送Android通知栏消息
代码位置：[examples/SendNotifyMessage.java](src/main/java/com/huawei/push/examples/SendNotifyMessage.java)

#### 3.	基于主题发送消息
代码位置：[examples/SendTopicMessage.java](src/main/java/com/huawei/push/examples/SendTopicMessage.java)

#### 4.	基于条件发送消息
代码位置：[examples/SendConditionMessage.java](src/main/java/com/huawei/push/examples/SendConditionMessage.java)

#### 5.	向华为快应用发送消息
代码位置：[examples/SendInstanceAppMessage.java](src/main/java/com/huawei/push/examples/SendInstanceAppMessage.java)

#### 6.	基于WebPush代理发送消息
代码位置：[examples/SendWebpushMessage.java](src/main/java/com/huawei/push/examples/SendWebpushMessage.java)

#### 7.	基于APNs代理发送消息
代码位置：[examples/SendApnsMessage.java](src/main/java/com/huawei/push/examples/SendApnsMessage.java)

#### 8.	发送测试消息
代码位置：[examples/SendTestMessage.java](src/main/java/com/huawei/push/examples/SendTestMessage.java)

## 技术支持
如果您对HMS Core还处于评估阶段，可在[Reddit社区](https://www.reddit.com/r/HuaweiDevelopers/)获取关于HMS Core的最新讯息，并与其他开发者交流见解。

如果您对使用HMS示例代码有疑问，请尝试：
- 开发过程遇到问题上[Stack Overflow](https://stackoverflow.com/questions/tagged/huawei-mobile-services?tab=Votes)，在`huawei-mobile-services`标签下提问，有华为研发专家在线一对一解决您的问题。
- 到[华为开发者论坛](https://developer.huawei.com/consumer/cn/forum/blockdisplay?fid=18?ha_source=hms1) HMS Core板块与其他开发者进行交流。

如果您在尝试示例代码中遇到问题，请向仓库提交[issue](https://github.com/HMS-Core/hms-push-serverdemo-java/issues)，也欢迎您提交[Pull Request](https://github.com/HMS-Core/hms-push-serverdemo-java/pulls)。

##  授权许可
华为推送服务Java示例代码经过 [Apache License, version 2.0](http://www.apache.org/licenses/LICENSE-2.0)授权许可。
