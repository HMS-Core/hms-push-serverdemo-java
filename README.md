# HMS Core Push Kit Sample Code (Java)
English | [中文](README_ZH.md)

## Contents

 * [Introduction](#Introduction)
 * [Environment Requirements](#Environment-Requirements)
 * [Installation](#Installation)
 * [Configuration](#Configuration)
 * [Sample Code](#Sample-Code)
 * [Technical Support](#technical-support)
 * [License](#License)


## Introduction

The sample code for Java encapsulates the server-side APIs of Push Kit, for your reference or direct use.

The following table describes packages of Java sample code.
| Package| Description|
| ---- | ---- |
| examples| Sample code packages.|
| messaging| Package where Push Kit server APIs are encapsulated.|

## Environment Requirements

JDK 8.0 or later is recommended.

## Configuration

Set the following parameters.

| Parameter| Description|
| ---- | ---- |
| appid| App ID, which is obtained from the app information.|
| appsecret | App secret, which is obtained from the app information.|
| token_server | URL for Huawei OAuth 2.0 to obtain a token. For details, please refer to [OAuth 2.0-based Authentication](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/oauth2-0000001212610981?ha_source=hms1). |
| push_open_url | Access address of Push Kit. For details, please refer to [Downlink Message Sending](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/android-server-dev-0000001050040110?ha_source=hms1). |

## Sample Code

1. Send a data message to an Android app.
File path: **examples/sendDataMessage.java**

	.	Send a notification message to an Android app.
File path: **examples/sendNotifyMessage.java**

	.	Send a message by topic.
File path: **examples/sendTopicMessage.java**

	.	Send a message by condition.
File path: **examples/sendConditionMessage.java**

	.	Send a message to a Huawei quick app.
File path: **examples/sendInstanceAppMessage.java**

	.	Send a message by WebPush.
File path: **examples/sendWebpushMessage.java**

	.	Send a message by APNs.
File path: **examples/sendApnsMessage.java**

	.	Send a test message.
File path: **examples/sendTestMessage.java**

## Technical Support
You can visit the [Reddit community](https://www.reddit.com/r/HuaweiDevelopers/) to obtain the latest information about HMS Core and communicate with other developers.

If you have any questions about the sample code, try the following:
- Visit [Stack Overflow](https://stackoverflow.com/questions/tagged/huawei-mobile-services?tab=Votes), submit your questions, and tag them with `huawei-mobile-services`. Huawei experts will answer your questions.
- Visit the HMS Core section in the [HUAWEI Developer Forum](https://forums.developer.huawei.com/forumPortal/en/home?fid=0101187876626530001?ha_source=hms1) and communicate with other developers.

If you encounter any issues when using the sample code, submit your [issues](https://github.com/HMS-Core/hms-push-serverdemo-java/issues) or submit a [pull request](https://github.com/HMS-Core/hms-push-serverdemo-java/pulls).

##  License
The sample code is licensed under [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0).
