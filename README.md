# HMS Pushkit Java Severdemo


## Table of Contents

 * [Introduction](#introduction)
 * [Supported Environments](#supported-environments)
 * [Installation](#installation)
 * [Configuration ](#configuration )
 * [Sample Code](#sample-code)
 * [License](#license)
 
 
## Introduction

Java sample code encapsulates APIs of the HUAWEI Push Kit server. It provides many sample programs for your reference or usage.

The following table describes packages of Java sample code.

| Package | Description |
| ---- | ---- |
| examples | Sample code packages. Each package can run independently. |
| messaging | Package where APIs of the HUAWEI Push Kit server are encapsulated. |

## Supported Environments

For HUAWEI Push Kit, JDK 8.0 or later and IntelliJ IDEA are recommended.

## Installation
Configure your build tool to import the sample code into your IDE.

## Configuration 

The following table lists parameters to be set.

| Parameter | Description |
| ---- | ---- |
| appid | App ID, which is obtained from app information. |
| appsecret | Secret access key of an app, which is obtained from app information. |
| token_server | URL for the Huawei OAuth 2.0 service to obtain a token, please refer to [Generating an App-Level Access Token](https://developer.huawei.com/consumer/en/doc/development/parts-Guides/generating_app_level_access_token). |
| push_open_url | URL for accessing HUAWEI Push Kit, please refer to [Sending Messages](https://developer.huawei.com/consumer/en/doc/development/HMS-References/push-sendapi). |

## Sample Code

### 1 Send an Android data message.
Code location: examples/sendDataMessage.java

### 2 Send an Android notification message.
Code location: examples/sendNotifyMessage.java

### 3 Send a message by topic.
Code location: examples/sendTopicMessage.java

### 4 Send a message by conditions.
Code location: examples/sendConditionMessage.java

### 5 Send a message to a Huawei quick app.
Code location: examples/sendInstanceAppMessage.java

### 6 Send a message through the WebPush agent.
Code location: examples/sendWebpushMessage.java

### 7 Send a message through the APNs agent.
Code location: examples/sendApnsMessage.java

### 8 Send a test message.
Code location: examples/sendTestMessage.java

## Question or issues
If you want to evaluate more about HMS Core,
[r/HMSCore on Reddit](https://www.reddit.com/r/HMSCore/) is for you to keep up with latest news about HMS Core, and to exchange insights with other developers.

If you have questions about how to use HMS samples, try the following options:
- [Stack Overflow](https://stackoverflow.com/questions/tagged/huawei-mobile-services) is the best place for any programming questions. Be sure to tag your question with 
**huawei-mobile-services**.
- [Huawei Developer Forum](https://forums.developer.huawei.com/forumPortal/en/home?fid=0101187876626530001) HMS Core Module is great for general questions, or seeking recommendations and opinions.

If you run into a bug in our samples, please submit an [issue](https://github.com/HMS-Core/hms-push-serverdemo-java/issues) to the Repository. Even better you can submit a [Pull Request](https://github.com/HMS-Core/hms-push-serverdemo-java/pulls) with a fix.

##  License
Pushkit Java sample is licensed under the [Apache License, version 2.0](http://www.apache.org/licenses/LICENSE-2.0).
