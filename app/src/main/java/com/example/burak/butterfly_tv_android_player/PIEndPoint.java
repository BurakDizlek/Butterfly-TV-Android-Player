package com.example.burak.butterfly_tv_android_player;

import android.content.pm.PackageInstaller;

import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

/**
 * Created by Burak on 11.11.2015.
 */

@ClientEndpoint
(subprotocols = {"chat"})

public class PIEndPoint {

  private Session mSession;
        @OnOpen
        public void onOpen(Session session, EndpointConfig config) {   }

        @OnClose
        public void onClose(Session session,  CloseReason closeReason) {}

        @OnError
        public void onError(Session session, Throwable thr)
        {    }

        @OnMessage
        public void onMessage(String message) {
        }

}
