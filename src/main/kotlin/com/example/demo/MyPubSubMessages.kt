package com.example.demo

import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate

class MyPubSubMessages(val pubSub: PubSubTemplate) {

    fun publish(myMessage: String) {
        this.pubSub.publish("speedtest", myMessage)
    }

}