

# InlineObject3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** | The content of the Tweet. |  [optional]
**directMessageDeepLink** | **String** | Link to take the conversation from the public timeline to a private Direct Message. |  [optional]
**quoteTweetId** | **String** | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional]
**forSuperFollowersOnly** | **Boolean** | Exclusive Tweet for super followers. |  [optional]
**reply** | [**Model2TweetsReply**](Model2TweetsReply.md) |  |  [optional]
**media** | [**Model2TweetsMedia**](Model2TweetsMedia.md) |  |  [optional]
**poll** | [**Model2TweetsPoll**](Model2TweetsPoll.md) |  |  [optional]
**replySettings** | [**ReplySettingsEnum**](#ReplySettingsEnum) | Settings to indicate who can reply to the Tweet. |  [optional]
**geo** | [**Model2TweetsGeo**](Model2TweetsGeo.md) |  |  [optional]



## Enum: ReplySettingsEnum

Name | Value
---- | -----
FOLLOWING | &quot;following&quot;
MENTIONEDUSERS | &quot;mentionedUsers&quot;



